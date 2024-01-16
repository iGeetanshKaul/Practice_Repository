package fifthPackage;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
       // int[] arr = {1, 2, 3, 4, 5};
        int[] arr = {5, 5, 4, 3, 2, 1};
        int[] newArr = bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("=======================");
     //   int[] secondArr = selectionSort(arr);
    }



    private static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j -1];
                    arr[j - 1] = temp;
                }
            }
        }
        return arr;
    }
}