package open.closed.principle.good;

public class Customer {
    private int numberOfDrinksToPayFor = 0;
    private BillingStrategy billingStrategy;

    public void buyOneDrink() {
        numberOfDrinksToPayFor++;
    }

    public void setBillingStrategy(BillingStrategy billingStrategy) {
        this.billingStrategy = billingStrategy;
    }

    public void payBill() {
        System.out.println("Total due: " + billingStrategy.sum(numberOfDrinksToPayFor));
        numberOfDrinksToPayFor = 0;
    }
}
