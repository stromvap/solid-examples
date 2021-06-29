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
public class CalculatePayingCustomer {
    
    public void payBill(Customer customer) {
        System.out.println("Total: " + customer.getBilling().total(customer.getNumberOfDrinksToPayFor()));
        customer.setNumberOfDrinksToPayFor(0);
    }
    
}
