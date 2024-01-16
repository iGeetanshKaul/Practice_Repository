package abs;

public class Daughter extends Parent{

    @Override
    void career(String name){
        System.out.println("My name is " + name);

    }

    @Override
    void partner(String name, int age){
        System.out.println("I am this years old" + age);
    }
}