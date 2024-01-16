package JavaPointQuestions.ArraysPrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
      //  int[] arr = {10, 5, 3, 7, 2, 1, 6, 8, 9, 4};
        int[] arr = {4, 0, 6, 3, 1, 2};
        int missing = missingCycSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(missing);

//        ArrayList<Integer> list;
//        list = findRepeatedElement(arr);
//        System.out.println(Arrays.toString(list.toArray()));
//
//       int missingElement = findMissingElement(arr);
//        System.out.println(missingElement);
    }

    private static int findMissingElement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != i + 1)
                return i + 1;
        }
        return -1;
    }

    private static ArrayList<Integer> findRepeatedElement(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] == arr[i - 1]){
                list.add(arr[i]);
            }
        }
        return list;
    }

    private static int missingCycSort(int[] arr) {
        int missing = -1;
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i] - 1;
                if (arr[correctIndex] != arr[i]) {
                    if(correctIndex == -1){
                        missing = i + 1;
                        break;
                    }else
                    swap(arr, correctIndex, i);
                }

            else i++;
        }
        return missing;
    }

    private static void swap(int[] arr, int correctIndex, int i) {
        int temp = arr[correctIndex];
        arr[correctIndex] = arr[i];
        arr[i] = temp;
    }
}