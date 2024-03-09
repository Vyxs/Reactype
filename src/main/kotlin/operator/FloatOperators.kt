package operator

import type.ImmutableReactiveType
import type.MutableReactiveType
import type.TransformerChain

/**
 * ================ Plus Operator ================
 **/
operator fun <T: Number> MutableReactiveType<Float>.plus(other: MutableReactiveType<T>): TransformerChain<Float> =
    TransformerChain({ this.value + other.value.toFloat() }, setOf(this@plus, other))

operator fun <T: Number> MutableReactiveType<Float>.plus(other: ImmutableReactiveType<T>): TransformerChain<Float> =
    TransformerChain({ this.value + other.value.toFloat() }, setOf(this@plus) union other.transformer.dependencies)
operator fun <T: Number> MutableReactiveType<Float>.plus(other: TransformerChain<T>): TransformerChain<Float> =
    TransformerChain({ this.value + other().toFloat() }, setOf(this@plus) union other.dependencies)
operator fun <T: Number> MutableReactiveType<Float>.plus(other: T): TransformerChain<Float> =
    TransformerChain({ this.value + other.toFloat() }, setOf(this@plus))

operator fun <T: Number> ImmutableReactiveType<Float>.plus(other: MutableReactiveType<T>): TransformerChain<Float> =
    TransformerChain({ this.value + other.value.toFloat() }, this@plus.transformer.dependencies union setOf(other))
operator fun <T: Number> ImmutableReactiveType<Float>.plus(other: TransformerChain<T>): TransformerChain<Float> =
    TransformerChain({ this.value + other().toFloat() }, this@plus.transformer.dependencies union setOf(other))
operator fun <T: Number> ImmutableReactiveType<Float>.plus(other: ImmutableReactiveType<T>): TransformerChain<Float> =
    TransformerChain({ this.value + other.value.toFloat() }, this@plus.transformer.dependencies union setOf(other))
operator fun <T: Number> ImmutableReactiveType<Float>.plus(other: T): TransformerChain<Float> =
    TransformerChain({ this.value + other.toFloat() }, this@plus.transformer.dependencies)

operator fun <T: Number>TransformerChain<Float>.plus(other: MutableReactiveType<T>): TransformerChain<Float> =
    TransformerChain({ this() + other.value.toFloat() }, setOf(other) union this@plus.dependencies)
operator fun <T: Number>TransformerChain<Float>.plus(other: TransformerChain<T>): TransformerChain<Float> =
    TransformerChain({ this() + other().toFloat() }, other.dependencies union this@plus.dependencies)
operator fun <T: Number>TransformerChain<Float>.plus(other: ImmutableReactiveType<T>): TransformerChain<Float> =
    TransformerChain({ this() + other.value.toFloat() }, other.transformer.dependencies union this@plus.dependencies)
operator fun <T: Number>TransformerChain<Float>.plus(other: T): TransformerChain<Float> =
    TransformerChain({ this() + other.toFloat() }, this@plus.dependencies)

/**
 * ================ Minus Operator ================
 **/
operator fun <T: Number> MutableReactiveType<Float>.minus(other: MutableReactiveType<T>): TransformerChain<Float> =
    TransformerChain({ this.value - other.value.toFloat() }, setOf(this@minus, other))

operator fun <T: Number> MutableReactiveType<Float>.minus(other: ImmutableReactiveType<T>): TransformerChain<Float> =
    TransformerChain({ this.value - other.value.toFloat() }, setOf(this@minus) union other.transformer.dependencies)
operator fun <T: Number> MutableReactiveType<Float>.minus(other: TransformerChain<T>): TransformerChain<Float> =
    TransformerChain({ this.value - other().toFloat() }, setOf(this@minus) union other.dependencies)
operator fun <T: Number> MutableReactiveType<Float>.minus(other: T): TransformerChain<Float> =
    TransformerChain({ this.value - other.toFloat() }, setOf(this@minus))

operator fun <T: Number> ImmutableReactiveType<Float>.minus(other: MutableReactiveType<T>): TransformerChain<Float> =
    TransformerChain({ this.value - other.value.toFloat() }, this@minus.transformer.dependencies union setOf(other))
operator fun <T: Number> ImmutableReactiveType<Float>.minus(other: TransformerChain<T>): TransformerChain<Float> =
    TransformerChain({ this.value - other().toFloat() }, this@minus.transformer.dependencies union setOf(other))
operator fun <T: Number> ImmutableReactiveType<Float>.minus(other: ImmutableReactiveType<T>): TransformerChain<Float> =
    TransformerChain({ this.value - other.value.toFloat() }, this@minus.transformer.dependencies union setOf(other))
operator fun <T: Number> ImmutableReactiveType<Float>.minus(other: T): TransformerChain<Float> =
    TransformerChain({ this.value - other.toFloat() }, this@minus.transformer.dependencies)

operator fun <T: Number>TransformerChain<Float>.minus(other: MutableReactiveType<T>): TransformerChain<Float> =
    TransformerChain({ this() - other.value.toFloat() }, setOf(other) union this@minus.dependencies)
operator fun <T: Number>TransformerChain<Float>.minus(other: TransformerChain<T>): TransformerChain<Float> =
    TransformerChain({ this() - other().toFloat() }, other.dependencies union this@minus.dependencies)
operator fun <T: Number>TransformerChain<Float>.minus(other: ImmutableReactiveType<T>): TransformerChain<Float> =
    TransformerChain({ this() - other.value.toFloat() }, other.transformer.dependencies union this@minus.dependencies)
operator fun <T: Number>TransformerChain<Float>.minus(other: T): TransformerChain<Float> =
    TransformerChain({ this() - other.toFloat() }, this@minus.dependencies)

/**
 * ================ Times Operator ================
 **/
operator fun <T: Number> MutableReactiveType<Float>.times(other: MutableReactiveType<T>): TransformerChain<Float> =
    TransformerChain({ this.value * other.value.toFloat() }, setOf(this@times, other))

operator fun <T: Number> MutableReactiveType<Float>.times(other: ImmutableReactiveType<T>): TransformerChain<Float> =
    TransformerChain({ this.value * other.value.toFloat() }, setOf(this@times) union other.transformer.dependencies)
operator fun <T: Number> MutableReactiveType<Float>.times(other: TransformerChain<T>): TransformerChain<Float> =
    TransformerChain({ this.value * other().toFloat() }, setOf(this@times) union other.dependencies)
operator fun <T: Number> MutableReactiveType<Float>.times(other: T): TransformerChain<Float> =
    TransformerChain({ this.value * other.toFloat() }, setOf(this@times))

operator fun <T: Number> ImmutableReactiveType<Float>.times(other: MutableReactiveType<T>): TransformerChain<Float> =
    TransformerChain({ this.value * other.value.toFloat() }, this@times.transformer.dependencies union setOf(other))
operator fun <T: Number> ImmutableReactiveType<Float>.times(other: TransformerChain<T>): TransformerChain<Float> =
    TransformerChain({ this.value * other().toFloat() }, this@times.transformer.dependencies union setOf(other))
operator fun <T: Number> ImmutableReactiveType<Float>.times(other: ImmutableReactiveType<T>): TransformerChain<Float> =
    TransformerChain({ this.value * other.value.toFloat() }, this@times.transformer.dependencies union setOf(other))
operator fun <T: Number> ImmutableReactiveType<Float>.times(other: T): TransformerChain<Float> =
    TransformerChain({ this.value * other.toFloat() }, this@times.transformer.dependencies)

operator fun <T: Number>TransformerChain<Float>.times(other: MutableReactiveType<T>): TransformerChain<Float> =
    TransformerChain({ this() * other.value.toFloat() }, setOf(other) union this@times.dependencies)
operator fun <T: Number>TransformerChain<Float>.times(other: TransformerChain<T>): TransformerChain<Float> =
    TransformerChain({ this() * other().toFloat() }, other.dependencies union this@times.dependencies)
operator fun <T: Number>TransformerChain<Float>.times(other: ImmutableReactiveType<T>): TransformerChain<Float> =
    TransformerChain({ this() * other.value.toFloat() }, other.transformer.dependencies union this@times.dependencies)
operator fun <T: Number>TransformerChain<Float>.times(other: T): TransformerChain<Float> =
    TransformerChain({ this() * other.toFloat() }, this@times.dependencies)

/**
 * ================ Div Operator ================
 **/
operator fun <T: Number> MutableReactiveType<Float>.div(other: MutableReactiveType<T>): TransformerChain<Float> =
    TransformerChain({ this.value / other.value.toFloat() }, setOf(this@div, other))

operator fun <T: Number> MutableReactiveType<Float>.div(other: ImmutableReactiveType<T>): TransformerChain<Float> =
    TransformerChain({ this.value / other.value.toFloat() }, setOf(this@div) union other.transformer.dependencies)
operator fun <T: Number> MutableReactiveType<Float>.div(other: TransformerChain<T>): TransformerChain<Float> =
    TransformerChain({ this.value / other().toFloat() }, setOf(this@div) union other.dependencies)
operator fun <T: Number> MutableReactiveType<Float>.div(other: T): TransformerChain<Float> =
    TransformerChain({ this.value / other.toFloat() }, setOf(this@div))

operator fun <T: Number> ImmutableReactiveType<Float>.div(other: MutableReactiveType<T>): TransformerChain<Float> =
    TransformerChain({ this.value / other.value.toFloat() }, this@div.transformer.dependencies union setOf(other))
operator fun <T: Number> ImmutableReactiveType<Float>.div(other: TransformerChain<T>): TransformerChain<Float> =
    TransformerChain({ this.value / other().toFloat() }, this@div.transformer.dependencies union setOf(other))
operator fun <T: Number> ImmutableReactiveType<Float>.div(other: ImmutableReactiveType<T>): TransformerChain<Float> =
    TransformerChain({ this.value / other.value.toFloat() }, this@div.transformer.dependencies union setOf(other))
operator fun <T: Number> ImmutableReactiveType<Float>.div(other: T): TransformerChain<Float> =
    TransformerChain({ this.value / other.toFloat() }, this@div.transformer.dependencies)

operator fun <T: Number>TransformerChain<Float>.div(other: MutableReactiveType<T>): TransformerChain<Float> =
    TransformerChain({ this() / other.value.toFloat() }, setOf(other) union this@div.dependencies)
operator fun <T: Number>TransformerChain<Float>.div(other: TransformerChain<T>): TransformerChain<Float> =
    TransformerChain({ this() / other().toFloat() }, other.dependencies union this@div.dependencies)
operator fun <T: Number>TransformerChain<Float>.div(other: ImmutableReactiveType<T>): TransformerChain<Float> =
    TransformerChain({ this() / other.value.toFloat() }, other.transformer.dependencies union this@div.dependencies)
operator fun <T: Number>TransformerChain<Float>.div(other: T): TransformerChain<Float> =
    TransformerChain({ this() / other.toFloat() }, this@div.dependencies)

/**
 * ================ Assign Operators ================
 **/
operator fun <T: Number> MutableReactiveType<Float>.plusAssign(value: T) {
    this.value += value.toFloat()
}

operator fun <T: Number> MutableReactiveType<Float>.minusAssign(value: T) {
    this.value -= value.toFloat()
}

operator fun <T: Number> MutableReactiveType<Float>.timesAssign(value: T) {
    this.value *= value.toFloat()
}

operator fun <T: Number> MutableReactiveType<Float>.divAssign(value: T) {
    this.value /= value.toFloat()
}