package single.responsibility.principle.good;

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

    public String getCurrentPageContent() {
        return "current page content";
    }
}
