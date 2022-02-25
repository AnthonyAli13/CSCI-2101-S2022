package Week4;

import java.util.Scanner;

public class BankAccount {
    private double balance;

    
    public BankAccount(){
        balance = 0;
    }

    public BankAccount(double initalBalance){
        balance = initalBalance;
    }


    public double getBalance(){
        return balance;
    }

 //test
    public void deposit(double amount){
        balance = balance + amount;
    }

    public void withdraw(double amount){
        balance = balance - amount;
    }


    public void monthlyfee(){
        withdraw(10);
    }

    public static int menu(){
        int selection;
        Scanner input = new Scanner(System.in);

        /************************ */
        System.out.println("Please select and option:");
        System.out.println("-------------------------");
        System.out.println("1: Get Balance");
        System.out.println("2: Deposit");
        System.out.println("3: Withdraw");
        System.out.println("0: Quit");
        System.out.println("-------------------------");

        selection = input.nextInt();


        return selection;


    }





}
