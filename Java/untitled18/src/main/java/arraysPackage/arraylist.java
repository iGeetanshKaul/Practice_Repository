package arraysPackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       // ArrayList<Integer> list = new ArrayList<>(10);
        System.out.println("Enter the numbers: ");
        ArrayList<Integer> list = new ArrayList<>();

        while(input.hasNextInt()){
            list = askForElements(input);
        }
//        list.add(12);
//        list.add(23);
//        list.add(445);
//        System.out.println(list);
//
//        System.out.println(maxValue(list));

//        for (int i: list) {
//            System.out.println(i);
//        }




    }

    private static ArrayList<Integer> askForElements(Scanner input) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                list.add(i,input.nextInt());
            }
        }
        return list;
    }

    private static int maxValue(ArrayList<Integer> list) {
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if(list.get(i) > max){
                max = list.get(i);
            }
        }
        return max;
    }

//    private static ArrayList<Integer> show(ArrayList<Integer> list){
//        for (int i: list) {
//            System.out.println(i);
//        }
//    }
}