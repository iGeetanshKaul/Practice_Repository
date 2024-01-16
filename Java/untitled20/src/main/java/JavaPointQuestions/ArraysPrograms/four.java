package JavaPointQuestions.ArraysPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class four {
    public static void main(String[] args) {
        int[] arr = {1, -34, 34, 8, 4, 5, 1, -34, 0, 8, 4};
        rotateArr(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void rotateArr(int[] arr) {
        for (int i = 1; i < arr.length - 1; i++) {
            int last = arr[arr.length - 1];

            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
        }


    }
}