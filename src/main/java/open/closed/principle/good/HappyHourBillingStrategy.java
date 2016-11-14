package open.closed.principle.good;

public class HappyHourBillingStrategy implements BillingStrategy {

    private static final int PRICE_PER_DRINK = 30;

    @Override
    public int sum(int numberOfDrinksToPayFor) {
        return numberOfDrinksToPayFor * PRICE_PER_DRINK;
    }
}
