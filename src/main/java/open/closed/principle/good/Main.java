package open.closed.principle.good;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();

        // Regular day
        customer.buyOneDrink();
        customer.buyOneDrink();
        customer.setBillingStrategy(new NormalBillingStrategy());
        customer.payBill();

        // Happy hour day
        customer.buyOneDrink();
        customer.buyOneDrink();
        customer.setBillingStrategy(new HappyHourBillingStrategy());
        customer.payBill();
    }
}
