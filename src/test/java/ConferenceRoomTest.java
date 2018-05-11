import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest{

    ConferenceRoom conferenceRoom;

    @Before

    public void before(){

        conferenceRoom = new ConferenceRoom("ConferenceRm 1", 55, 37);
    }

    @Test
    public void hasName(){
        assertEquals("ConferenceRm 1", conferenceRoom.getName());
    }

    @Test
    public void hasDailyRate(){
        assertEquals(55, conferenceRoom.getDailyRate());
    }
}
