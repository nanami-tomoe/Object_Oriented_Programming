public class BasicAccount extends BankAccount{
    private static final double OVERDRAFT_PENALTY = 30.00;

    public BasicAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        if (getBalance() < 0) {
            super.withdraw(OVERDRAFT_PENALTY);
        }
    }
}
