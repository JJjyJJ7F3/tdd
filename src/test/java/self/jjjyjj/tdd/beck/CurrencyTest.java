package self.jjjyjj.tdd.beck;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

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
}
