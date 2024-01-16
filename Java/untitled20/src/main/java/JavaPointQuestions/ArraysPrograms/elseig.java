package JavaPointQuestions.ArraysPrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class elseig {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 0, 5, 8, -12, 98, 0, -8, 0, 19};

        countAndAppendZeros(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] countAndAppendZeros(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;

        for(int i: arr){
            if(i == 0){count++;}
            else {list.add(i);}
        }

        for(int i = 0; i < count; i++){
            list.add(0);
        }
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }


}