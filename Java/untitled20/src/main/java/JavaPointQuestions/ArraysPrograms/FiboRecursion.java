package JavaPointQuestions.ArraysPrograms;



public class FiboRecursion {
    public static void main(String[] args) {

        int result = fib(5);
        System.out.println(result);
    }

    private static int fib(int i) {
        if(i < 2) return i;
        else return fib(i - 1) + fib(i - 2);
    }
}