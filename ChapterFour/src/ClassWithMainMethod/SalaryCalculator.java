package ClassWithMainMethod;

import java.util.Scanner;

/***
 * 4.20 (Salary Calculator) Develop a Java application that determines the gross pay for each of
 * three employees. The company pays straight time for the first 40 hours worked by each employee
 * and time and a half for all hours worked in excess of 40. You’re given a list of the employees, their
 * number of hours worked last week and their hourly rates. Your program should input this informa-
 * tion for each employee, then determine and display the employee’s gross pay. Use class Scanner to
 * input the data.****/

public class SalaryCalculator {
    public static void main(String[] args) {
        double GrossPay;
        double hours;
        double hourlyRate;
        int Employee = 1;

        Scanner input = new Scanner(System.in);

        while ( Employee <= 3){
            System.out.print("Enter Hourly Rate");
            hourlyRate = input.nextDouble();

            System.out.print("Enter Hours Worked");
            hours = input.nextDouble();

            if (hours > 40)
                GrossPay = (40.0 * hourlyRate) + (hours - 40) * (hourlyRate * 1.5);
                else
                    GrossPay = hours * hourlyRate;
            System.out.printf("Pay for Employee %d is #%.2f\n", Employee, GrossPay);

            Employee++;


        }


    }
}
