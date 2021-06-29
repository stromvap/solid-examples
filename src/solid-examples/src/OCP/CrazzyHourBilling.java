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
public class CrazzyHourBilling implements Billing {
    static int valueforDrinks = 10;
    
    @Override
    public int total(int numDrinks) {
        return numDrinks * valueforDrinks;
    }
}
