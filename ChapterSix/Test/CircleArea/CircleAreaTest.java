package CircleArea;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleAreaTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void testForCircleArea(){
        CircleArea circleArea = new CircleArea();
        assertEquals(157.07963267948966,circleArea.CircleArea(5.0));
    }
}