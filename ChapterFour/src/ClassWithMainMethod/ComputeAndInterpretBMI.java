package ClassWithMainMethod;

import java.util.Scanner;

public class ComputeAndInterpretBMI {
    private static final double KILOGRAMS_PER_POUND =0;
    private static final double METERS_PER_INCH = 0;
    double Weight;
     double Height;
     double KilogramsPerPound = 0.45359237;
     double MeterPerInch = 0.0254;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Weight In Pounds: ");
        double Weight = input.nextDouble();

        System.out.println("Enter Weight In Inches: " );
        double Height = input.nextDouble();

        // Compute BMI
        double weightInKilograms = Weight * KILOGRAMS_PER_POUND;
        double heightInMeters = Height * METERS_PER_INCH;
        double BMI = weightInKilograms /
                (heightInMeters * heightInMeters);

        // Display result
        System.out.println("BMI is " + BMI);
        if (BMI < 18.5)
            System.out.println("Underweight");
        else if (BMI < 25)
            System.out.println("Normal");
        else if (BMI < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");

    }
}
