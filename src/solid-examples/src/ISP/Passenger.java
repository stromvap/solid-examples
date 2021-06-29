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
public class Passenger {
    public void chillAndPlayMusic(Playable playable) {
        playable.startRadio();
        System.out.println("Shake It Up!!");
    }
    
    public void openBackDoor(Openable openable){
        openable.openDoorBack();
    }
    
    public void openCloseDoor(Closedable closedable){
        closedable.closeBackDoor();
    }
}
