package interfaces;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.brake();

        ArrayList list = new ArrayList();
        list.add("geetansh");
        list.add(45);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(Arrays.toString(new Object[]{list.get(i)}));

        }
    }
}