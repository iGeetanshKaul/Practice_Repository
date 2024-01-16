package oop3;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(4);
        System.out.println(box.l + " " + box.w + " " + box.h + " " );
        Box box1 = new Box(box);
        System.out.println(box.l + " " + box.w + " " + box.h + " " );

        Box box2 = new BoxWeight(1, 2, 3, 4);

    }
}