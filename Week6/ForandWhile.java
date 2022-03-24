package Week6;

import java.util.Scanner;

public class ForandWhile {
    public static void main(String[] args) {
        double total = 0;
        int count = 0;

        Scanner in = new Scanner(System.in);

        // for (int i = 0; i < 0; i++) {
        //     int userout = i + 1;
        //     System.out.println("Please enter number "+ userout +":");
        //     double input = in.nextDouble();
        //     total = total + input;
        //     count ++;
        // }
        // double average = 0;
        // if (count > 0){
        //     average = total / count;
        //     System.out.println("The average is: "+average);
        // }
        

        // // What this looks like with a while loop
        // System.out.println("Please enter a number to begin");
        // while(in.hasNextDouble()){
        //     int userout = count + 1;
        //     System.out.println("Please enter number "+ userout +":");
        //     double input = in.nextDouble();
        //     total = total + input;
        //     count ++;
        // }
        // if (count > 0){
        //     average = total / count;
        //     System.out.println("The average is: "+average);
        // }
        // int temp = 0;
        // double test1 = 0;
        // Scanner in2 = new Scanner(System.in);
        // while(temp < 5){
        //     double test = in2.nextDouble();
        //     test1 = test1 + test;
        //     temp++;
        // }

        // Duplicate Values

        Scanner in3 = new Scanner(System.in);
        double calcinput = in3.nextDouble();
        while(in3.hasNextDouble()){
            double previous = calcinput;
            calcinput = in3.nextDouble();
            if(calcinput == previous){
                System.out.println("Duplicate input");
            }
        }
    }
}
