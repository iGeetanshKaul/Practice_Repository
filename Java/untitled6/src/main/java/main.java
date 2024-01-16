import java.util.Scanner;

public class main {
    public static void main(Integer[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number:");
        int q=0;
        int rem=0;
        int rev=0;
        int sum=0;
        int n=input.nextInt();

        while(n!=0){
            rem=n%10;
            rev=(rev*10)+rem;

            for(int i=rev;i>=1;i--){
                sum=rev*i;
            }
            n/=10;

        }
        System.out.println(sum);

    }
}