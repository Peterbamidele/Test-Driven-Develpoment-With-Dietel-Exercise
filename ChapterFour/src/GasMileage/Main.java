package GasMileage;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GasMileage gasMileage = new GasMileage(3, 9, 23, 43, 56.0, 43);

        System.out.print("Enter Miles(-1 to quit):");
        gasMileage.setMiles(input.nextInt());

        while (gasMileage.getMiles() != -1) {

            System.out.print("Enter Gallons:");
            gasMileage.setGallon(input.nextInt());

//            gasMileage.settotalMiles() += gasMileage.getMiles();
//            gasMileage.gettotalGallon(input.nextInt()) = gasMileage.getGallon();



        }
    }
}