import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest{

    ConferenceRoom conferenceRoom;

    @Before

    public void before(){

        conferenceRoom = new ConferenceRoom("ConferenceRm 1", 55);
    }

    @Test

    public void hasName(){
        assertEquals("ConferenceRm 1", conferenceRoom.getName());
    }
}
