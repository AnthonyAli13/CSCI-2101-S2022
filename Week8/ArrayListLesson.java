package Week8;

import java.util.ArrayList;
import java.util.Collections;
// i want to add bank account from week4 so i have to import it
import Week4.BankAccount;
import java.util.Random;


public class ArrayListLesson {
    public static void main(String[] args) {
        // int      // Integer
        // double   // Double
        // String   // String
        // char     // Char
        // init an Array List with STRING
        ArrayList<String> cars = new ArrayList<String>();
        // Constructs an empty list with an initial capacity of ten.
        // how do we add values to an Array List
        System.out.println(cars.size());
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Honda");
        System.out.println(cars.size());
        // print array list
        System.out.println(cars);
        // for each loop with array list
        for (String string : cars) {
            System.out.println(string);
        }
        Collections.sort(cars);
        System.err.println("sorted: " + cars);

        // to remove from an array list
        System.out.println(cars.size());
        cars.remove(0);
        System.out.println(cars.size());
        for (String string : cars) {
            System.out.println(string);
        }

        // Integer array list
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();

        myNumbers.add(10);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(25);

        System.out.println(myNumbers);

        int test = 5;

        myNumbers.add(test);
        System.out.println(myNumbers);

        Collections.sort(myNumbers);
        System.out.println("sorted:" + myNumbers);

        // to add values in the array list
        int addValue = 0;
        for (Integer i : myNumbers) {
            // System.out.println(addValue);
            addValue += i;
            // same thing as
            // addValue = addValue + i; 
        }
        System.out.println(addValue);
        // Array List with Character
        ArrayList<Character> names = new ArrayList<Character>();
        // Array List with Double 
        ArrayList<Double> dollas = new ArrayList<Double>();
        // Array list can take in ANY object!!
        // Even Bank Account objects
        ArrayList<BankAccount> banks = new ArrayList<BankAccount>();

        BankAccount userBank = new BankAccount("useBank", 1500);
        BankAccount gregchecking = new BankAccount("gregs", 2000);
        BankAccount bobchecking = new BankAccount("bobs",3000);

        banks.add(userBank);
        banks.add(gregchecking);
        banks.add(bobchecking);
        System.out.println("==================================");
        System.out.println(banks.size());
        // if we try to print bank account objects it will print the memory reference
        // System.out.println(gregchecking.getBalance());
        
        System.out.println(banks);

        for (BankAccount bankAccount : banks) {
            bankAccount.monthlyfee();
            System.out.println(bankAccount.getname() +"     $" +  bankAccount.getBalance() );
        }


        Random generator = new Random();
        int rand = generator.nextInt(6);

        System.out.println(rand);
        //https://www.geeksforgeeks.org/arraylist-in-java/
        //https://www.geeksforgeeks.org/wrapper-classes-java/




    }
}
