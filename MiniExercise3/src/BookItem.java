import java.util.ArrayList;

public class BookItem extends LibraryItem  implements Book{

    boolean bookChecked;

    public BookItem(String bookTitle, int bookCode, boolean bookChecked) {
        super(bookTitle, bookCode);
        this.bookChecked = bookChecked;
    }

    @Override
    public void displayItems() {
        System.out.println(getBookTitle());
    }

    @Override
    public void checkIfBookIsChecked() {
        if(bookChecked){
            System.out.println("The book is checked");
        } else {
            System.out.println("The book is not checked");
        }
    }

    @Override
    public void displayBookInformation() {
        System.out.printf("Book Title: %s\nBook Code: %d\nChecked: %b\n", getBookTitle(), getBookCode(), bookChecked);
    }

    @Override
    public void checkBookAvailability() {
        if (bookChecked){
            System.out.println("The book will be available in 5 days");
        } else {
            System.out.println("The book is available");
        }
    }

}
