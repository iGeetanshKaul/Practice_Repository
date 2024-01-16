import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int i=0,reverse=0;
        //int rem;
        System.out.println("Enter the number: ");
        i=input.nextInt();

        while(i>0){
            int rem=i%10;
            reverse=reverse*10+rem;
            i/=10;
        }
        System.out.println(reverse);
    }
}
