import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    private ArrayList<Integer> guests;

//    public Room() {
//        this.capacity  = 0;
//    }

    public Room(int capacity){

        this.capacity = capacity;
        this.guests = new ArrayList<>();
    }

    public int getCapacity(){

        return this.capacity;
    }

    public int getGuest(){
        return this.guests.size();
    }

}
