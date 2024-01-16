package firstPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the week day in numbers; ");
        int userInput = input.nextInt();
        findAndDisplyTheWeekDay(userInput);
        System.out.println();
        int[] arr = {1, 5, 5,7,-1,8 };
        ArrayList<Integer> arraylist = new ArrayList<>(3);
        arraylist.add(0,1);
        arraylist.add(1,2);
        arraylist.add(2,3);
        int[][] matrix = {
                {1,2,3},
                {4,5},
                {6,7,8,9,10}
        };

        String str = "Geetansh";
        toChararcterArray(str);
        System.out.println();




        displayMatrix(matrix);
        System.out.println();
        displayMatrixForeach(matrix);
        System.out.println();
        displayMatrixInToStrings(matrix);
        System.out.println();
        anotherDisplayMatrix(matrix);
        System.out.println();
        ArrayList<Integer> Arraylist = addAnother(arraylist);
        System.out.println();
        System.out.println(Arraylist);
       // showcaseArraylist()
        System.out.println(Arrays.toString(addAnother(arr)));
    }

    private static void toChararcterArray(String str) {
       char[] charArr = new char[str.length()];
            for (int i = 0; i < str.length(); i++) {
                charArr[i] = str.charAt(i);
        }
            for(char ch: charArr){
                System.out.print(ch + " ");
            }
        System.out.println(Arrays.toString(charArr));

    }

    private static void findAndDisplyTheWeekDay(int userInput) {
        switch(userInput){
            case 1: System.out.println("MOnday");
                break;
            case 2: System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("I don't give a shit.");
                break;
        }

    }

    private static void anotherDisplayMatrix(int[][] matrix) {
        for (int[] i: matrix) {
            System.out.println(Arrays.toString(i));
        }
    }

    private static void displayMatrixInToStrings(int[][] matrix) {
        for (int i =0;i<matrix.length;i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    private static void displayMatrixForeach(int[][] matrix) {
        for(int[] i: matrix){
            for(int j: i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    private static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }

    }

    private static ArrayList<Integer> addAnother(ArrayList<Integer> arraylist) {
        ArrayList<Integer> newArraylist = arraylist;
        newArraylist.add(1,10);

        return newArraylist;
    }

    private static int[] addAnother(int[] arr) {
        int[] anotherArr = arr;
        anotherArr[3] = 10;
        return anotherArr;
    }

}