package Week4;

public class BankAccountTester {

    public static void main(String[] args) {
        BankAccount gregChecking = new BankAccount();
        BankAccount bobChecking = new BankAccount(10000);
        double balance = bobChecking.getBalance();
        System.out.println(balance);

        System.out.println(gregChecking.getBalance());
        gregChecking.deposit(5);
        System.out.println(gregChecking.getBalance());
        gregChecking.withdraw(3.25);
        System.out.println(gregChecking.getBalance());
        gregChecking.monthlyfee();
        System.out.println(gregChecking.getBalance());
    }
}
