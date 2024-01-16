package fourthPackage;

public class first {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 4, 5},
                {45, 3, 8},
                {10, 20, 20},
        };

        int primaryDiagonalSum = primaryDiagonalSum(arr);
        System.out.println(primaryDiagonalSum);
        int secondaryDiagonalSum = secondaryDiagonalSum(arr);
        System.out.println(secondaryDiagonalSum);
        int sum = primaryDiagonalSum + secondaryDiagonalSum;
        int totalSum = omitMiddle(arr, sum);
        System.out.println(totalSum);
    }

    private static int omitMiddle(int[][] arr, int sum) {
        if(arr.length == 1)

        if(arr.length % 2 != 0)
            sum = sum - arr[arr.length % 2][arr.length % 2];
        return sum;
    }

    private static int secondaryDiagonalSum(int[][] arr) {
        int N = arr.length;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum +=  arr[i][N - 1 - i];
        }
        return sum;
    }



    private static int primaryDiagonalSum(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i == j){
                    sum += arr[i][j];
                }

            }
        }
        return sum;
    }
}