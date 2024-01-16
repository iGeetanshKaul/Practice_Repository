package JavaPointQuestions.ArraysPrograms;

import java.util.Arrays;

public class JavaPoint16 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 6, 10, -555,-2764,-123, 0, 7, 8, 9,9, 10};
        bubSort(arr);
        System.out.println(Arrays.toString(arr));
        int element = thirdLargetElement(arr);
        System.out.println(element);

    }

    private static int thirdLargetElement(int[] arr) {
        int distinct = 1;
        for (int i = arr.length - 1; i > 0; i--) {
            if(arr[i] != arr[i - 1]) {
                distinct++;
            }

            if(distinct == 3){
                return arr[i - 1];
            }
        }
        return -1;
    }

    private static void bubSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i ; j++) {
                if(arr[j] < arr[j - 1]){
                    swap(arr,j,j-1);
                }
            }
        }
    }

    private static void swap(int[] arr, int j, int i) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}