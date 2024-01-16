package fifthPackage;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;

public class first {
    public static void main(String[] args) {
        String a = "Geetansh";
        String b = new String("Geetansh");
        String c = "Geetansh";
        String d = null;
        String e = "null";


        System.out.println(d);
        System.out.println(e);

        System.out.println(a==b);
        System.out.println(a == c);
        System.out.println(a.equals(b));
        a = renameA(a);
        System.out.println(a);




        int[] arr1 = {1, 2, 4};
        int[] arr2 = arr1;
        arr2[1] = 3;
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

    private static String renameA(String a) {
         a = a + " " + "Kaul";
       return a;
    }
}