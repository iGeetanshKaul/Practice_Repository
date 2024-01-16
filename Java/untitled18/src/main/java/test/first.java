package test;

import java.util.Arrays;

public class first {
    public static void main(String[] args) {
        int[] arr = {1, 5,6 ,8 ,5 ,45,-33};
        System.out.println(Arrays.toString(addAnother(arr)));
    }

    private static int[] addAnother(int[] arr) {
        int[] arrAnother = arr;
        arrAnother[4] = 6;
        return arrAnother;
    }
}