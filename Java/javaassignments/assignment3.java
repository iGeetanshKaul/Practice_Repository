import java.util.Scanner;

public class assignment3 {
    public static void main(String[] args) {
        int in=0;
        int count=0;
        System.out.println("Enter: ");
        Scanner input = new Scanner(System.in);
        while(input.hasNextInt()){
            in=input.nextInt();
            count+=in;
        }
        System.out.println(count);



        }
    }


