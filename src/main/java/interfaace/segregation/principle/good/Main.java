package interfaace.segregation.principle.good;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        Driver driver = new Driver();
        driver.startAndDrive(car);

        Passenger passenger = new Passenger();
        passenger.chillAndPlayMusic(car);
    }
}
