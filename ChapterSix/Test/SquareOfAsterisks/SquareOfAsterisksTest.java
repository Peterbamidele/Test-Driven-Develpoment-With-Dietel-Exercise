package SquareOfAsterisks;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareOfAsterisksTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void testForSquareOfAsterisks(){
        SquareOfAsterisks squareOfAsterisks = new SquareOfAsterisks();
        squareOfAsterisks.displaySquareOfAsterisks(5);
        assertEquals(5,squareOfAsterisks.getrowCounter());
        assertEquals(5,squareOfAsterisks.getcolumnCounter());
    }
}