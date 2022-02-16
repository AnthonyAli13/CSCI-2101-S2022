package Week2;
// define class name (This is an object)
public class Friend {
    String myFriend = "djkhfhsdjkfh";
    int myFriendage = 0;
    String myFriendcolor = "";
    // make a method called myFriendname
    public static String myFriendName(){
        // return friend name
        return "My name is Bob";
    }
    // Setter to set the Friend Name
    public void setFriendName(String s) {
        myFriend = s;
    }
    public String getFriendName(){
        return myFriend;
    }
    // Method example with two parameters
    public void setFriendColorAndAge(String color, int age){
        myFriendcolor = color;
        myFriendage = age;
    }

    public boolean match(String name){
        boolean x = name.matches("Greg");
        return x;
    }
    // method sees if 2 parameters match eachother
    public boolean match(String name, String othername){
        boolean answer = name.matches(othername);
        return answer;
    }

    // parameters can be called literally whatever you want
    public String subs(String cat){
        // String index starts counting at 0
        // HELLO
        // 01234
        // MOUSE
        // 01234
        int x = 2;
        String ending = cat.substring(0, x+1);
        return ending;
    }

    public String getFriendColor(){
        return myFriendcolor;
    }

    public int getFriendAge(){
        return myFriendage;
    }
}
