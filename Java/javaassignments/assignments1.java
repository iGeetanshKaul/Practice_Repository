import java.util.Scanner;

public class assignments1 {
    public static void main(String[] args) {
        System.out.print(" enter a year: ");
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();

        if((year%4==0)&&(year%100!=0)||(year%400==0)){
            System.out.println("leap year");
        }
        else {
            System.out.println("not a leap year");
        }
    }
}
