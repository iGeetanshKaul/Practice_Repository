package fifthPackage;

import java.util.Arrays;



public class newClass {


    public static void main(String[] args) {
        String str = "Geetansh";
        int[] nums = {3,30,34,34,5,5,9};
        //int[] tempArr =  incBubbleSort(nums);
       // System.out.println(Arrays.toString(nums));
       // int[] tempArr2 = decBubbleSort(nums);
      ////  System.out.println(Arrays.toString(tempArr));
        System.out.println("+=+=====+++++++=+");
       // System.out.println(Arrays.toString(tempArr2));
        int k = 3;
      //  int kth = kthLargestElement(tempArr,k);
       // System.out.println(kth);
        System.out.println("uierubguiregnbiuerguerhg");
        selectSort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println("ioerngiuerhguieh");




        String newString = largestNumber(nums);
        System.out.println("===============");
        System.out.println(newString);
        System.out.println("===============");
        int[] arr = {1, 2, 5, 6, 9};
        System.out.println(Arrays.toString(Solution.twoSum(arr, 3)));
    }

    private static void selectSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
           int last = nums.length - 1 - i;
           int max = maxValue(0,last,nums);
           swap(last, max, nums);
        }
    }

    private static void swap(int last, int max, int[] nums) {
        int temp = nums[last];
        nums[last] = nums[max];
        nums[max] = temp;
    }

    private static int maxValue(int start, int last, int[] nums) {
        int max = 0;
        for (int i = start; i < last; i++) {
            if(nums[start] < nums[i]){
                max = i;
            }
        }
        return max;
    }



























    private static int kthLargestElement(int[] tempArr2, int k) {
        return tempArr2[tempArr2.length - k];
    }

    private static int[] decBubbleSort(int[] nums) {
        boolean swapped;
        for (int i = 0; i < nums.length; i++) {
            swapped = false;
            for (int j = 1; j < nums.length - i; j++) {
                if(nums[j - 1] < nums[j]){
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }

        return nums;
    }

    private static int[] incBubbleSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length - i; j++) {
                if(nums[j - 1] > nums[j]){
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                }
            }
        }
        return nums;
    }

    public static String largestNumber(int[] nums) {
        String num = "";
        for(int i = nums.length - 1; i > 0; i--){
            num += Integer.toString(nums[i]);
        }
        return num;
    }


}
class Solution{
    public static int[] twoSum(int[] numbers, int target){
        int[] newArr = new int[2];
        for (int i = 3; i < numbers.length; i++) {
            if(target == numbers[i - 2] + numbers[i - 1])
            newArr = new int[]{i - 2, i - 1};
        }
        return newArr;
    }


}