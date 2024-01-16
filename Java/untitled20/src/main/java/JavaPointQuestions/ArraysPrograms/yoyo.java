package JavaPointQuestions.ArraysPrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class yoyo {
    public static void main(String[] args) {
        int[] arr = {1, 3, 0, 8, 4, 0, 0, 5, 8};

        countAndAppendZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void countAndAppendZeroes(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;

        for(int i: arr){
            if(i == 0){
                count++;
            }else{
                list.add(i);
            }
        }

        System.out.println("++++++++++");
        System.out.println(Arrays.toString(list.toArray()));

        for(int i = 0; i < count; i++){
            list.add(0);
        }
        System.out.println("++++++");
        System.out.println(Arrays.toString(list.toArray()));

       for(int i = 0; i < list.size(); i++){
           arr[i] = list.get(i);
       }
    }
}