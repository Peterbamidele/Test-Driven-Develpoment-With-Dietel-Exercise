package CountingLetter;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CountingLetterTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void CheckForCountLetter() {
        java.lang.String words = "Hello There";
        String[] word = words.split("\\s");
        for (String H : word){
            System.out.println(H);
        }

    }
}