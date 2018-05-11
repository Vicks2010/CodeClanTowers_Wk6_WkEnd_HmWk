public class ConferenceRoom extends Room{

    String name;
    int dailyRate;

    public ConferenceRoom(String name, int dailyRate, int capacity){

        super(capacity);
        this.name = name;
        this.dailyRate = dailyRate;
//        dailyRate = 55;
    }

    public String getName() {
        return name;
    }

    public int getDailyRate(){
        return dailyRate;
    }
}
