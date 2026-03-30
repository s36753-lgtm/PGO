public class Library {
    private Book[] books;
    private int bookCount;

    public Library(int capacity) {
        this.books = new Book[capacity];
        this.bookCount = 0;
    }

    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;
        }
    }

    public void findBookByTitle(String title) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equals(title)) {
                books[i].printInfo();
            }
        }
    }

    public int countAvailableBooks() {
        int count = 0;

        for (int i = 0; i < bookCount; i++) {
            if (books[i].getAvailable()) {
                count++;
            }
        }
        return count;
    }

    public void printAvailableBooks() {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getAvailable()) {
                books[i].printInfo();
            }
        }
    }
}
