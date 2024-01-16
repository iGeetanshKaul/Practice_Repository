package JavaPointQuestions.ArraysPrograms;

import java.util.Arrays;

public class move {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int shift = 2;
        shift(arr,shift);
        System.out.println(Arrays.toString(arr));

    }

    private static void shift(int[] arr, int shift) {
        for (int i = 0; i < shift; i++) {
            int temp = arr[arr.length - 1];
            for (int j = arr.length - 1; j > 0; j--) {

                arr[j] = arr[j - 1];

            }
            arr[0] = temp;

        }
    }
}