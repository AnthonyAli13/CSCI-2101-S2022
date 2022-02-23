package Week4;

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


    public void deposit(double amount){
        balance = balance + amount;
    }

    public void withdraw(double amount){
        balance = balance - amount;
    }


    public void monthlyfee(){
        withdraw(10);
    }





}
