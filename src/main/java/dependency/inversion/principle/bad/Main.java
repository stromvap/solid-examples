package dependency.inversion.principle.bad;

public class Main {
    public static void main(String[] args) {
        new EBookReader(new PdfBook()).read();
    }
}
