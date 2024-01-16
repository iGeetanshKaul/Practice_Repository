public class newclass {
    public static void main(String[] args) {
        String a ="11";
        String b = "1";

        System.out.println(solutin(a,b));
    }

    private static String solutin(String A, String B) {
        int a = Integer.parseInt(A,2);
        int b = Integer.parseInt(B,2);

        int c = a + b;

        String str = Integer.toBinaryString(c);



        return str;
    }

}