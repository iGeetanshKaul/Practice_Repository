import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=input.nextInt();

        for (int i = 1; i <= num; i++) {
            int count=num%i;
            if(count==0){
                System.out.print(i+" ");
            }

        }
    }
}
