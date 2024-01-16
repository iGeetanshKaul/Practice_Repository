package InfiniteArray;

public class infinitearray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 13, 14,15, 16, 17, 18, 19, 20, 21, 22 ,23, 24, 25, 26, 27, 28,29,30};
        int target = 27;
        int lowerBound = arr[0];
        int upperBound = arr[0];


       // int newUpperBound = chunk(arr, lowerBound, upperBound, target);

        System.out.println(chunk(arr, lowerBound, upperBound, target));

    }

    private static int chunk(int[]arr, int lowerBound, int upperBound, int target) {


        int newUpperBound = 0;
        while (arr[upperBound] < target) {
            lowerBound = upperBound + 1;
            int i = upperBound - lowerBound + 1;
            newUpperBound = 2 * 2 * i;

            // return bSearch(arr, target, upperBound + 1, 2*i);
        }
        return bSearch(arr, target, lowerBound, newUpperBound);
    }

    private static int bSearch(int[] arr, int target, int lowerBound, int newUpperBound) {
//        int lowerBound = 0;
//        int upperBound = arr.length - 1;

        while(lowerBound <= newUpperBound){
            int mid = lowerBound + (newUpperBound - lowerBound)/2;

            if(arr[mid] < target) lowerBound = mid + 1;
            else if(arr[mid] > target) newUpperBound = mid - 1;
            else return mid;
        }
        return -1;
    }


}