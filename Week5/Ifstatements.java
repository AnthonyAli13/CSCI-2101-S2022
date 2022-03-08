package Week5;

import java.util.Scanner;

import Week4.*;

public class Ifstatements {


    
    public static String checkageandbank(int age, BankAccount bank, String name) {
        // valid with 2 if statements
        // if(age >= 21){
        //     if(bank.getBalance()>= 9000){
        //         if(name.equalsIgnoreCase("greg")){
        //             return "Welcome in Greg";
        //         }
        //         return "Welcome in grab a drink but don't talk to greg";
        //     }
        //     return "Welcome in but don't drink anything you cant afford";
        // }else{
        //     return "Beat it kid";
        // }
        // valid with 1 if statement that has && 
        if(age >= 21 && bank.getBalance() >= 9000 || name.equalsIgnoreCase("greg")){
                return "Welcome in " +  name;
        }else if(age >= 21 && bank.getBalance() >= 9000){
            return "Welcome in grab a drink but don't talk to greg";
        }else if (age < 21 && bank.getBalance()>=50000){
            return "Ill let you in for $5,000";
        } 
        else{
           return "Beat it kid";
        }
        
    }

    public static void main(String[] args) {
        
        // Scanner keyboard = new Scanner(System.in);


        // System.out.println("Enter an age");
        // int age = keyboard.nextInt();

        // System.out.println(age);
        // keyboard.nextLine();
        // System.out.println("Enter your name");
        // String name = keyboard.nextLine();
        // if(name.equalsIgnoreCase("GREG")){
        //     System.out.println("Hey man whats up");
        //     if(age >= 21){
        //         System.out.println("Welcome in grab a beer");
        //     }
        //     else{
        //         System.out.println("Scram Kid");
        //     }
        // }
        // else if (name.equalsIgnoreCase("Sam")){
        //     System.out.println("Ew you stink take a shower");
        //     if(age >= 21){
        //         System.out.println("Welcome in grab a beer");
        //     }
        //     else{
        //         System.out.println("Scram Kid");
        //     }
        // }
        // else if (name.isBlank()){
        //     System.out.println("ERROR NO NAME ENTERED");
        // }

        BankAccount bank = new BankAccount(60000);

        System.out.println(Ifstatements.checkageandbank(18, bank, "sam"));
        
    }
    
}
