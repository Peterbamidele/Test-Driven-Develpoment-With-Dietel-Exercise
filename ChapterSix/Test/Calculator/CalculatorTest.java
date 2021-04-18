package Calculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @AfterEach
    void tearDown() {
        calculator = null;
    }

    @Test
    void CheckIfCalulatorCanTakeFirstVarable() {
        calculator.setFirstValue(50);

    }

    @Test
    void CheckIfCalulatorCanTakeSecondVarable() {
        calculator.setsecondValue(30);
    }

    @Test
    void CheckIfCalulatorCanAddPerformOperations() {
        calculator.setFirstValue(50);
        calculator.setsecondValue(30);
        assertEquals(80,calculator.getadditions());
        assertEquals(20,calculator.getSubtraction());
        assertEquals(1500,calculator.getMutiplication());
        assertEquals(1.0,calculator.getDivision());
    }
    @Test
    void CheckIfCalulatorCanHavePercentage(){
        calculator.setFirstValue(50);
        assertEquals(0.0,calculator.getpercentage());
    }
}