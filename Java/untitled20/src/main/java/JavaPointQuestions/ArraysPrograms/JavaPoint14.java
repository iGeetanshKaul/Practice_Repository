package JavaPointQuestions.ArraysPrograms;

import javax.crypto.spec.PSource;
import java.util.Arrays;



public class JavaPoint14 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 6, 10,-555, -123, 0, 7, 8, 9, 10};
     //   bubSort(arr);
          selSor(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selSor(int[] arr) {
       for(int i = 0; i < arr.length; i++){
          int last = arr.length - 1 - i;
          int maxIndex = getMaxIndex(arr, 0, last);
          swap(arr,last,maxIndex);
       }
    }

    private static int getMaxIndex(int[] arr, int i, int last) {
        int maxIndex = 0;
        for (int j = i; j <= last; j++) {
            if(arr[maxIndex] < arr[j])
                maxIndex = j;
        }
        return maxIndex;
    }

    private static void bubSort(int[] arr) {
        boolean swapped = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - 1 - i ; j++) {
                if(arr[j] < arr[j - 1]){
                   swap(arr,j,j - 1);
                }
            }
            if(!swapped)
                return;
        }
    }

    private static void swap(int[] arr, int i, int i1) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }


}