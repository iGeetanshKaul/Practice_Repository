package JavaPointQuestions.ArraysPrograms;


import java.util.Arrays;

public class JavaPoint3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 3;
        fun(arr,target);
        System.out.println(Arrays.toString(arr));
    }

    private static void fun(int[] arr, int target) {
        int leftShift = arr.length - target;
        for (int i = arr.length - 1; i > leftShift; i--) {
            int temp = arr[0];
            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j+1];
            }
            arr[arr.length - 1] = temp;
        }
    }
}