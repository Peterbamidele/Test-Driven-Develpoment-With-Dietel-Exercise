package GasMileage;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GasMileageTest {
    GasMileage gasMileage;

    @BeforeEach
    void setUp() {
        gasMileage = new GasMileage(400, 6, 780, 16, 0, 0);
    }

    @AfterEach
    void tearDown() {
        gasMileage = null;
    }

    @Test
    void CheckIfDriverCanHaveMilesForOneTankful() {
        gasMileage.setMiles(0);
        assertEquals(0, gasMileage.getMiles());
    }

    @Test
    void CheckIfDriverCanHaveGallonForOneTankful() {
        gasMileage.setGallon(0);
        assertEquals(0, gasMileage.getGallon());
    }

    @Test
    void CheckHowManyMileDriverCanCompleteInATrip() {
        gasMileage.settotalMiles(0);
        assertEquals(0, gasMileage.gettotalMiles());
    }

    @Test
    void CheckHowManyGallonDriverCanCompleteInATrip() {
        gasMileage.settotalGallon(0);
        assertEquals(0, gasMileage.totalGallon());
    }

    @Test
    void CheckHowManyMilePerGallonforATankful() {
        gasMileage.setmilesPerGallon(00.0);
        assertEquals(00.0, gasMileage.getMilesPerGallon());
    }

    @Test
    void CheckHowTotalMilePerGallonforATrip() {
        gasMileage.settotalMilesPerGallon(00.0);
        assertEquals(00.0, gasMileage.gettotalMilesPerGallon());
    }
}
