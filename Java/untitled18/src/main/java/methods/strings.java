package methods;

import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the input: ");
        String string = input.next();

//        if(string.equals("mango")){
//            System.out.println("string is mango");
//        }else if(string.equals("orange")){
//            System.out.println("string in orange.");
//        }

        switch (string) {
            case "mango" -> System.out.println("the string is mango.");
            case "orange" -> System.out.println("the string is orange.");
            case "apple" -> System.out.println("the string is an apple.");
            default -> System.out.println("the string is empty.");
        }


    }

}