package self.jjjyjj.tdd.beck;

public class Dollar {

    private final int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Dollar)) {
            return false;
        }
        return this.amount == ((Dollar)obj).amount;
    }
}
