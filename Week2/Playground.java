package Week2;

public class Playground {
    public static void main(String[] args) {
        String name = "Greg";
        // System.out.println(name); //prinln() is a method
        addExclamationPoint("Greg");
        addExclamationPoint("Candy");
        //Encapsulation
        System.out.println(newExclamationPoint("cats"));
        String answer = addQuestion("Would You Like Water");
        System.out.println(answer);
        printer(answer);

        // String class Method Examples
        String dogName = "Murray";
        dogName.toUpperCase();
        System.out.println(dogName.toUpperCase());
        printer(dogName.toUpperCase());
        String dogNameUpper = dogName.toUpperCase();
        String dogNameUpperQuestion = addQuestion(dogNameUpper);
        String dogNameUpperQuestionExclamation = newExclamationPoint(dogNameUpperQuestion);
        
        printer(dogName.toLowerCase());
        // length of string is 6
        System.out.println(dogName.length());
        // indici of string is 5
        // murray
        // 012345
        // System.out.println(dogName.charAt(5));
        System.out.println(dogName.charAt(dogName.length()-1));



        // printer(dogNameUpperQuestionExclamation);
        }
    //Create our own method to add Exclamation Point
    public static void addExclamationPoint(String s) {
        System.out.println(s + "!");
    }

    public static String newExclamationPoint(String s) {
        return s + '!';
    }

    public static String addQuestion(String s) {
        return s + '?'; 
    }

    public static void printer(String s) {
        System.out.println(s);
    }

}

