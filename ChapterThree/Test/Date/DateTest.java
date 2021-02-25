package Date;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DateTest {
    Date dateClass;
    @BeforeEach
    void setUp() {
        dateClass = new Date(12,31,2021);
    }

    @AfterEach
    void tearDown() {
        dateClass = null;
    }

    @Test
    void CheckIfDateHasContainAMonthy(){
        assertEquals(12, dateClass.getmonth());
        dateClass.setMonth(12);
        assertEquals(12, dateClass.getmonth());
    }

    @Test
    void CheckIfDateContainADay(){
        dateClass.setDay(30);
        //date_class.scanner.nextInt();
        assertEquals(30, dateClass.getday());
    }

    @Test
    void CheckIfYearContainAYear(){
        dateClass.setYear(1992);
//        dateClass.scanner.nextInt();
        assertEquals(1992, dateClass.getyear());
    }



}