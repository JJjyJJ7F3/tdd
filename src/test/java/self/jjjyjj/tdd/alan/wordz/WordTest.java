package self.jjjyjj.tdd.alan.wordz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * According to the notes in requirements.md, we need to create a test for the Word class.
 */
public class WordTest {
    @Test
    public void oneIncorrectLetter() {
        // Arrange
        var word = new Word("A");

        // Act
        var score = word.guess("B");
        var result = score.letter(0);

        // Assert
        assertThat(result).isEqualTo(Letter.INCORRECT);
    }
}
