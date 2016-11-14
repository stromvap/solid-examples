package single.responsibility.principle.good;

public class PlainTextPrinter implements Printer {

    @Override
    public void printPage(Book book) {
        System.out.println(book.getCurrentPageContent());
    }
}
