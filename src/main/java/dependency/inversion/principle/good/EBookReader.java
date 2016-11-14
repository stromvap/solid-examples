package dependency.inversion.principle.good;

public class EBookReader {
    private EBook eBook;

    public EBookReader(EBook eBook) {
        this.eBook = eBook;
    }

    public void read() {
        System.out.println(eBook.getContent());
    }
}
