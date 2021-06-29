/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OCP;

/**
 *
 * @author dante
 */
public class HappyHourBilling implements Billing {
    
    static int valueforDrinks = 30;
    

    @Override
    public int total(int numDrinks) {
        return numDrinks * valueforDrinks;
    }
    
}
