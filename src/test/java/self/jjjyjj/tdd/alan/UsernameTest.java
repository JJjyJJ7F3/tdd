package self.jjjyjj.tdd.alan;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.assertj.core.api.Assertions.assertThatNoException;

public class UsernameTest {
    @Test
    public void convertsToLowercase() {
        // Arrange
        String expected = "john";
        Username actual = new Username("John");

        // Act & Assert
        assertThat(actual.toLowerCase()).isEqualTo(expected);
    }

    /**
     * the username should be at least 3 characters long
     */
    @Test
    public void rejectShortUsername() {
        assertThatExceptionOfType(InvalidNameException.class)
            .isThrownBy(() -> new Username("AG"))
            .withMessage("Username must be at least 3 characters long");
    }

    @Test
    public void acceptMinimumLengthUsername() {
        assertThatNoException()
            .isThrownBy(() -> new Username("ABC"));
    }

    
}
