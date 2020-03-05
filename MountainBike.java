
public class MountainBike extends Bicycle {
    
    // the MountainBike subclass adds one field
    public int seatHeight;

    // Default Constructor
    public MountainBike(int startCadence, int startGear, int startSpeed, int seatHeight) {
        super(startCadence, startGear, startSpeed);
        this.seatHeight = seatHeight;
        System.out.println("I just created a mountain bicycle!!!!");
    }
    // Paramiterised constructor
//    public MountainBike(int startHeight) {
//    	seatHeight = startHeight;
//    }  
    
    // Paramiterised constructor using super keyword 
        
    // Getters and Setters
}
