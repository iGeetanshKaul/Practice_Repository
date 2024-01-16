package oop3;

public class Solution {
    int start = 0;
    int end = nums.length - 1;
    int temp = 0;


    int findpivot(int[] nums, int target, int start, int end){
    while(start <= end){
        int mid = start + (end - start)/2;


        if(nums[mid] < nums[mid - 1] ) temp = mid - 1;
        else if (start < end && nums[mid] > nums[mid + 1] ) temp = mid;
        else if (nums[mid] <= nums[start]) end = mid - 1;
        else start = mid + 1;
        return temp;
    }
    }
    return -1;
}