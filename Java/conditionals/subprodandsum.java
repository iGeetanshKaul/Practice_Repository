import java.util.Scanner;

public class subprodandsum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the first number: ");
        int i=input.nextInt();
        System.out.print("Enter the second number: ");
        int j=input.nextInt();

        int k=i*j;
        int l=i+j;
        int m=k-l;
        System.out.println(m);
    }
}
