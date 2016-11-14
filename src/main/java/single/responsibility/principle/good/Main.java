package single.responsibility.principle.good;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        new PlainTextPrinter().printPage(book);
        new HtmlPrinter().printPage(book);
    }
}
