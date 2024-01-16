package JavaPointQuestions.ArraysPrograms;

import java.util.Arrays;

public class JavaPoint19 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 6, 10, -555,-2764,-123, 0, 7, 8, 9,9, 10};
        seSort(arr);
        System.out.println(Arrays.toString(arr));
        int secondLargestElement = secLargeElem(arr);
        System.out.println(secondLargestElement);
    }

    private static int secLargeElem(int[] arr) {
        int distinct = 1;
        for (int i = arr.length - 1; i > 0 ; i--) {
            if(arr[i] != arr[i - 1]){
                distinct++;
            }
            if(distinct == 2)
                return arr[i - 1];
        }
        return -1;
    }

    private static void seSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - 1- i;
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr,last,maxIndex);
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
            if(arr[maxIndex] < arr[j])
                maxIndex = j;
        }
        return maxIndex;
    }
}