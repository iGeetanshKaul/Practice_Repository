public class orderAgnostic {
    public static void main(String[] args) {
        int[] arr = {-495, -304, -194, -100, -1, 0, 1, 399, 300, 599, 777};
     //    int[] arr = {777, 599, 300, 1, 0, -1, 100, -194, -304, -495};
        int target = -1;
        System.out.println(orderAgnos(arr,target));

    }

    private static int orderAgnos(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[end] > arr[start];

        while(start <= end){
            int mid = start + ( end - start)/2;

            if(isAsc){
                if (arr[mid]<target){
                    start = mid + 1;
                } else if (arr[mid] > target) {
                    end =  mid - 1;
                }else return mid;
            }else {
                if (arr[mid] > target){
                    start = mid + 1;
                } else if (arr[mid] < target) {
                    end =  mid - 1;
                }else return mid;
            }


        }
        return -1;
    }


}