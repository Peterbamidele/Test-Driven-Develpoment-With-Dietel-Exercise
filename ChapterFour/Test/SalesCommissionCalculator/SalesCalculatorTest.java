package SalesCommissionCalculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalesCalculatorTest {

    SalesCommissionCalculator salesCommissionCalculator;

    @BeforeEach
    void setUp() {
        salesCommissionCalculator = new SalesCommissionCalculator();
    }

    @AfterEach
    void tearDown() {
        salesCommissionCalculator = null;
    }

    @Test
    void CheckIfSalesCommissionCalculatorHasProduct() {
        salesCommissionCalculator.setItemNumber(1);
        assertEquals(1, salesCommissionCalculator.getItemNumber());
        salesCommissionCalculator.setItemNumber(2);
        assertEquals(2, salesCommissionCalculator.getItemNumber());
    }

    @Test
    void testThatEachItemHasAPrice() {
        salesCommissionCalculator.setItemNumber(1);
        assertEquals(239.99, salesCommissionCalculator.getItemPrice());
        salesCommissionCalculator.setItemNumber(2);
        assertEquals(129.75, salesCommissionCalculator.getItemPrice());
        salesCommissionCalculator.setItemNumber(3);
        assertEquals(99.95, salesCommissionCalculator.getItemPrice());
        salesCommissionCalculator.setItemNumber(4);
        assertEquals(350.89, salesCommissionCalculator.getItemPrice());
    }

    @Test
    void testThatWeHaveTotalSales() {
        salesCommissionCalculator.setItemNumber(1);
        salesCommissionCalculator.setItemNumber(1);
        salesCommissionCalculator.setItemNumber(1);
        salesCommissionCalculator.setItemNumber(1);
        assertEquals(959.96, salesCommissionCalculator.getGrossSales());
    }

    @Test
    void testForWeeklySalaryForItemsSold() {
        salesCommissionCalculator.setItemNumber(1);
        salesCommissionCalculator.setItemNumber(1);
        salesCommissionCalculator.setItemNumber(1);
        salesCommissionCalculator.setItemNumber(1);
        assertEquals(286.39639999999997, salesCommissionCalculator.getGrossSalary());
    }

    @Test
    void testForWeeklySalaryForNoItemsSold() {
        assertEquals(200, salesCommissionCalculator.getGrossSalary());
    }
}

