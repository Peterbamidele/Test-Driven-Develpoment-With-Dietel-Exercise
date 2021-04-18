package SalaeryCalculator;
/***
 *
 * /***
 *  * 4.20 (Salary Calculator) Develop a Java application that determines the gross pay for each of
 *  * three employees. The company pays straight time for the first 40 hours worked by each employee
 *  * and time and a half for all hours worked in excess of 40. You’re given a list of the employees, their
 *  * number of hours worked last week and their hourly rates. Your program should input this informa-
 *  * tion for each employee, then determine and display the employee’s gross pay. Use class Scanner to
 *  * input the data.****/

public class SalaryCalculator {


    public double grosspay;
    private double HourWorked;
    private double HourlyRate;
    private double OverTimePay;
    private String Employee;
    private double PermanentPay;


    public SalaryCalculator(double grosspay, double hourWorked, double hourlyRate, double overTimePay, String employee, double permanentPay) {
        this.grosspay = grosspay;
        HourWorked = hourWorked;
        HourlyRate = hourlyRate;
        OverTimePay = overTimePay;
        Employee = employee;
        PermanentPay = permanentPay;
    }

    public void setHourWorked(double HourWorked) {
        this.HourWorked = HourWorked;
    }

    public void setHourlyRate(double HourlyRate) {
        this.HourlyRate = HourlyRate;
    }

    public void setgrosspay(double grosspay) {
        grosspay = PermanentPay * OverTimePay;
        this.grosspay = grosspay;
    }


    public void setOvertimePay(double OverTimePay) {
        double Overtime = HourWorked - 40;
        OverTimePay = Overtime * (HourlyRate / 2);
        this.OverTimePay = OverTimePay;
    }

    public void setEmployee(String Employee) {
        this.Employee = Employee;
    }

    public void setPermanentPay(double PermanentPay) {
         PermanentPay = HourlyRate * 40;
        this.PermanentPay = PermanentPay;
    }

    public double getHourlyWorked() {
        return HourWorked;

    }

    public double getHourlyRate() {
        return HourlyRate;
    }

    public String getEmployee() {
        return Employee;
    }

    public double getgrosspay() {
        return grosspay;
    }

    public  double getOvertimePay() {
        return OverTimePay;
    }

    public double getPermanentPay() {
        return PermanentPay;
    }
}

