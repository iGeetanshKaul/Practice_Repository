package methods;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class function {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        storeInArray(input);

        int[] nums =  {1, 4, 6};
        int[] nums2 = {1, 3, 6, 8};

        nums = swap(nums);
       // System.out.println(Arrays.toString(swap(nums)));
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(swap(nums2)));

        String name = "Geetansh";
       name =  changeName(name);
       String newNames = changeName(name);
        System.out.println(name);
        System.out.println(newNames);

        Integer a = 5;
        a = changeInteger(a, 6);
        Integer new_A = changeInteger(a, 6);
        System.out.println(a);

    }

    private static Integer changeInteger(Integer temp, int value) {
        temp = value;
        System.out.println(temp);
        return temp;
    }

    private static String changeName(String name) {
        name = "Kunal";
        System.out.println(name);
        return name;
    }

    private static int[] swap(int[] nums) {
        for (int i = 0; i < nums.length/2; i++) {
            int temp = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = nums[i];
            nums[i] = temp;
        }
        //System.out.println(Arrays.toString(nums));
        return nums;
    }

    private static ArrayList<Integer> storeInArray(Scanner input) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while(input.hasNextInt()){
            int i = 0;
            arr.add(i,input.nextInt());
        }
        System.out.println(arr);
        return arr;
    }


}