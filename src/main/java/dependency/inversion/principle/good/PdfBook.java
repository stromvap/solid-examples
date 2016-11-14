package dependency.inversion.principle.good;

public class PdfBook implements EBook {

    @Override
    public String getContent() {
        return "PDF e-book content";
    }
}
