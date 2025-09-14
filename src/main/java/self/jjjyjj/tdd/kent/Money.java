package self.jjjyjj.tdd.kent;

public class Money {
    protected int amount;

    public static Dollar dollar(int amount) {
        return new Dollar(amount);
    }

    @Override
    public boolean equals(Object obj) {
        return this.amount == ((Money) obj).amount && this.getClass() == obj.getClass();
    }

}
