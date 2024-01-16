package methods;

import java.util.Scanner;

public class Coordinate {
    public static void main(String[] args) {
        System.out.println("Enter the first coordinate: ");
        Scanner input = new Scanner(System.in);
        double first_coordinate_x = input.nextInt();
        double first_coordinate_y = input.nextInt();
        System.out.println("Enter the second coordinate: ");
        double second_coordinate_x = input.nextInt();
        double second_coordinate_y = input.nextInt();
        System.out.println(distance(first_coordinate_x, first_coordinate_y,second_coordinate_x,second_coordinate_y));



    }

    public static double distance(double a, double b, double c, double d){
        double distance = Math.sqrt((c - a) + (d - b));
        return distance;
    }

}