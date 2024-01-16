package BSearchPackage;

import java.util.Arrays;

public class first {
    public static void main(String[] args) {
        String name = "Geetansh";
        int[] arr = {2, 5, 7, 8, -1, -234, 56, 0};
        int[][] array = {
                            {1, 4, -1},
                            {56, 789, -123},
                            {-575,  847, 485}
                        };
        char target = 't';
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(searchChar(name, target));
//        for(char i : name){
//            System.out.println(i);
//        }
        System.out.println(minNumberInArray(arr));
        System.out.println(minNumberInArray(array));
    }

    private static int minNumberInArray(int[][] array) {
        int min = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j] < min){
                    min = array[i][j];
                }
            }
        }
        return min;
    }

    private static int minNumberInArray(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    private static boolean searchChar(String name, char target) {
        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i) == target){
                return true;
            }
        }
        return false;
    }
}