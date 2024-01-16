public class Binary {
    public static void main(String[] args) {
        int[] arr = {-199, -100, -1, 1, 120, 200, 300};
        int target = 0;

        System.out.println(search(arr,target));
    }

    private static int search(int[] arr, int target) {
        boolean isAsc = (arr[0] < arr[arr.length - 1]);
        int start = 0;
        int end = arr.length -1;


        while(start<=end){
            int mid = start + (end - start)/2;

            if(isAsc){
                if(arr[mid] < target) start = mid + 1;
                else if (arr[mid] > target) end = mid - 1;
                else if (arr[mid] == target) return mid;

            }else{
                if(arr[mid] > target) start = mid + 1;
                else if (arr[mid] < target) end = mid - 1;
                else if (arr[mid] == target) return mid;

            }
        }
        //return start;
        return end;

    }
}