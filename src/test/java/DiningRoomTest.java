import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningRoom;

    @Before

    public void before(){
        diningRoom = new DiningRoom(0, 50);
    }

    @Test

    public void hasNoCharge(){

        assertEquals(0, diningRoom.getDiningRoomCharge());
    }
}
