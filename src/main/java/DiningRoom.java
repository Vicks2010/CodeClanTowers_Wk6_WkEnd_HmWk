public class DiningRoom extends Room{
    int diningRoomCharge;

    public DiningRoom(int diningRoomCharge, int capacity){
        super(capacity);
        this.diningRoomCharge = diningRoomCharge;
    }

    public int getDiningRoomCharge() {
        return diningRoomCharge;
    }
}
