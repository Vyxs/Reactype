package builder

import type.MutableReactiveType

fun int(value: Int): MutableReactiveType<Int> = MutableReactiveType(value)
fun long(value: Long): MutableReactiveType<Long> = MutableReactiveType(value)
fun float(value: Float): MutableReactiveType<Float> = MutableReactiveType(value)
fun double(value: Double): MutableReactiveType<Double> = MutableReactiveType(value)
fun string(value: String): MutableReactiveType<String> = MutableReactiveType(value)
fun short(value: Short): MutableReactiveType<Short> = MutableReactiveType(value)
fun char(value: Char): MutableReactiveType<Char> = MutableReactiveType(value)
fun boolean(value: Boolean): MutableReactiveType<Boolean> = MutableReactiveType(value)