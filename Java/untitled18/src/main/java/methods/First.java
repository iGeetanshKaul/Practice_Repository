package methods;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner input = new Scanner(System.in);
//        while(input.hasNextInt()){
//            System.out.println(input.nextInt());
//        }
//
//        int i = 10;
//        do{
//            System.out.println(i);
//        }while (i != 10);
        String word = "Geetansh";

        System.out.println(word.charAt(5));

        if((word.charAt(5) > 'a') && (word.charAt(5) < 'z')){
            System.out.println("Lowercase");
        }else System.out.println("Uppercase");

       // System.out.println(fib(input.nextInt()));
        System.out.println(rev(8883949));





    }

    public static int fib(int input){
       int a = 0;
       int b = 1;
       int temp = 0;
        for (int i = 2; i <= input; i++) {
            temp = a + b;
            a = b;
            b = temp;
        }
        return temp;
    }

    public static int rev(int anothertemp){
        int revNum = 0;
        while(anothertemp > 0){
            int rem = anothertemp % 10;
            revNum = revNum*10 + rem;
            anothertemp = anothertemp/10;
        }
        return revNum;
    }
}