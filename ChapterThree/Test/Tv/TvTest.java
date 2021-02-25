package Tv;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TvTest {
    Tv tv;
    @BeforeEach
    void setUp() {
        tv = new Tv();
    }

    @AfterEach
    void tearDown() {
        tv = null;
    }

    @Test
    void CheckTvCanTurnON(){
        tv.turnOn();
        assertTrue(tv.isOn());
    }

    @Test
    void CheckTvCanTurnOFF(){
        tv.turnOff();
       // assertFalse(tv.isOff());
     //  assertEquals(assertFalse(false),tv.getTurnOff());
    }

    @Test
    void CheckTvCanChannel(){
        tv.setChannel(100);
        assertEquals(100,tv.getChannel());
    }

    @Test
    void CheckTvCanChangeChannelUp(){
        tv.setchannelUp(100);
        assertEquals(100,tv.getchannelup());
    }

    @Test
    void CheckTvCanChangeChannelDown (){
        tv.setchannelDown(1);
        assertEquals(1,tv.getchannelDown());
    }

    @Test
    void CheckTvCanChangeVolumeLevel (){
        tv.setvolumelevel(70);
        assertEquals(70,tv.getvolumelevel());
    }

    @Test
    void CheckTvCanChangeVolumeLevelup (){
        tv.setvolumelevelup(70);
        assertEquals(70,tv.getvolumelevelup());
    }

    @Test
    void CheckTvCanChangeVolumeLevelDown (){
        tv.setvolumelevelDown(70);
        assertEquals(70,tv.getvolumelevelDown());
    }



}