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

        Assertions.assertEquals(50, f())
    }
}