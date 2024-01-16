package JavaPointQuestions.ArraysPrograms;


import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
            int[] arr = {10, 5, 3, 87, 2, 1, 4,3, 87, 5 -555,-2764,-123, 0, 7, 8, 9,9, 10};
        insSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0 ; j--) {
                if(arr[j] < arr[j - 1]){
                    swap(arr, j, j - 1);
                }else break;
            }
        }
    }

    private static void swap(int[] arr, int j, int i) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}