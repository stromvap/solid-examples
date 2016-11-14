package interfaace.segregation.principle.bad;

public class Driver {
    public void startAndDrive(Vehicle vehicle) {
        vehicle.startEngine();
        System.out.println("Driving...");
    }
}
