package EmployeeClass;

public class EmployeeClass {

    private String firstName;
    private String lastName;
    private double monthlySalary;


    EmployeeClass(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;

    }

    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getfirstName() {
        return firstName;
    }

    public void setlastName(String lastName) {
        this.lastName = lastName;
    }

    public String getlastName() {
        return lastName;
    }

    public void setmonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public double getmonthlySalary() {
        return monthlySalary;
    }

    public void IncreasinglySalaryByTenPercent() {
        double PERCENT = 0.1;
        double Salary = monthlySalary * PERCENT;
        monthlySalary = Salary + monthlySalary;

    }
}

