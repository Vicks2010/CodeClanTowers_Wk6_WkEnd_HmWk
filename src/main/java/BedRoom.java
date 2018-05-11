public class BedRoom extends Room{

    private BedroomType bedroomType;

    private int roomNo;
    private String bedRoomType;
    private double nightlyRate;

    public BedRoom (int roomNo, String bedRoomType, double nightlyRate){

        this.roomNo = roomNo;
        this.bedRoomType = bedRoomType;
        this.nightlyRate = nightlyRate;
    }

    public int getRoomNo() {
        return roomNo;
    }
}
