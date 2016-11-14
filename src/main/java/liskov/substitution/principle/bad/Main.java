package liskov.substitution.principle.bad;

public class Main {
    public static void main(String[] args) {
        new AreaVerifier().verifyArea(new Rectangle());
        new AreaVerifier().verifyArea(new Square());
    }
}
