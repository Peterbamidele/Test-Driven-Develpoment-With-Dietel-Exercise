package ExerciseWithOutTTD.ParkingCharge;

import java.security.SecureRandom;
import java.util.Scanner;

public class CircleArea {
    /*****
     * (Circle Area) Write an application that prompts the user for the radius of a circle and uses
     * a method called circleArea to calculate the area of the circle.****/
    public static void main(String[] args) {
        System.out.println(circleArea(4));
        System.out.println(circleArea(5));

    }

    private static double circleArea(int radius) {
            double circleArea=2*Math.PI*Math.pow(radius,2);
            return circleArea;
    }
}
