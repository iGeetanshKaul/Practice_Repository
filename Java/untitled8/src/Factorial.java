import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
      //  System.out.println("Enter the number: ");
//        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(args[0]);
        int factorialProduct = getFactorial(n);
        System.out.println(factorialProduct);
    }

    private static int getFactorial(int n) {
        int product = 1;
        for (int i = n; i > 0; i--) {
            product *= i;
        }
        return product;
    }
}