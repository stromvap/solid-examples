package liskov.substitution.principle.bad;

public class AreaVerifier {
    public void verifyArea(Rectangle rectangle) {
        rectangle.setWidth(4);
        rectangle.setHeight(5);

        if(rectangle.calculateArea() != 20) {
            System.out.println("Bad Area!");
        } else {
            System.out.println("Good Area!");
        }
    }
}
