package abs;

public class Son extends Parent{
    @Override
    void career(String name) {
        System.out.println(name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println(name+ " "+ age);
    }
}