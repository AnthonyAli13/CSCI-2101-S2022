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

        
        bobChecking.calcInterest(bobChecking.getBalance(), 5, 0.15, 12);

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
            System.out.println("Total Balance: $" + bobChecking.getBalance());

        }else if (menuSelection == 3){
            System.out.println("Please enter the amount to withdraw");
            double withdrawAmount = keyboard.nextDouble();
            bobChecking.withdraw(withdrawAmount);
            
            System.out.println("Amount: $"+withdrawAmount + " Was Withdrew");
            System.out.println("Total Balance: $" + bobChecking.getBalance());

        }else if(menuSelection == 4){

            System.out.println("Please enter the amount of years");
            int years = keyboard.nextInt();
            bobChecking.calcInterest(bobChecking.getBalance(), years, 0.15, 12);



        }else if (menuSelection == 0){
            System.out.println("Have a nice day!");
        }else{
            System.out.println("Error: No Valid Selection");
        }
    }
}
