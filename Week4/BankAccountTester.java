package Week4;

import java.util.Scanner;

public class BankAccountTester {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        BankAccount gregChecking = new BankAccount();
        BankAccount bobChecking = new BankAccount(10000);
        double balance = bobChecking.getBalance();
        // System.out.println(balance);
        // System.out.println(gregChecking.getBalance());
        gregChecking.deposit(5);
        // System.out.println(gregChecking.getBalance());
        gregChecking.withdraw(3.25);
        // System.out.println(gregChecking.getBalance());
        gregChecking.monthlyfee();
        // System.out.println(gregChecking.getBalance());

        // Start of interaction with User

        System.out.println("Hello Welcome! Please Enter your Name:");
        String name = keyboard.nextLine();
        System.out.println("Welcome " + name + ", How much would you like start your account with?");
        double startAmount = keyboard.nextDouble();
        //https://stackoverflow.com/questions/39881371/is-there-a-way-to-create-a-new-variable-from-user-input-in-java 
        // We will implement this when we learn ArrayLists
        BankAccount name_checking = new BankAccount(startAmount);

        System.out.println("Great! "+ name+" Your starting balance is: $"+ name_checking.getBalance());
        
        int menuSelection = BankAccount.menu();
        System.out.println(menuSelection);
        
        if(menuSelection == 1){
            System.out.println("Getting Account Balance...");
            System.out.println("Total Balance: $"+name_checking.getBalance());

        }else if (menuSelection == 2){
            System.out.println("Please enter the amount to deposit");
            double depositAmount = keyboard.nextDouble();
            name_checking.deposit(depositAmount);
            System.out.println("Amount: $"+depositAmount + " Was Deposited");
            System.out.println("Total Balance: $" + name_checking.getBalance());

        }else if (menuSelection == 3){
            System.out.println("Please enter the amount to withdraw");
            double withdrawAmount = keyboard.nextDouble();
            name_checking.withdraw(withdrawAmount);
            
            System.out.println("Amount: $"+withdrawAmount + " Was Withdrew");
            System.out.println("Total Balance: $" + name_checking.getBalance());

        }else if(menuSelection == 4){

            System.out.println("Please enter the amount of years");
            int years = keyboard.nextInt();
            name_checking.calcInterest(name_checking.getBalance(), years, 0.15, 12);



        }else if (menuSelection == 0){
            System.out.println("Have a nice day!");
        }else{
            System.out.println("Error: No Valid Selection");
        }
    }
}
