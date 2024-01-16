package Question4;

import java.util.Arrays;

public class Question {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] answers = {-1, -1};
        int begin = search(nums, target, true);
        int last = search(nums, target, false);
        boolean left = true;
        answers[0] = begin;
        answers[1] = last;
        System.out.println(Arrays.toString(answers));
    }



    private static int search(int[] nums, int target, boolean left ) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;


        while(start <= end) {
            int mid = start + (end - start)/2;
            if (nums[mid] < target) start = mid + 1;
            else if (nums[mid] > target) end = mid - 1;
            else if(nums[mid] == target){ ans = mid;
                if(left) end = mid - 1;
                else start = mid + 1;
            }

        }
        return ans;
    }
}