package EmployeeClass;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EmployeeClassTest {

    EmployeeClass employeeClass;
    @BeforeEach
    void setUp() {
         employeeClass = new EmployeeClass("peter","tobi",75000.00);
    }

    @AfterEach
    void tearDown() {
        employeeClass  = null;
    }

    @Test
    void ToTestIfEmployeeHasAFirstName(){
        employeeClass.setfirstName("firstName");
        assertEquals("firstName",employeeClass.getfirstName());
    }

    @Test
    void ToTestIfEmployeeHasALastName(){
        employeeClass.setlastName("lastName");
        assertEquals("lastName",employeeClass.getlastName());
    }

    @Test
    void ToTestIfEmployeeHasAMonthSalary(){
        employeeClass.setmonthlySalary(75000.00);
        assertEquals(75000.00,employeeClass.getmonthlySalary());
    }
    @Test
    void CheckIfEmployeeSalaryCanBeAddedWith10Percent(){
        employeeClass.setmonthlySalary(75000.00);
        employeeClass.IncreasinglySalaryByTenPercent();
        assertEquals(82500,employeeClass.getmonthlySalary());


   }

}