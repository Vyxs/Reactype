package operator

import type.ImmutableReactiveType
import type.MutableReactiveType
import type.TransformerChain

/**
 * ================ Plus Operator ================
 **/
operator fun <T: Number> MutableReactiveType<Int>.plus(other: MutableReactiveType<T>): TransformerChain<Int> =
    TransformerChain({ this.value + other.value.toInt() }, setOf(this@plus, other))

operator fun <T: Number> MutableReactiveType<Int>.plus(other: ImmutableReactiveType<T>): TransformerChain<Int> =
    TransformerChain({ this.value + other.value.toInt() }, setOf(this@plus) union other.transformer.dependencies)
operator fun <T: Number> MutableReactiveType<Int>.plus(other: TransformerChain<T>): TransformerChain<Int> =
    TransformerChain({ this.value + other().toInt() }, setOf(this@plus) union other.dependencies)
operator fun <T: Number> MutableReactiveType<Int>.plus(other: T): TransformerChain<Int> =
    TransformerChain({ this.value + other.toInt() }, setOf(this@plus))

operator fun <T: Number> ImmutableReactiveType<Int>.plus(other: MutableReactiveType<T>): TransformerChain<Int> =
    TransformerChain({ this.value + other.value.toInt() }, this@plus.transformer.dependencies union setOf(other))
operator fun <T: Number> ImmutableReactiveType<Int>.plus(other: TransformerChain<T>): TransformerChain<Int> =
    TransformerChain({ this.value + other().toInt() }, this@plus.transformer.dependencies union setOf(other))
operator fun <T: Number> ImmutableReactiveType<Int>.plus(other: ImmutableReactiveType<T>): TransformerChain<Int> =
    TransformerChain({ this.value + other.value.toInt() }, this@plus.transformer.dependencies union setOf(other))
operator fun <T: Number> ImmutableReactiveType<Int>.plus(other: T): TransformerChain<Int> =
    TransformerChain({ this.value + other.toInt() }, this@plus.transformer.dependencies)

operator fun <T: Number>TransformerChain<Int>.plus(other: MutableReactiveType<T>): TransformerChain<Int> =
    TransformerChain({ this() + other.value.toInt() }, setOf(other) union this@plus.dependencies)
operator fun <T: Number>TransformerChain<Int>.plus(other: TransformerChain<T>): TransformerChain<Int> =
    TransformerChain({ this() + other().toInt() }, other.dependencies union this@plus.dependencies)
operator fun <T: Number>TransformerChain<Int>.plus(other: ImmutableReactiveType<T>): TransformerChain<Int> =
    TransformerChain({ this() + other.value.toInt() }, other.transformer.dependencies union this@plus.dependencies)
operator fun <T: Number>TransformerChain<Int>.plus(other: T): TransformerChain<Int> =
    TransformerChain({ this() + other.toInt() }, this@plus.dependencies)

/**
 * ================ Minus Operator ================
 **/
operator fun <T: Number> MutableReactiveType<Int>.minus(other: MutableReactiveType<T>): TransformerChain<Int> =
    TransformerChain({ this.value - other.value.toInt() }, setOf(this@minus, other))

operator fun <T: Number> MutableReactiveType<Int>.minus(other: ImmutableReactiveType<T>): TransformerChain<Int> =
    TransformerChain({ this.value - other.value.toInt() }, setOf(this@minus) union other.transformer.dependencies)
operator fun <T: Number> MutableReactiveType<Int>.minus(other: TransformerChain<T>): TransformerChain<Int> =
    TransformerChain({ this.value - other().toInt() }, setOf(this@minus) union other.dependencies)
operator fun <T: Number> MutableReactiveType<Int>.minus(other: T): TransformerChain<Int> =
    TransformerChain({ this.value - other.toInt() }, setOf(this@minus))

operator fun <T: Number> ImmutableReactiveType<Int>.minus(other: MutableReactiveType<T>): TransformerChain<Int> =
    TransformerChain({ this.value - other.value.toInt() }, this@minus.transformer.dependencies union setOf(other))
operator fun <T: Number> ImmutableReactiveType<Int>.minus(other: TransformerChain<T>): TransformerChain<Int> =
    TransformerChain({ this.value - other().toInt() }, this@minus.transformer.dependencies union setOf(other))
operator fun <T: Number> ImmutableReactiveType<Int>.minus(other: ImmutableReactiveType<T>): TransformerChain<Int> =
    TransformerChain({ this.value - other.value.toInt() }, this@minus.transformer.dependencies union setOf(other))
operator fun <T: Number> ImmutableReactiveType<Int>.minus(other: T): TransformerChain<Int> =
    TransformerChain({ this.value - other.toInt() }, this@minus.transformer.dependencies)

operator fun <T: Number>TransformerChain<Int>.minus(other: MutableReactiveType<T>): TransformerChain<Int> =
    TransformerChain({ this() - other.value.toInt() }, setOf(other) union this@minus.dependencies)
operator fun <T: Number>TransformerChain<Int>.minus(other: TransformerChain<T>): TransformerChain<Int> =
    TransformerChain({ this() - other().toInt() }, other.dependencies union this@minus.dependencies)
operator fun <T: Number>TransformerChain<Int>.minus(other: ImmutableReactiveType<T>): TransformerChain<Int> =
    TransformerChain({ this() - other.value.toInt() }, other.transformer.dependencies union this@minus.dependencies)
operator fun <T: Number>TransformerChain<Int>.minus(other: T): TransformerChain<Int> =
    TransformerChain({ this() - other.toInt() }, this@minus.dependencies)

/**
 * ================ Times Operator ================
 **/
operator fun <T: Number> MutableReactiveType<Int>.times(other: MutableReactiveType<T>): TransformerChain<Int> =
    TransformerChain({ this.value * other.value.toInt() }, setOf(this@times, other))

operator fun <T: Number> MutableReactiveType<Int>.times(other: ImmutableReactiveType<T>): TransformerChain<Int> =
    TransformerChain({ this.value * other.value.toInt() }, setOf(this@times) union other.transformer.dependencies)
operator fun <T: Number> MutableReactiveType<Int>.times(other: TransformerChain<T>): TransformerChain<Int> =
    TransformerChain({ this.value * other().toInt() }, setOf(this@times) union other.dependencies)
operator fun <T: Number> MutableReactiveType<Int>.times(other: T): TransformerChain<Int> =
    TransformerChain({ this.value * other.toInt() }, setOf(this@times))

operator fun <T: Number> ImmutableReactiveType<Int>.times(other: MutableReactiveType<T>): TransformerChain<Int> =
    TransformerChain({ this.value * other.value.toInt() }, this@times.transformer.dependencies union setOf(other))
operator fun <T: Number> ImmutableReactiveType<Int>.times(other: TransformerChain<T>): TransformerChain<Int> =
    TransformerChain({ this.value * other().toInt() }, this@times.transformer.dependencies union setOf(other))
operator fun <T: Number> ImmutableReactiveType<Int>.times(other: ImmutableReactiveType<T>): TransformerChain<Int> =
    TransformerChain({ this.value * other.value.toInt() }, this@times.transformer.dependencies union setOf(other))
operator fun <T: Number> ImmutableReactiveType<Int>.times(other: T): TransformerChain<Int> =
    TransformerChain({ this.value * other.toInt() }, this@times.transformer.dependencies)

operator fun <T: Number>TransformerChain<Int>.times(other: MutableReactiveType<T>): TransformerChain<Int> =
    TransformerChain({ this() * other.value.toInt() }, setOf(other) union this@times.dependencies)
operator fun <T: Number>TransformerChain<Int>.times(other: TransformerChain<T>): TransformerChain<Int> =
    TransformerChain({ this() * other().toInt() }, other.dependencies union this@times.dependencies)
operator fun <T: Number>TransformerChain<Int>.times(other: ImmutableReactiveType<T>): TransformerChain<Int> =
    TransformerChain({ this() * other.value.toInt() }, other.transformer.dependencies union this@times.dependencies)
operator fun <T: Number>TransformerChain<Int>.times(other: T): TransformerChain<Int> =
    TransformerChain({ this() * other.toInt() }, this@times.dependencies)

/**
 * ================ Div Operator ================
 **/
operator fun <T: Number> MutableReactiveType<Int>.div(other: MutableReactiveType<T>): TransformerChain<Int> =
    TransformerChain({ this.value / other.value.toInt() }, setOf(this@div, other))

operator fun <T: Number> MutableReactiveType<Int>.div(other: ImmutableReactiveType<T>): TransformerChain<Int> =
    TransformerChain({ this.value / other.value.toInt() }, setOf(this@div) union other.transformer.dependencies)
operator fun <T: Number> MutableReactiveType<Int>.div(other: TransformerChain<T>): TransformerChain<Int> =
    TransformerChain({ this.value / other().toInt() }, setOf(this@div) union other.dependencies)
operator fun <T: Number> MutableReactiveType<Int>.div(other: T): TransformerChain<Int> =
    TransformerChain({ this.value / other.toInt() }, setOf(this@div))

operator fun <T: Number> ImmutableReactiveType<Int>.div(other: MutableReactiveType<T>): TransformerChain<Int> =
    TransformerChain({ this.value / other.value.toInt() }, this@div.transformer.dependencies union setOf(other))
operator fun <T: Number> ImmutableReactiveType<Int>.div(other: TransformerChain<T>): TransformerChain<Int> =
    TransformerChain({ this.value / other().toInt() }, this@div.transformer.dependencies union setOf(other))
operator fun <T: Number> ImmutableReactiveType<Int>.div(other: ImmutableReactiveType<T>): TransformerChain<Int> =
    TransformerChain({ this.value / other.value.toInt() }, this@div.transformer.dependencies union setOf(other))
operator fun <T: Number> ImmutableReactiveType<Int>.div(other: T): TransformerChain<Int> =
    TransformerChain({ this.value / other.toInt() }, this@div.transformer.dependencies)

operator fun <T: Number>TransformerChain<Int>.div(other: MutableReactiveType<T>): TransformerChain<Int> =
    TransformerChain({ this() / other.value.toInt() }, setOf(other) union this@div.dependencies)
operator fun <T: Number>TransformerChain<Int>.div(other: TransformerChain<T>): TransformerChain<Int> =
    TransformerChain({ this() / other().toInt() }, other.dependencies union this@div.dependencies)
operator fun <T: Number>TransformerChain<Int>.div(other: ImmutableReactiveType<T>): TransformerChain<Int> =
    TransformerChain({ this() / other.value.toInt() }, other.transformer.dependencies union this@div.dependencies)
operator fun <T: Number>TransformerChain<Int>.div(other: T): TransformerChain<Int> =
    TransformerChain({ this() / other.toInt() }, this@div.dependencies)

/**
 * ================ Assign Operators ================
 **/
operator fun <T: Number> MutableReactiveType<Int>.plusAssign(value: T) {
    this.value += value.toInt()
}

operator fun <T: Number> MutableReactiveType<Int>.minusAssign(value: T) {
    this.value -= value.toInt()
}

operator fun <T: Number> MutableReactiveType<Int>.timesAssign(value: T) {
    this.value *= value.toInt()
}

operator fun <T: Number> MutableReactiveType<Int>.divAssign(value: T) {
    this.value /= value.toInt()
}