public class CheckingAccountTester
{
    public static void main(String[] args)
    {
        BankAccount account = new CheckingAccount();
        account.deposit(100.00);
        System.out.println(account.getBalance());

        // 1st withdrawal, no overdraft
        account.withdraw(90.00);
        System.out.println(account.getBalance());


        //2nd withdrawal, 1st overdraft ($20)
        account.withdraw(20.00);
        System.out.println(account.getBalance());

        //3rd withdrawal, 2nd overdraft ($30)
        account.withdraw(20.00);
        System.out.println(account.getBalance());


        //4th withdrawal ($1), third overdraft ($30)
        account.withdraw(20.00);
        System.out.println(account.getBalance());


        //perform end month transactions
        account.monthEnd();
        account.deposit(151);
        System.out.println(account.getBalance());


        account.withdraw(20.0);
        System.out.println(account.getBalance());
    }
}
