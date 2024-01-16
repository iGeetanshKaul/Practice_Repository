import java.util.Scanner;

public class firstjavacode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a;
        System.out.println("Enter a number: ");
        a=input.nextInt();
        while(a%2==0){
            System.out.println("even");
            return;
        }
        System.out.println("odd");
    }
}
