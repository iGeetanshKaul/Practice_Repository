package JavaPointQuestions.ArraysPrograms;


import java.util.HashMap;

public class JavaPoint2 {
    public static void main(String[] args) {
        int[] arr = {1, 5, -84, 0, 56, -2345, 7, 5, 6,56, 5, 7, -84, 56, 999, 8475, 748};
        HashMap<Integer, Integer> mmap;
        mmap = func(arr);
        System.out.println(mmap);
    }

    private static HashMap<Integer,Integer> func(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 1;
        for (int i=0; i<arr.length;i++) {
            if((map.containsValue(arr[i]))){
                map.put(arr[i], map.get(arr[i])+1);

            }
            else  map.put(arr[i],count);
        }
        return map;
    }


}