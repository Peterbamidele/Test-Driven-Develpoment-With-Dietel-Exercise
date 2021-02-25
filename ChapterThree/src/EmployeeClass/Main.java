package EmployeeClass;

public class Main {
    public static void main(String[] args) {
        EmployeeClass employeeClass = new EmployeeClass("Peter", "Bamidele", 700000 * 0.1);

        System.out.println("EmployeeClass");
        System.out.println("FirstName: " + employeeClass.getfirstName());
        System.out.println("LastName: " + employeeClass.getlastName());
        System.out.println("MonthlySalary: " + employeeClass.getmonthlySalary()*0.1);
    }

}

