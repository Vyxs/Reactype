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