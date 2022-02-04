package Week1;

public class Examples {
    
    public static void main(String[] args) {
        // Print our name
        System.out.println("Greg Walsh");
        // Print our favorite color
        System.out.println("Black");
        // Print our favorite animal
        System.out.print("Dog");
        // literally print a space
        System.out.print(" ");
        // print a new line
        // \n
        // System.out.println("whatever in here" + "\n");
        System.out.print("hii \n");

        // Print our favorite food
        System.out.println("Cosmic Brownies");

        // Java can do more than work with words (or Strings!)
        // We can do numbers too :)
        System.out.println(2);
        // Seed for later (This 2 is a String)
        System.out.println("2");
        // Back to some math
        System.out.println(2+3); // addition
        System.out.println(2-3); // subtraction
        System.out.println(2*3); // multiplication
        System.out.println(2/3); // division - round down 
        System.out.println(3%2); // modulus - remainder of division


        System.out.println(2.342); // double
        System.out.println(false); // boolean
        System.out.println("no"); 
        System.out.println('a');

        // Java has lots of different Types
        // "Hello" - String
        // In memory it looks like this
        // 'H' 'e' 'l' 'l' 'o'
        // 'a' - char
        // 2 - int
        // 2.342 - double 
        // false or true - boolean
        // 109238912849012890389123 - long
        // 3.14f; - float

        // String concatenation
        
        System.out.println("Greg " + "Walsh");
        
        System.out.println("Black "+2);

        // variable's in java 

        // SCOPE TYPE NAME 
        // Public is assumed if you do not define the Scope

      //Type   name = "Whatever you want to call it"
        // This step creates the folders in the cabinet 
        String nameFirst = "Greg";
        String nameLast  = "Walsh";
        // To pull out the folder (var)
        System.out.println(nameFirst + nameLast);
        // The proper place to use spaces is in the String concatenation
        System.out.println(nameFirst + " " + nameLast);
        System.out.println(nameLast + " " + nameFirst);
        
        // Variables can change dynamically
        String favFood = "Cosmic Brownies";
        int age = 25;
        int year = 1;
        // System.out.println(age);
        // System.out.println("Year goes by");
        // age = 26;
        // age = 25+1;
        // This does not work because age does not change 
        // String printout = "My age is " + age + " and my favorite food is " + favFood;
        System.out.println("My age is " + age + " and my favorite food is " + favFood);
        System.out.println(year + " years Have gone by....");
        // Tell the program we want to age 
        // age = age + 1;
        // age = age + year;
        age += year;
        System.out.println("My age is " + age + " and my favorite food is " + favFood);

        year = 5;
        // This line is typed twice and we would want to make it a variable to save memory and time
        System.out.println(year + " years Have gone by....");
        favFood = "Salad";
        age += year;
        System.out.println("My age is " + age + " and my favorite food is " + favFood);
        

        // System.out.println(age);

    }
}
