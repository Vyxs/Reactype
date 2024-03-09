package operator

import type.ImmutableReactiveType
import type.MutableReactiveType
import type.TransformerChain

/**
 * ================ Plus Operator ================
 **/
operator fun MutableReactiveType<Float>.plus(other: MutableReactiveType<Float>): TransformerChain<Float> =
    TransformerChain({ this.value + other.value }, setOf(this@plus, other))

operator fun MutableReactiveType<Float>.plus(other: ImmutableReactiveType<Float>): TransformerChain<Float> =
    TransformerChain({ this.value + other.value }, setOf(this@plus) union other.transformer.dependencies)
operator fun MutableReactiveType<Float>.plus(other: TransformerChain<Float>): TransformerChain<Float> =
    TransformerChain({ this.value + other() }, setOf(this@plus) union other.dependencies)
operator fun MutableReactiveType<Float>.plus(other: Float): TransformerChain<Float> =
    TransformerChain({ this.value + other }, setOf(this@plus))

operator fun ImmutableReactiveType<Float>.plus(other: MutableReactiveType<Float>): TransformerChain<Float> =
    TransformerChain({ this.value + other.value }, this@plus.transformer.dependencies union setOf(other))
operator fun ImmutableReactiveType<Float>.plus(other: TransformerChain<Float>): TransformerChain<Float> =
    TransformerChain({ this.value + other() }, this@plus.transformer.dependencies union setOf(other))
operator fun ImmutableReactiveType<Float>.plus(other: ImmutableReactiveType<Float>): TransformerChain<Float> =
    TransformerChain({ this.value + other.value }, this@plus.transformer.dependencies union setOf(other))
operator fun ImmutableReactiveType<Float>.plus(other: Float): TransformerChain<Float> =
    TransformerChain({ this.value + other }, this@plus.transformer.dependencies)

operator fun TransformerChain<Float>.plus(other: MutableReactiveType<Float>): TransformerChain<Float> =
    TransformerChain({ this() + other.value }, setOf(other) union this@plus.dependencies)
operator fun TransformerChain<Float>.plus(other: TransformerChain<Float>): TransformerChain<Float> =
    TransformerChain({ this() + other() }, other.dependencies union this@plus.dependencies)
operator fun TransformerChain<Float>.plus(other: ImmutableReactiveType<Float>): TransformerChain<Float> =
    TransformerChain({ this() + other.value }, other.transformer.dependencies union this@plus.dependencies)
operator fun TransformerChain<Float>.plus(other: Float): TransformerChain<Float> =
    TransformerChain({ this() + other }, this@plus.dependencies)

/**
 * ================ Minus Operator ================
 **/
operator fun MutableReactiveType<Float>.minus(other: MutableReactiveType<Float>): TransformerChain<Float> =
    TransformerChain({ this.value - other.value }, setOf(this@minus, other))

operator fun MutableReactiveType<Float>.minus(other: ImmutableReactiveType<Float>): TransformerChain<Float> =
    TransformerChain({ this.value - other.value }, setOf(this@minus) union other.transformer.dependencies)
operator fun MutableReactiveType<Float>.minus(other: TransformerChain<Float>): TransformerChain<Float> =
    TransformerChain({ this.value - other() }, setOf(this@minus) union other.dependencies)
operator fun MutableReactiveType<Float>.minus(other: Float): TransformerChain<Float> =
    TransformerChain({ this.value - other }, setOf(this@minus))

operator fun ImmutableReactiveType<Float>.minus(other: MutableReactiveType<Float>): TransformerChain<Float> =
    TransformerChain({ this.value - other.value }, this@minus.transformer.dependencies union setOf(other))
operator fun ImmutableReactiveType<Float>.minus(other: TransformerChain<Float>): TransformerChain<Float> =
    TransformerChain({ this.value - other() }, this@minus.transformer.dependencies union setOf(other))
operator fun ImmutableReactiveType<Float>.minus(other: ImmutableReactiveType<Float>): TransformerChain<Float> =
    TransformerChain({ this.value - other.value }, this@minus.transformer.dependencies union setOf(other))
operator fun ImmutableReactiveType<Float>.minus(other: Float): TransformerChain<Float> =
    TransformerChain({ this.value - other }, this@minus.transformer.dependencies)

operator fun TransformerChain<Float>.minus(other: MutableReactiveType<Float>): TransformerChain<Float> =
    TransformerChain({ this() - other.value }, setOf(other) union this@minus.dependencies)
operator fun TransformerChain<Float>.minus(other: TransformerChain<Float>): TransformerChain<Float> =
    TransformerChain({ this() - other() }, other.dependencies union this@minus.dependencies)
operator fun TransformerChain<Float>.minus(other: ImmutableReactiveType<Float>): TransformerChain<Float> =
    TransformerChain({ this() - other.value }, other.transformer.dependencies union this@minus.dependencies)
operator fun TransformerChain<Float>.minus(other: Float): TransformerChain<Float> =
    TransformerChain({ this() - other }, this@minus.dependencies)

/**
 * ================ Times Operator ================
 **/
operator fun MutableReactiveType<Float>.times(other: MutableReactiveType<Float>): TransformerChain<Float> =
    TransformerChain({ this.value * other.value }, setOf(this@times, other))

operator fun MutableReactiveType<Float>.times(other: ImmutableReactiveType<Float>): TransformerChain<Float> =
    TransformerChain({ this.value * other.value }, setOf(this@times) union other.transformer.dependencies)
operator fun MutableReactiveType<Float>.times(other: TransformerChain<Float>): TransformerChain<Float> =
    TransformerChain({ this.value * other() }, setOf(this@times) union other.dependencies)
operator fun MutableReactiveType<Float>.times(other: Float): TransformerChain<Float> =
    TransformerChain({ this.value * other }, setOf(this@times))

operator fun ImmutableReactiveType<Float>.times(other: MutableReactiveType<Float>): TransformerChain<Float> =
    TransformerChain({ this.value * other.value }, this@times.transformer.dependencies union setOf(other))
operator fun ImmutableReactiveType<Float>.times(other: TransformerChain<Float>): TransformerChain<Float> =
    TransformerChain({ this.value * other() }, this@times.transformer.dependencies union setOf(other))
operator fun ImmutableReactiveType<Float>.times(other: ImmutableReactiveType<Float>): TransformerChain<Float> =
    TransformerChain({ this.value * other.value }, this@times.transformer.dependencies union setOf(other))
operator fun ImmutableReactiveType<Float>.times(other: Float): TransformerChain<Float> =
    TransformerChain({ this.value * other }, this@times.transformer.dependencies)

operator fun TransformerChain<Float>.times(other: MutableReactiveType<Float>): TransformerChain<Float> =
    TransformerChain({ this() * other.value }, setOf(other) union this@times.dependencies)
operator fun TransformerChain<Float>.times(other: TransformerChain<Float>): TransformerChain<Float> =
    TransformerChain({ this() * other() }, other.dependencies union this@times.dependencies)
operator fun TransformerChain<Float>.times(other: ImmutableReactiveType<Float>): TransformerChain<Float> =
    TransformerChain({ this() * other.value }, other.transformer.dependencies union this@times.dependencies)
operator fun TransformerChain<Float>.times(other: Float): TransformerChain<Float> =
    TransformerChain({ this() * other }, this@times.dependencies)

/**
 * ================ Div Operator ================
 **/
operator fun MutableReactiveType<Float>.div(other: MutableReactiveType<Float>): TransformerChain<Float> =
    TransformerChain({ this.value / other.value }, setOf(this@div, other))

operator fun MutableReactiveType<Float>.div(other: ImmutableReactiveType<Float>): TransformerChain<Float> =
    TransformerChain({ this.value / other.value }, setOf(this@div) union other.transformer.dependencies)
operator fun MutableReactiveType<Float>.div(other: TransformerChain<Float>): TransformerChain<Float> =
    TransformerChain({ this.value / other() }, setOf(this@div) union other.dependencies)
operator fun MutableReactiveType<Float>.div(other: Float): TransformerChain<Float> =
    TransformerChain({ this.value / other }, setOf(this@div))

operator fun ImmutableReactiveType<Float>.div(other: MutableReactiveType<Float>): TransformerChain<Float> =
    TransformerChain({ this.value / other.value }, this@div.transformer.dependencies union setOf(other))
operator fun ImmutableReactiveType<Float>.div(other: TransformerChain<Float>): TransformerChain<Float> =
    TransformerChain({ this.value / other() }, this@div.transformer.dependencies union setOf(other))
operator fun ImmutableReactiveType<Float>.div(other: ImmutableReactiveType<Float>): TransformerChain<Float> =
    TransformerChain({ this.value / other.value }, this@div.transformer.dependencies union setOf(other))
operator fun ImmutableReactiveType<Float>.div(other: Float): TransformerChain<Float> =
    TransformerChain({ this.value / other }, this@div.transformer.dependencies)

operator fun TransformerChain<Float>.div(other: MutableReactiveType<Float>): TransformerChain<Float> =
    TransformerChain({ this() / other.value }, setOf(other) union this@div.dependencies)
operator fun TransformerChain<Float>.div(other: TransformerChain<Float>): TransformerChain<Float> =
    TransformerChain({ this() / other() }, other.dependencies union this@div.dependencies)
operator fun TransformerChain<Float>.div(other: ImmutableReactiveType<Float>): TransformerChain<Float> =
    TransformerChain({ this() / other.value }, other.transformer.dependencies union this@div.dependencies)
operator fun TransformerChain<Float>.div(other: Float): TransformerChain<Float> =
    TransformerChain({ this() / other }, this@div.dependencies)

/**
 * ================ Assign Operators ================
 **/
operator fun MutableReactiveType<Float>.plusAssign(value: Float) {
    this.value += value
}

operator fun MutableReactiveType<Float>.minusAssign(value: Float) {
    this.value -= value
}

operator fun MutableReactiveType<Float>.timesAssign(value: Float) {
    this.value *= value
}

operator fun MutableReactiveType<Float>.divAssign(value: Float) {
    this.value /= value
}