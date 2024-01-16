import java.util.Scanner;

public class firstjavacode2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a=0,b=0;
        System.out.print("Enter a number: ");
        a=input.nextInt();
        System.out.print("Enter another number: ");
        b=input.nextInt();

        while(a>b){
            System.out.println(a+ " is greater than" +b);
            return;
        }
        System.out.println(b + "is greaater than " +a);
    }
}
