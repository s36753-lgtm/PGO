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
        boolean found = false;

        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equals(title)) {
                books[i].printInfo();

                found = true;

            }
        }

        if (!found) {
            System.out.print("The library doesn't have this book");
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

    public void printAllBooks() {
        for (int i = 0; i < bookCount; i++) {
            books[i].printInfo();
        }
    }


    public void borrowBook(String title, Reader reader) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equals(title)) {
                books[i].borrow();
                reader.increaseBorrowedCount();
            }
        }
    }

    public void returnedBook(String title, Reader reader) {
        for (int i =0; i < bookCount; i++) {
            if (books[i].getTitle().equals(title)) {
                books[i].returnBook();
                reader.decreaseBorrowedCount();
            }
        }
    }
}
