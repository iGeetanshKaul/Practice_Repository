package JavaPointQuestions.ArraysPrograms;

import javax.crypto.spec.PSource;
import java.util.Arrays;

public class JavaPoint15 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 6, -555, 10, -123, 0, 7, 8, 9, 10};
     //   bubDescSort(arr);
          selDesSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void selDesSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - 1- i;
            int minIndex = getMinIndex(arr,0,last);
            swap(arr,last,minIndex);
        }
    }

    private static int getMinIndex(int[] arr, int i, int last) {
        int minIndex = 0;
        for (int j = i; j <= last; j++) {
            if(arr[j] > arr[minIndex])
                minIndex = j;
        }
        return minIndex;
    }

    private static void bubDescSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j] > arr[j - 1])
                    swap(arr,j,j - 1);
            }
        }
    }

    private static void swap(int[] arr, int j, int i) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}