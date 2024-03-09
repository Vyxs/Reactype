package operator

import type.ImmutableReactiveType
import type.MutableReactiveType
import type.TransformerChain

/**
 * ================ Plus Operator ================
 **/
operator fun <T: Number> MutableReactiveType<Long>.plus(other: MutableReactiveType<T>): TransformerChain<Long> =
    TransformerChain({ this.value + other.value.toLong() }, setOf(this@plus, other))

operator fun <T: Number> MutableReactiveType<Long>.plus(other: ImmutableReactiveType<T>): TransformerChain<Long> =
    TransformerChain({ this.value + other.value.toLong() }, setOf(this@plus) union other.transformer.dependencies)
operator fun <T: Number> MutableReactiveType<Long>.plus(other: TransformerChain<T>): TransformerChain<Long> =
    TransformerChain({ this.value + other().toLong() }, setOf(this@plus) union other.dependencies)
operator fun <T: Number> MutableReactiveType<Long>.plus(other: T): TransformerChain<Long> =
    TransformerChain({ this.value + other.toLong() }, setOf(this@plus))

operator fun <T: Number> ImmutableReactiveType<Long>.plus(other: MutableReactiveType<T>): TransformerChain<Long> =
    TransformerChain({ this.value + other.value.toLong() }, this@plus.transformer.dependencies union setOf(other))
operator fun <T: Number> ImmutableReactiveType<Long>.plus(other: TransformerChain<T>): TransformerChain<Long> =
    TransformerChain({ this.value + other().toLong() }, this@plus.transformer.dependencies union setOf(other))
operator fun <T: Number> ImmutableReactiveType<Long>.plus(other: ImmutableReactiveType<T>): TransformerChain<Long> =
    TransformerChain({ this.value + other.value.toLong() }, this@plus.transformer.dependencies union setOf(other))
operator fun <T: Number> ImmutableReactiveType<Long>.plus(other: T): TransformerChain<Long> =
    TransformerChain({ this.value + other.toLong() }, this@plus.transformer.dependencies)

operator fun <T: Number>TransformerChain<Long>.plus(other: MutableReactiveType<T>): TransformerChain<Long> =
    TransformerChain({ this() + other.value.toLong() }, setOf(other) union this@plus.dependencies)
operator fun <T: Number>TransformerChain<Long>.plus(other: TransformerChain<T>): TransformerChain<Long> =
    TransformerChain({ this() + other().toLong() }, other.dependencies union this@plus.dependencies)
operator fun <T: Number>TransformerChain<Long>.plus(other: ImmutableReactiveType<T>): TransformerChain<Long> =
    TransformerChain({ this() + other.value.toLong() }, other.transformer.dependencies union this@plus.dependencies)
operator fun <T: Number>TransformerChain<Long>.plus(other: T): TransformerChain<Long> =
    TransformerChain({ this() + other.toLong() }, this@plus.dependencies)

/**
 * ================ Minus Operator ================
 **/
operator fun <T: Number> MutableReactiveType<Long>.minus(other: MutableReactiveType<T>): TransformerChain<Long> =
    TransformerChain({ this.value - other.value.toLong() }, setOf(this@minus, other))

operator fun <T: Number> MutableReactiveType<Long>.minus(other: ImmutableReactiveType<T>): TransformerChain<Long> =
    TransformerChain({ this.value - other.value.toLong() }, setOf(this@minus) union other.transformer.dependencies)
operator fun <T: Number> MutableReactiveType<Long>.minus(other: TransformerChain<T>): TransformerChain<Long> =
    TransformerChain({ this.value - other().toLong() }, setOf(this@minus) union other.dependencies)
operator fun <T: Number> MutableReactiveType<Long>.minus(other: T): TransformerChain<Long> =
    TransformerChain({ this.value - other.toLong() }, setOf(this@minus))

operator fun <T: Number> ImmutableReactiveType<Long>.minus(other: MutableReactiveType<T>): TransformerChain<Long> =
    TransformerChain({ this.value - other.value.toLong() }, this@minus.transformer.dependencies union setOf(other))
operator fun <T: Number> ImmutableReactiveType<Long>.minus(other: TransformerChain<T>): TransformerChain<Long> =
    TransformerChain({ this.value - other().toLong() }, this@minus.transformer.dependencies union setOf(other))
operator fun <T: Number> ImmutableReactiveType<Long>.minus(other: ImmutableReactiveType<T>): TransformerChain<Long> =
    TransformerChain({ this.value - other.value.toLong() }, this@minus.transformer.dependencies union setOf(other))
operator fun <T: Number> ImmutableReactiveType<Long>.minus(other: T): TransformerChain<Long> =
    TransformerChain({ this.value - other.toLong() }, this@minus.transformer.dependencies)

operator fun <T: Number>TransformerChain<Long>.minus(other: MutableReactiveType<T>): TransformerChain<Long> =
    TransformerChain({ this() - other.value.toLong() }, setOf(other) union this@minus.dependencies)
operator fun <T: Number>TransformerChain<Long>.minus(other: TransformerChain<T>): TransformerChain<Long> =
    TransformerChain({ this() - other().toLong() }, other.dependencies union this@minus.dependencies)
operator fun <T: Number>TransformerChain<Long>.minus(other: ImmutableReactiveType<T>): TransformerChain<Long> =
    TransformerChain({ this() - other.value.toLong() }, other.transformer.dependencies union this@minus.dependencies)
operator fun <T: Number>TransformerChain<Long>.minus(other: T): TransformerChain<Long> =
    TransformerChain({ this() - other.toLong() }, this@minus.dependencies)

/**
 * ================ Times Operator ================
 **/
operator fun <T: Number> MutableReactiveType<Long>.times(other: MutableReactiveType<T>): TransformerChain<Long> =
    TransformerChain({ this.value * other.value.toLong() }, setOf(this@times, other))

operator fun <T: Number> MutableReactiveType<Long>.times(other: ImmutableReactiveType<T>): TransformerChain<Long> =
    TransformerChain({ this.value * other.value.toLong() }, setOf(this@times) union other.transformer.dependencies)
operator fun <T: Number> MutableReactiveType<Long>.times(other: TransformerChain<T>): TransformerChain<Long> =
    TransformerChain({ this.value * other().toLong() }, setOf(this@times) union other.dependencies)
operator fun <T: Number> MutableReactiveType<Long>.times(other: T): TransformerChain<Long> =
    TransformerChain({ this.value * other.toLong() }, setOf(this@times))

operator fun <T: Number> ImmutableReactiveType<Long>.times(other: MutableReactiveType<T>): TransformerChain<Long> =
    TransformerChain({ this.value * other.value.toLong() }, this@times.transformer.dependencies union setOf(other))
operator fun <T: Number> ImmutableReactiveType<Long>.times(other: TransformerChain<T>): TransformerChain<Long> =
    TransformerChain({ this.value * other().toLong() }, this@times.transformer.dependencies union setOf(other))
operator fun <T: Number> ImmutableReactiveType<Long>.times(other: ImmutableReactiveType<T>): TransformerChain<Long> =
    TransformerChain({ this.value * other.value.toLong() }, this@times.transformer.dependencies union setOf(other))
operator fun <T: Number> ImmutableReactiveType<Long>.times(other: T): TransformerChain<Long> =
    TransformerChain({ this.value * other.toLong() }, this@times.transformer.dependencies)

operator fun <T: Number>TransformerChain<Long>.times(other: MutableReactiveType<T>): TransformerChain<Long> =
    TransformerChain({ this() * other.value.toLong() }, setOf(other) union this@times.dependencies)
operator fun <T: Number>TransformerChain<Long>.times(other: TransformerChain<T>): TransformerChain<Long> =
    TransformerChain({ this() * other().toLong() }, other.dependencies union this@times.dependencies)
operator fun <T: Number>TransformerChain<Long>.times(other: ImmutableReactiveType<T>): TransformerChain<Long> =
    TransformerChain({ this() * other.value.toLong() }, other.transformer.dependencies union this@times.dependencies)
operator fun <T: Number>TransformerChain<Long>.times(other: T): TransformerChain<Long> =
    TransformerChain({ this() * other.toLong() }, this@times.dependencies)

/**
 * ================ Div Operator ================
 **/
operator fun <T: Number> MutableReactiveType<Long>.div(other: MutableReactiveType<T>): TransformerChain<Long> =
    TransformerChain({ this.value / other.value.toLong() }, setOf(this@div, other))

operator fun <T: Number> MutableReactiveType<Long>.div(other: ImmutableReactiveType<T>): TransformerChain<Long> =
    TransformerChain({ this.value / other.value.toLong() }, setOf(this@div) union other.transformer.dependencies)
operator fun <T: Number> MutableReactiveType<Long>.div(other: TransformerChain<T>): TransformerChain<Long> =
    TransformerChain({ this.value / other().toLong() }, setOf(this@div) union other.dependencies)
operator fun <T: Number> MutableReactiveType<Long>.div(other: T): TransformerChain<Long> =
    TransformerChain({ this.value / other.toLong() }, setOf(this@div))

operator fun <T: Number> ImmutableReactiveType<Long>.div(other: MutableReactiveType<T>): TransformerChain<Long> =
    TransformerChain({ this.value / other.value.toLong() }, this@div.transformer.dependencies union setOf(other))
operator fun <T: Number> ImmutableReactiveType<Long>.div(other: TransformerChain<T>): TransformerChain<Long> =
    TransformerChain({ this.value / other().toLong() }, this@div.transformer.dependencies union setOf(other))
operator fun <T: Number> ImmutableReactiveType<Long>.div(other: ImmutableReactiveType<T>): TransformerChain<Long> =
    TransformerChain({ this.value / other.value.toLong() }, this@div.transformer.dependencies union setOf(other))
operator fun <T: Number> ImmutableReactiveType<Long>.div(other: T): TransformerChain<Long> =
    TransformerChain({ this.value / other.toLong() }, this@div.transformer.dependencies)

operator fun <T: Number>TransformerChain<Long>.div(other: MutableReactiveType<T>): TransformerChain<Long> =
    TransformerChain({ this() / other.value.toLong() }, setOf(other) union this@div.dependencies)
operator fun <T: Number>TransformerChain<Long>.div(other: TransformerChain<T>): TransformerChain<Long> =
    TransformerChain({ this() / other().toLong() }, other.dependencies union this@div.dependencies)
operator fun <T: Number>TransformerChain<Long>.div(other: ImmutableReactiveType<T>): TransformerChain<Long> =
    TransformerChain({ this() / other.value.toLong() }, other.transformer.dependencies union this@div.dependencies)
operator fun <T: Number>TransformerChain<Long>.div(other: T): TransformerChain<Long> =
    TransformerChain({ this() / other.toLong() }, this@div.dependencies)

/**
 * ================ Assign Operators ================
 **/
operator fun <T: Number> MutableReactiveType<Long>.plusAssign(value: T) {
    this.value += value.toLong()
}

operator fun <T: Number> MutableReactiveType<Long>.minusAssign(value: T) {
    this.value -= value.toLong()
}

operator fun <T: Number> MutableReactiveType<Long>.timesAssign(value: T) {
    this.value *= value.toLong()
}

operator fun <T: Number> MutableReactiveType<Long>.divAssign(value: T) {
    this.value /= value.toLong()
}