package one;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
      //   int[] arr = {1, 2, -9, 7, -9, 7, 1, 75, -100, 34};
        int[] arr = {5, 7, 3, 2, 1 ,6 ,4};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicSort(int[] arr) {
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(i,correct,arr);
            }
            i++;
        }
    }

    private static void swap(int i, int i1, int[] arr) {
        int temp = arr[i1];
        arr[i1] = arr[i];
        arr[i] = temp;
    }
}