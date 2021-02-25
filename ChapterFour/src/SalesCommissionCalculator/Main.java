package SalesCommissionCalculator;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        SalesCommissionCalculator salesCommissionCalculator = new SalesCommissionCalculator();

        System.out.println("Enter the item Number for the item sold: ");
        int itemNumber=input.nextInt();
        while (itemNumber>0&&itemNumber<=4){
            System.out.printf("Enter number of times you sold item:%d%n",itemNumber);
            int numberOfTimesSold=input.nextInt();
            for(int counter=0;numberOfTimesSold>counter;counter++){
                salesCommissionCalculator.setItemNumber(itemNumber);
            }
            System.out.println("Enter the item Number for the item sold:");
            itemNumber=input.nextInt();
        }
        System.out.printf("The gross salary is %.2f",salesCommissionCalculator.getGrossSalary());


    }

}
