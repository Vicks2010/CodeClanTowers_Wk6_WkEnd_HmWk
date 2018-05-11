public class BedRoom extends Room{

    private BedRoomType bedRoomType;

    private int roomNo;
//    private String bedRoomType;
    private double nightlyRate;

    public BedRoom (int roomNo, BedRoomType bedRoomType, double nightlyRate, int capacity){

        super(capacity);
        this.roomNo = roomNo;
        this.bedRoomType = bedRoomType;
        this.nightlyRate = nightlyRate;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public BedRoomType getBedRoomType(){
        return bedRoomType;
    }

    public double getNightlyRate() {
        return nightlyRate;
    }
}
