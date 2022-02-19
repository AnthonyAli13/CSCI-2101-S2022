package Week3;

public class Main {
    // This is our Main method it runs anything you place inside of it
    public static void main(String[] args) {
        System.out.println("Hello World");

        //  Init the Person Object
        // CLASSNAME NAMEOFOBJECT = new CLASSNAME
        Person person1 = new Person();

        System.out.println(person1.Getname());

        Person person2 = new Person("Greg");
        System.out.println(person2.Getname());

        // 2 objects were created. 2 "Person"
        // Person1 has no name in parameter so they are assigned the default name Rob
        // Person2 has a name in the parameter so they are assigned the name of the parameter

        person1.Setname("Sam");
        System.out.println(person1.Getname());

        Person person3 =  new Person("Steve", 25);

        System.out.println(person3.Getname() + " is " + person3.Getage());

        String welcome = Person.WelcomeMessage();

        System.out.println(welcome);

        System.out.println(person3.WelcomeMessagePersonal());

        System.out.println(Person.getCount());


        Person person4 =  new Person("Bob", 35);

        System.out.println(Person.getCount());



    }
    
}
