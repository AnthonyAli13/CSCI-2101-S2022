package Week7;

import java.util.Scanner;

public class moreLoops {
    // while loop = executes a block of code as long as the condition remains true


    // count the number of times xx is in a given string
    // countXX("Hapxxpy Birtxxhday") -> 2
    public static int countXX(String str){
        int count = 0; 
        //HapxxpyBxx
        //0123456789
        for (int i = 0; i < str.length()-1; i++) {
            // System.out.println(str.charAt(i) +" "+ str.charAt(i+2));
            if(str.substring(i, i+2).equalsIgnoreCase("xx")){
                
                count ++;
            }
            // i = 0
            // 0-2 -> Hp
        }
        return count;
    }
        
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println(countXX("HapxxxpyBxx"));
        
        // String name = "";
        // while(name.isBlank()){
        //     System.out.println("Enter your name: ");
        //     name = keyboard.nextLine();
        // }
        
        // System.out.println("Hello "+ name);
        // matrix with if else 
        System.out.println("What will your choice be Red or Blue?");
        String pill = "";
        pill = keyboard.nextLine();
        if(!pill.equalsIgnoreCase("Red")){
            System.out.println("Have a nice life");
        } else{
            System.out.println("Welcome to the Matrix!");
        }
        // while look 
        // we like booleans 
        String pill2 = "";
        // pill = keyboard.nextLine();
        while(!pill2.equalsIgnoreCase("red")){
            System.out.println("What will your choice be.. Red or Blue?");
            pill2= keyboard.nextLine();
        }
        System.out.println("Welcome to the matrix!");


        // while(true){
        //     System.out.println();
        // }





    }
}
