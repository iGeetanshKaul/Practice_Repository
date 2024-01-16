package JavaPointQuestions.ArraysPrograms;

import java.util.Arrays;

public class selSort {
    public static void main(String[] args) {
        int[] arr = {4, -23, 95, -345, 8, 6, 4, 0, 234, 200};
      //  int[] arr = {3, 1, 5, 4, 2};
        selSor(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selSor(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - 1 - i;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, last, maxIndex);
        }
    }

    private static void swap(int[] arr, int last, int maxIndex) {
        int temp = arr[last];
        arr[last] = arr[maxIndex];
        arr[maxIndex] = temp;
    }

    private static int getMaxIndex(int[] arr, int i, int last) {
        int maxIndex = 0;
        for (int j = i; j <= last; j++) {
            if(arr[j] > arr[maxIndex])
                maxIndex = j;
        }
        return maxIndex;
    }


}