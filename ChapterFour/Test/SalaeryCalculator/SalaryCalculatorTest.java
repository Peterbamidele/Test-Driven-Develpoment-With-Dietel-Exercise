package SalaeryCalculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryCalculatorTest {

    SalaryCalculator  salaryCalculator;

    @BeforeEach
    void setUp() {
        salaryCalculator = new SalaryCalculator(67.0,56.8,40.0,40.0,"PETER",67.9);
    }

    @AfterEach
    void tearDown() {
        salaryCalculator = null;
    }

    @Test
    void TestForhourEmployerWorked(){
        salaryCalculator.setHourWorked(40.0);
    }
    @Test
    void TestForEmployerHourlyRate(){
        salaryCalculator.setHourlyRate(40.0);
    }

    @Test
    void TestForEmployergrosspay(){
        salaryCalculator.setgrosspay(10.0);
    }
    @Test
    void TestForEmployergetgrosspay(){
        salaryCalculator.setOvertimePay(10.0);
        salaryCalculator.setPermanentPay(10.0);
        assertEquals(0.0,salaryCalculator.getgrosspay());
    }

    @Test
    void TestForEmployerOverTimePay(){
        salaryCalculator.setOvertimePay(10.0);
    }

    @Test
    void CheckIfsalaryCalculatorHasEmployee(){
        salaryCalculator.setEmployee("employee");
    }

    @Test
    void CheckIfsalaryCalculatorHasPermanentPay(){
        salaryCalculator.setPermanentPay(10.0);
    }
    @Test
    void CheckIfsalaryCalculatorHasGetPermanentPay(){
        salaryCalculator.setHourlyRate(40.0);
        assertEquals(0.0,salaryCalculator.getPermanentPay());
    }

    @Test
    void CheckfoRALLGettersInSalaryCalculator(){
        assertEquals(40.0,salaryCalculator.getHourlyWorked());
        assertEquals(40.0,salaryCalculator.getHourlyRate());

    }
}
