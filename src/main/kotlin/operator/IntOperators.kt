package operator

import type.ImmutableReactiveType
import type.MutableReactiveType
import type.TransformerChain

operator fun MutableReactiveType<Int>.plus(other: MutableReactiveType<Int>): TransformerChain<Int> =
    TransformerChain({ this.value + other.value }, setOf(this@plus, other))

operator fun MutableReactiveType<Int>.plus(other: ImmutableReactiveType<Int>): TransformerChain<Int> =
    TransformerChain({ this.value + other.value }, setOf(this@plus) union other.transformer.dependencies)
operator fun MutableReactiveType<Int>.plus(other: TransformerChain<Int>): TransformerChain<Int> =
    TransformerChain({ this.value + other() }, setOf(this@plus) union other.dependencies)
operator fun MutableReactiveType<Int>.plus(other: Int): TransformerChain<Int> =
    TransformerChain({ this.value + other }, setOf(this@plus))

operator fun ImmutableReactiveType<Int>.plus(other: MutableReactiveType<Int>): TransformerChain<Int> =
    TransformerChain({ this.value + other.value }, this@plus.transformer.dependencies union setOf(other))
operator fun ImmutableReactiveType<Int>.plus(other: TransformerChain<Int>): TransformerChain<Int> =
    TransformerChain({ this.value + other() }, this@plus.transformer.dependencies union setOf(other))
operator fun ImmutableReactiveType<Int>.plus(other: ImmutableReactiveType<Int>): TransformerChain<Int> =
    TransformerChain({ this.value + other.value }, this@plus.transformer.dependencies union setOf(other))
operator fun ImmutableReactiveType<Int>.plus(other: Int): TransformerChain<Int> =
    TransformerChain({ this.value + other }, this@plus.transformer.dependencies)

operator fun TransformerChain<Int>.plus(other: MutableReactiveType<Int>): TransformerChain<Int> =
    TransformerChain({ this() + other.value }, setOf(other) union this@plus.dependencies)
operator fun TransformerChain<Int>.plus(other: TransformerChain<Int>): TransformerChain<Int> =
    TransformerChain({ this() + other() }, other.dependencies union this@plus.dependencies)
operator fun TransformerChain<Int>.plus(other: Int): TransformerChain<Int> =
    TransformerChain({ this() + other }, this@plus.dependencies)