package Week7;

public class harderLoops {


    // Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.
    public static String everyNth(String str, int n){
        // temp variable
        String result = "";
        // System.out.println(str.length());
        // init temp counter
        // see if conditional is t or f (boolean)
        //      if true run whats in the for loop
        //          increment counter variable
        // else if false exit
        for (int i = 0; i < str.length(); i = i + n) {
            // System.out.println(i + "    "+ str.charAt(i));
            result = result + str.charAt(i);
            // result += str.charAt(i);
        }

        return result;
    }

    // given a string create a new string that will move the first char to the end of the following 2 chars
    // EX.
    //oneTwo("abc") → "bca"
    //oneTwo("tca") → "cat"
    //oneTwo("tcagdo") → "catdog"

    public static String oneTwo(String str){
        String result = "";
        // abc
        // 012
        // length is 3
        // 3-2 = 1 
        System.out.println(str.length());
        // System.out.println(str.charAt(str.length()-1));
        System.out.println(str);
        for (int i = 0; i < str.length()-2; i+=3) {
            // System.out.println(i+"  "+str.charAt(i));
            // System.out.println( str.substring(i+1, i+3));
            // System.out.println(str.charAt(i));
            result = result + str.substring(i+1, i+3) + str.charAt(i);
        }
        return result;
    }

    //Create a Palindrome checker 
    //EX.
    //tacocat -> True
    //test -> False
    public static boolean isPalindrome(String str){

        //Pointers pointing to the beginning and the end of the string
        int i = 0;
        int j = str.length()-1;

        // while there are characters to compare
        while(i < j){
            // if there is a mismatch
            if (str.charAt(i) != str.charAt(j))
                return false;
            // Increment first pointer and decrement the other pointer
            i++;
            j--;
        }
        // tacocat
        // 0123456
        // length = 7
        // test
        // 0123
        // length = 4 
        return true;
    }




    public static void main(String[] args) {
        System.out.println(everyNth("Hello World", 2));
        System.out.println(oneTwo("tca"));
        System.out.println(isPalindrome("tacocat"));
        
    }
}
