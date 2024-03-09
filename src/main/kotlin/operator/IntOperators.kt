package operator

import type.ImmutableReactiveType
import type.MutableReactiveType
import type.TransformerChain

/**
 * ================ Plus Operator ================
 **/
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
operator fun TransformerChain<Int>.plus(other: ImmutableReactiveType<Int>): TransformerChain<Int> =
    TransformerChain({ this() + other.value }, other.transformer.dependencies union this@plus.dependencies)
operator fun TransformerChain<Int>.plus(other: Int): TransformerChain<Int> =
    TransformerChain({ this() + other }, this@plus.dependencies)

/**
 * ================ Minus Operator ================
 **/
operator fun MutableReactiveType<Int>.minus(other: MutableReactiveType<Int>): TransformerChain<Int> =
    TransformerChain({ this.value - other.value }, setOf(this@minus, other))

operator fun MutableReactiveType<Int>.minus(other: ImmutableReactiveType<Int>): TransformerChain<Int> =
    TransformerChain({ this.value - other.value }, setOf(this@minus) union other.transformer.dependencies)
operator fun MutableReactiveType<Int>.minus(other: TransformerChain<Int>): TransformerChain<Int> =
    TransformerChain({ this.value - other() }, setOf(this@minus) union other.dependencies)
operator fun MutableReactiveType<Int>.minus(other: Int): TransformerChain<Int> =
    TransformerChain({ this.value - other }, setOf(this@minus))

operator fun ImmutableReactiveType<Int>.minus(other: MutableReactiveType<Int>): TransformerChain<Int> =
    TransformerChain({ this.value - other.value }, this@minus.transformer.dependencies union setOf(other))
operator fun ImmutableReactiveType<Int>.minus(other: TransformerChain<Int>): TransformerChain<Int> =
    TransformerChain({ this.value - other() }, this@minus.transformer.dependencies union setOf(other))
operator fun ImmutableReactiveType<Int>.minus(other: ImmutableReactiveType<Int>): TransformerChain<Int> =
    TransformerChain({ this.value - other.value }, this@minus.transformer.dependencies union setOf(other))
operator fun ImmutableReactiveType<Int>.minus(other: Int): TransformerChain<Int> =
    TransformerChain({ this.value - other }, this@minus.transformer.dependencies)

operator fun TransformerChain<Int>.minus(other: MutableReactiveType<Int>): TransformerChain<Int> =
    TransformerChain({ this() - other.value }, setOf(other) union this@minus.dependencies)
operator fun TransformerChain<Int>.minus(other: TransformerChain<Int>): TransformerChain<Int> =
    TransformerChain({ this() - other() }, other.dependencies union this@minus.dependencies)
operator fun TransformerChain<Int>.minus(other: ImmutableReactiveType<Int>): TransformerChain<Int> =
    TransformerChain({ this() - other.value }, other.transformer.dependencies union this@minus.dependencies)
operator fun TransformerChain<Int>.minus(other: Int): TransformerChain<Int> =
    TransformerChain({ this() - other }, this@minus.dependencies)

/**
 * ================ Times Operator ================
 **/
operator fun MutableReactiveType<Int>.times(other: MutableReactiveType<Int>): TransformerChain<Int> =
    TransformerChain({ this.value * other.value }, setOf(this@times, other))

operator fun MutableReactiveType<Int>.times(other: ImmutableReactiveType<Int>): TransformerChain<Int> =
    TransformerChain({ this.value * other.value }, setOf(this@times) union other.transformer.dependencies)
operator fun MutableReactiveType<Int>.times(other: TransformerChain<Int>): TransformerChain<Int> =
    TransformerChain({ this.value * other() }, setOf(this@times) union other.dependencies)
operator fun MutableReactiveType<Int>.times(other: Int): TransformerChain<Int> =
    TransformerChain({ this.value * other }, setOf(this@times))

operator fun ImmutableReactiveType<Int>.times(other: MutableReactiveType<Int>): TransformerChain<Int> =
    TransformerChain({ this.value * other.value }, this@times.transformer.dependencies union setOf(other))
operator fun ImmutableReactiveType<Int>.times(other: TransformerChain<Int>): TransformerChain<Int> =
    TransformerChain({ this.value * other() }, this@times.transformer.dependencies union setOf(other))
operator fun ImmutableReactiveType<Int>.times(other: ImmutableReactiveType<Int>): TransformerChain<Int> =
    TransformerChain({ this.value * other.value }, this@times.transformer.dependencies union setOf(other))
operator fun ImmutableReactiveType<Int>.times(other: Int): TransformerChain<Int> =
    TransformerChain({ this.value * other }, this@times.transformer.dependencies)

operator fun TransformerChain<Int>.times(other: MutableReactiveType<Int>): TransformerChain<Int> =
    TransformerChain({ this() * other.value }, setOf(other) union this@times.dependencies)
operator fun TransformerChain<Int>.times(other: TransformerChain<Int>): TransformerChain<Int> =
    TransformerChain({ this() * other() }, other.dependencies union this@times.dependencies)
operator fun TransformerChain<Int>.times(other: ImmutableReactiveType<Int>): TransformerChain<Int> =
    TransformerChain({ this() * other.value }, other.transformer.dependencies union this@times.dependencies)
operator fun TransformerChain<Int>.times(other: Int): TransformerChain<Int> =
    TransformerChain({ this() * other }, this@times.dependencies)

/**
 * ================ Div Operator ================
 **/
operator fun MutableReactiveType<Int>.div(other: MutableReactiveType<Int>): TransformerChain<Int> =
    TransformerChain({ this.value / other.value }, setOf(this@div, other))

operator fun MutableReactiveType<Int>.div(other: ImmutableReactiveType<Int>): TransformerChain<Int> =
    TransformerChain({ this.value / other.value }, setOf(this@div) union other.transformer.dependencies)
operator fun MutableReactiveType<Int>.div(other: TransformerChain<Int>): TransformerChain<Int> =
    TransformerChain({ this.value / other() }, setOf(this@div) union other.dependencies)
operator fun MutableReactiveType<Int>.div(other: Int): TransformerChain<Int> =
    TransformerChain({ this.value / other }, setOf(this@div))

operator fun ImmutableReactiveType<Int>.div(other: MutableReactiveType<Int>): TransformerChain<Int> =
    TransformerChain({ this.value / other.value }, this@div.transformer.dependencies union setOf(other))
operator fun ImmutableReactiveType<Int>.div(other: TransformerChain<Int>): TransformerChain<Int> =
    TransformerChain({ this.value / other() }, this@div.transformer.dependencies union setOf(other))
operator fun ImmutableReactiveType<Int>.div(other: ImmutableReactiveType<Int>): TransformerChain<Int> =
    TransformerChain({ this.value / other.value }, this@div.transformer.dependencies union setOf(other))
operator fun ImmutableReactiveType<Int>.div(other: Int): TransformerChain<Int> =
    TransformerChain({ this.value / other }, this@div.transformer.dependencies)

operator fun TransformerChain<Int>.div(other: MutableReactiveType<Int>): TransformerChain<Int> =
    TransformerChain({ this() / other.value }, setOf(other) union this@div.dependencies)
operator fun TransformerChain<Int>.div(other: TransformerChain<Int>): TransformerChain<Int> =
    TransformerChain({ this() / other() }, other.dependencies union this@div.dependencies)
operator fun TransformerChain<Int>.div(other: ImmutableReactiveType<Int>): TransformerChain<Int> =
    TransformerChain({ this() / other.value }, other.transformer.dependencies union this@div.dependencies)
operator fun TransformerChain<Int>.div(other: Int): TransformerChain<Int> =
    TransformerChain({ this() / other }, this@div.dependencies)

/**
 * ================ Assign Operators ================
 **/
operator fun MutableReactiveType<Int>.plusAssign(value: Int) {
    this.value += value
}

operator fun MutableReactiveType<Int>.minusAssign(value: Int) {
    this.value -= value
}

operator fun MutableReactiveType<Int>.timesAssign(value: Int) {
    this.value *= value
}

operator fun MutableReactiveType<Int>.divAssign(value: Int) {
    this.value /= value
}