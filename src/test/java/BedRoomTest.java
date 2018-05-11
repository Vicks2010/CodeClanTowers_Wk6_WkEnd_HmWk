import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedRoomTest {

    BedRoom bedRoom;

    @Before

    public void before(){

        bedRoom = new BedRoom(5, "Single", 8);
    }

    @Test

    public void hasRoomNo(){
        assertEquals(5, bedRoom.roomNo());
    }
}
