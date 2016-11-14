package interfaace.segregation.principle.good;

public class Driver {
    public void startAndDrive(Drivable drivable) {
        drivable.startEngine();
        System.out.println("Driving...");
    }
}
