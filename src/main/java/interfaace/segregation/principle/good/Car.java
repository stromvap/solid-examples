package interfaace.segregation.principle.good;

public class Car implements Drivable, Playable {

    @Override
    public void startEngine() {
        System.out.println("Engine started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine stopped");
    }

    @Override
    public void startRadio() {
        System.out.println("Radio started");
    }

    @Override
    public void stopRadio() {
        System.out.println("Radio stopped");
    }
}
