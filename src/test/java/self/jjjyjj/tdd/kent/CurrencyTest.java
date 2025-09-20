package self.jjjyjj.tdd.kent;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CurrencyTest {
    @Test
    public void testMultiplication() {
        // Arrange
        Dollar dollar = new Dollar(5);

        // Act
        dollar.times(2);

        // Assert
        assertThat(dollar.amount).isEqualTo(10);
    }
}
