package JavaPointQuestions.ArraysPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class another {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        switch (input.nextInt()){
            case (1):
                System.out.println("integer.");
                break;
            default:
                System.out.println("no int.");
                break;
        }

        int[][] arr = {
                       {1, 2, 3},
                       {4, 5, 6},
                       {7, 8, 9}
                      };

        for(int[] i : arr){
            System.out.println(Arrays.toString(i));
            }





     ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        System.out.println(list);
        for (int[] i:arr) {
            ArrayList<Integer> listForRow = new ArrayList<>();
            for (int j: i) {
               listForRow.add(j);
            }
            list.add(listForRow);
        }

        for(ArrayList<Integer> i:list){
            System.out.println(Arrays.toString(i.toArray()));
            }
        }
    }