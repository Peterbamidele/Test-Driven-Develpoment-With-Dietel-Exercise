package JavaExercise;

import java.util.Scanner;

public class Maximufinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first floating-point values separeted by space:");
        double number1 = input.nextDouble();
        System.out.print("Enter second floating-point values separeted by space:");
        double number2 = input.nextDouble();
        System.out.print("Enter third floating-point values separeted by space:");
        double number3 = input.nextDouble();

        double result = maximum(number1 , number2 ,number3);

        System.out.println("Maximum is:"+ result);


    }

    private static double maximum(double x, double y, double z) {
        double maximumValue = x;
        if (y > maximumValue)
            maximumValue = y;
        if (z > maximumValue)
            maximumValue = z;

        return maximumValue;

    }
}
