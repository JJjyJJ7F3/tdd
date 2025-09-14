package self.jjjyjj.tdd.kent;

public class Money {
    protected int amount;

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Money)) {
            return false;
        }
        return this.amount == ((Money) obj).amount;
    }

}
