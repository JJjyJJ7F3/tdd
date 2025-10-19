package self.jjjyjj.tdd.alan;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

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
}
