package DisplayingaSquareofAnyCharacter;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DisplayingaSquareofAnyCharacterTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void testDisplayingaSquareofAnyCharacter(){
        DisplayingaSquareofAnyCharacter displayingaSquareofAnyCharacter = new DisplayingaSquareofAnyCharacter();
        displayingaSquareofAnyCharacter.SquareOfCharacter(5, '&');
        assertEquals(5, displayingaSquareofAnyCharacter.getrowCounter());
        assertEquals(5,displayingaSquareofAnyCharacter.getcolunmCounter());
    }
}