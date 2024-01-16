package second;

public class second {
    public static void main(String[] args) {
        first ob1 = new first(2);
        first ob2 = ob1.incrByTen();
        System.out.println(ob1.a);
        System.out.println(ob2.a);
    }
}