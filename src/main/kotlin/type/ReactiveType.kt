package type

import subscription.Disposable

interface ReactiveType<T> {
    val value: T
}

class MutableReactiveType<T>(initialValue: T) : ReactiveType<T> {
    override var value: T = initialValue
        set(value) {
            field = value
            observers.forEach { it() }
        }

    private val observers: MutableList<() -> Unit> = mutableListOf()

    fun addObserver(observer: () -> Unit) {
        observers.add(observer)
    }

    fun removeObserver(observer: () -> Unit) {
        observers.remove(observer)
    }
}

class ImmutableReactiveType<T>(val transformer: TransformerChain<T>) : ReactiveType<T> {
    override val value: T
        get() = transformer()

    fun subscribe(deferred: Boolean = true, subscriber: (T) -> Unit): Disposable {
        if (!deferred)
            subscriber(value)

        val observer = {
            subscriber(this@ImmutableReactiveType.value)
        }

        val mutableTypes = transformer.dependencies.filterIsInstance<MutableReactiveType<*>>()

        mutableTypes.forEach {
            it.addObserver(observer)
        }

        return {
            mutableTypes.forEach {
                it.removeObserver(observer)
            }
        }
    }
}