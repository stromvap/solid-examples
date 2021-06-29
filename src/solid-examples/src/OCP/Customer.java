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
public class Customer {
    private int numberOfDrinksToPayFor = 0;
    private Billing billing; // Cumpliendo DIP

    public void buyOneDrink() {
        numberOfDrinksToPayFor++;
    }

    public int getNumberOfDrinksToPayFor() {
        return numberOfDrinksToPayFor;
    }

    public void setNumberOfDrinksToPayFor(int numberOfDrinksToPayFor) {
        this.numberOfDrinksToPayFor = numberOfDrinksToPayFor;
    }

    public void setBilling(Billing billing) {
        this.billing = billing;
    }

    public Billing getBilling() {
        return billing;
    }
}


