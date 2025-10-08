package self.jjjyjj.tdd.alan.wordz;

public class Word {
    private final String word;

    public Word(String word) {
        this.word = word;
    }

    public Score guess(String guess) {
        var score = new Score();
        for (int i = 0; i < this.word.length(); i++) {
            score.assess(this.word.charAt(i), guess.charAt(i));
        }
        return score;
    }
}
