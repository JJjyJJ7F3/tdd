package self.jjjyjj.tdd.kent;

public abstract class Money {
    protected int amount;

    public static Dollar dollar(int amount) {
        return new Dollar(amount);
    }

    public static Franc franc(int amount) {
        return new Franc(amount);
    }

    @Override
    public boolean equals(Object obj) {
        return this.amount == ((Money) obj).amount && this.getClass() == obj.getClass();
    }

    public abstract Money times(int amount);
}
