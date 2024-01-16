package JavaPointQuestions.ArraysPrograms;

public class JavaPoint7And8 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        evenPrinting(arr);
    }

    private static void evenPrinting(int[] arr) {
        for (int i = 1; i < arr.length; i+=2) {
            System.out.println(arr[i]);
        }
    }
}