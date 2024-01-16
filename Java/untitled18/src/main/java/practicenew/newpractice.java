package practicenew;


import java.util.Arrays;
import java.util.Scanner;

public class newpractice {
    static int a = 9;
    static double t =5;
    public static void main(String[] args) {
        int num = Integer.parseInt(Arrays.toString(args));
      one first = new one(4,5);
      one second = new one(4,5);
      int b = 6;

        System.out.println(first.i + first.j);
        System.out.println(second.i + second.j);
        System.out.println(a);
        System.out.println(newpractice.t);
        System.out.println(first.isEqualto(second));
        System.out.println(first.isEqualto(second));
        System.out.println(one.inner.i);

    }



}