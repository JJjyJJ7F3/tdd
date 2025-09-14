package self.jjjyjj.tdd.kent;

public class Dollar extends Money {
    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Money)) {
            return false;
        }
        return this.amount == ((Money) obj).amount;
    }
}
