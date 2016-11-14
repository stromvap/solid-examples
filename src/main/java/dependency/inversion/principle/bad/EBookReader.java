package dependency.inversion.principle.bad;

public class EBookReader {
    private PdfBook pdfBook;

    public EBookReader(PdfBook pdfBook) {
        this.pdfBook = pdfBook;
    }

    public void read() {
        System.out.println(pdfBook.getContent());
    }
}
