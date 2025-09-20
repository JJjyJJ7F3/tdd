package self.jjjyjj.tdd.kent;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CurrencyTest {

    /**
     * Could you find the duplication between the test and the production code?
     * We can see that the value of the amount field in dollar can be replaced by variables.
     */
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
