package one;



public class another {
    public static void main(String[] args) {
        int[] arr = {0, 3,2 ,5, 6, 1,8,10};
        int missingNumber = cyclicSortAndFindMissingNumber(arr);
        System.out.println(missingNumber);
    }

    private static int cyclicSortAndFindMissingNumber(int[] arr) {
        int missingN = Integer.MIN_VALUE;
        int i = 0;
        while(i < arr.length){
            int correct = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correct]){
                swap(i,correct,arr);
            }else i++;
        }

        for (int j = 0; j < arr.length; j++) {
            if(j != arr[j])
                missingN =  j;
        }
        return missingN;
    }

    private static void swap(int i, int correct, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}