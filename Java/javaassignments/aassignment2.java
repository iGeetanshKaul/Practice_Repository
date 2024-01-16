import java.util.Scanner;

public class aassignment2 {
    public static void main(String[] args) {
        int i,j;
        System.out.println("Enter a number: ");
        Scanner in = new Scanner(System.in);
        int num= in.nextInt();
        for(i=1;i<11;i++){
            System.out.println(num+"*"+i+"="+num*i);
        }
    }
}
