package arraysPackage;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
//        ArrayList<Integer> arr = new ArrayList<>();
//        System.out.println("Enter the array values: ");
//        while(input.hasNextInt()){
//            int i = 0;
//            arr.add(i,input.nextInt());
//            i++;
//        }

//        System.out.println(arr);
//        System.out.println(Arrays.toString(arr));
//        String[] a = {null,"Geetansh"};
//        System.out.println(Arrays.toString(a));
//        String b = "null";
//        System.out.println(b);
        System.out.println("Enter the values for the arrays: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));

    }
}