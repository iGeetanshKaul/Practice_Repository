package first;

import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][4];

        for(int row=0;row<arr[row].length;row++){
            for(int col=0;col<arr[row].length;col++){
                arr[row][col] = input.nextInt();
            }
        }

        for(int row=0;row<arr[row].length;row++){
            for(int col=0;col<arr[row].length;col++){
                System.out.print(arr[row][col]);
                System.out.println();
            }
        }
    }
}