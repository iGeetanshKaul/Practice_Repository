package thirdPackage;

public class first {
    public static void main(String[] args) {
        int[] arr = {134, 2,24, 3333, 7890,345,5674};
        int a = 0;
        int b = 3;
        int c = 5;
        int d = 10;

        int d1 = a < b ? a : b;
        int d2 = d1 < c ? d1 : c;

        a = swapXOR(a, b);

        c = swapXOR(c , d);

        System.out.println(a);
        System.out.println(c);

//
//        int count = coutTheNumberOfEvenDigitNumbers(arr);
//        System.out.println(count);
    }

    private static int swapXOR(int a, int b) {
        int temp = a^b;
        a = temp^a;
        return a;
    }

//    private static int coutTheNumberOfEvenDigitNumbers(int[] arr) {
//        int count = 0;
//        for(int num: arr){
//            if(even(num))
//                count++;
//
//        }
//        return count;
//    }
//
//    private static boolean even(int num) {
//        int count = 0;
//        while(num>0){
//            count++;
//            num /= 10;
//        }
//    }


}