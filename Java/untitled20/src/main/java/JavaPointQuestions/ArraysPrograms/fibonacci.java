package JavaPointQuestions.ArraysPrograms;

public class fibonacci {
    public static void main(String[] args) {
        int N = 5;
        int first = 0;
        int second = 1;
        int sum = 0;

        for (int i = 2; i < N; i++) {
           sum = first + second;
           first = second;
           second = sum;
        }

        System.out.println(sum);
    }
}