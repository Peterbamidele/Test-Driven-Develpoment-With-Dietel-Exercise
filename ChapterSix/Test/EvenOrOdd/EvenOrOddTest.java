package EvenOrOdd;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenOrOddTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void CheckIfNumberIsEvenorOdd(){
        EvenOrOdd evenOrOdd = new EvenOrOdd();
        assertTrue(evenOrOdd.isEven(8));
        assertTrue(evenOrOdd.isEven(19));
        assertTrue(evenOrOdd.isEven(10));
        assertTrue(evenOrOdd.isEven(59));
    }
}