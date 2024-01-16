public class binarysearch {
    public static void main(String[] args) {
        int[] arr = {-846,-546,-234,100, -1, 0 , 848, 8475,9485934 };
        int target = -1;
        long startTime = System.nanoTime();
        System.out.println(binarySearchmethod(arr,target));
        long endTime = System.nanoTime();
        System.out.println((endTime-startTime)/1_000_000_000.00);

    }

    private static int binarySearchmethod(int[] arr,int target) {
        int start = 0;
        int end = arr.length -1;
        while(start<=end){
            int m = start + ((end - start)/2);

            if(arr[m]<target) start = m+1;
            else if(arr[m]>target) end = m-1;
            else return m;
        }
        return -1;


    }
}