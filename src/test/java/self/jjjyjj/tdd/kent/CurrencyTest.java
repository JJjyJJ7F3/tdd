package self.jjjyjj.tdd.kent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CurrencyTest {
    /**
     * for example, $5 * 2 = $10
     */
    @Test
    public void testDollarMultiplication() {
        // Arrange
        Money five = Money.dollar(5);

        // Assert
        assertEquals(Money.dollar(10), five.times(2));

        // Assert
        assertEquals(Money.dollar(15), five.times(3));
    }

    @Test
    public void testFrancMultiplication() {
        // Arrange
        Money five = Money.franc(5);

        // Assert
        assertEquals(Money.franc(10), five.times(2));

        // Assert
        assertEquals(Money.franc(15), five.times(3));
    }


    @Test
    public void testEquality() {
        assertEquals(Money.dollar(5), Money.dollar(5));

        assertNotEquals(Money.dollar(5), Money.dollar(6));

        assertEquals(Money.franc(5), Money.franc(5));

        assertNotEquals(Money.franc(5), Money.franc(6));

        assertNotEquals(Money.franc(5), Money.dollar(5));
    }
}
