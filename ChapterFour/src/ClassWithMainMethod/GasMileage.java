package ClassWithMainMethod;

import java.util.Scanner;

public class GasMileage {
    private static int miles;
    private static int gallon;
    private static int totalMiles = 0;
    private static double milesPerGallon;
    private static double totalMilesPerGallon;

    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        System.out.print("Enter miles(-1 to quit):");
        miles = input.nextInt();
        
        while (miles != -1){
            System.out.println("Enter gallon:");
            gallon = input.nextInt();
            
            totalMiles+= miles;
            int totalgallon = gallon;

            if (gallon != 0){
                milesPerGallon = (double) miles/gallon;
                System.out.printf("milesPerGallon(Mpg) of tankful: %.2f\n",milesPerGallon);

            }

            if (totalgallon !=0)
            {
                totalMilesPerGallon = (double) totalMiles / totalgallon;
                System.out.printf("Total milesPerGallon(Mpg) : %.2f\n",totalMilesPerGallon);
            }

            System.out.printf("Enter miles (-1 to quit): ");
            miles = input.nextInt();

        }
    }
    
}
