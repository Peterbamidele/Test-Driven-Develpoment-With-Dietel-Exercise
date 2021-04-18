package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InterestTest {
    Interest interest;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        interest = new Interest();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        interest = null;
    }

    @Test
    void checkInterestHasAmount(){
        interest.setamount(200.0);
        assertEquals(9.765625000000006,interest.getamount());
    }
    @Test
    void checkInterestHasPrincipal(){
        interest.setprincipal(100.00);
    }

    @Test
    void checkInterestHasRate(){
        interest.setrate(100.00);
    }
}