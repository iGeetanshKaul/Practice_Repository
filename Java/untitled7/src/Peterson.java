import java.util.Scanner;

public class Peterson {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number:");

        int rem=0;
        int rev=0;
        int sum=0;
        int n=input.nextInt();

        while(n!=0){
            rem=n%10;
            System.out.println(rem);

        }

        System.out.println(sum);

    }
}