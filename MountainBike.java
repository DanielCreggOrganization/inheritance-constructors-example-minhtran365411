
public class MountainBike extends Bicycle {

    // the MountainBike subclass adds one field

    private int seatHeight;

    // Default Constructor
    public MountainBike() {

    }

    // Paramiterised constructor using super keyword
    public MountainBike(int startCadence, int startGear, int startSpeed, int seatHeight) {
        super(startCadence, startGear, startSpeed);
        this.seatHeight = seatHeight;
        System.out.println("I just created a mountain bicycle!!!!");
    }

    // Paramiterised constructor
    public MountainBike(int startHeight) {
        seatHeight = startHeight;
    }

    
    // Getters and Setters
    public int getSeatHeight() {
        return seatHeight;
    }
    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }
}
