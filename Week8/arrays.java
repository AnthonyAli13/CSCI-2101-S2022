package Week8;

import java.util.Scanner;

public class arrays {

    // Arrays are used to store multiple values in a single variable
    public static void main(String[] args) {
        
        // declare an array of integers
        // type[] name 
        int[] anArray;

        // allocate memory for 10 integers
        anArray = new int[10];


        
        //[0,0,0,0,0,0,0,0,0,0] -> NULL?
        anArray[0]= 100;
        anArray[1]= 200;
        anArray[2]= 300;
        anArray[3]= 400;
        anArray[4]= 500;
        anArray[5]= 600;
        anArray[6]= 700;
        anArray[7]= 800;
        anArray[8]= 900;
        anArray[9]= 1000;
        //anArray[10]= 1100;

        System.out.println("Element at index 0: "
        + anArray[0]);
        System.out.println("Element at index 1: "
                + anArray[1]);
        System.out.println("Element at index 2: "
                + anArray[2]);
        System.out.println("Element at index 3: "
                + anArray[3]);
        System.out.println("Element at index 4: "
                + anArray[4]);
        System.out.println("Element at index 5: "
                + anArray[5]);
        System.out.println("Element at index 6: "
                + anArray[6]);
        System.out.println("Element at index 7: "
                + anArray[7]);
        System.out.println("Element at index 8: "
                + anArray[8]);
        System.out.println("Element at index 9: "
                + anArray[9]);

        // another way to create arrays if we know the data before hand 

        int[] shortArray = {1000,2000,3000,4000,5000};
        System.out.println();

        // for loop in java with array
        for (int i = 0; i < shortArray.length; i++) {
            System.out.println(shortArray[i]);
            
        }

        // System.out.println("Element at index 1: "
        // + shortArray[1]);

        // for each loop
        for (int i : shortArray) {
            System.out.println("for each: " + i);
        }

        System.out.println();

        String[] name = {"Appa","Momo","Jack"};
        // for loop the way we have been using
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
            
        }

        System.out.println();
        // for each loop
        for (String string : name) {
            System.out.println(string);
        }


        // what if we dont know the information yet?
        String[] namesunknown = new String[20];
        // Arrays are object!
        namesunknown[0] = "Greg";
        namesunknown[1] = "Rommel";
        namesunknown[2] = "Fred";
        namesunknown[3] = "Jordyn";

        System.out.println();
        System.out.println(namesunknown[2]);

        Scanner keyboard = new Scanner(System.in);

        // example showing scanner to save to an array
        System.out.println();
        System.out.println("Enter a name");
        String str = keyboard.nextLine();
        System.out.println();
        namesunknown[4] = str; 
        System.out.println(namesunknown[5]);
        for (String string : namesunknown) {
            System.out.println(string);
        }


        
        // create array of string str length
        // collect string from user -> turn it into an array
        System.out.println("Enter a Word");
        String word = keyboard.nextLine();

        char[] ch = new char[word.length()];

        // copy char by char into the array
        for (int i = 0; i < ch.length; i++) {
            ch[i] = word.charAt(i);
        }

        System.out.println("Your word was turned into a char array");
        System.out.println(ch);


        for (char c : ch) {
            System.out.println("Char: " + c);
        }

        System.out.println(ch[2]);

    }
    
}
