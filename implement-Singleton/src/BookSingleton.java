public class BookSingleton {
    private final String author;
    private final String title;
    private static BookSingleton book;
    private static boolean isLoanedOut;

    private BookSingleton(){
        author = "Gamma, Helm, Johnson, and Visits";
        title  = "Design Patterns";
        book = null;
        isLoanedOut = false;
    }

    public static BookSingleton borrowBook() {
        if (!isLoanedOut) {
            if (book == null) {
                book = new BookSingleton();
            }
            isLoanedOut = true;
            return book;
        }
        return null;
    }

    public void returnBook(){
        isLoanedOut = false;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorAndTitle(){
        return getTitle() + " by " + getAuthor();
    }
}
