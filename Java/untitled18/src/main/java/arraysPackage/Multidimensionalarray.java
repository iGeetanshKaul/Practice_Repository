package arraysPackage;


import java.util.Arrays;
import java.util.Scanner;

public class Multidimensionalarray {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers: ");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = input.nextInt();
            }
        }


        for (int[] i: arr) {
            System.out.println(Arrays.toString(i));
        }
    }
}