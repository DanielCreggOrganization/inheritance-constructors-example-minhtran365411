public class Bicycle {

	// the Bicycle class has three fields
	private int cadence;
	private int gear;
	private int speed;
	
	// Default constructor
    public Bicycle() {
        int cadence = 0;
	    int gear = 0;
        int speed = 0;
        System.out.println("I just created a bicycle!!!!");

    }

	// Parameterised constructor
   public Bicycle(int startCadence, int startGear, int startSpeed) {
		// Your code here
        cadence = startCadence;
        gear = startGear;
        speed = startSpeed;
    }
	
	// Getters and Setters here
    public int getCadence() { //this is getter
        return cadence;
    }

    public void setCadence(int cadence) { // this is setter
        this.cadence = cadence;
    }

     //Getter & Setter for Gear
    public int getGear() { //this is getter
        return gear;
    }

    public void setGear(int gear) { // this is setter
        this.gear = gear;
    }

    //Getter & Setter for Speed
    public int getSpeed() { //this is getter
        return speed;
    }

    public void setSpeed(int speed) { // this is setter
        this.speed = speed;
    }

	// Extra methods here
	public void applyBrake(int speedDecrement) {
        speed -= speedDecrement;
        if (speed < 0) {
            speed = 0;
        }
	}

	public void speedUp(int speedIncrement) {
        // Your code here
        speed += speedIncrement;
        if (speed > 60) {
            speed = 59;
        }
	}

}
