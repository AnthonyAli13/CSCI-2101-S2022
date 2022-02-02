package Week1;


public class HelloWorld{
    //TYPE STRING
    //VAR name 
    // =
    // "VAR NAME"
    // Object of the String class

    // create 2 static variables for name and color

    static String name = "Greg";
    static String color = "Black";

    // This is our main method
    public static void main(String[] args) {
        // System.out.println("Hello World");
        String cat = "momo";
        // System.out belongs to PrintStream class
        // System.out.print("Hi");
        // System.out.print("World");

        //String concatenation

        System.out.print("Hello, ");
        System.out.print("My name is ");
        System.out.print(name);

        System.out.println();

        System.out.println("Hi Friend, " + "My name is " + name);

        name = "Sam";

        String email = "";
        String password = "";

        System.out.println("My name is " + name);



        
        int i = 10;


    }
}