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
public class Driver {
    public void startAndDrive(Drivable drivable) {
        drivable.startEngine();
        System.out.println("Driving...");
    }
    
    public void openFrontDoor(Openable openable){
        openable.openDoorDriver();
        
    }
    
    public void closedDoors(Closedable closedable){
        closedable.closeDriverDoor();
        closedable.closeBackDoor();
    }
    
}
