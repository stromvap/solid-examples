package dependency.inversion.principle.good;

public class Main {
    public static void main(String[] args) {
        new EBookReader(new PdfBook()).read();
    }
}
