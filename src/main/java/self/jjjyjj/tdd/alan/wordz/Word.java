package self.jjjyjj.tdd.alan.wordz;

public class Word {
    private final String actual;

    public Word(String actual) {
        this.actual = actual;
    }

    public Score guess(String attempt) {
        Score score = new Score(actual);

        score.access(0, attempt);
        return score;
    }
}
