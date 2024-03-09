package operator

import type.ImmutableReactiveType
import type.MutableReactiveType
import type.TransformerChain

/**
 * ================ Plus Operator ================
 **/
operator fun MutableReactiveType<String>.plus(other: MutableReactiveType<String>): TransformerChain<String> =
    TransformerChain({ this.value + other.value }, setOf(this@plus, other))

operator fun MutableReactiveType<String>.plus(other: ImmutableReactiveType<String>): TransformerChain<String> =
    TransformerChain({ this.value + other.value }, setOf(this@plus) union other.transformer.dependencies)
operator fun MutableReactiveType<String>.plus(other: TransformerChain<String>): TransformerChain<String> =
    TransformerChain({ this.value + other() }, setOf(this@plus) union other.dependencies)
operator fun MutableReactiveType<String>.plus(other: String): TransformerChain<String> =
    TransformerChain({ this.value + other }, setOf(this@plus))
operator fun MutableReactiveType<String>.plus(other: Any): TransformerChain<String> =
    TransformerChain({ this.value + other.toString() }, setOf(this@plus))

operator fun ImmutableReactiveType<String>.plus(other: MutableReactiveType<String>): TransformerChain<String> =
    TransformerChain({ this.value + other.value }, this@plus.transformer.dependencies union setOf(other))
operator fun ImmutableReactiveType<String>.plus(other: TransformerChain<String>): TransformerChain<String> =
    TransformerChain({ this.value + other() }, this@plus.transformer.dependencies union setOf(other))
operator fun ImmutableReactiveType<String>.plus(other: ImmutableReactiveType<String>): TransformerChain<String> =
    TransformerChain({ this.value + other.value }, this@plus.transformer.dependencies union setOf(other))
operator fun ImmutableReactiveType<String>.plus(other: String): TransformerChain<String> =
    TransformerChain({ this.value + other }, this@plus.transformer.dependencies)
operator fun ImmutableReactiveType<String>.plus(other: Any): TransformerChain<String> =
    TransformerChain({ this.value + other.toString() }, this@plus.transformer.dependencies)

operator fun TransformerChain<String>.plus(other: MutableReactiveType<String>): TransformerChain<String> =
    TransformerChain({ this() + other.value }, setOf(other) union this@plus.dependencies)
operator fun TransformerChain<String>.plus(other: TransformerChain<String>): TransformerChain<String> =
    TransformerChain({ this() + other() }, other.dependencies union this@plus.dependencies)
operator fun TransformerChain<String>.plus(other: ImmutableReactiveType<String>): TransformerChain<String> =
    TransformerChain({ this() + other.value }, other.transformer.dependencies union this@plus.dependencies)
operator fun TransformerChain<String>.plus(other: String): TransformerChain<String> =
    TransformerChain({ this() + other }, this@plus.dependencies)
operator fun TransformerChain<String>.plus(other: Any): TransformerChain<String> =
    TransformerChain({ this() + other.toString() }, this@plus.dependencies)