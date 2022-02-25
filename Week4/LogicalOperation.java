package Week4;

import java.util.Scanner;

public class LogicalOperation {
    public static void main(String[] args) {
       System.out.println("Logic"); 
       // if statements
       // if
       // else
       // else if

       Scanner keyboard = new Scanner(System.in);

       System.out.println("Whats the weather");
       double temp = keyboard.nextDouble();
       System.out.println(temp);
       //< =  > = >=
       //<
       //>
       //<=
       //>=
       //if
       //else if
       //else
       //&& = AND - BOTH conditions are true
       //|| = OR - Either condition are true
       //! = NOT - Reverse Boolean Value
       // == (= =) Equal to 
       // != (! =) Not equal to
       // less than 60 degrees we want to wear a jacket
       // 75
       // true
       System.out.println("Is it raining?");
       boolean rain = keyboard.nextBoolean();
       if(temp > 60 && rain == false){
           System.out.println("No you do not need a jacket");
       }else if(temp <= 60 || rain == true){
           System.out.println("Yes you need a jacket");
       }else{
           System.out.println("Error");
       }


    }

}
