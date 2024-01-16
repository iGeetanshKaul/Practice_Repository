import java.lang.reflect.Array;
import java.util.Arrays;

public class twoDimensionArraySearch {
    public static void main(String[] args) {
        int[][] arr = {
                        {1,2,4},
                        {45,65,333},
                        {35,85,679,356}
                      };
        int element = 85;

        System.out.println(Arrays.toString(searchIndex(arr,element)));
    }

    private static int[] searchIndex(int[][] arr, int element) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] == element){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{Integer.MAX_VALUE};
    }


}