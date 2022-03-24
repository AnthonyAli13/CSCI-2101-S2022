package Week6;

import java.util.Scanner;

public class For {

    public static void main(String[] args) {
        // for loop executes block of code a LIMITED amount of times
        // simple case
        // init variable, condition, iteration (optional)
        // Humans count at 1 
        // Computers count at 0
        int students = 22;
        int children = 0;
        for(int i = 0; i < 1; i++){
            System.out.println(i +" | Greg");
        }
        for (int index = students; index > 0; index-=5) {
            // System.out.println("#"+students);
            System.out.println("Hello " + index + " Welcome to Class");
            children += 2;
            System.out.println("Children = " + children);
        }

        Scanner keyboard = new Scanner(System.in);
        int rows;
        int columns;
        String symbol = "";

        System.out.println("Enter # of rows:");
        rows = keyboard.nextInt();
        System.out.println("Enter # of columns:");
        columns = keyboard.nextInt();
        System.out.println("Enter symbol to use:");
        symbol = keyboard.next();

        System.out.println(rows+" "+columns+" "+symbol);
        
        // nested for loop
        // Loop within a loop
        // rows = 3
        // columns = 3
        for (int i = 0; i < rows; i++){
            // incharge of rows..
            System.out.println();
            //moves us down to the next line
            for (int j = 1; j <= columns; j++){
                // incharge of columns until it reaches the end
                // then moves back to the outer loop
                System.out.print(symbol);
            }
        }
        System.out.println();
        System.out.println("Finish");


        String str = "Hel!lo wor!ld @#$$@ Hello World! Hel!lo World";

        System.out.println(str.length());
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == '!'){
                System.out.println(i + "    "+ ch+ "<--- FOUND AT POSITION: "+ i);
                break;
            }else{
                System.out.println(i + "    "+ch);
            }
        }
        System.out.println("Hello");

    }
}
