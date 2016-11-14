package single.responsibility.principle.bad;

public class Book {
    public String getTitle() {
        return "A Great Book";
    }

    public String getAuthor() {
        return "John Doe";
    }

    public void turnPage() {
        // TODO: Turn page
    }

    public void printCurrentPagePlainText() {
        System.out.println("current page content");
    }

    public void printCurrentPageHtml() {
        System.out.println("<div style=\"single-page\">current page content</div>");
    }
}
