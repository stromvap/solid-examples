/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ISP;

/**
 *
 * @author dante
 */
public class Car implements Drivable, Playable, Openable, Closedable{
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

    @Override
    public void openDoorDriver() {
        System.out.println("\"Opening Front Door\"");
    }

    @Override
    public void openDoorBack() {
        System.out.println("Opening Back Door");
    }

    @Override
    public void closeDriverDoor() {
        System.out.println("Closed Door");
    }

    @Override
    public void closeBackDoor() {
        System.out.println("Closed BackDoor");
    }
}
