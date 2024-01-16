package JavaPointQuestions.ArraysPrograms;

import java.util.Arrays;

public class JavaPoint13 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 3;
        rightRotate(arr,target);
        System.out.println(Arrays.toString(arr));
    }

    private static void rightRotate(int[] arr, int target) {
        for (int i = 0; i < target; i++) {
            int temp = arr[arr.length - 1];
            for (int j = arr.length - 1; j > 0 ; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = temp;
        }
    }
}