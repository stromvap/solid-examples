package interfaace.segregation.principle.bad;

public class Passenger {
    public void chillAndPlayMusic(Vehicle vehicle) {
        vehicle.stopEngine();
        System.out.println("CRASH!");
    }
}
