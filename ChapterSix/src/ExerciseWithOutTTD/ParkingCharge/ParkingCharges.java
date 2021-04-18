package ExerciseWithOutTTD.ParkingCharge;

public class ParkingCharges {
    /****
     * (Parking Charges) A parking garage charges a $2.00 minimum fee to park for up to three
     * hours. The garage charges an additional $0.50 per hour for each hour or part thereof in excess of three
     * hours. The maximum charge for any given 24-hour period is $10.00. Assume that no car parks for
     * longer than 24 hours at a time. Write an application that calculates and displays the parking charges
     * for each customer who parked in the garage yesterday. You should enter the hours parked for each
     * customer. The program should display the charge for the current customer and should calculate and
     * display the running total of yesterday’s receipts. It should use the method calculateCharges to de-
     * termine the charge for each customer.*****/
    public static void main(String[] args) {
        System.out.printf("$%.2f%n", calculateCharges(24));
        System.out.printf("$%.2f%n", calculateCharges(13));
        System.out.printf("parking garage charges:$%.2f%n", calculateCharges(2));
        System.out.printf("$%.2f%n", calculateCharges(0));
    }

    public static double calculateCharges(int hoursparked) {
        double garageCharges = 0;

        if (hoursparked < 3) {
            garageCharges = 2.00;
        }
        if (hoursparked > 3) {
            garageCharges = 2.0 + (hoursparked - 2) * 0.5;
        }
        if (hoursparked == 24) {
            garageCharges = 10.00;
        }
        return garageCharges;
    }
}

