public class ConferenceRoom extends Room{

    String name;
    int dailyRate;

    public ConferenceRoom(String name, int dailyRate){

        this.name = name;
        this.dailyRate = dailyRate;
    }

    public String getName() {
        return name;
    }
}
