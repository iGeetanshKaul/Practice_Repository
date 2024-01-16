package JavaPointQuestions.ArraysPrograms;

public class binarySearchRecursion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 7, 8, 11, 12};

       int var = bsearchR(arr,11,0,arr.length - 1);
        System.out.println(var);
    }
    public static int bsearchR(int[] arr, int target, int start, int end){
        if(start > end){
            return -1;
        }

        int middle = start + (end - start)/2;

        if (arr[middle] == target) {
            return middle;
        }else if(arr[middle] < target)
            return bsearchR(arr,target,middle + 1,end);
        else
           return bsearchR(arr,target,start,middle - 1);

    }
}