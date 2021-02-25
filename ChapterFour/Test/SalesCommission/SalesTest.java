package SalesCommission;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalesTest {
    Sales salesCommission;
    @BeforeEach
    void setUp() {
        double basePay = 200;
        salesCommission = new Sales();

    }

    @AfterEach
    void tearDown() {
        salesCommission = null;
    }



    @Test
    void employeeHasBasePay(){
        assertEquals(200.0, salesCommission.getBasePay());
    }


    @Test
    void testCompanyHasAListOfItemsWithPriceTag(){
        assertEquals(239.99, salesCommission.getValueOfItem1());
        assertEquals(129.75, salesCommission.getValueOfItem2());
        assertEquals(99.95, salesCommission.getValueOfItem3());
        assertEquals(350.89, salesCommission.getValueOfItem4());
    }

    @Test
    void methodThatPromptUserForQuantityOfItem(){

        salesCommission.setQuantityOfItem1();
        assertEquals(2,salesCommission.getQuantityOfItem1());

    }


    @Test
    void testMethodThatCanCalculateTheTotalValueOfItemSold(){
        salesCommission.calcTotalNumberOfItemsSold();
        assertEquals(1390.2199999999998,salesCommission.getTotalSales());
    }


    @Test
    void testMethodThatCalculatesGrossPay(){

        salesCommission.calcGrossPay();
        assertEquals(325.1198, salesCommission.getGrossPay());
    }


}