package secong;

import java.util.ArrayList;
import java.util.Scanner;

public class array {

    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList<Integer> list = getList(n);
        int sum = sumOfList(list);
        int num = sum;
        System.out.println(sum);



    }

    private static int sumOfList(ArrayList<Integer> list) {
        int sum=0;
        for (Integer integer : list) {
            sum += integer;
        }
        return sum;
    }

    private static ArrayList getList(int n) {
        String str = Integer.toString(n);
        int length = str.length();
        ArrayList<Integer> list = new ArrayList<>(length);
        while(n!=0){
            int rem = n%10;
            list.add(rem);
            n=n/10;
        }
        return list;
    }


}