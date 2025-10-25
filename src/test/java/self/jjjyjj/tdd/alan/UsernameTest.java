package self.jjjyjj.tdd.alan;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class UsernameTest {
    @Test
    public void convertsToLowercase() {
        // Arrange
        var username = new Username("Singularity");

        // Act
        String actual = username.toLowerCase();

        // Assert
        assertThat(actual).isEqualTo("singularity");
    }

    @Test
    public void rejectShortNames() {
        assertThatExceptionOfType(InvalidNameException.class)
                .isThrownBy(
                        () -> new Username("S")
                );
    }

    @Test
    public void acceptsLongNames() {
        assertThatNoException().isThrownBy(() -> new Username("LongUsername"));
    }
}
