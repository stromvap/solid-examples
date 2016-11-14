package interfaace.segregation.principle.bad;

public class Car implements Vehicle {

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
