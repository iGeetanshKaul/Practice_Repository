package one;

import java.util.ArrayList;
import java.util.Arrays;


class Solution {
        public static void main(String[] args) {
            int[] nums = {0, 3,2 ,5, 6, 1,8,10};
            findDisappearedNumbers(nums);


        }
    public static ArrayList<Integer> findDisappearedNumbers(int[] nums) {
        cyclicSort(nums);
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != i)
                list.add(nums[i]);

        }
        return list;
    }

    private static void cyclicSort(int[] nums) {
        int i = 1;
        while(i < nums.length){
            int correctIndex = nums[i] - 1;
            if(nums[i] != nums[correctIndex]){
                swap(i,correctIndex,nums);
            }else i++;
        }
        System.out.println(Arrays.toString(nums));
        System.out.println("After sorting");


    }

    private static void swap(int i, int correctIndex, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[correctIndex];
        nums[correctIndex] = temp;
    }
}