import builder.int
import subscription.CompositeDisposable
import operator.plus
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class TestSubscription {

    @Test
    @DisplayName("Test subscribing to reactive int")
    fun testIntSubscribing() {
        val a = int(10)
        val b = int(10)
        val c = int(10)
        val d = int(10)
        val e = int(10)
        val f = (a + b + c + d + e).typed

        val disposable = CompositeDisposable()
        var newValue = 0
        disposable += f.subscribe(deferred = false) {
            newValue = it
        }

        a.value = 5
        Assertions.assertEquals(45, newValue)

        b.value = 5
        Assertions.assertEquals(40, newValue)

        disposable.dispose()
        c.value = 5
        Assertions.assertEquals(40, newValue)
        Assertions.assertEquals(35, f.value)
    }
}