package ClassWithMainMethod;

import java.util.IllegalFormatCodePointException;
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
        Scanner input = new Scanner(System.in);
        double hourlyRate;
        int hourworked;
        double PermanentPay = 0;
        double grossPay = 0;
        String employee;
        int counter = 1;

        while (counter < 4) {
            System.out.print("Enter Employee Name:");
            employee = input.nextLine();

            System.out.print("Enter HourWorked:");
            hourworked = input.nextInt();

            System.out.print("Enter HourlyWorked:");
            hourlyRate = input.nextDouble();

            if (hourworked <= 40) {
                grossPay = hourlyRate * hourworked;
                System.out.printf("Gross Pay of %s is :%.2f %n", employee, grossPay);
            }
            else if  (hourworked > 40) {
                int Overtime = hourworked - 40;
                double OverTimePay = Overtime * (hourlyRate / 2);
                PermanentPay = hourlyRate * 40;
                grossPay = PermanentPay + OverTimePay;
                System.out.printf("Gross Pay of %s is: %.2f %n", employee, grossPay);
            }
            counter++;
            System.out.println();

        }

        }
    }



