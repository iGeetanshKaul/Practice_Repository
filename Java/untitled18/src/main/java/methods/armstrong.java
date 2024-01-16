package methods;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the lowerbound: ");
        //int lowerBound = input.next();
        System.out.println("Enter the upperbound: ");

        int upperBound = input.nextInt();
       // armstrongNumbers(lowerBound,upperBound);
    }

    private static void armstrongNumbers(int lowerBound, int upperBound) {
        while(lowerBound <= upperBound) {
            int cube = 0;
            while (lowerBound != 0) {
                int rem = lowerBound % 10;
                cube = rem * rem * rem;
                rem /= 10;
            }
            if (cube == lowerBound)
                System.out.println(cube);
            lowerBound++;
        }

    }
}