package JavaPointQuestions.ArraysPrograms;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {};

        bubbSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbSort(int[] arr) {
        boolean swap;
        for (int j = 0; j < arr.length; j++) {
            swap = false;
            for (int i = 1; i < arr.length - j; i++) {

                if(arr[i] < arr[i - 1]){
                    int temp = arr[i-1];
                    arr[i-1] = arr[i];
                    arr[i] = temp;
                    swap = true;
                }

            }
            if(!swap)
                break;
        }

    }
}