package Rectangle;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {
    Rectangle rectangle ;

    @BeforeEach
    void setUp() {
        rectangle = new Rectangle();
    }

    @AfterEach
    void tearDown() {
        rectangle = null;
    }

    @Test
    void CheckifRectangleHasWidth(){
        rectangle.setwidth(3.5);
        assertEquals(3.5,rectangle.getrectangle());
    }

    @Test
    void CheckIfRectangleHasHeight(){
        rectangle.setheight(35.9);
        assertEquals(35.9,rectangle.getrectangle());
    }

    @Test
    void CheckIfRectangleHasArea(){

    }

}