package second;

public class second {
    public static void main(String[] args) {
        first one = new first("Geetansh", 10, 100);
        first two = new first(one);
        one.changeName("kunal");
        System.out.println(one.name);
        System.out.println(two.name);

        first A;

        for (int i = 0; i < 10000000000; i++) {
            A = new first("Random name", 50, 400);

        }
    }
}