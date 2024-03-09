package operator

import type.ImmutableReactiveType
import type.MutableReactiveType
import type.TransformerChain

/**
 * ================ Plus Operator ================
 **/
operator fun MutableReactiveType<Double>.plus(other: MutableReactiveType<Double>): TransformerChain<Double> =
    TransformerChain({ this.value + other.value }, setOf(this@plus, other))

operator fun MutableReactiveType<Double>.plus(other: ImmutableReactiveType<Double>): TransformerChain<Double> =
    TransformerChain({ this.value + other.value }, setOf(this@plus) union other.transformer.dependencies)
operator fun MutableReactiveType<Double>.plus(other: TransformerChain<Double>): TransformerChain<Double> =
    TransformerChain({ this.value + other() }, setOf(this@plus) union other.dependencies)
operator fun MutableReactiveType<Double>.plus(other: Double): TransformerChain<Double> =
    TransformerChain({ this.value + other }, setOf(this@plus))

operator fun ImmutableReactiveType<Double>.plus(other: MutableReactiveType<Double>): TransformerChain<Double> =
    TransformerChain({ this.value + other.value }, this@plus.transformer.dependencies union setOf(other))
operator fun ImmutableReactiveType<Double>.plus(other: TransformerChain<Double>): TransformerChain<Double> =
    TransformerChain({ this.value + other() }, this@plus.transformer.dependencies union setOf(other))
operator fun ImmutableReactiveType<Double>.plus(other: ImmutableReactiveType<Double>): TransformerChain<Double> =
    TransformerChain({ this.value + other.value }, this@plus.transformer.dependencies union setOf(other))
operator fun ImmutableReactiveType<Double>.plus(other: Double): TransformerChain<Double> =
    TransformerChain({ this.value + other }, this@plus.transformer.dependencies)

operator fun TransformerChain<Double>.plus(other: MutableReactiveType<Double>): TransformerChain<Double> =
    TransformerChain({ this() + other.value }, setOf(other) union this@plus.dependencies)
operator fun TransformerChain<Double>.plus(other: TransformerChain<Double>): TransformerChain<Double> =
    TransformerChain({ this() + other() }, other.dependencies union this@plus.dependencies)
operator fun TransformerChain<Double>.plus(other: ImmutableReactiveType<Double>): TransformerChain<Double> =
    TransformerChain({ this() + other.value }, other.transformer.dependencies union this@plus.dependencies)
operator fun TransformerChain<Double>.plus(other: Double): TransformerChain<Double> =
    TransformerChain({ this() + other }, this@plus.dependencies)

/**
 * ================ Minus Operator ================
 **/
operator fun MutableReactiveType<Double>.minus(other: MutableReactiveType<Double>): TransformerChain<Double> =
    TransformerChain({ this.value - other.value }, setOf(this@minus, other))

operator fun MutableReactiveType<Double>.minus(other: ImmutableReactiveType<Double>): TransformerChain<Double> =
    TransformerChain({ this.value - other.value }, setOf(this@minus) union other.transformer.dependencies)
operator fun MutableReactiveType<Double>.minus(other: TransformerChain<Double>): TransformerChain<Double> =
    TransformerChain({ this.value - other() }, setOf(this@minus) union other.dependencies)
operator fun MutableReactiveType<Double>.minus(other: Double): TransformerChain<Double> =
    TransformerChain({ this.value - other }, setOf(this@minus))

operator fun ImmutableReactiveType<Double>.minus(other: MutableReactiveType<Double>): TransformerChain<Double> =
    TransformerChain({ this.value - other.value }, this@minus.transformer.dependencies union setOf(other))
operator fun ImmutableReactiveType<Double>.minus(other: TransformerChain<Double>): TransformerChain<Double> =
    TransformerChain({ this.value - other() }, this@minus.transformer.dependencies union setOf(other))
operator fun ImmutableReactiveType<Double>.minus(other: ImmutableReactiveType<Double>): TransformerChain<Double> =
    TransformerChain({ this.value - other.value }, this@minus.transformer.dependencies union setOf(other))
operator fun ImmutableReactiveType<Double>.minus(other: Double): TransformerChain<Double> =
    TransformerChain({ this.value - other }, this@minus.transformer.dependencies)

operator fun TransformerChain<Double>.minus(other: MutableReactiveType<Double>): TransformerChain<Double> =
    TransformerChain({ this() - other.value }, setOf(other) union this@minus.dependencies)
operator fun TransformerChain<Double>.minus(other: TransformerChain<Double>): TransformerChain<Double> =
    TransformerChain({ this() - other() }, other.dependencies union this@minus.dependencies)
operator fun TransformerChain<Double>.minus(other: ImmutableReactiveType<Double>): TransformerChain<Double> =
    TransformerChain({ this() - other.value }, other.transformer.dependencies union this@minus.dependencies)
operator fun TransformerChain<Double>.minus(other: Double): TransformerChain<Double> =
    TransformerChain({ this() - other }, this@minus.dependencies)

/**
 * ================ Times Operator ================
 **/
operator fun MutableReactiveType<Double>.times(other: MutableReactiveType<Double>): TransformerChain<Double> =
    TransformerChain({ this.value * other.value }, setOf(this@times, other))

operator fun MutableReactiveType<Double>.times(other: ImmutableReactiveType<Double>): TransformerChain<Double> =
    TransformerChain({ this.value * other.value }, setOf(this@times) union other.transformer.dependencies)
operator fun MutableReactiveType<Double>.times(other: TransformerChain<Double>): TransformerChain<Double> =
    TransformerChain({ this.value * other() }, setOf(this@times) union other.dependencies)
operator fun MutableReactiveType<Double>.times(other: Double): TransformerChain<Double> =
    TransformerChain({ this.value * other }, setOf(this@times))

operator fun ImmutableReactiveType<Double>.times(other: MutableReactiveType<Double>): TransformerChain<Double> =
    TransformerChain({ this.value * other.value }, this@times.transformer.dependencies union setOf(other))
operator fun ImmutableReactiveType<Double>.times(other: TransformerChain<Double>): TransformerChain<Double> =
    TransformerChain({ this.value * other() }, this@times.transformer.dependencies union setOf(other))
operator fun ImmutableReactiveType<Double>.times(other: ImmutableReactiveType<Double>): TransformerChain<Double> =
    TransformerChain({ this.value * other.value }, this@times.transformer.dependencies union setOf(other))
operator fun ImmutableReactiveType<Double>.times(other: Double): TransformerChain<Double> =
    TransformerChain({ this.value * other }, this@times.transformer.dependencies)

operator fun TransformerChain<Double>.times(other: MutableReactiveType<Double>): TransformerChain<Double> =
    TransformerChain({ this() * other.value }, setOf(other) union this@times.dependencies)
operator fun TransformerChain<Double>.times(other: TransformerChain<Double>): TransformerChain<Double> =
    TransformerChain({ this() * other() }, other.dependencies union this@times.dependencies)
operator fun TransformerChain<Double>.times(other: ImmutableReactiveType<Double>): TransformerChain<Double> =
    TransformerChain({ this() * other.value }, other.transformer.dependencies union this@times.dependencies)
operator fun TransformerChain<Double>.times(other: Double): TransformerChain<Double> =
    TransformerChain({ this() * other }, this@times.dependencies)

/**
 * ================ Div Operator ================
 **/
operator fun MutableReactiveType<Double>.div(other: MutableReactiveType<Double>): TransformerChain<Double> =
    TransformerChain({ this.value / other.value }, setOf(this@div, other))

operator fun MutableReactiveType<Double>.div(other: ImmutableReactiveType<Double>): TransformerChain<Double> =
    TransformerChain({ this.value / other.value }, setOf(this@div) union other.transformer.dependencies)
operator fun MutableReactiveType<Double>.div(other: TransformerChain<Double>): TransformerChain<Double> =
    TransformerChain({ this.value / other() }, setOf(this@div) union other.dependencies)
operator fun MutableReactiveType<Double>.div(other: Double): TransformerChain<Double> =
    TransformerChain({ this.value / other }, setOf(this@div))

operator fun ImmutableReactiveType<Double>.div(other: MutableReactiveType<Double>): TransformerChain<Double> =
    TransformerChain({ this.value / other.value }, this@div.transformer.dependencies union setOf(other))
operator fun ImmutableReactiveType<Double>.div(other: TransformerChain<Double>): TransformerChain<Double> =
    TransformerChain({ this.value / other() }, this@div.transformer.dependencies union setOf(other))
operator fun ImmutableReactiveType<Double>.div(other: ImmutableReactiveType<Double>): TransformerChain<Double> =
    TransformerChain({ this.value / other.value }, this@div.transformer.dependencies union setOf(other))
operator fun ImmutableReactiveType<Double>.div(other: Double): TransformerChain<Double> =
    TransformerChain({ this.value / other }, this@div.transformer.dependencies)

operator fun TransformerChain<Double>.div(other: MutableReactiveType<Double>): TransformerChain<Double> =
    TransformerChain({ this() / other.value }, setOf(other) union this@div.dependencies)
operator fun TransformerChain<Double>.div(other: TransformerChain<Double>): TransformerChain<Double> =
    TransformerChain({ this() / other() }, other.dependencies union this@div.dependencies)
operator fun TransformerChain<Double>.div(other: ImmutableReactiveType<Double>): TransformerChain<Double> =
    TransformerChain({ this() / other.value }, other.transformer.dependencies union this@div.dependencies)
operator fun TransformerChain<Double>.div(other: Double): TransformerChain<Double> =
    TransformerChain({ this() / other }, this@div.dependencies)

/**
 * ================ Assign Operators ================
 **/
operator fun MutableReactiveType<Double>.plusAssign(value: Double) {
    this.value += value
}

operator fun MutableReactiveType<Double>.minusAssign(value: Double) {
    this.value -= value
}

operator fun MutableReactiveType<Double>.timesAssign(value: Double) {
    this.value *= value
}

operator fun MutableReactiveType<Double>.divAssign(value: Double) {
    this.value /= value
}