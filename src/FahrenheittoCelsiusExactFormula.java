import java.util.Scanner;

public class FahrenheittoCelsiusExactFormula {
    public static void main(String[] args) {
        double fahrenheit;
        double constant = 1.8 ;
        double constant1 = -32;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter value fahreneit:");
        fahrenheit = input.nextDouble();


        double celsius =  (fahrenheit - constant1) / constant;

        System.out.printf("Your Fahrenheit to Celsius is %.2f :",celsius);



    }
}
