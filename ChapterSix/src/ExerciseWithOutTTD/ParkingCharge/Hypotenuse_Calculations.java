package ExerciseWithOutTTD.ParkingCharge;

import java.util.Scanner;

public class Hypotenuse_Calculations {
    /****
     * 6.15 (Hypotenuse Calculations) Define a method hypotenuse that calculates the hypotenuse of
     * a right triangle when the lengths of the other two sides are given. The method should take two ar-
     * guments of type double and return the hypotenuse as a double . Incorporate this method into an
     * application that reads values for side1 and side2 and performs the calculation with the hypotenuse
     * method. Use Math methods pow and sqrt to determine the length of the hypotenuse for each of the
     * triangles in Fig. 6.15. [Note: Class Math also provides method hypot to perform this calculation.]*****/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double side1;
        double side2;
        double Hypotenuse;
        System.out.println("Enter value for side1:");
        side1 = input.nextDouble();
        System.out.println("Enter value for side2:");
        side2= input.nextDouble();

        Hypotenuse = Math.sqrt(Math.pow(side1,2)+ Math.pow(side2,2));
        System.out.printf("%s%10s%20s%n","side1","side2","Hypotenuse");
        System.out.printf("%.2f%10.2f%20.2f",side1,side2,Hypotenuse);
    }
}
