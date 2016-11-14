package single.responsibility.principle.good;

public class HtmlPrinter implements Printer {

    @Override
    public void printPage(Book book) {
        System.out.println("<div style=\"single-page\">" + book.getCurrentPageContent() + "</div>");
    }
}
