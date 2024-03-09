package builder

import type.*
import java.awt.Color
import java.awt.image.BufferedImage

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
fun color(r: Int, g: Int, b: Int, a: Int): MutableReactiveType<Color> = MutableReactiveType(Color(r, g, b, a))
fun color(r: Int, g: Int, b: Int): MutableReactiveType<Color> = MutableReactiveType(Color(r, g, b))
fun bufferedImage(value: BufferedImage): MutableReactiveType<BufferedImage> = MutableReactiveType(value)

fun <T> list(value: List<T>): MutableReactiveType<List<T>> = MutableReactiveType(value)
fun <T> set(value: Set<T>): MutableReactiveType<Set<T>> = MutableReactiveType(value)
fun <K, V> map(value: Map<K, V>): MutableReactiveType<Map<K, V>> = MutableReactiveType(value)
fun <T> array(value: Array<T>): MutableReactiveType<Array<T>> = MutableReactiveType(value)
fun <T> mutableList(value: MutableList<T>): MutableReactiveType<MutableList<T>> = MutableReactiveType(value)
fun <T> mutableSet(value: MutableSet<T>): MutableReactiveType<MutableSet<T>> = MutableReactiveType(value)
fun <K, V> mutableMap(value: MutableMap<K, V>): MutableReactiveType<MutableMap<K, V>> = MutableReactiveType(value)
fun any(value: Any): MutableReactiveType<Any> = MutableReactiveType(value)
fun unit(value: Unit): MutableReactiveType<Unit> = MutableReactiveType(value)
fun nothing(value: Nothing?): MutableReactiveType<Nothing?> = MutableReactiveType(value)
fun <T> reactive(value: T): MutableReactiveType<T> = MutableReactiveType(value)
