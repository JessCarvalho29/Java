public class Runner {
    public static void main(String[] args) {

        var book1 = new BookItem("Harry Potter", 1234, true);
        var book2 = new BookItem("Lord of the Rings", 1235, false);

        book1.displayItems();
        book1.displayBookInformation();
        book1.checkBookAvailability();
        book1.checkIfBookIsChecked();

        book2.displayItems();
        book2.displayBookInformation();
        book2.checkBookAvailability();
        book2.checkIfBookIsChecked();
    }
}
