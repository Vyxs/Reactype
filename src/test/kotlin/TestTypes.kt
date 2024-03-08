import builder.int
import operator.div
import operator.minus
import operator.plus
import operator.times
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class TestTypes {

    @Test
    @DisplayName("Test values of reactive int")
    fun testReactiveValues() {
        Assertions.assertEquals(10, int(10).value)
        Assertions.assertEquals(-10, int(-10).value)
    }

    @Test
    @DisplayName("Test addition of reactive int")
    fun testIntAddition() {
        val a = int(10)
        val b = int(10)
        val c = int(10)
        val d = int(10)
        val e = int(10)
        val f = a + b + c + d + e

        Assertions.assertEquals(50, f.value)
    }

    @Test
    @DisplayName("Test addition of reactive int with change")
    fun testIntAdditionWithChange() {
        val a = int(10)
        val b = int(10)
        val c = int(10)
        val d = a + b + c
        val e = b + c + a
        val f = d + e

        Assertions.assertEquals(60, f.value)
        a.value = 5
        Assertions.assertEquals(50, f.value)
        b.value = 5
        Assertions.assertEquals(40, f.value)
        c.value = 5
        Assertions.assertEquals(30, f.value)
    }

    @Test
    @DisplayName("Test subtraction of reactive int")
    fun testIntSubtraction() {
        val a = int(10)
        val b = int(10)
        val c = int(10)
        val d = int(10)
        val e = int(10)
        val f = a - b - c - d - e

        Assertions.assertEquals(-30, f.value)
    }

    @Test
    @DisplayName("Test subtraction of reactive int with change")
    fun testIntSubtractionWithChange() {
        val a = int(10)
        val b = int(10)
        val c = int(10)
        val d = a - b - c
        val e = b - c - a
        val f = d - e

        Assertions.assertEquals(0, f.value)
        a.value = 5
        Assertions.assertEquals(-10, f.value)
        b.value = 5
        Assertions.assertEquals(0, f.value)
        c.value = 5
        Assertions.assertEquals(0, f.value)
    }

    @Test
    @DisplayName("Test multiplication of reactive int")
    fun testIntMultiplication() {
        val a = int(10)
        val b = int(10)
        val c = int(10)
        val d = int(10)
        val e = int(10)
        val f = a * b * c * d * e

        Assertions.assertEquals(100000, f())
    }

    @Test
    @DisplayName("Test multiplication of reactive int with change")
    fun testIntMultiplicationWithChange() {
        val a = int(10)
        val b = int(10)
        val c = int(10)
        val d = a * b * c
        val e = b * c * a
        val f = d * e

        Assertions.assertEquals(1000000, f.value)
        a.value = 5
        Assertions.assertEquals(250000, f.value)
        b.value = 5
        Assertions.assertEquals(62500, f.value)
        c.value = 5
        Assertions.assertEquals(15625, f.value)
    }

    @Test
    @DisplayName("Test division of reactive int")
    fun testIntDivision() {
        val a = int(10)
        val b = int(10)
        val c = int(10)
        val d = int(10)
        val e = int(10)
        val f = a / b / c / d / e

        Assertions.assertEquals(0, f())
    }

    @Test
    @DisplayName("Test division of reactive int with change")
    fun testIntDivisionWithChange() {
        val a = int(10)
        val b = int(10)
        val c = int(10)
        val d = a / b / c

        Assertions.assertEquals(0, d.value)
        a.value = 500
        Assertions.assertEquals(5, d.value)
        b.value = 5
        Assertions.assertEquals(10, d.value)
    }

    @Test
    @DisplayName("Test all operations of reactive int")
    fun testIntAllOperations() {
        val a = int(10)
        val b = int(10)
        val c = int(10)
        val d = int(10)
        val e = int(10)
        val f = a + b - c * d / e

        Assertions.assertEquals(10, f())
        a.value = 5
        Assertions.assertEquals(5, f())
        b.value = 5
        Assertions.assertEquals(0, f())
        c.value = 5
        Assertions.assertEquals(5, f())
        d.value = 5
        Assertions.assertEquals(8, f()) // 7.5 rounded to 8
        e.value = 5
        Assertions.assertEquals(5, f())
    }

}