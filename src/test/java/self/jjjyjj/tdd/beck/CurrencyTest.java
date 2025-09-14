package self.jjjyjj.tdd.beck;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class CurrencyTest {
    /**
     * for example, $5 * 2 = $10
     */
    @Test
    public void testMultiplication() {
        // Arrange
        Dollar five = new Dollar(5);

        // Act
        Dollar product = five.times(2);

        // Assert
        assertThat(product.amount).isEqualTo(10);

        // Act
        product = five.times(3);

        // Assert
        assertThat(product.amount).isEqualTo(15);
    }

    @Test
    public void testEquality() {
        assertEquals(new Dollar(5), new Dollar(5));

        assertNotEquals(new Dollar(5), new Dollar(6));
    }
}
