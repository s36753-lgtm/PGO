public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Foundation", "I. Asimov", 798, true);
        Book book2 = new Book("Le dereglement du monde", "A. Maalouf", 289, true);
        Book book3 = new Book("The Memory Police", "Y. Ogawa", 288, true);
        book1.printInfo();
        book1.borrow();
        book1.returnBook();

        Reader reader1 = new Reader("Kuba", "Nguyen", 123, 2);
        Reader reader2 = new Reader("Salaman", "Aminu", 124, 1);
        reader1.printData();
        reader1.decreaseBorrowedCount();
        reader1.increaseBorrowedCount();

        int capacity = 3;
        Library books = new Library(capacity);

        books.addBook(book1);
        books.addBook(book2);
        books.addBook(book3);

        books.findBookByTitle("The Memory Police");
        System.out.println(books.countAvailableBooks());
        books.printAvailableBooks();
    }
}

