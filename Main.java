public class Main {
    public static void main(String[] args) {
      Bicycle bikeObj1 = new Bicycle(5, 4, 18);
      System.out.println(bikeObj1.cadence);

      MountainBike mountainBikeObj1 = new MountainBike(5, 4, 18, 5);
      System.out.println(mountainBikeObj1.seatHeight);
      mountainBikeObj1.applyBrake(20);
      System.out.println("Mountain Bike speed after applying brake is: "+mountainBikeObj1.speed);
      bikeObj1.speedUp(100);
      System.out.println("Bike speed after applying brake is: "+bikeObj1.speed);
    }
}