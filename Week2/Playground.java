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
        String replace = dogName.replace('r', 'n');
        System.out.println(replace);


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
        // String friendName = Friend.myFriendName();

        // System.out.println(friendName);

        System.out.println(Friend.myFriendName());
        //object instantiation
        Friend myFriend = new Friend();

        System.out.println(myFriend.getFriendName());
        myFriend.setFriendName("jake");
        System.out.println(myFriend.getFriendName());

        Friend secondFriend = new Friend();

        secondFriend.setFriendName("Sam");

        System.out.println(secondFriend.getFriendName());

        myFriend.setFriendColorAndAge("black", 20);

        System.out.println("My Friends name is " + myFriend.getFriendName() + ". His favorite color is " + 
            myFriend.getFriendColor() + ". His age is " + myFriend.getFriendAge() + "." );

        System.out.println(myFriend.match(myFriend.getFriendName()));
        myFriend.setFriendName("Greg");
        System.out.println(myFriend.match(myFriend.getFriendName()));

        System.out.println(myFriend.subs("mouse"));
        
        // System.out.println(myFriend.match(myFriend.getFriendName(), secondFriend.getFriendName()));
        // myFriend.setFriendName("Sam");
        // System.out.println(myFriend.match(myFriend.getFriendName(), secondFriend.getFriendName()));
        // 



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

