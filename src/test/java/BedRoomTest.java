import org.junit.Before;
import org.junit.Test;

import static javafx.scene.control.SelectionMode.SINGLE;
import static org.junit.Assert.assertEquals;

public class BedRoomTest {

    BedRoom bedRoom;

    @Before

    public void before(){

        bedRoom = new BedRoom(5, BedRoomType.SINGLE, 18.00);
    }

    @Test

    public void hasRoomNo(){
        assertEquals(5, bedRoom.getRoomNo());
    }

    @Test
    public void hasBedRoomType(){
        assertEquals(SINGLE, bedRoom.getBedRoomType());
    }

    @Test
    public void hasNightlyRate(){
        assertEquals(18.00, bedRoom.getNightlyRate());

    }
}
