package self.jjjyjj.tdd.beck;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CurrencyTest {
    /**
     * for example, $5 * 2 = $10
     */
    @Test
    public void testMultiplication() {
        // Arrange
        Dollar five = new Dollar(5);

        // Assert
        assertEquals(new Dollar(10), five.times(2));

        // Assert
        assertEquals(new Dollar(15), five.times(3));
    }

    @Test
    public void testEquality() {
        assertEquals(new Dollar(5), new Dollar(5));

        assertNotEquals(new Dollar(5), new Dollar(6));
    }
}
