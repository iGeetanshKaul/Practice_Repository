package fifthPackage;

public class PrettyPrinting {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        float a = 1345.3466f;
        String name = "Geetansh";
        String b = new String("Geetansh");
        String c = "Kunal";
        System.out.println(b == name);
        System.out.printf("The number is: %.2f", a);
        System.out.println();
        System.out.printf("Pie: %.4f",Math.PI);
        System.out.println();
        System.out.printf("The strings are: %s and %s", b, c);
    }
}