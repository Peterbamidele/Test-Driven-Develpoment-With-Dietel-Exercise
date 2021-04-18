package ExerciseWithOutTTD.ParkingCharge;

public class ParkingCharges2 {
    /*****
     * (Parking Charges) A parking garage charges a $2.00 minimum fee to park for up to three
     * hours. The garage charges an additional $0.50 per hour for each hour or part thereof in excess of three
     * hours. The maximum charge for any given 24-hour period is $10.00. Assume that no car parks for
     * longer than 24 hours at a time. Write an application that calculates and displays the parking charges
     * for each customer who parked in the garage yesterday. You should enter the hours parked for each
     * customer. The program should display the charge for the current customer and should calculate and
     * display the running total of yesterday’s receipts. It should use the method calculateCharges to de-
     * termine the charge for each customer.*****/
    private double totalReceipt = 0.0;
    private double currentCustomerCharge;
    private static double Minimum_Parking_Fee = 2.00;
    private static double Addition_Charges = 0.50;
    private static int Base_Hours = 3;
    private static double Maximum_Charges = 10.00;

    public void calculateCharges(int parkingHours){

        int excessHours = parkingHours - Base_Hours;
        double excessHourCharge = excessHours * Addition_Charges;
        double parkingCharge =Minimum_Parking_Fee + excessHourCharge;

        currentCustomerCharge =Math.min(parkingCharge,Maximum_Charges);
        totalReceipt +=currentCustomerCharge;
    }
    public double getCurrentCustomerCharge(){
        return currentCustomerCharge;
    }
    public  double getTotalReceipts(){
        return totalReceipt;
    }

}
