public class CheckingAccount extends BankAccount{
    private static final double FIRST_OVERDRAFT_PENALTY = 20.00;
    private static final double ADDITIONAL_OVERDRAFT_PENALTY = 30.00;
    private static final double FOURTH_WITHDRAW_EXTRA = 1.00;

    private boolean isFirstOverdraft;
    private int withdrawCount;

    public CheckingAccount() {
        super();
        isFirstOverdraft = true;
        withdrawCount = 0;
    }

    public void withdraw(double amount) {
        super.withdraw(amount);
        withdrawCount++;
        if (withdrawCount == 4) {
            super.withdraw(FOURTH_WITHDRAW_EXTRA);
        }
        if (getBalance() < 0) {
            if (isFirstOverdraft) {
                super.withdraw(FIRST_OVERDRAFT_PENALTY);
                isFirstOverdraft = false;
            } else {
                super.withdraw(ADDITIONAL_OVERDRAFT_PENALTY);
            }
        }
    }

    @Override
    public void monthEnd() {
        isFirstOverdraft = true;
        withdrawCount = 0;
    }
}
