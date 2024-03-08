class TransformerChain<T>(
    val transformer: () -> T,
    val dependencies: Set<ReactiveType<*>>

): () -> T, ReactiveType<T> {

    override fun invoke(): T = transformer()

    override val value: T
        get() = transformer()

    val typed = ImmutableReactiveType(this)
}