package operator

import type.ImmutableReactiveType
import type.MutableReactiveType
import type.TransformerChain

/**
 * ================ Plus Operator ================
 **/
operator fun <T: Number> MutableReactiveType<Double>.plus(other: MutableReactiveType<T>): TransformerChain<Double> =
    TransformerChain({ this.value + other.value.toDouble() }, setOf(this@plus, other))

operator fun <T: Number> MutableReactiveType<Double>.plus(other: ImmutableReactiveType<T>): TransformerChain<Double> =
    TransformerChain({ this.value + other.value.toDouble() }, setOf(this@plus) union other.transformer.dependencies)
operator fun <T: Number> MutableReactiveType<Double>.plus(other: TransformerChain<T>): TransformerChain<Double> =
    TransformerChain({ this.value + other().toDouble() }, setOf(this@plus) union other.dependencies)
operator fun <T: Number> MutableReactiveType<Double>.plus(other: T): TransformerChain<Double> =
    TransformerChain({ this.value + other.toDouble() }, setOf(this@plus))

operator fun <T: Number> ImmutableReactiveType<Double>.plus(other: MutableReactiveType<T>): TransformerChain<Double> =
    TransformerChain({ this.value + other.value.toDouble() }, this@plus.transformer.dependencies union setOf(other))
operator fun <T: Number> ImmutableReactiveType<Double>.plus(other: TransformerChain<T>): TransformerChain<Double> =
    TransformerChain({ this.value + other().toDouble() }, this@plus.transformer.dependencies union setOf(other))
operator fun <T: Number> ImmutableReactiveType<Double>.plus(other: ImmutableReactiveType<T>): TransformerChain<Double> =
    TransformerChain({ this.value + other.value.toDouble() }, this@plus.transformer.dependencies union setOf(other))
operator fun <T: Number> ImmutableReactiveType<Double>.plus(other: T): TransformerChain<Double> =
    TransformerChain({ this.value + other.toDouble() }, this@plus.transformer.dependencies)

operator fun <T: Number>TransformerChain<Double>.plus(other: MutableReactiveType<T>): TransformerChain<Double> =
    TransformerChain({ this() + other.value.toDouble() }, setOf(other) union this@plus.dependencies)
operator fun <T: Number>TransformerChain<Double>.plus(other: TransformerChain<T>): TransformerChain<Double> =
    TransformerChain({ this() + other().toDouble() }, other.dependencies union this@plus.dependencies)
operator fun <T: Number>TransformerChain<Double>.plus(other: ImmutableReactiveType<T>): TransformerChain<Double> =
    TransformerChain({ this() + other.value.toDouble() }, other.transformer.dependencies union this@plus.dependencies)
operator fun <T: Number>TransformerChain<Double>.plus(other: T): TransformerChain<Double> =
    TransformerChain({ this() + other.toDouble() }, this@plus.dependencies)

/**
 * ================ Minus Operator ================
 **/
operator fun <T: Number> MutableReactiveType<Double>.minus(other: MutableReactiveType<T>): TransformerChain<Double> =
    TransformerChain({ this.value - other.value.toDouble() }, setOf(this@minus, other))

operator fun <T: Number> MutableReactiveType<Double>.minus(other: ImmutableReactiveType<T>): TransformerChain<Double> =
    TransformerChain({ this.value - other.value.toDouble() }, setOf(this@minus) union other.transformer.dependencies)
operator fun <T: Number> MutableReactiveType<Double>.minus(other: TransformerChain<T>): TransformerChain<Double> =
    TransformerChain({ this.value - other().toDouble() }, setOf(this@minus) union other.dependencies)
operator fun <T: Number> MutableReactiveType<Double>.minus(other: T): TransformerChain<Double> =
    TransformerChain({ this.value - other.toDouble() }, setOf(this@minus))

operator fun <T: Number> ImmutableReactiveType<Double>.minus(other: MutableReactiveType<T>): TransformerChain<Double> =
    TransformerChain({ this.value - other.value.toDouble() }, this@minus.transformer.dependencies union setOf(other))
operator fun <T: Number> ImmutableReactiveType<Double>.minus(other: TransformerChain<T>): TransformerChain<Double> =
    TransformerChain({ this.value - other().toDouble() }, this@minus.transformer.dependencies union setOf(other))
operator fun <T: Number> ImmutableReactiveType<Double>.minus(other: ImmutableReactiveType<T>): TransformerChain<Double> =
    TransformerChain({ this.value - other.value.toDouble() }, this@minus.transformer.dependencies union setOf(other))
operator fun <T: Number> ImmutableReactiveType<Double>.minus(other: T): TransformerChain<Double> =
    TransformerChain({ this.value - other.toDouble() }, this@minus.transformer.dependencies)

operator fun <T: Number>TransformerChain<Double>.minus(other: MutableReactiveType<T>): TransformerChain<Double> =
    TransformerChain({ this() - other.value.toDouble() }, setOf(other) union this@minus.dependencies)
operator fun <T: Number>TransformerChain<Double>.minus(other: TransformerChain<T>): TransformerChain<Double> =
    TransformerChain({ this() - other().toDouble() }, other.dependencies union this@minus.dependencies)
operator fun <T: Number>TransformerChain<Double>.minus(other: ImmutableReactiveType<T>): TransformerChain<Double> =
    TransformerChain({ this() - other.value.toDouble() }, other.transformer.dependencies union this@minus.dependencies)
operator fun <T: Number>TransformerChain<Double>.minus(other: T): TransformerChain<Double> =
    TransformerChain({ this() - other.toDouble() }, this@minus.dependencies)

/**
 * ================ Times Operator ================
 **/
operator fun <T: Number> MutableReactiveType<Double>.times(other: MutableReactiveType<T>): TransformerChain<Double> =
    TransformerChain({ this.value * other.value.toDouble() }, setOf(this@times, other))

operator fun <T: Number> MutableReactiveType<Double>.times(other: ImmutableReactiveType<T>): TransformerChain<Double> =
    TransformerChain({ this.value * other.value.toDouble() }, setOf(this@times) union other.transformer.dependencies)
operator fun <T: Number> MutableReactiveType<Double>.times(other: TransformerChain<T>): TransformerChain<Double> =
    TransformerChain({ this.value * other().toDouble() }, setOf(this@times) union other.dependencies)
operator fun <T: Number> MutableReactiveType<Double>.times(other: T): TransformerChain<Double> =
    TransformerChain({ this.value * other.toDouble() }, setOf(this@times))

operator fun <T: Number> ImmutableReactiveType<Double>.times(other: MutableReactiveType<T>): TransformerChain<Double> =
    TransformerChain({ this.value * other.value.toDouble() }, this@times.transformer.dependencies union setOf(other))
operator fun <T: Number> ImmutableReactiveType<Double>.times(other: TransformerChain<T>): TransformerChain<Double> =
    TransformerChain({ this.value * other().toDouble() }, this@times.transformer.dependencies union setOf(other))
operator fun <T: Number> ImmutableReactiveType<Double>.times(other: ImmutableReactiveType<T>): TransformerChain<Double> =
    TransformerChain({ this.value * other.value.toDouble() }, this@times.transformer.dependencies union setOf(other))
operator fun <T: Number> ImmutableReactiveType<Double>.times(other: T): TransformerChain<Double> =
    TransformerChain({ this.value * other.toDouble() }, this@times.transformer.dependencies)

operator fun <T: Number>TransformerChain<Double>.times(other: MutableReactiveType<T>): TransformerChain<Double> =
    TransformerChain({ this() * other.value.toDouble() }, setOf(other) union this@times.dependencies)
operator fun <T: Number>TransformerChain<Double>.times(other: TransformerChain<T>): TransformerChain<Double> =
    TransformerChain({ this() * other().toDouble() }, other.dependencies union this@times.dependencies)
operator fun <T: Number>TransformerChain<Double>.times(other: ImmutableReactiveType<T>): TransformerChain<Double> =
    TransformerChain({ this() * other.value.toDouble() }, other.transformer.dependencies union this@times.dependencies)
operator fun <T: Number>TransformerChain<Double>.times(other: T): TransformerChain<Double> =
    TransformerChain({ this() * other.toDouble() }, this@times.dependencies)

/**
 * ================ Div Operator ================
 **/
operator fun <T: Number> MutableReactiveType<Double>.div(other: MutableReactiveType<T>): TransformerChain<Double> =
    TransformerChain({ this.value / other.value.toDouble() }, setOf(this@div, other))

operator fun <T: Number> MutableReactiveType<Double>.div(other: ImmutableReactiveType<T>): TransformerChain<Double> =
    TransformerChain({ this.value / other.value.toDouble() }, setOf(this@div) union other.transformer.dependencies)
operator fun <T: Number> MutableReactiveType<Double>.div(other: TransformerChain<T>): TransformerChain<Double> =
    TransformerChain({ this.value / other().toDouble() }, setOf(this@div) union other.dependencies)
operator fun <T: Number> MutableReactiveType<Double>.div(other: T): TransformerChain<Double> =
    TransformerChain({ this.value / other.toDouble() }, setOf(this@div))

operator fun <T: Number> ImmutableReactiveType<Double>.div(other: MutableReactiveType<T>): TransformerChain<Double> =
    TransformerChain({ this.value / other.value.toDouble() }, this@div.transformer.dependencies union setOf(other))
operator fun <T: Number> ImmutableReactiveType<Double>.div(other: TransformerChain<T>): TransformerChain<Double> =
    TransformerChain({ this.value / other().toDouble() }, this@div.transformer.dependencies union setOf(other))
operator fun <T: Number> ImmutableReactiveType<Double>.div(other: ImmutableReactiveType<T>): TransformerChain<Double> =
    TransformerChain({ this.value / other.value.toDouble() }, this@div.transformer.dependencies union setOf(other))
operator fun <T: Number> ImmutableReactiveType<Double>.div(other: T): TransformerChain<Double> =
    TransformerChain({ this.value / other.toDouble() }, this@div.transformer.dependencies)

operator fun <T: Number>TransformerChain<Double>.div(other: MutableReactiveType<T>): TransformerChain<Double> =
    TransformerChain({ this() / other.value.toDouble() }, setOf(other) union this@div.dependencies)
operator fun <T: Number>TransformerChain<Double>.div(other: TransformerChain<T>): TransformerChain<Double> =
    TransformerChain({ this() / other().toDouble() }, other.dependencies union this@div.dependencies)
operator fun <T: Number>TransformerChain<Double>.div(other: ImmutableReactiveType<T>): TransformerChain<Double> =
    TransformerChain({ this() / other.value.toDouble() }, other.transformer.dependencies union this@div.dependencies)
operator fun <T: Number>TransformerChain<Double>.div(other: T): TransformerChain<Double> =
    TransformerChain({ this() / other.toDouble() }, this@div.dependencies)

/**
 * ================ Assign Operators ================
 **/
operator fun <T: Number> MutableReactiveType<Double>.plusAssign(value: T) {
    this.value += value.toDouble()
}

operator fun <T: Number> MutableReactiveType<Double>.minusAssign(value: T) {
    this.value -= value.toDouble()
}

operator fun <T: Number> MutableReactiveType<Double>.timesAssign(value: T) {
    this.value *= value.toDouble()
}

operator fun <T: Number> MutableReactiveType<Double>.divAssign(value: T) {
    this.value /= value.toDouble()
}