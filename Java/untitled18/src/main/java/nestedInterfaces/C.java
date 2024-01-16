package nestedInterfaces;

public class C {
    public static void main(String[] args) {
        A.NestedInterface one = new B();

        if(one.isNegative(9)){
            System.out.println("positive");
        }else if(one.isNegative(-2)){
            System.out.println("Negative");
        }

    }
}