package operator

import type.ImmutableReactiveType
import type.MutableReactiveType
import type.TransformerChain

/**
 * ================ Plus Operator ================
 **/
operator fun MutableReactiveType<Long>.plus(other: MutableReactiveType<Long>): TransformerChain<Long> =
    TransformerChain({ this.value + other.value }, setOf(this@plus, other))

operator fun MutableReactiveType<Long>.plus(other: ImmutableReactiveType<Long>): TransformerChain<Long> =
    TransformerChain({ this.value + other.value }, setOf(this@plus) union other.transformer.dependencies)
operator fun MutableReactiveType<Long>.plus(other: TransformerChain<Long>): TransformerChain<Long> =
    TransformerChain({ this.value + other() }, setOf(this@plus) union other.dependencies)
operator fun MutableReactiveType<Long>.plus(other: Long): TransformerChain<Long> =
    TransformerChain({ this.value + other }, setOf(this@plus))

operator fun ImmutableReactiveType<Long>.plus(other: MutableReactiveType<Long>): TransformerChain<Long> =
    TransformerChain({ this.value + other.value }, this@plus.transformer.dependencies union setOf(other))
operator fun ImmutableReactiveType<Long>.plus(other: TransformerChain<Long>): TransformerChain<Long> =
    TransformerChain({ this.value + other() }, this@plus.transformer.dependencies union setOf(other))
operator fun ImmutableReactiveType<Long>.plus(other: ImmutableReactiveType<Long>): TransformerChain<Long> =
    TransformerChain({ this.value + other.value }, this@plus.transformer.dependencies union setOf(other))
operator fun ImmutableReactiveType<Long>.plus(other: Long): TransformerChain<Long> =
    TransformerChain({ this.value + other }, this@plus.transformer.dependencies)

operator fun TransformerChain<Long>.plus(other: MutableReactiveType<Long>): TransformerChain<Long> =
    TransformerChain({ this() + other.value }, setOf(other) union this@plus.dependencies)
operator fun TransformerChain<Long>.plus(other: TransformerChain<Long>): TransformerChain<Long> =
    TransformerChain({ this() + other() }, other.dependencies union this@plus.dependencies)
operator fun TransformerChain<Long>.plus(other: ImmutableReactiveType<Long>): TransformerChain<Long> =
    TransformerChain({ this() + other.value }, other.transformer.dependencies union this@plus.dependencies)
operator fun TransformerChain<Long>.plus(other: Long): TransformerChain<Long> =
    TransformerChain({ this() + other }, this@plus.dependencies)

/**
 * ================ Minus Operator ================
 **/
operator fun MutableReactiveType<Long>.minus(other: MutableReactiveType<Long>): TransformerChain<Long> =
    TransformerChain({ this.value - other.value }, setOf(this@minus, other))

operator fun MutableReactiveType<Long>.minus(other: ImmutableReactiveType<Long>): TransformerChain<Long> =
    TransformerChain({ this.value - other.value }, setOf(this@minus) union other.transformer.dependencies)
operator fun MutableReactiveType<Long>.minus(other: TransformerChain<Long>): TransformerChain<Long> =
    TransformerChain({ this.value - other() }, setOf(this@minus) union other.dependencies)
operator fun MutableReactiveType<Long>.minus(other: Long): TransformerChain<Long> =
    TransformerChain({ this.value - other }, setOf(this@minus))

operator fun ImmutableReactiveType<Long>.minus(other: MutableReactiveType<Long>): TransformerChain<Long> =
    TransformerChain({ this.value - other.value }, this@minus.transformer.dependencies union setOf(other))
operator fun ImmutableReactiveType<Long>.minus(other: TransformerChain<Long>): TransformerChain<Long> =
    TransformerChain({ this.value - other() }, this@minus.transformer.dependencies union setOf(other))
operator fun ImmutableReactiveType<Long>.minus(other: ImmutableReactiveType<Long>): TransformerChain<Long> =
    TransformerChain({ this.value - other.value }, this@minus.transformer.dependencies union setOf(other))
operator fun ImmutableReactiveType<Long>.minus(other: Long): TransformerChain<Long> =
    TransformerChain({ this.value - other }, this@minus.transformer.dependencies)

operator fun TransformerChain<Long>.minus(other: MutableReactiveType<Long>): TransformerChain<Long> =
    TransformerChain({ this() - other.value }, setOf(other) union this@minus.dependencies)
operator fun TransformerChain<Long>.minus(other: TransformerChain<Long>): TransformerChain<Long> =
    TransformerChain({ this() - other() }, other.dependencies union this@minus.dependencies)
operator fun TransformerChain<Long>.minus(other: ImmutableReactiveType<Long>): TransformerChain<Long> =
    TransformerChain({ this() - other.value }, other.transformer.dependencies union this@minus.dependencies)
operator fun TransformerChain<Long>.minus(other: Long): TransformerChain<Long> =
    TransformerChain({ this() - other }, this@minus.dependencies)

/**
 * ================ Times Operator ================
 **/
operator fun MutableReactiveType<Long>.times(other: MutableReactiveType<Long>): TransformerChain<Long> =
    TransformerChain({ this.value * other.value }, setOf(this@times, other))

operator fun MutableReactiveType<Long>.times(other: ImmutableReactiveType<Long>): TransformerChain<Long> =
    TransformerChain({ this.value * other.value }, setOf(this@times) union other.transformer.dependencies)
operator fun MutableReactiveType<Long>.times(other: TransformerChain<Long>): TransformerChain<Long> =
    TransformerChain({ this.value * other() }, setOf(this@times) union other.dependencies)
operator fun MutableReactiveType<Long>.times(other: Long): TransformerChain<Long> =
    TransformerChain({ this.value * other }, setOf(this@times))

operator fun ImmutableReactiveType<Long>.times(other: MutableReactiveType<Long>): TransformerChain<Long> =
    TransformerChain({ this.value * other.value }, this@times.transformer.dependencies union setOf(other))
operator fun ImmutableReactiveType<Long>.times(other: TransformerChain<Long>): TransformerChain<Long> =
    TransformerChain({ this.value * other() }, this@times.transformer.dependencies union setOf(other))
operator fun ImmutableReactiveType<Long>.times(other: ImmutableReactiveType<Long>): TransformerChain<Long> =
    TransformerChain({ this.value * other.value }, this@times.transformer.dependencies union setOf(other))
operator fun ImmutableReactiveType<Long>.times(other: Long): TransformerChain<Long> =
    TransformerChain({ this.value * other }, this@times.transformer.dependencies)

operator fun TransformerChain<Long>.times(other: MutableReactiveType<Long>): TransformerChain<Long> =
    TransformerChain({ this() * other.value }, setOf(other) union this@times.dependencies)
operator fun TransformerChain<Long>.times(other: TransformerChain<Long>): TransformerChain<Long> =
    TransformerChain({ this() * other() }, other.dependencies union this@times.dependencies)
operator fun TransformerChain<Long>.times(other: ImmutableReactiveType<Long>): TransformerChain<Long> =
    TransformerChain({ this() * other.value }, other.transformer.dependencies union this@times.dependencies)
operator fun TransformerChain<Long>.times(other: Long): TransformerChain<Long> =
    TransformerChain({ this() * other }, this@times.dependencies)

/**
 * ================ Div Operator ================
 **/
operator fun MutableReactiveType<Long>.div(other: MutableReactiveType<Long>): TransformerChain<Long> =
    TransformerChain({ this.value / other.value }, setOf(this@div, other))

operator fun MutableReactiveType<Long>.div(other: ImmutableReactiveType<Long>): TransformerChain<Long> =
    TransformerChain({ this.value / other.value }, setOf(this@div) union other.transformer.dependencies)
operator fun MutableReactiveType<Long>.div(other: TransformerChain<Long>): TransformerChain<Long> =
    TransformerChain({ this.value / other() }, setOf(this@div) union other.dependencies)
operator fun MutableReactiveType<Long>.div(other: Long): TransformerChain<Long> =
    TransformerChain({ this.value / other }, setOf(this@div))

operator fun ImmutableReactiveType<Long>.div(other: MutableReactiveType<Long>): TransformerChain<Long> =
    TransformerChain({ this.value / other.value }, this@div.transformer.dependencies union setOf(other))
operator fun ImmutableReactiveType<Long>.div(other: TransformerChain<Long>): TransformerChain<Long> =
    TransformerChain({ this.value / other() }, this@div.transformer.dependencies union setOf(other))
operator fun ImmutableReactiveType<Long>.div(other: ImmutableReactiveType<Long>): TransformerChain<Long> =
    TransformerChain({ this.value / other.value }, this@div.transformer.dependencies union setOf(other))
operator fun ImmutableReactiveType<Long>.div(other: Long): TransformerChain<Long> =
    TransformerChain({ this.value / other }, this@div.transformer.dependencies)

operator fun TransformerChain<Long>.div(other: MutableReactiveType<Long>): TransformerChain<Long> =
    TransformerChain({ this() / other.value }, setOf(other) union this@div.dependencies)
operator fun TransformerChain<Long>.div(other: TransformerChain<Long>): TransformerChain<Long> =
    TransformerChain({ this() / other() }, other.dependencies union this@div.dependencies)
operator fun TransformerChain<Long>.div(other: ImmutableReactiveType<Long>): TransformerChain<Long> =
    TransformerChain({ this() / other.value }, other.transformer.dependencies union this@div.dependencies)
operator fun TransformerChain<Long>.div(other: Long): TransformerChain<Long> =
    TransformerChain({ this() / other }, this@div.dependencies)

/**
 * ================ Assign Operators ================
 **/
operator fun MutableReactiveType<Long>.plusAssign(value: Long) {
    this.value += value
}

operator fun MutableReactiveType<Long>.minusAssign(value: Long) {
    this.value -= value
}

operator fun MutableReactiveType<Long>.timesAssign(value: Long) {
    this.value *= value
}

operator fun MutableReactiveType<Long>.divAssign(value: Long) {
    this.value /= value
}