package BSearchPackage.anotherpackage;

import java.util.Arrays;
import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int[][] arr = new int[4][4];
        while(input.hasNextInt()){
            arr = takeAndStoreInput2d(input);
        }
        for(int[]arr ){
            System.out.println(Arrays.toString);
        }

    }

    private static int[][] takeAndStoreInput2d(Scanner input) {
        int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        return arr;
    }
}