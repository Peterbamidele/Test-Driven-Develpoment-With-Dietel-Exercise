package Swap;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwapNumberTest {
    SwapNumber swapNumber;
    private Object SeconValue;

    @BeforeEach
    void setUp() {
        swapNumber = new SwapNumber();
    }

    @AfterEach
    void tearDown() {
        swapNumber = null;
    }

    @Test
    void CheckFirstVariableIsInteger(){
        int firstValue = 0;
        swapNumber.setfirstValue(firstValue);
        int SecondValue = 0;
        swapNumber.setSecondValue(SecondValue);
    }

    @Test
    void CheckIfNumberCanbeSwap(){
        int n1 = 0;
        int n2 = 0;
        swapNumber.Swap(n1,n2);
        int temp = n1;
        n1 = n2;
        n2 = temp;


    }
}