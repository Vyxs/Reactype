package type

import kotlin.math.*

data class Vector<T>(
    val x: T,
    val y: T
) {
    override fun toString(): String = "Vector(x=$x, y=$y)"
}

data class Vector3<T>(
    val x: T,
    val y: T,
    val z: T
) {
    override fun toString(): String = "Vector3(x=$x, y=$y, z=$z)"
}

data class MutableVector<T>(
    var x: T,
    var y: T
) {
    override fun toString(): String = "MutableVector(x=$x, y=$y)"

    fun set(vector: MutableVector<T>) {
        x = vector.x
        y = vector.y
    }
}

data class MutableVector3<T>(
    var x: T,
    var y: T,
    var z: T
) {
    override fun toString(): String = "MutableVector3(x=$x, y=$y, z=$z)"

    fun set(vector: MutableVector3<T>) {
        x = vector.x
        y = vector.y
        z = vector.z
    }
}

fun <T> Vector<T>.toMutable(): MutableVector<T> = MutableVector(x, y)
fun <T> Vector3<T>.toMutable(): MutableVector3<T> = MutableVector3(x, y, z)
fun <T> MutableVector<T>.toImmutable(): Vector<T> = Vector(x, y)
fun <T> MutableVector3<T>.toImmutable(): Vector3<T> = Vector3(x, y, z)

@JvmName("vectorIntToLong")
fun Vector<Int>.toLong(): Vector<Long> = Vector(x.toLong(), y.toLong())
@JvmName("vectorIntToFloat")
fun Vector<Int>.toFloat(): Vector<Float> = Vector(x.toFloat(), y.toFloat())
@JvmName("vectorIntToDouble")
fun Vector<Int>.toDouble(): Vector<Double> = Vector(x.toDouble(), y.toDouble())
@JvmName("vectorLongToInt")
fun Vector<Long>.toInt(): Vector<Int> = Vector(x.toInt(), y.toInt())
@JvmName("vectorLongToFloat")
fun Vector<Long>.toFloat(): Vector<Float> = Vector(x.toFloat(), y.toFloat())
@JvmName("vectorLongToDouble")
fun Vector<Long>.toDouble(): Vector<Double> = Vector(x.toDouble(), y.toDouble())
@JvmName("vectorFloatToInt")
fun Vector<Float>.toInt(): Vector<Int> = Vector(x.toInt(), y.toInt())
@JvmName("vectorFloatToLong")
fun Vector<Float>.toLong(): Vector<Long> = Vector(x.toLong(), y.toLong())
@JvmName("vectorFloatToDouble")
fun Vector<Float>.toDouble(): Vector<Double> = Vector(x.toDouble(), y.toDouble())
@JvmName("vectorDoubleToInt")
fun Vector<Double>.toInt(): Vector<Int> = Vector(x.toInt(), y.toInt())
@JvmName("vectorDoubleToLong")
fun Vector<Double>.toLong(): Vector<Long> = Vector(x.toLong(), y.toLong())
@JvmName("vectorDoubleToFloat")
fun Vector<Double>.toFloat(): Vector<Float> = Vector(x.toFloat(), y.toFloat())

@JvmName("vector3IntToLong")
fun Vector3<Int>.toLong(): Vector3<Long> = Vector3(x.toLong(), y.toLong(), z.toLong())
@JvmName("vector3IntToFloat")
fun Vector3<Int>.toFloat(): Vector3<Float> = Vector3(x.toFloat(), y.toFloat(), z.toFloat())
@JvmName("vector3IntToDouble")
fun Vector3<Int>.toDouble(): Vector3<Double> = Vector3(x.toDouble(), y.toDouble(), z.toDouble())
@JvmName("vector3LongToInt")
fun Vector3<Long>.toInt(): Vector3<Int> = Vector3(x.toInt(), y.toInt(), z.toInt())
@JvmName("vector3LongToFloat")
fun Vector3<Long>.toFloat(): Vector3<Float> = Vector3(x.toFloat(), y.toFloat(), z.toFloat())
@JvmName("vector3LongToDouble")
fun Vector3<Long>.toDouble(): Vector3<Double> = Vector3(x.toDouble(), y.toDouble(), z.toDouble())
@JvmName("vector3FloatToInt")
fun Vector3<Float>.toInt(): Vector3<Int> = Vector3(x.toInt(), y.toInt(), z.toInt())
@JvmName("vector3FloatToLong")
fun Vector3<Float>.toLong(): Vector3<Long> = Vector3(x.toLong(), y.toLong(), z.toLong())
@JvmName("vector3FloatToDouble")
fun Vector3<Float>.toDouble(): Vector3<Double> = Vector3(x.toDouble(), y.toDouble(), z.toDouble())
@JvmName("vector3DoubleToInt")
fun Vector3<Double>.toInt(): Vector3<Int> = Vector3(x.toInt(), y.toInt(), z.toInt())
@JvmName("vector3DoubleToLong")
fun Vector3<Double>.toLong(): Vector3<Long> = Vector3(x.toLong(), y.toLong(), z.toLong())
@JvmName("vector3DoubleToFloat")
fun Vector3<Double>.toFloat(): Vector3<Float> = Vector3(x.toFloat(), y.toFloat(), z.toFloat())

@JvmName("mutableVectorIntToLong")
fun MutableVector<Int>.toLong(): MutableVector<Long> = MutableVector(x.toLong(), y.toLong())
@JvmName("mutableVectorIntToFloat")
fun MutableVector<Int>.toFloat(): MutableVector<Float> = MutableVector(x.toFloat(), y.toFloat())
@JvmName("mutableVectorIntToDouble")
fun MutableVector<Int>.toDouble(): MutableVector<Double> = MutableVector(x.toDouble(), y.toDouble())
@JvmName("mutableVectorLongToInt")
fun MutableVector<Long>.toInt(): MutableVector<Int> = MutableVector(x.toInt(), y.toInt())
@JvmName("mutableVectorLongToFloat")
fun MutableVector<Long>.toFloat(): MutableVector<Float> = MutableVector(x.toFloat(), y.toFloat())
@JvmName("mutableVectorLongToDouble")
fun MutableVector<Long>.toDouble(): MutableVector<Double> = MutableVector(x.toDouble(), y.toDouble())
@JvmName("mutableVectorFloatToInt")
fun MutableVector<Float>.toInt(): MutableVector<Int> = MutableVector(x.toInt(), y.toInt())
@JvmName("mutableVectorFloatToLong")
fun MutableVector<Float>.toLong(): MutableVector<Long> = MutableVector(x.toLong(), y.toLong())
@JvmName("mutableVectorFloatToDouble")
fun MutableVector<Float>.toDouble(): MutableVector<Double> = MutableVector(x.toDouble(), y.toDouble())
@JvmName("mutableVectorDoubleToInt")
fun MutableVector<Double>.toInt(): MutableVector<Int> = MutableVector(x.toInt(), y.toInt())
@JvmName("mutableVectorDoubleToLong")
fun MutableVector<Double>.toLong(): MutableVector<Long> = MutableVector(x.toLong(), y.toLong())
@JvmName("mutableVectorDoubleToFloat")
fun MutableVector<Double>.toFloat(): MutableVector<Float> = MutableVector(x.toFloat(), y.toFloat())

@JvmName("mutableVector3IntToLong")
fun MutableVector3<Int>.toLong(): MutableVector3<Long> = MutableVector3(x.toLong(), y.toLong(), z.toLong())
@JvmName("mutableVector3IntToFloat")
fun MutableVector3<Int>.toFloat(): MutableVector3<Float> = MutableVector3(x.toFloat(), y.toFloat(), z.toFloat())
@JvmName("mutableVector3IntToDouble")
fun MutableVector3<Int>.toDouble(): MutableVector3<Double> = MutableVector3(x.toDouble(), y.toDouble(), z.toDouble())
@JvmName("mutableVector3LongToInt")
fun MutableVector3<Long>.toInt(): MutableVector3<Int> = MutableVector3(x.toInt(), y.toInt(), z.toInt())
@JvmName("mutableVector3LongToFloat")
fun MutableVector3<Long>.toFloat(): MutableVector3<Float> = MutableVector3(x.toFloat(), y.toFloat(), z.toFloat())
@JvmName("mutableVector3LongToDouble")
fun MutableVector3<Long>.toDouble(): MutableVector3<Double> = MutableVector3(x.toDouble(), y.toDouble(), z.toDouble())
@JvmName("mutableVector3FloatToInt")
fun MutableVector3<Float>.toInt(): MutableVector3<Int> = MutableVector3(x.toInt(), y.toInt(), z.toInt())
@JvmName("mutableVector3FloatToLong")
fun MutableVector3<Float>.toLong(): MutableVector3<Long> = MutableVector3(x.toLong(), y.toLong(), z.toLong())
@JvmName("mutableVector3FloatToDouble")
fun MutableVector3<Float>.toDouble(): MutableVector3<Double> = MutableVector3(x.toDouble(), y.toDouble(), z.toDouble())
@JvmName("mutableVector3DoubleToInt")
fun MutableVector3<Double>.toInt(): MutableVector3<Int> = MutableVector3(x.toInt(), y.toInt(), z.toInt())
@JvmName("mutableVector3DoubleToLong")
fun MutableVector3<Double>.toLong(): MutableVector3<Long> = MutableVector3(x.toLong(), y.toLong(), z.toLong())
@JvmName("mutableVector3DoubleToFloat")
fun MutableVector3<Double>.toFloat(): MutableVector3<Float> = MutableVector3(x.toFloat(), y.toFloat(), z.toFloat())


@JvmName("vectorIntUnaryMinus")
operator fun Vector<Int>.unaryMinus(): Vector<Int> = Vector(-x, -y)
@JvmName("vector3IntUnaryMinus")
operator fun Vector3<Int>.unaryMinus(): Vector3<Int> = Vector3(-x, -y, -z)
@JvmName("mutableVectorIntUnaryMinus")
operator fun MutableVector<Int>.unaryMinus(): MutableVector<Int> = MutableVector(-x, -y)
@JvmName("mutableVector3IntUnaryMinus")
operator fun MutableVector3<Int>.unaryMinus(): MutableVector3<Int> = MutableVector3(-x, -y, -z)
@JvmName("vectorIntPlusVectorInt")
operator fun Vector<Int>.plus(other: Vector<Int>): Vector<Int> = Vector(x + other.x, y + other.y)
@JvmName("vectorIntMinusVectorInt")
operator fun Vector<Int>.minus(other: Vector<Int>): Vector<Int> = Vector(x - other.x, y - other.y)
@JvmName("vectorIntTimesVectorInt")
operator fun Vector<Int>.times(other: Vector<Int>): Vector<Int> = Vector(x * other.x, y * other.y)
@JvmName("vectorIntDivVectorInt")
operator fun Vector<Int>.div(other: Vector<Int>): Vector<Int> = Vector(x / other.x, y / other.y)
@JvmName("vectorIntPlusInt")
operator fun Vector<Int>.plus(other: Int): Vector<Int> = Vector(x + other, y + other)
@JvmName("vectorIntMinusInt")
operator fun Vector<Int>.minus(other: Int): Vector<Int> = Vector(x - other, y - other)
@JvmName("vectorIntTimesInt")
operator fun Vector<Int>.times(other: Int): Vector<Int> = Vector(x * other, y * other)
@JvmName("vectorIntDivInt")
operator fun Vector<Int>.div(other: Int): Vector<Int> = Vector(x / other, y / other)
@JvmName("vectorIntPlusMutableVectorInt")
operator fun Vector<Int>.plus(other: MutableVector<Int>): MutableVector<Int> = MutableVector(x + other.x, y + other.y)
@JvmName("vectorIntMinusMutableVectorInt")
operator fun Vector<Int>.minus(other: MutableVector<Int>): MutableVector<Int> = MutableVector(x - other.x, y - other.y)
@JvmName("vectorIntTimesMutableVectorInt")
operator fun Vector<Int>.times(other: MutableVector<Int>): MutableVector<Int> = MutableVector(x * other.x, y * other.y)
@JvmName("vectorIntDivMutableVectorInt")
operator fun Vector<Int>.div(other: MutableVector<Int>): MutableVector<Int> = MutableVector(x / other.x, y / other.y)
@JvmName("mutableVectorIntPlusVectorInt")
operator fun MutableVector<Int>.plus(other: Vector<Int>): MutableVector<Int> = MutableVector(x + other.x, y + other.y)
@JvmName("mutableVectorIntMinusVectorInt")
operator fun MutableVector<Int>.minus(other: Vector<Int>): MutableVector<Int> = MutableVector(x - other.x, y - other.y)
@JvmName("mutableVectorIntTimesVectorInt")
operator fun MutableVector<Int>.times(other: Vector<Int>): MutableVector<Int> = MutableVector(x * other.x, y * other.y)
@JvmName("mutableVectorIntDivVectorInt")
operator fun MutableVector<Int>.div(other: Vector<Int>): MutableVector<Int> = MutableVector(x / other.x, y / other.y)
@JvmName("mutableVectorIntPlusMutableVectorInt")
operator fun MutableVector<Int>.plus(other: MutableVector<Int>): MutableVector<Int> = MutableVector(x + other.x, y + other.y)
@JvmName("mutableVectorIntMinusMutableVectorInt")
operator fun MutableVector<Int>.minus(other: MutableVector<Int>): MutableVector<Int> = MutableVector(x - other.x, y - other.y)
@JvmName("mutableVectorIntTimesMutableVectorInt")
operator fun MutableVector<Int>.times(other: MutableVector<Int>): MutableVector<Int> = MutableVector(x * other.x, y * other.y)
@JvmName("mutableVectorIntDivMutableVectorInt")
operator fun MutableVector<Int>.div(other: MutableVector<Int>): MutableVector<Int> = MutableVector(x / other.x, y / other.y)
@JvmName("mutableVectorIntPlusInt")
operator fun MutableVector<Int>.plus(other: Int): MutableVector<Int> = MutableVector(x + other, y + other)
@JvmName("mutableVectorIntMinusInt")
operator fun MutableVector<Int>.minus(other: Int): MutableVector<Int> = MutableVector(x - other, y - other)
@JvmName("mutableVectorIntTimesInt")
operator fun MutableVector<Int>.times(other: Int): MutableVector<Int> = MutableVector(x * other, y * other)
@JvmName("mutableVectorIntDivInt")
operator fun MutableVector<Int>.div(other: Int): MutableVector<Int> = MutableVector(x / other, y / other)
@JvmName("vector3IntPlusVector3Int")
operator fun Vector3<Int>.plus(other: Vector3<Int>): Vector3<Int> = Vector3(x + other.x, y + other.y, z + other.z)
@JvmName("vector3IntMinusVector3Int")
operator fun Vector3<Int>.minus(other: Vector3<Int>): Vector3<Int> = Vector3(x - other.x, y - other.y, z - other.z)
@JvmName("vector3IntTimesVector3Int")
operator fun Vector3<Int>.times(other: Vector3<Int>): Vector3<Int> = Vector3(x * other.x, y * other.y, z * other.z)
@JvmName("vector3IntDivVector3Int")
operator fun Vector3<Int>.div(other: Vector3<Int>): Vector3<Int> = Vector3(x / other.x, y / other.y, z / other.z)
@JvmName("vector3IntPlusInt")
operator fun Vector3<Int>.plus(other: Int): Vector3<Int> = Vector3(x + other, y + other, z + other)
@JvmName("vector3IntMinusInt")
operator fun Vector3<Int>.minus(other: Int): Vector3<Int> = Vector3(x - other, y - other, z - other)
@JvmName("vector3IntTimesInt")
operator fun Vector3<Int>.times(other: Int): Vector3<Int> = Vector3(x * other, y * other, z * other)
@JvmName("vector3IntDivInt")
operator fun Vector3<Int>.div(other: Int): Vector3<Int> = Vector3(x / other, y / other, z / other)
@JvmName("vector3IntPlusMutableVector3Int")
operator fun Vector3<Int>.plus(other: MutableVector3<Int>): MutableVector3<Int> = MutableVector3(x + other.x, y + other.y, z + other.z)
@JvmName("vector3IntMinusMutableVector3Int")
operator fun Vector3<Int>.minus(other: MutableVector3<Int>): MutableVector3<Int> = MutableVector3(x - other.x, y - other.y, z - other.z)
@JvmName("vector3IntTimesMutableVector3Int")
operator fun Vector3<Int>.times(other: MutableVector3<Int>): MutableVector3<Int> = MutableVector3(x * other.x, y * other.y, z * other.z)
@JvmName("vector3IntDivMutableVector3Int")
operator fun Vector3<Int>.div(other: MutableVector3<Int>): MutableVector3<Int> = MutableVector3(x / other.x, y / other.y, z / other.z)
@JvmName("mutableVector3IntPlusVector3Int")
operator fun MutableVector3<Int>.plus(other: Vector3<Int>): MutableVector3<Int> = MutableVector3(x + other.x, y + other.y, z + other.z)
@JvmName("mutableVector3IntMinusVector3Int")
operator fun MutableVector3<Int>.minus(other: Vector3<Int>): MutableVector3<Int> = MutableVector3(x - other.x, y - other.y, z - other.z)
@JvmName("mutableVector3IntTimesVector3Int")
operator fun MutableVector3<Int>.times(other: Vector3<Int>): MutableVector3<Int> = MutableVector3(x * other.x, y * other.y, z * other.z)
@JvmName("mutableVector3IntDivVector3Int")
operator fun MutableVector3<Int>.div(other: Vector3<Int>): MutableVector3<Int> = MutableVector3(x / other.x, y / other.y, z / other.z)
@JvmName("mutableVector3IntPlusMutableVector3Int")
operator fun MutableVector3<Int>.plus(other: MutableVector3<Int>): MutableVector3<Int> = MutableVector3(x + other.x, y + other.y, z + other.z)
@JvmName("mutableVector3IntMinusMutableVector3Int")
operator fun MutableVector3<Int>.minus(other: MutableVector3<Int>): MutableVector3<Int> = MutableVector3(x - other.x, y - other.y, z - other.z)
@JvmName("mutableVector3IntTimesMutableVector3Int")
operator fun MutableVector3<Int>.times(other: MutableVector3<Int>): MutableVector3<Int> = MutableVector3(x * other.x, y * other.y, z * other.z)
@JvmName("mutableVector3IntDivMutableVector3Int")
operator fun MutableVector3<Int>.div(other: MutableVector3<Int>): MutableVector3<Int> = MutableVector3(x / other.x, y / other.y, z / other.z)
@JvmName("mutableVector3IntPlusInt")
operator fun MutableVector3<Int>.plus(other: Int): MutableVector3<Int> = MutableVector3(x + other, y + other, z + other)
@JvmName("mutableVector3IntMinusInt")
operator fun MutableVector3<Int>.minus(other: Int): MutableVector3<Int> = MutableVector3(x - other, y - other, z - other)
@JvmName("mutableVector3IntTimesInt")
operator fun MutableVector3<Int>.times(other: Int): MutableVector3<Int> = MutableVector3(x * other, y * other, z * other)
@JvmName("mutableVector3IntDivInt")
operator fun MutableVector3<Int>.div(other: Int): MutableVector3<Int> = MutableVector3(x / other, y / other, z / other)

@JvmName("vectorLongUnaryMinus")
operator fun Vector<Long>.unaryMinus(): Vector<Long> = Vector(-x, -y)
@JvmName("vector3LongUnaryMinus")
operator fun Vector3<Long>.unaryMinus(): Vector3<Long> = Vector3(-x, -y, -z)
@JvmName("mutableVectorLongUnaryMinus")
operator fun MutableVector<Long>.unaryMinus(): MutableVector<Long> = MutableVector(-x, -y)
@JvmName("mutableVector3LongUnaryMinus")
operator fun MutableVector3<Long>.unaryMinus(): MutableVector3<Long> = MutableVector3(-x, -y, -z)
@JvmName("vectorLongPlusVectorLong")
operator fun Vector<Long>.plus(other: Vector<Long>): Vector<Long> = Vector(x + other.x, y + other.y)
@JvmName("vectorLongMinusVectorLong")
operator fun Vector<Long>.minus(other: Vector<Long>): Vector<Long> = Vector(x - other.x, y - other.y)
@JvmName("vectorLongTimesVectorLong")
operator fun Vector<Long>.times(other: Vector<Long>): Vector<Long> = Vector(x * other.x, y * other.y)
@JvmName("vectorLongDivVectorLong")
operator fun Vector<Long>.div(other: Vector<Long>): Vector<Long> = Vector(x / other.x, y / other.y)
@JvmName("vectorLongPlusLong")
operator fun Vector<Long>.plus(other: Long): Vector<Long> = Vector(x + other, y + other)
@JvmName("vectorLongMinusLong")
operator fun Vector<Long>.minus(other: Long): Vector<Long> = Vector(x - other, y - other)
@JvmName("vectorLongTimesLong")
operator fun Vector<Long>.times(other: Long): Vector<Long> = Vector(x * other, y * other)
@JvmName("vectorLongDivLong")
operator fun Vector<Long>.div(other: Long): Vector<Long> = Vector(x / other, y / other)
@JvmName("vectorLongPlusMutableVectorLong")
operator fun Vector<Long>.plus(other: MutableVector<Long>): MutableVector<Long> = MutableVector(x + other.x, y + other.y)
@JvmName("vectorLongMinusMutableVectorLong")
operator fun Vector<Long>.minus(other: MutableVector<Long>): MutableVector<Long> = MutableVector(x - other.x, y - other.y)
@JvmName("vectorLongTimesMutableVectorLong")
operator fun Vector<Long>.times(other: MutableVector<Long>): MutableVector<Long> = MutableVector(x * other.x, y * other.y)
@JvmName("vectorLongDivMutableVectorLong")
operator fun Vector<Long>.div(other: MutableVector<Long>): MutableVector<Long> = MutableVector(x / other.x, y / other.y)
@JvmName("mutableVectorLongPlusVectorLong")
operator fun MutableVector<Long>.plus(other: Vector<Long>): MutableVector<Long> = MutableVector(x + other.x, y + other.y)
@JvmName("mutableVectorLongMinusVectorLong")
operator fun MutableVector<Long>.minus(other: Vector<Long>): MutableVector<Long> = MutableVector(x - other.x, y - other.y)
@JvmName("mutableVectorLongTimesVectorLong")
operator fun MutableVector<Long>.times(other: Vector<Long>): MutableVector<Long> = MutableVector(x * other.x, y * other.y)
@JvmName("mutableVectorLongDivVectorLong")
operator fun MutableVector<Long>.div(other: Vector<Long>): MutableVector<Long> = MutableVector(x / other.x, y / other.y)
@JvmName("mutableVectorLongPlusMutableVectorLong")
operator fun MutableVector<Long>.plus(other: MutableVector<Long>): MutableVector<Long> = MutableVector(x + other.x, y + other.y)
@JvmName("mutableVectorLongMinusMutableVectorLong")
operator fun MutableVector<Long>.minus(other: MutableVector<Long>): MutableVector<Long> = MutableVector(x - other.x, y - other.y)
@JvmName("mutableVectorLongTimesMutableVectorLong")
operator fun MutableVector<Long>.times(other: MutableVector<Long>): MutableVector<Long> = MutableVector(x * other.x, y * other.y)
@JvmName("mutableVectorLongDivMutableVectorLong")
operator fun MutableVector<Long>.div(other: MutableVector<Long>): MutableVector<Long> = MutableVector(x / other.x, y / other.y)
@JvmName("mutableVectorLongPlusLong")
operator fun MutableVector<Long>.plus(other: Long): MutableVector<Long> = MutableVector(x + other, y + other)
@JvmName("mutableVectorLongMinusLong")
operator fun MutableVector<Long>.minus(other: Long): MutableVector<Long> = MutableVector(x - other, y - other)
@JvmName("mutableVectorLongTimesLong")
operator fun MutableVector<Long>.times(other: Long): MutableVector<Long> = MutableVector(x * other, y * other)
@JvmName("mutableVectorLongDivLong")
operator fun MutableVector<Long>.div(other: Long): MutableVector<Long> = MutableVector(x / other, y / other)
@JvmName("vector3LongPlusVector3Long")
operator fun Vector3<Long>.plus(other: Vector3<Long>): Vector3<Long> = Vector3(x + other.x, y + other.y, z + other.z)
@JvmName("vector3LongMinusVector3Long")
operator fun Vector3<Long>.minus(other: Vector3<Long>): Vector3<Long> = Vector3(x - other.x, y - other.y, z - other.z)
@JvmName("vector3LongTimesVector3Long")
operator fun Vector3<Long>.times(other: Vector3<Long>): Vector3<Long> = Vector3(x * other.x, y * other.y, z * other.z)
@JvmName("vector3LongDivVector3Long")
operator fun Vector3<Long>.div(other: Vector3<Long>): Vector3<Long> = Vector3(x / other.x, y / other.y, z / other.z)
@JvmName("vector3LongPlusLong")
operator fun Vector3<Long>.plus(other: Long): Vector3<Long> = Vector3(x + other, y + other, z + other)
@JvmName("vector3LongMinusLong")
operator fun Vector3<Long>.minus(other: Long): Vector3<Long> = Vector3(x - other, y - other, z - other)
@JvmName("vector3LongTimesLong")
operator fun Vector3<Long>.times(other: Long): Vector3<Long> = Vector3(x * other, y * other, z * other)
@JvmName("vector3LongDivLong")
operator fun Vector3<Long>.div(other: Long): Vector3<Long> = Vector3(x / other, y / other, z / other)
@JvmName("vector3LongPlusMutableVector3Long")
operator fun Vector3<Long>.plus(other: MutableVector3<Long>): MutableVector3<Long> = MutableVector3(x + other.x, y + other.y, z + other.z)
@JvmName("vector3LongMinusMutableVector3Long")
operator fun Vector3<Long>.minus(other: MutableVector3<Long>): MutableVector3<Long> = MutableVector3(x - other.x, y - other.y, z - other.z)
@JvmName("vector3LongTimesMutableVector3Long")
operator fun Vector3<Long>.times(other: MutableVector3<Long>): MutableVector3<Long> = MutableVector3(x * other.x, y * other.y, z * other.z)
@JvmName("vector3LongDivMutableVector3Long")
operator fun Vector3<Long>.div(other: MutableVector3<Long>): MutableVector3<Long> = MutableVector3(x / other.x, y / other.y, z / other.z)
@JvmName("mutableVector3LongPlusVector3Long")
operator fun MutableVector3<Long>.plus(other: Vector3<Long>): MutableVector3<Long> = MutableVector3(x + other.x, y + other.y, z + other.z)
@JvmName("mutableVector3LongMinusVector3Long")
operator fun MutableVector3<Long>.minus(other: Vector3<Long>): MutableVector3<Long> = MutableVector3(x - other.x, y - other.y, z - other.z)
@JvmName("mutableVector3LongTimesVector3Long")
operator fun MutableVector3<Long>.times(other: Vector3<Long>): MutableVector3<Long> = MutableVector3(x * other.x, y * other.y, z * other.z)
@JvmName("mutableVector3LongDivVector3Long")
operator fun MutableVector3<Long>.div(other: Vector3<Long>): MutableVector3<Long> = MutableVector3(x / other.x, y / other.y, z / other.z)
@JvmName("mutableVector3LongPlusMutableVector3Long")
operator fun MutableVector3<Long>.plus(other: MutableVector3<Long>): MutableVector3<Long> = MutableVector3(x + other.x, y + other.y, z + other.z)
@JvmName("mutableVector3LongMinusMutableVector3Long")
operator fun MutableVector3<Long>.minus(other: MutableVector3<Long>): MutableVector3<Long> = MutableVector3(x - other.x, y - other.y, z - other.z)
@JvmName("mutableVector3LongTimesMutableVector3Long")
operator fun MutableVector3<Long>.times(other: MutableVector3<Long>): MutableVector3<Long> = MutableVector3(x * other.x, y * other.y, z * other.z)
@JvmName("mutableVector3LongDivMutableVector3Long")
operator fun MutableVector3<Long>.div(other: MutableVector3<Long>): MutableVector3<Long> = MutableVector3(x / other.x, y / other.y, z / other.z)
@JvmName("mutableVector3LongPlusLong")
operator fun MutableVector3<Long>.plus(other: Long): MutableVector3<Long> = MutableVector3(x + other, y + other, z + other)
@JvmName("mutableVector3LongMinusLong")
operator fun MutableVector3<Long>.minus(other: Long): MutableVector3<Long> = MutableVector3(x - other, y - other, z - other)
@JvmName("mutableVector3LongTimesLong")
operator fun MutableVector3<Long>.times(other: Long): MutableVector3<Long> = MutableVector3(x * other, y * other, z * other)
@JvmName("mutableVector3LongDivLong")
operator fun MutableVector3<Long>.div(other: Long): MutableVector3<Long> = MutableVector3(x / other, y / other, z / other)

@JvmName("vectorDoubleUnaryMinus")
operator fun Vector<Double>.unaryMinus(): Vector<Double> = Vector(-x, -y)
@JvmName("vector3DoubleUnaryMinus")
operator fun Vector3<Double>.unaryMinus(): Vector3<Double> = Vector3(-x, -y, -z)
@JvmName("mutableVectorDoubleUnaryMinus")
operator fun MutableVector<Double>.unaryMinus(): MutableVector<Double> = MutableVector(-x, -y)
@JvmName("mutableVector3DoubleUnaryMinus")
operator fun MutableVector3<Double>.unaryMinus(): MutableVector3<Double> = MutableVector3(-x, -y, -z)
@JvmName("vectorDoublePlusVectorDouble")
operator fun Vector<Double>.plus(other: Vector<Double>): Vector<Double> = Vector(x + other.x, y + other.y)
@JvmName("vectorDoubleMinusVectorDouble")
operator fun Vector<Double>.minus(other: Vector<Double>): Vector<Double> = Vector(x - other.x, y - other.y)
@JvmName("vectorDoubleTimesVectorDouble")
operator fun Vector<Double>.times(other: Vector<Double>): Vector<Double> = Vector(x * other.x, y * other.y)
@JvmName("vectorDoubleDivVectorDouble")
operator fun Vector<Double>.div(other: Vector<Double>): Vector<Double> = Vector(x / other.x, y / other.y)
@JvmName("vectorDoublePlusDouble")
operator fun Vector<Double>.plus(other: Double): Vector<Double> = Vector(x + other, y + other)
@JvmName("vectorDoubleMinusDouble")
operator fun Vector<Double>.minus(other: Double): Vector<Double> = Vector(x - other, y - other)
@JvmName("vectorDoubleTimesDouble")
operator fun Vector<Double>.times(other: Double): Vector<Double> = Vector(x * other, y * other)
@JvmName("vectorDoubleDivDouble")
operator fun Vector<Double>.div(other: Double): Vector<Double> = Vector(x / other, y / other)
@JvmName("vectorDoublePlusMutableVectorDouble")
operator fun Vector<Double>.plus(other: MutableVector<Double>): MutableVector<Double> = MutableVector(x + other.x, y + other.y)
@JvmName("vectorDoubleMinusMutableVectorDouble")
operator fun Vector<Double>.minus(other: MutableVector<Double>): MutableVector<Double> = MutableVector(x - other.x, y - other.y)
@JvmName("vectorDoubleTimesMutableVectorDouble")
operator fun Vector<Double>.times(other: MutableVector<Double>): MutableVector<Double> = MutableVector(x * other.x, y * other.y)
@JvmName("vectorDoubleDivMutableVectorDouble")
operator fun Vector<Double>.div(other: MutableVector<Double>): MutableVector<Double> = MutableVector(x / other.x, y / other.y)
@JvmName("mutableVectorDoublePlusVectorDouble")
operator fun MutableVector<Double>.plus(other: Vector<Double>): MutableVector<Double> = MutableVector(x + other.x, y + other.y)
@JvmName("mutableVectorDoubleMinusVectorDouble")
operator fun MutableVector<Double>.minus(other: Vector<Double>): MutableVector<Double> = MutableVector(x - other.x, y - other.y)
@JvmName("mutableVectorDoubleTimesVectorDouble")
operator fun MutableVector<Double>.times(other: Vector<Double>): MutableVector<Double> = MutableVector(x * other.x, y * other.y)
@JvmName("mutableVectorDoubleDivVectorDouble")
operator fun MutableVector<Double>.div(other: Vector<Double>): MutableVector<Double> = MutableVector(x / other.x, y / other.y)
@JvmName("mutableVectorDoublePlusMutableVectorDouble")
operator fun MutableVector<Double>.plus(other: MutableVector<Double>): MutableVector<Double> = MutableVector(x + other.x, y + other.y)
@JvmName("mutableVectorDoubleMinusMutableVectorDouble")
operator fun MutableVector<Double>.minus(other: MutableVector<Double>): MutableVector<Double> = MutableVector(x - other.x, y - other.y)
@JvmName("mutableVectorDoubleTimesMutableVectorDouble")
operator fun MutableVector<Double>.times(other: MutableVector<Double>): MutableVector<Double> = MutableVector(x * other.x, y * other.y)
@JvmName("mutableVectorDoubleDivMutableVectorDouble")
operator fun MutableVector<Double>.div(other: MutableVector<Double>): MutableVector<Double> = MutableVector(x / other.x, y / other.y)
@JvmName("mutableVectorDoublePlusDouble")
operator fun MutableVector<Double>.plus(other: Double): MutableVector<Double> = MutableVector(x + other, y + other)
@JvmName("mutableVectorDoubleMinusDouble")
operator fun MutableVector<Double>.minus(other: Double): MutableVector<Double> = MutableVector(x - other, y - other)
@JvmName("mutableVectorDoubleTimesDouble")
operator fun MutableVector<Double>.times(other: Double): MutableVector<Double> = MutableVector(x * other, y * other)
@JvmName("mutableVectorDoubleDivDouble")
operator fun MutableVector<Double>.div(other: Double): MutableVector<Double> = MutableVector(x / other, y / other)
@JvmName("vector3DoublePlusVector3Double")
operator fun Vector3<Double>.plus(other: Vector3<Double>): Vector3<Double> = Vector3(x + other.x, y + other.y, z + other.z)
@JvmName("vector3DoubleMinusVector3Double")
operator fun Vector3<Double>.minus(other: Vector3<Double>): Vector3<Double> = Vector3(x - other.x, y - other.y, z - other.z)
@JvmName("vector3DoubleTimesVector3Double")
operator fun Vector3<Double>.times(other: Vector3<Double>): Vector3<Double> = Vector3(x * other.x, y * other.y, z * other.z)
@JvmName("vector3DoubleDivVector3Double")
operator fun Vector3<Double>.div(other: Vector3<Double>): Vector3<Double> = Vector3(x / other.x, y / other.y, z / other.z)
@JvmName("vector3DoublePlusDouble")
operator fun Vector3<Double>.plus(other: Double): Vector3<Double> = Vector3(x + other, y + other, z + other)
@JvmName("vector3DoubleMinusDouble")
operator fun Vector3<Double>.minus(other: Double): Vector3<Double> = Vector3(x - other, y - other, z - other)
@JvmName("vector3DoubleTimesDouble")
operator fun Vector3<Double>.times(other: Double): Vector3<Double> = Vector3(x * other, y * other, z * other)
@JvmName("vector3DoubleDivDouble")
operator fun Vector3<Double>.div(other: Double): Vector3<Double> = Vector3(x / other, y / other, z / other)
@JvmName("vector3DoublePlusMutableVector3Double")
operator fun Vector3<Double>.plus(other: MutableVector3<Double>): MutableVector3<Double> = MutableVector3(x + other.x, y + other.y, z + other.z)
@JvmName("vector3DoubleMinusMutableVector3Double")
operator fun Vector3<Double>.minus(other: MutableVector3<Double>): MutableVector3<Double> = MutableVector3(x - other.x, y - other.y, z - other.z)
@JvmName("vector3DoubleTimesMutableVector3Double")
operator fun Vector3<Double>.times(other: MutableVector3<Double>): MutableVector3<Double> = MutableVector3(x * other.x, y * other.y, z * other.z)
@JvmName("vector3DoubleDivMutableVector3Double")
operator fun Vector3<Double>.div(other: MutableVector3<Double>): MutableVector3<Double> = MutableVector3(x / other.x, y / other.y, z / other.z)
@JvmName("mutableVector3DoublePlusVector3Double")
operator fun MutableVector3<Double>.plus(other: Vector3<Double>): MutableVector3<Double> = MutableVector3(x + other.x, y + other.y, z + other.z)
@JvmName("mutableVector3DoubleMinusVector3Double")
operator fun MutableVector3<Double>.minus(other: Vector3<Double>): MutableVector3<Double> = MutableVector3(x - other.x, y - other.y, z - other.z)
@JvmName("mutableVector3DoubleTimesVector3Double")
operator fun MutableVector3<Double>.times(other: Vector3<Double>): MutableVector3<Double> = MutableVector3(x * other.x, y * other.y, z * other.z)
@JvmName("mutableVector3DoubleDivVector3Double")
operator fun MutableVector3<Double>.div(other: Vector3<Double>): MutableVector3<Double> = MutableVector3(x / other.x, y / other.y, z / other.z)
@JvmName("mutableVector3DoublePlusMutableVector3Double")
operator fun MutableVector3<Double>.plus(other: MutableVector3<Double>): MutableVector3<Double> = MutableVector3(x + other.x, y + other.y, z + other.z)
@JvmName("mutableVector3DoubleMinusMutableVector3Double")
operator fun MutableVector3<Double>.minus(other: MutableVector3<Double>): MutableVector3<Double> = MutableVector3(x - other.x, y - other.y, z - other.z)
@JvmName("mutableVector3DoubleTimesMutableVector3Double")
operator fun MutableVector3<Double>.times(other: MutableVector3<Double>): MutableVector3<Double> = MutableVector3(x * other.x, y * other.y, z * other.z)
@JvmName("mutableVector3DoubleDivMutableVector3Double")
operator fun MutableVector3<Double>.div(other: MutableVector3<Double>): MutableVector3<Double> = MutableVector3(x / other.x, y / other.y, z / other.z)
@JvmName("mutableVector3DoublePlusDouble")
operator fun MutableVector3<Double>.plus(other: Double): MutableVector3<Double> = MutableVector3(x + other, y + other, z + other)
@JvmName("mutableVector3DoubleMinusDouble")
operator fun MutableVector3<Double>.minus(other: Double): MutableVector3<Double> = MutableVector3(x - other, y - other, z - other)
@JvmName("mutableVector3DoubleTimesDouble")
operator fun MutableVector3<Double>.times(other: Double): MutableVector3<Double> = MutableVector3(x * other, y * other, z * other)
@JvmName("mutableVector3DoubleDivDouble")
operator fun MutableVector3<Double>.div(other: Double): MutableVector3<Double> = MutableVector3(x / other, y / other, z / other)

@JvmName("vectorFloatUnaryMinus")
operator fun Vector<Float>.unaryMinus(): Vector<Float> = Vector(-x, -y)
@JvmName("vector3FloatUnaryMinus")
operator fun Vector3<Float>.unaryMinus(): Vector3<Float> = Vector3(-x, -y, -z)
@JvmName("mutableVectorFloatUnaryMinus")
operator fun MutableVector<Float>.unaryMinus(): MutableVector<Float> = MutableVector(-x, -y)
@JvmName("mutableVector3FloatUnaryMinus")
operator fun MutableVector3<Float>.unaryMinus(): MutableVector3<Float> = MutableVector3(-x, -y, -z)
@JvmName("vectorFloatPlusVectorFloat")
operator fun Vector<Float>.plus(other: Vector<Float>): Vector<Float> = Vector(x + other.x, y + other.y)
@JvmName("vectorFloatMinusVectorFloat")
operator fun Vector<Float>.minus(other: Vector<Float>): Vector<Float> = Vector(x - other.x, y - other.y)
@JvmName("vectorFloatTimesVectorFloat")
operator fun Vector<Float>.times(other: Vector<Float>): Vector<Float> = Vector(x * other.x, y * other.y)
@JvmName("vectorFloatDivVectorFloat")
operator fun Vector<Float>.div(other: Vector<Float>): Vector<Float> = Vector(x / other.x, y / other.y)
@JvmName("vectorFloatPlusFloat")
operator fun Vector<Float>.plus(other: Float): Vector<Float> = Vector(x + other, y + other)
@JvmName("vectorFloatMinusFloat")
operator fun Vector<Float>.minus(other: Float): Vector<Float> = Vector(x - other, y - other)
@JvmName("vectorFloatTimesFloat")
operator fun Vector<Float>.times(other: Float): Vector<Float> = Vector(x * other, y * other)
@JvmName("vectorFloatDivFloat")
operator fun Vector<Float>.div(other: Float): Vector<Float> = Vector(x / other, y / other)
@JvmName("vectorFloatPlusMutableVectorFloat")
operator fun Vector<Float>.plus(other: MutableVector<Float>): MutableVector<Float> = MutableVector(x + other.x, y + other.y)
@JvmName("vectorFloatMinusMutableVectorFloat")
operator fun Vector<Float>.minus(other: MutableVector<Float>): MutableVector<Float> = MutableVector(x - other.x, y - other.y)
@JvmName("vectorFloatTimesMutableVectorFloat")
operator fun Vector<Float>.times(other: MutableVector<Float>): MutableVector<Float> = MutableVector(x * other.x, y * other.y)
@JvmName("vectorFloatDivMutableVectorFloat")
operator fun Vector<Float>.div(other: MutableVector<Float>): MutableVector<Float> = MutableVector(x / other.x, y / other.y)
@JvmName("mutableVectorFloatPlusVectorFloat")
operator fun MutableVector<Float>.plus(other: Vector<Float>): MutableVector<Float> = MutableVector(x + other.x, y + other.y)
@JvmName("mutableVectorFloatMinusVectorFloat")
operator fun MutableVector<Float>.minus(other: Vector<Float>): MutableVector<Float> = MutableVector(x - other.x, y - other.y)
@JvmName("mutableVectorFloatTimesVectorFloat")
operator fun MutableVector<Float>.times(other: Vector<Float>): MutableVector<Float> = MutableVector(x * other.x, y * other.y)
@JvmName("mutableVectorFloatDivVectorFloat")
operator fun MutableVector<Float>.div(other: Vector<Float>): MutableVector<Float> = MutableVector(x / other.x, y / other.y)
@JvmName("mutableVectorFloatPlusMutableVectorFloat")
operator fun MutableVector<Float>.plus(other: MutableVector<Float>): MutableVector<Float> = MutableVector(x + other.x, y + other.y)
@JvmName("mutableVectorFloatMinusMutableVectorFloat")
operator fun MutableVector<Float>.minus(other: MutableVector<Float>): MutableVector<Float> = MutableVector(x - other.x, y - other.y)
@JvmName("mutableVectorFloatTimesMutableVectorFloat")
operator fun MutableVector<Float>.times(other: MutableVector<Float>): MutableVector<Float> = MutableVector(x * other.x, y * other.y)
@JvmName("mutableVectorFloatDivMutableVectorFloat")
operator fun MutableVector<Float>.div(other: MutableVector<Float>): MutableVector<Float> = MutableVector(x / other.x, y / other.y)
@JvmName("mutableVectorFloatPlusFloat")
operator fun MutableVector<Float>.plus(other: Float): MutableVector<Float> = MutableVector(x + other, y + other)
@JvmName("mutableVectorFloatMinusFloat")
operator fun MutableVector<Float>.minus(other: Float): MutableVector<Float> = MutableVector(x - other, y - other)
@JvmName("mutableVectorFloatTimesFloat")
operator fun MutableVector<Float>.times(other: Float): MutableVector<Float> = MutableVector(x * other, y * other)
@JvmName("mutableVectorFloatDivFloat")
operator fun MutableVector<Float>.div(other: Float): MutableVector<Float> = MutableVector(x / other, y / other)
@JvmName("vector3FloatPlusVector3Float")
operator fun Vector3<Float>.plus(other: Vector3<Float>): Vector3<Float> = Vector3(x + other.x, y + other.y, z + other.z)
@JvmName("vector3FloatMinusVector3Float")
operator fun Vector3<Float>.minus(other: Vector3<Float>): Vector3<Float> = Vector3(x - other.x, y - other.y, z - other.z)
@JvmName("vector3FloatTimesVector3Float")
operator fun Vector3<Float>.times(other: Vector3<Float>): Vector3<Float> = Vector3(x * other.x, y * other.y, z * other.z)
@JvmName("vector3FloatDivVector3Float")
operator fun Vector3<Float>.div(other: Vector3<Float>): Vector3<Float> = Vector3(x / other.x, y / other.y, z / other.z)
@JvmName("vector3FloatPlusFloat")
operator fun Vector3<Float>.plus(other: Float): Vector3<Float> = Vector3(x + other, y + other, z + other)
@JvmName("vector3FloatMinusFloat")
operator fun Vector3<Float>.minus(other: Float): Vector3<Float> = Vector3(x - other, y - other, z - other)
@JvmName("vector3FloatTimesFloat")
operator fun Vector3<Float>.times(other: Float): Vector3<Float> = Vector3(x * other, y * other, z * other)
@JvmName("vector3FloatDivFloat")
operator fun Vector3<Float>.div(other: Float): Vector3<Float> = Vector3(x / other, y / other, z / other)
@JvmName("vector3FloatPlusMutableVector3Float")
operator fun Vector3<Float>.plus(other: MutableVector3<Float>): MutableVector3<Float> = MutableVector3(x + other.x, y + other.y, z + other.z)
@JvmName("vector3FloatMinusMutableVector3Float")
operator fun Vector3<Float>.minus(other: MutableVector3<Float>): MutableVector3<Float> = MutableVector3(x - other.x, y - other.y, z - other.z)
@JvmName("vector3FloatTimesMutableVector3Float")
operator fun Vector3<Float>.times(other: MutableVector3<Float>): MutableVector3<Float> = MutableVector3(x * other.x, y * other.y, z * other.z)
@JvmName("vector3FloatDivMutableVector3Float")
operator fun Vector3<Float>.div(other: MutableVector3<Float>): MutableVector3<Float> = MutableVector3(x / other.x, y / other.y, z / other.z)
@JvmName("mutableVector3FloatPlusVector3Float")
operator fun MutableVector3<Float>.plus(other: Vector3<Float>): MutableVector3<Float> = MutableVector3(x + other.x, y + other.y, z + other.z)
@JvmName("mutableVector3FloatMinusVector3Float")
operator fun MutableVector3<Float>.minus(other: Vector3<Float>): MutableVector3<Float> = MutableVector3(x - other.x, y - other.y, z - other.z)
@JvmName("mutableVector3FloatTimesVector3Float")
operator fun MutableVector3<Float>.times(other: Vector3<Float>): MutableVector3<Float> = MutableVector3(x * other.x, y * other.y, z * other.z)
@JvmName("mutableVector3FloatDivVector3Float")
operator fun MutableVector3<Float>.div(other: Vector3<Float>): MutableVector3<Float> = MutableVector3(x / other.x, y / other.y, z / other.z)
@JvmName("mutableVector3FloatPlusMutableVector3Float")
operator fun MutableVector3<Float>.plus(other: MutableVector3<Float>): MutableVector3<Float> = MutableVector3(x + other.x, y + other.y, z + other.z)
@JvmName("mutableVector3FloatMinusMutableVector3Float")
operator fun MutableVector3<Float>.minus(other: MutableVector3<Float>): MutableVector3<Float> = MutableVector3(x - other.x, y - other.y, z - other.z)
@JvmName("mutableVector3FloatTimesMutableVector3Float")
operator fun MutableVector3<Float>.times(other: MutableVector3<Float>): MutableVector3<Float> = MutableVector3(x * other.x, y * other.y, z * other.z)
@JvmName("mutableVector3FloatDivMutableVector3Float")
operator fun MutableVector3<Float>.div(other: MutableVector3<Float>): MutableVector3<Float> = MutableVector3(x / other.x, y / other.y, z / other.z)
@JvmName("mutableVector3FloatPlusFloat")
operator fun MutableVector3<Float>.plus(other: Float): MutableVector3<Float> = MutableVector3(x + other, y + other, z + other)
@JvmName("mutableVector3FloatMinusFloat")
operator fun MutableVector3<Float>.minus(other: Float): MutableVector3<Float> = MutableVector3(x - other, y - other, z - other)
@JvmName("mutableVector3FloatTimesFloat")
operator fun MutableVector3<Float>.times(other: Float): MutableVector3<Float> = MutableVector3(x * other, y * other, z * other)
@JvmName("mutableVector3FloatDivFloat")
operator fun MutableVector3<Float>.div(other: Float): MutableVector3<Float> = MutableVector3(x / other, y / other, z / other)

@JvmName("vectorFloatLength")
fun Vector<Float>.length(): Float = sqrt(x * x + y * y)
@JvmName("vector3FloatLength")
fun Vector3<Float>.length(): Float = sqrt(x * x + y * y + z * z)
@JvmName("vectorDoubleLength")
fun Vector<Double>.length(): Double = sqrt(x * x + y * y)
@JvmName("vector3DoubleLength")
fun Vector3<Double>.length(): Double = sqrt(x * x + y * y + z * z)
@JvmName("mutableVectorFloatLength")
fun MutableVector<Float>.length(): Float = sqrt(x * x + y * y)
@JvmName("mutableVector3FloatLength")
fun MutableVector3<Float>.length(): Float = sqrt(x * x + y * y + z * z)
@JvmName("mutableVectorDoubleLength")
fun MutableVector<Double>.length(): Double = sqrt(x * x + y * y)
@JvmName("mutableVector3DoubleLength")
fun MutableVector3<Double>.length(): Double = sqrt(x * x + y * y + z * z)

@JvmName("vectorFloatLengthSquared")
fun Vector<Float>.lengthSquared(): Float = x * x + y * y
@JvmName("vector3FloatLengthSquared")
fun Vector3<Float>.lengthSquared(): Float = x * x + y * y + z * z
@JvmName("vectorDoubleLengthSquared")
fun Vector<Double>.lengthSquared(): Double = x * x + y * y
@JvmName("vector3DoubleLengthSquared")
fun Vector3<Double>.lengthSquared(): Double = x * x + y * y + z * z
@JvmName("mutableVectorFloatLengthSquared")
fun MutableVector<Float>.lengthSquared(): Float = x * x + y * y
@JvmName("mutableVector3FloatLengthSquared")
fun MutableVector3<Float>.lengthSquared(): Float = x * x + y * y + z * z
@JvmName("mutableVectorDoubleLengthSquared")
fun MutableVector<Double>.lengthSquared(): Double = x * x + y * y
@JvmName("mutableVector3DoubleLengthSquared")
fun MutableVector3<Double>.lengthSquared(): Double = x * x + y * y + z * z

@JvmName("vectorFloatNormalize")
fun Vector<Float>.normalize(): Vector<Float> {
    val length = length()
    if (length == 0f) return this
    return Vector(x / length, y / length)
}
@JvmName("vector3FloatNormalize")
fun Vector3<Float>.normalize(): Vector3<Float> {
    val length = length()
    if (length == 0f) return this
    return Vector3(x / length, y / length, z / length)
}
@JvmName("vectorDoubleNormalize")
fun Vector<Double>.normalize(): Vector<Double> {
    val length = length()
    if (length == 0.0) return this
    return Vector(x / length, y / length)
}
@JvmName("vector3DoubleNormalize")
fun Vector3<Double>.normalize(): Vector3<Double> {
    val length = length()
    if (length == 0.0) return this
    return Vector3(x / length, y / length, z / length)
}
@JvmName("mutableVectorFloatNormalize")
fun MutableVector<Float>.normalize() {
    val length = length()
    if (length == 0f) return
    x /= length
    y /= length
}
@JvmName("mutableVector3FloatNormalize")
fun MutableVector3<Float>.normalize() {
    val length = length()
    if (length == 0f) return
    x /= length
    y /= length
    z /= length
}
@JvmName("mutableVectorDoubleNormalize")
fun MutableVector<Double>.normalize() {
    val length = length()
    if (length == 0.0) return
    x /= length
    y /= length
}
@JvmName("mutableVector3DoubleNormalize")
fun MutableVector3<Double>.normalize() {
    val length = length()
    if (length == 0.0) return
    x /= length
    y /= length
    z /= length
}

@JvmName("vectorFloatMulAdd")
fun Vector<Float>.mulAdd(scalar: Float, other: Vector<Float>): Vector<Float> = Vector(x + other.x * scalar, y + other.y * scalar)
@JvmName("vector3FloatMulAdd")
fun Vector3<Float>.mulAdd(scalar: Float, other: Vector3<Float>): Vector3<Float> = Vector3(x + other.x * scalar, y + other.y * scalar, z + other.z)
@JvmName("vectorDoubleMulAdd")
fun Vector<Double>.mulAdd(scalar: Double, other: Vector<Double>): Vector<Double> = Vector(x + other.x * scalar, y + other.y * scalar)
@JvmName("vector3DoubleMulAdd")
fun Vector3<Double>.mulAdd(scalar: Double, other: Vector3<Double>): Vector3<Double> = Vector3(x + other.x * scalar, y + other.y * scalar, z + other.z)
@JvmName("mutableVectorFloatMulAdd")
fun MutableVector<Float>.mulAdd(scalar: Float, other: MutableVector<Float>) {
    x += other.x * scalar
    y += other.y * scalar
}
@JvmName("mutableVector3FloatMulAdd")
fun MutableVector3<Float>.mulAdd(scalar: Float, other: MutableVector3<Float>) {
    x += other.x * scalar
    y += other.y * scalar
    z += other.z * scalar
}
@JvmName("mutableVectorDoubleMulAdd")
fun MutableVector<Double>.mulAdd(scalar: Double, other: MutableVector<Double>) {
    x += other.x * scalar
    y += other.y * scalar
}
@JvmName("mutableVector3DoubleMulAdd")
fun MutableVector3<Double>.mulAdd(scalar: Double, other: MutableVector3<Double>) {
    x += other.x * scalar
    y += other.y * scalar
    z += other.z * scalar
}

@JvmName("vectorFloatDistance")
fun Vector<Float>.distance(other: Vector<Float>): Float = (this - other).length()
@JvmName("vector3FloatDistance")
fun Vector3<Float>.distance(other: Vector3<Float>): Float = (this - other).length()
@JvmName("vectorDoubleDistance")
fun Vector<Double>.distance(other: Vector<Double>): Double = (this - other).length()
@JvmName("vector3DoubleDistance")
fun Vector3<Double>.distance(other: Vector3<Double>): Double = (this - other).length()
@JvmName("mutableVectorFloatDistance")
fun MutableVector<Float>.distance(other: MutableVector<Float>): Float = (this - other).length()
@JvmName("mutableVector3FloatDistance")
fun MutableVector3<Float>.distance(other: MutableVector3<Float>): Float = (this - other).length()
@JvmName("mutableVectorDoubleDistance")
fun MutableVector<Double>.distance(other: MutableVector<Double>): Double = (this - other).length()
@JvmName("mutableVector3DoubleDistance")
fun MutableVector3<Double>.distance(other: MutableVector3<Double>): Double = (this - other).length()

@JvmName("vectorFloatDistanceSquared")
fun Vector<Float>.distanceSquared(other: Vector<Float>): Float = (this - other).lengthSquared()
@JvmName("vector3FloatDistanceSquared")
fun Vector3<Float>.distanceSquared(other: Vector3<Float>): Float = (this - other).lengthSquared()
@JvmName("vectorDoubleDistanceSquared")
fun Vector<Double>.distanceSquared(other: Vector<Double>): Double = (this - other).lengthSquared()
@JvmName("vector3DoubleDistanceSquared")
fun Vector3<Double>.distanceSquared(other: Vector3<Double>): Double = (this - other).lengthSquared()
@JvmName("mutableVectorFloatDistanceSquared")
fun MutableVector<Float>.distanceSquared(other: MutableVector<Float>): Float = (this - other).lengthSquared()
@JvmName("mutableVector3FloatDistanceSquared")
fun MutableVector3<Float>.distanceSquared(other: MutableVector3<Float>): Float = (this - other).lengthSquared()
@JvmName("mutableVectorDoubleDistanceSquared")
fun MutableVector<Double>.distanceSquared(other: MutableVector<Double>): Double = (this - other).lengthSquared()
@JvmName("mutableVector3DoubleDistanceSquared")
fun MutableVector3<Double>.distanceSquared(other: MutableVector3<Double>): Double = (this - other).lengthSquared()

@JvmName("vectorFloatClamp")
fun Vector<Float>.clamp(min: Float, max: Float): Vector<Float> = Vector(x.coerceIn(min, max), y.coerceIn(min, max))
@JvmName("vector3FloatClamp")
fun Vector3<Float>.clamp(min: Float, max: Float): Vector3<Float> = Vector3(x.coerceIn(min, max), y.coerceIn(min, max), z.coerceIn(min, max))
@JvmName("vectorDoubleClamp")
fun Vector<Double>.clamp(min: Double, max: Double): Vector<Double> = Vector(x.coerceIn(min, max), y.coerceIn(min, max))
@JvmName("vector3DoubleClamp")
fun Vector3<Double>.clamp(min: Double, max: Double): Vector3<Double> = Vector3(x.coerceIn(min, max), y.coerceIn(min, max), z.coerceIn(min, max))
@JvmName("mutableVectorFloatClamp")
fun MutableVector<Float>.clamp(min: Float, max: Float) {
    x = x.coerceIn(min, max)
    y = y.coerceIn(min, max)
}
@JvmName("mutableVector3FloatClamp")
fun MutableVector3<Float>.clamp(min: Float, max: Float) {
    x = x.coerceIn(min, max)
    y = y.coerceIn(min, max)
    z = z.coerceIn(min, max)
}
@JvmName("mutableVectorDoubleClamp")
fun MutableVector<Double>.clamp(min: Double, max: Double) {
    x = x.coerceIn(min, max)
    y = y.coerceIn(min, max)
}
@JvmName("mutableVector3DoubleClamp")
fun MutableVector3<Double>.clamp(min: Double, max: Double) {
    x = x.coerceIn(min, max)
    y = y.coerceIn(min, max)
    z = z.coerceIn(min, max)
}

@JvmName("vectorFloatLerp")
fun Vector<Float>.lerp(other: Vector<Float>, alpha: Float): Vector<Float> = Vector(x + (other.x - x) * alpha, y + (other.y - y) * alpha)
@JvmName("vector3FloatLerp")
fun Vector3<Float>.lerp(other: Vector3<Float>, alpha: Float): Vector3<Float> = Vector3(x + (other.x - x) * alpha, y + (other.y - y) * alpha, z + (other.z - z) * alpha)
@JvmName("vectorDoubleLerp")
fun Vector<Double>.lerp(other: Vector<Double>, alpha: Double): Vector<Double> = Vector(x + (other.x - x) * alpha, y + (other.y - y) * alpha)
@JvmName("vector3DoubleLerp")
fun Vector3<Double>.lerp(other: Vector3<Double>, alpha: Double): Vector3<Double> = Vector3(x + (other.x - x) * alpha, y + (other.y - y) * alpha, z + (other.z - z) * alpha)
@JvmName("mutableVectorFloatLerp")
fun MutableVector<Float>.lerp(other: MutableVector<Float>, alpha: Float) {
    x += (other.x - x) * alpha
    y += (other.y - y) * alpha
}
@JvmName("mutableVector3FloatLerp")
fun MutableVector3<Float>.lerp(other: MutableVector3<Float>, alpha: Float) {
    x += (other.x - x) * alpha
    y += (other.y - y) * alpha
    z += (other.z - z) * alpha
}
@JvmName("mutableVectorDoubleLerp")
fun MutableVector<Double>.lerp(other: MutableVector<Double>, alpha: Double) {
    x += (other.x - x) * alpha
    y += (other.y - y) * alpha
}
@JvmName("mutableVector3DoubleLerp")
fun MutableVector3<Double>.lerp(other: MutableVector3<Double>, alpha: Double) {
    x += (other.x - x) * alpha
    y += (other.y - y) * alpha
    z += (other.z - z) * alpha
}

@JvmName("vectorFloatAngle")
fun Vector<Float>.angle(): Float {
    val angle = atan2(y, x) * 180f / PI.toFloat()
    return if (angle < 0) angle + 360f else angle
}
@JvmName("vector3FloatAngle")
fun Vector3<Float>.angle(): Float {
    val angle = atan2(sqrt(x * x + y * y), z) * 180f / PI.toFloat()
    return if (angle < 0) angle + 360f else angle
}
@JvmName("vectorDoubleAngle")
fun Vector<Double>.angle(): Double {
    val angle = atan2(y, x) * 180.0 / PI
    return if (angle < 0) angle + 360.0 else angle
}
@JvmName("vector3DoubleAngle")
fun Vector3<Double>.angle(): Double {
    val angle = atan2(sqrt(x * x + y * y), z) * 180.0 / PI
    return if (angle < 0) angle + 360.0 else angle
}
@JvmName("mutableVectorFloatAngle")
fun MutableVector<Float>.angle(): Float {
    val angle = atan2(y, x) * 180f / PI.toFloat()
    return if (angle < 0) angle + 360f else angle
}
@JvmName("mutableVector3FloatAngle")
fun MutableVector3<Float>.angle(): Float {
    val angle = atan2(sqrt(x * x + y * y), z) * 180f / PI.toFloat()
    return if (angle < 0) angle + 360f else angle
}
@JvmName("mutableVectorDoubleAngle")
fun MutableVector<Double>.angle(): Double {
    val angle = atan2(y, x) * 180.0 / PI
    return if (angle < 0) angle + 360.0 else angle
}
@JvmName("mutableVector3DoubleAngle")
fun MutableVector3<Double>.angle(): Double {
    val angle = atan2(sqrt(x * x + y * y), z) * 180.0 / PI
    return if (angle < 0) angle + 360.0 else angle
}

@JvmName("vectorFloatAngleRad")
fun Vector<Float>.angleRad(): Float = atan2(y, x)
@JvmName("vector3FloatAngleRad")
fun Vector3<Float>.angleRad(): Float = atan2(sqrt(x * x + y * y), z)
@JvmName("vectorDoubleAngleRad")
fun Vector<Double>.angleRad(): Double = atan2(y, x)
@JvmName("vector3DoubleAngleRad")
fun Vector3<Double>.angleRad(): Double = atan2(sqrt(x * x + y * y), z)
@JvmName("mutableVectorFloatAngleRad")
fun MutableVector<Float>.angleRad(): Float = atan2(y, x)
@JvmName("mutableVector3FloatAngleRad")
fun MutableVector3<Float>.angleRad(): Float = atan2(sqrt(x * x + y * y), z)
@JvmName("mutableVectorDoubleAngleRad")
fun MutableVector<Double>.angleRad(): Double = atan2(y, x)
@JvmName("mutableVector3DoubleAngleRad")
fun MutableVector3<Double>.angleRad(): Double = atan2(sqrt(x * x + y * y), z)

@JvmName("vectorFloatRotate")
fun Vector<Float>.rotate(angle: Float): Vector<Float> {
    val rad = angle * PI.toFloat() / 180f
    val cos = cos(rad)
    val sin = sin(rad)
    return Vector(x * cos - y * sin, x * sin + y * cos)
}
@JvmName("vector3FloatRotate")
fun Vector3<Float>.rotate(angle: Float): Vector3<Float> {
    val rad = angle * PI.toFloat() / 180f
    val cos = cos(rad)
    val sin = sin(rad)
    return Vector3(x * cos - y * sin, x * sin + y * cos, z)
}
@JvmName("vectorDoubleRotate")
fun Vector<Double>.rotate(angle: Double): Vector<Double> {
    val rad = angle * PI / 180.0
    val cos = cos(rad)
    val sin = sin(rad)
    return Vector(x * cos - y * sin, x * sin + y * cos)
}
@JvmName("vector3DoubleRotate")
fun Vector3<Double>.rotate(angle: Double): Vector3<Double> {
    val rad = angle * PI / 180.0
    val cos = cos(rad)
    val sin = sin(rad)
    return Vector3(x * cos - y * sin, x * sin + y * cos, z)
}
@JvmName("mutableVectorFloatRotate")
fun MutableVector<Float>.rotate(angle: Float) {
    val rad = angle * PI.toFloat() / 180f
    val cos = cos(rad)
    val sin = sin(rad)
    val x = x
    this.x = x * cos - y * sin
    this.y = x * sin + y * cos
}
@JvmName("mutableVector3FloatRotate")
fun MutableVector3<Float>.rotate(angle: Float) {
    val rad = angle * PI.toFloat() / 180f
    val cos = cos(rad)
    val sin = sin(rad)
    val x = x
    this.x = x * cos - y * sin
    this.y = x * sin + y * cos
}
@JvmName("mutableVectorDoubleRotate")
fun MutableVector<Double>.rotate(angle: Double) {
    val rad = angle * PI / 180.0
    val cos = cos(rad)
    val sin = sin(rad)
    val x = x
    this.x = x * cos - y * sin
    this.y = x * sin + y * cos
}
@JvmName("mutableVector3DoubleRotate")
fun MutableVector3<Double>.rotate(angle: Double) {
    val rad = angle * PI / 180.0
    val cos = cos(rad)
    val sin = sin(rad)
    val x = x
    this.x = x * cos - y * sin
    this.y = x * sin + y * cos
}

@JvmName("vectorFloatIsZero")
fun Vector<Float>.isZero(): Boolean = x == 0f && y == 0f
@JvmName("vector3FloatIsZero")
fun Vector3<Float>.isZero(): Boolean = x == 0f && y == 0f && z == 0f
@JvmName("vectorDoubleIsZero")
fun Vector<Double>.isZero(): Boolean = x == 0.0 && y == 0.0
@JvmName("vector3DoubleIsZero")
fun Vector3<Double>.isZero(): Boolean = x == 0.0 && y == 0.0 && z == 0.0
@JvmName("mutableVectorFloatIsZero")
fun MutableVector<Float>.isZero(): Boolean = x == 0f && y == 0f
@JvmName("mutableVector3FloatIsZero")
fun MutableVector3<Float>.isZero(): Boolean = x == 0f && y == 0f && z == 0f
@JvmName("mutableVectorDoubleIsZero")
fun MutableVector<Double>.isZero(): Boolean = x == 0.0 && y == 0.0
@JvmName("mutableVector3DoubleIsZero")
fun MutableVector3<Double>.isZero(): Boolean = x == 0.0 && y == 0.0 && z == 0.0