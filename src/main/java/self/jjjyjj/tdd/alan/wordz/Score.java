package self.jjjyjj.tdd.alan.wordz;

public class Score {
    private String result = "";

    public Letter letter(int position) {
        return this.result.charAt(position) == 'C' ? Letter.CORRECT : Letter.INCORRECT;
    }

    public void assess(char actual, char expected) {
        if (actual == expected) {
            this.result += "C";
        } else {
            this.result += "I";
        }
    }
}
