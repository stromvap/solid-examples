package single.responsibility.principle.bad;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        book.printCurrentPagePlainText();
        book.printCurrentPageHtml();
    }
}
