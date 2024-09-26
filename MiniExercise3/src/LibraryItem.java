public abstract class LibraryItem {

    private String bookTitle;
    private int bookCode;

    public LibraryItem(String bookTitle, int bookCode) {
        this.bookTitle = bookTitle;
        this.bookCode = bookCode;
    }

    public abstract void displayItems();
    public abstract void checkIfBookIsChecked();

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public int getBookCode() {
        return bookCode;
    }

    public void setBookCode(int bookCode) {
        this.bookCode = bookCode;
    }
}
