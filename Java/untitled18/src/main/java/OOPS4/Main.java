package OOPS4;

import first.anotherOOPS;

public class Main {
    public static void main(String[] args) {
        A temp = new A(13, 23, 45, 48);
        A temp1 = new A(13,23,45,48);
        System.out.println(temp.getA());
        System.out.println(temp.getB());

        if(temp == temp1){
            System.out.println("equals");
        }if(temp.equals(temp1)){
            System.out.println("jieh");
        }else System.out.println("not");

        class temp{
           // A temp2 = new A();
            int i = temp.c;

        }
        System.out.println(temp instanceof A);
        System.out.println(temp1.getClass());

    }




}