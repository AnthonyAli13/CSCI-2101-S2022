package Week9;

import java.util.ArrayList;

public class TwoDArray {
    public static void main(String[] args) {
        // Arrays can have 2 dimensions
        int BRANDS = 7;
        int TYPES = 3;

        // Row x Columns
        // All values are init with 0 if int array 
        // All valuse are init with null if String array
        // create an 2d array with pre defined values 
        int[][] test = new int[BRANDS][TYPES]; 

        String[] brands = {
            "Abercrombie",
            "Hollister",
            "American Eagle",
            "Polo Ralph Lauren",
            "H&M",
            "Nikes",
            "Adidas"
        };

        // we can also create an array using row column format
        // shirts pants jackets


        int[][] counts = 
        {
            { 3, 2, 1 },
            { 3, 1, 0 },
            { 2, 3, 1 }, 
            { 1, 4, 0 }, 
            { 1, 1, 1 }, 
            { 3, 1, 1 },
            { 1, 1, 3 }
        };

        // to access all elements in the 2D array you use nested loops:

        for (int i = 0; i < BRANDS; i++) {
            // process the ith row
            for (int j = 0; j < TYPES; j++) {
                // process the jth column in the ith row
                System.out.printf("%8d", counts[i][j]);
            }
            System.out.println(); // Start new line for next row 
            
        }

        System.out.println("------------------------------------------");


        // lets try to print the tests array

        for (int i = 0; i < test.length; i++) {
            // process the ith row
            for (int j = 0; j < test[0].length; j++){
                // process the jth column in the ith row
            System.out.printf("%8d", test[i][j]);
            } 
            System.out.println(); // new line after end of row
            
        }
        // *****************************************
        // counts.length is the number of rows.
        // counts[0].length is the number of columns.

        // Lets see an example of a pretty graphical output 

        System.out.println("               Brand         Shirt    Pant    Jacket     Total");

        // Print each row element and update the row total
        for (int i = 0; i < BRANDS; i++) {

            // process the ith row
            System.out.printf("%20s", brands[i] );


            int total = 0;
            
            // Print each row element and update the row total
            for (int j = 0; j < TYPES; j++) {

                System.out.printf("%10d", counts[i][j]);
                total = total + counts[i][j];
            }

            System.out.printf("%8d\n", total);
            // System.out.println();
        }

        // Array lists can have 2 dimensions as well but they are harder to create.
        
        ArrayList<String>[][] table = new ArrayList[10][10];
        table[0][0] =  new ArrayList<>();


    }
}
