package subscription
class CompositeDisposable {

    private val disposables: MutableList<Disposable> = mutableListOf()

    operator fun plusAssign(disposable: Disposable) {
        disposables.add(disposable)
    }

    fun add(vararg disposable: Disposable) {
        disposables.addAll(disposable)
    }

    fun dispose() {
        disposables.forEach(Disposable::invoke)
        disposables.clear()
    }
}

typealias Disposable = () -> Unit