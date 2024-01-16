package one;

import java.util.Arrays;

import static java.util.Collections.max;
import static java.util.Collections.swap;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {0};
         selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - 1 - i;
            int maxIndex = maxInd(0,last,arr);
            swap(maxIndex,last,arr);
        }

    }

    private static void swap(int maxIndex, int last, int[] arr) {
        int temp = last;
        arr[last] = arr[maxIndex];
        arr[maxIndex] = temp;
    }

    private static int maxInd(int start, int last, int[] arr) {
        int max = start;
        for (int i = start; i <= last; i++) {
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
}