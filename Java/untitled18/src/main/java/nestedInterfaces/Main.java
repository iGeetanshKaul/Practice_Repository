package nestedInterfaces;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Stack mystack1 = new Stack(5);
        Stack mystack2 = new Stack(10);

        for (int i = 0; i < 5; i++) {
            mystack1.push(i);
        }
        for (int i = 0; i < 10; i++) {
            mystack2.push(i);
        }
        for (int i = 0; i < 5; i++) {
            mystack1.pop();
        }
        for (int i = 0; i < 10; i++) {
            mystack2.pop();
        }

//        for (int i = 0; i < 10; i++) {
//            int[] arr = mystack2
//
//        }
    }

}