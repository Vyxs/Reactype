package builder

import type.*

fun int(value: Int): MutableReactiveType<Int> = MutableReactiveType(value)
fun long(value: Long): MutableReactiveType<Long> = MutableReactiveType(value)
fun float(value: Float): MutableReactiveType<Float> = MutableReactiveType(value)
fun double(value: Double): MutableReactiveType<Double> = MutableReactiveType(value)
fun string(value: String): MutableReactiveType<String> = MutableReactiveType(value)
fun short(value: Short): MutableReactiveType<Short> = MutableReactiveType(value)
fun char(value: Char): MutableReactiveType<Char> = MutableReactiveType(value)
fun boolean(value: Boolean): MutableReactiveType<Boolean> = MutableReactiveType(value)
fun <T: Number> vec(x: T, y: T): MutableReactiveType<Vector<T>> = MutableReactiveType(Vector(x, y))
fun <T: Number> vec(x: T, y: T, z: T): MutableReactiveType<Vector3<T>> = MutableReactiveType(Vector3(x, y, z))

fun <T: Number> mutableVec(x: T, y: T): MutableReactiveType<MutableVector<T>> = MutableReactiveType(MutableVector(x, y))
fun <T: Number> mutableVec(x: T, y: T, z: T): MutableReactiveType<MutableVector3<T>> = MutableReactiveType(MutableVector3(x, y, z))
