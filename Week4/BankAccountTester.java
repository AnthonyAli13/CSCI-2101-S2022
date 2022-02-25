package Week4;

import java.util.Scanner;

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

        int menuSelection = BankAccount.menu();
        System.out.println(menuSelection);
        Scanner keyboard = new Scanner(System.in);
        if(menuSelection == 1){
            System.out.println("Getting Account Balance...");
            System.out.println("Total Balance: $"+bobChecking.getBalance());

        }else if (menuSelection == 2){
            System.out.println("Please enter the amount to deposit");
            double depositAmount = keyboard.nextDouble();
            bobChecking.deposit(depositAmount);
            System.out.println("Amount: $"+depositAmount + " Was Deposited");
            System.err.println("Total Balance: $" + bobChecking.getBalance());

        }else{
            System.out.println("Error: No Valid Selection");
        }

    }
}
