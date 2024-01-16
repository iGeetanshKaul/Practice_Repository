import java.util.Scanner;

public class intentionalcount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i=0;
        int count=0;
        System.out.print("Enter the number");
        i=input.nextInt();

        while(i>0){
            int rem=i%10;

            if(rem==5){
                count++;
            }
            i=i/10;
        }
        System.out.println(count);
    }
}
