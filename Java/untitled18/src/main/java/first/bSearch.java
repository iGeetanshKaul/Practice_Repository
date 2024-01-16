package first;

public class bSearch {
    public static void main(String[] args) {
    int[] arr = {1, 4, 6 ,7, 8,9,0,1,2,3,4,5,6,7};
        System.out.println(findPivot(arr));




    }

     static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if((mid < end) && (arr[mid] > arr[mid + 1]))
                return mid;
            if((start < mid) && (arr[mid] < arr[mid - 1]))
                return mid - 1;
            if(arr[mid] <= arr[start])
                end = mid - 1;
            if(arr[mid] > arr[start])
                start = mid + 1;

        }
        return -1;
    }

}