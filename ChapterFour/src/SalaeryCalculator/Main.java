package SalaeryCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SalaryCalculator salaryCalculator = new SalaryCalculator(90.0,78.4,56.9,45.2,"peter",53.4);
        int counter = 0;

        while (counter < 3){
            System.out.print("Enter Employee Name:");
            salaryCalculator.setEmployee(input.next());

            System.out.print("Enter Hour Work:");
            salaryCalculator.setHourWorked(input.nextDouble());

            System.out.print("Enter HourlyRate:");
            salaryCalculator.setHourlyRate(input.nextDouble());

           if (salaryCalculator.getHourlyWorked() <= 40){
               double grosspay = salaryCalculator.getHourlyRate() * salaryCalculator.getHourlyWorked();
               salaryCalculator.setgrosspay(grosspay);
               System.out.printf("GrossPay for %s is %.2f: ",salaryCalculator.getEmployee(),salaryCalculator.getgrosspay());
           }
           else if (salaryCalculator.getHourlyWorked() > 40){
              int overtime = (int) (salaryCalculator.getHourlyWorked() - 40);
              double overtmePay = overtime * (salaryCalculator.getHourlyWorked() / 2) ;
               salaryCalculator.setOvertimePay(overtmePay);

               double PermanentPay = salaryCalculator.getHourlyRate() * 40;
               salaryCalculator.setPermanentPay(PermanentPay);

               double m = salaryCalculator.getPermanentPay() * salaryCalculator.getOvertimePay();
               salaryCalculator.setgrosspay(m);
               System.out.printf("GrossPay for %s is %.2f: ",salaryCalculator.getEmployee(),salaryCalculator.getgrosspay());
           }
           counter ++;
            System.out.println();
        }
    }
}
