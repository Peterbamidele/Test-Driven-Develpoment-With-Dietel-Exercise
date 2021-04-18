import java.util.Scanner;

public class newee {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your value for Mile:");
         int mile = input.nextInt();
        System.out.print("Enter your value for Kilometer_Per_Mile:");
        double kilometer_per_mile = input.nextDouble();

       double kilometer = mile * kilometer_per_mile;
        System.out.printf("Your estimated Miles amd kilometer %.2f:",kilometer);
    }
}
