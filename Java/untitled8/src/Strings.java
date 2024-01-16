import java.util.Arrays;
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        int[] str = new int[10];

        for(int i=0;i<str.length;i++){
            str[i]=input.nextInt();
        }
        System.out.println(Arrays.toString(str));
    }
}