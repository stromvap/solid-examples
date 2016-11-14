package open.closed.principle.bad;

public class Customer {
    private int numberOfDrinksToPayFor = 0;
    private boolean happyHour = false;

    public void buyOneDrink() {
        numberOfDrinksToPayFor++;
    }

    public void setHappyHour(boolean happyHour) {
        this.happyHour = happyHour;
    }

    public void payBill() {
        if (happyHour) {
            System.out.println("Total due: " + numberOfDrinksToPayFor * 30);
        } else {
            System.out.println("Total due: " + numberOfDrinksToPayFor * 70);
        }

        numberOfDrinksToPayFor = 0;
    }
}
