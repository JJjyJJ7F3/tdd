package self.jjjyjj.tdd.alan.wordz;

public class Score {

    private final String actual;
    private Letter result = Letter.INCORRECT;

    public Score(String actual) {
        this.actual = actual;
    }

    public Letter letter(int index) {
        return result;
    }

    public void access(int index, String attempt) {
        if (attempt.charAt(index) == actual.charAt(index)) {
            result = Letter.CORRECT;
        }
    }
}
