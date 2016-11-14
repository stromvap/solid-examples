package interfaace.segregation.principle.bad;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();

        Driver driver = new Driver();
        driver.startAndDrive(vehicle);

        Passenger passenger = new Passenger();
        passenger.chillAndPlayMusic(vehicle);
    }
}
