package open.closed.principle.bad;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();

        customer.buyOneDrink();
        customer.buyOneDrink();
        customer.setHappyHour(false);
        customer.payBill();

        customer.buyOneDrink();
        customer.buyOneDrink();
        customer.setHappyHour(true);
        customer.payBill();
    }
}
