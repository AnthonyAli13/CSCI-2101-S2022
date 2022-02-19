package Week3;

public class Person {

    // This is a Person Class
    // It makes Person Objects
    // Lets make some variables specific to a Person
    public String name = "";
    public int age = 0;
    public String favColor = "";
    public double giftTotal = 0;
    // Lets make some Global Variables
    public static int count = 0;

    //[[name, age, favColor, giftTotal]count]
    
    // Method to make a person with just a name
    // 1 parameter String n
    public Person(String n){
        name = n;
        count++;
    }


    public Person(){
        name = "Rob";
        count++;
    }

    // have 2 parameters String n and int a
    public Person(String n, int a){
        name = n;
        age = a;
        count++;
    }

    // Scope Type Name
    // Getter and setter for name
    public String Getname(){
        return name;
    }

    public void Setname(String n){
        name = n;
    }
    // Getter and setter for age

    public int Getage(){
        return age;
    }

    public void Setage(int a){
        age = a;
    }

    public static String WelcomeMessage(){
        return "Welcome in Grab a Drink!";
    }

    public String WelcomeMessagePersonal(){
        return "Welcome in " + name + " Grab a Drink! ";
    }
    // this does not work however since static can not use variables
    // public static String test(){
    //     return "Welcome in " + name + " Grab a Drink! ";
    // }

    // methods for getting current count this works because of static
    public static int getCount(){
        return count;
    }

    // This would return 1 not the total count of the party
    // public int getCount(){
    //     return count;
    // }



}
