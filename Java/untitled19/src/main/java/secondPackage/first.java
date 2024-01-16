package secondPackage;

import java.util.Arrays;

public class first {
    public static void main(String[] args) {
        int target = 9;
        int[] arr = {1, 4, 6, 7, 8, 45, -123, 78, 56, 0};
        int[][] array = {
                {1, 2, 4, 5},
                {89, -12, -23,},
                {10000, 586, 9},
        };

        int[] returnedArray = searchInTheArray(array, target);
        System.out.println(Arrays.toString(returnedArray));

        int max = searchInTheArrayReturnMax(array);
        System.out.println(max);


        String name = "Geetansh";
        char search = 'a';
        //   int returnedChar = searchAndReturnCharIndex(name, search);
        //  System.out.println(returnedChar);

//        int returnedIndex = searchAndReturnIndex(arr, target);
//        System.out.println(returnedIndex);
//        boolean exists = searchExistence(arr, target);
//        System.out.println(exists);

        System.out.println(Arrays.toString(name.toCharArray()));
    }

    private static int searchInTheArrayReturnMax(int[][] array) {
        int max = array[0][0];
        for(int[] i: array){
            for( int j: i){
                if(j > max)
                    max = j;
            }
        }
        return max;
    }

    private static int[] searchInTheArray(int[][] array, int target) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == target)
                    return new int[]{i, j};
            }
        }
        return new int[]{-1, -1};
    }

    //   private static int searchAndReturnCharIndex(String name, char search) {
//        for (int i = 0; i < name.length(); i++) {
//            if(name.charAt(i) == search)
//                return i;
//        }
//        return -1;
//        for(char ch: name.toCharArray()){
//            if(search == ch )
//                return ;
//        }
//        return -1;
//    }

//    private static boolean searchExistence(int[] arr, int target) {
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] == target) return true;
//        }
//        return false;
//    }
//
//
//    private static int searchAndReturnIndex(int[] arr, int target) {
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] == target)
//                return i;
//        }
//        return -1;
//    }
//}
}