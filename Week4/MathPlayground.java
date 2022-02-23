package Week4;

public class MathPlayground {

    static double balance = 10.1;
    // Casting 
    // declare int value = (TypeName) NameOfVariable
    static int intbal = (int) balance;


    public static void main(String[] args) {
        System.out.println(balance);
        System.out.println(intbal);
        System.out.println(Math.round(balance));
        System.out.println(Math.floor(balance));
        System.out.println(Math.ceil(balance));
        System.out.println(Math.toRadians(34));
    }
}
