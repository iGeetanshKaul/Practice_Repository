public class Swap {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
        Integer a = 10;
        Integer b = 20;

        swap(a,b);
        System.out.println(a + " " + b);
    }

    private static void swap(Integer a, Integer b) {
        int temp = b;
        b = a;
        a = temp;
       // System.out.println(a + " " + b);
       
    }
}
