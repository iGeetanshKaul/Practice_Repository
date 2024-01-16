package methods;

import java.util.Arrays;



public class varargs {
    public static void main(String[] args) {
        args("Geetansh",44,35,7,8);
    }

    private static void args(String a, int b, int ...v) {

        System.out.println(Arrays.toString(v));
    }
}