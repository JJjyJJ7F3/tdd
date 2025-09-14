package self.jjjyjj.tdd.kent;

public class Franc extends Money {
    public Franc(int amount) {
        this.amount = amount;
    }

    public Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Franc)) {
            return false;
        }
        return this.amount == ((Franc) obj).amount;
    }

}
