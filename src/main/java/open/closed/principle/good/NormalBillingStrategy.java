package open.closed.principle.good;

public class NormalBillingStrategy implements BillingStrategy {

    private static final int PRICE_PER_DRINK = 70;

    @Override
    public int sum(int numberOfDrinksToPayFor) {
        return numberOfDrinksToPayFor * PRICE_PER_DRINK;
    }
}
