public class BasicAccountTester
{
    public static void main(String[] args)
    {
        BankAccount account = new BasicAccount(100.00);    //An BasicAccount with initial balance of 100.00 dollars

        account.withdraw(80.00);      //No overdraft, so no penalty.
        System.out.println(account.getBalance());

        account.withdraw(50.00);      //If this is a overdraft, charges $30 penalty
        System.out.println(account.getBalance());

        account.withdraw(50.00);     //If this is a overdraft, charges $30 penalty
        System.out.println(account.getBalance());
    }
}
