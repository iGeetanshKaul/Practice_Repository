package JavaPointQuestions.ArraysPrograms;

public class basicPrintRecursion {
    public static void main(String[] args) {

        print(1);
    }

    private static void print(int i) {
        //base condition
        if(i == 5) {
            System.out.println(i);
            return;
        }

        System.out.println(i);
        print(1 + i);
    }
}