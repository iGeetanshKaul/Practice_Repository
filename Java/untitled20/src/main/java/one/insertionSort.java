package one;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
       // int[] arr = { 1, -9,  54, 45, 54, -9, 1, 4, 5, 8, 10};
        int[] arr = {0};

        insSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insSort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++){
            for (int j = i + 1; j > 0 ; j--) {
                if(arr[j] < arr[j - 1]){
                    swap(j,j - 1,arr);
                }else break;
            }
        }
    }

    private static void swap(int i, int i1, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }
}