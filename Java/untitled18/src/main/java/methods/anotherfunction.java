package methods;

import java.util.Arrays;
import java.util.Scanner;



public class anotherfunction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = 10;
        int b = 20;
       // System.out.println(swap(a,b));

        String name = "Geetansh";
        String newName = addName(name);
        System.out.println(newName);

        int[] arr = {1, 4, 6};
        addNumber(arr, 6);
        System.out.println(arr);

    }

    private static int[] addNumber(int[] arr, int number) {
        int length = arr.length;
        return arr;
    }

    private static String addName(String name) {
        String newName = name + " " +"kaul";
        System.out.println(newName);
        return newName;
    }

    private static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }


}