import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Foundation", "I. Asimov", 798, true);
        Book book2 = new Book("Le dereglement du monde", "A. Maalouf", 289, true);
        Book book3 = new Book("The Memory Police", "Y. Ogawa", 288, true);

        Reader reader1 = new Reader("Kuba", "Nguyen", 123, 0);
        Reader reader2 = new Reader("Salaman", "Aminu", 124, 0);

        int capacity = 3;
        Library books = new Library(capacity);

        books.addBook(book1);
        books.addBook(book2);
        books.addBook(book3);

        books.printAvailableBooks();

        System.out.println("Search for a book by title: ");
        Scanner sc = new Scanner(System.in);
        String book = sc.nextLine();
        books.findBookByTitle(book);
        System.out.println();

        System.out.println("Type in the title of the book you want to borrow: ");
        Scanner brow = new Scanner(System.in);
        String borrow = brow.nextLine();
        books.borrowBook(borrow, reader1);

        books.printAllBooks();

        System.out.println("Type in the title of the book you want to return: ");
        Scanner ret = new Scanner(System.in);
        String returned = ret.nextLine();
        books.returnedBook(returned, reader1);

        reader1.printData();
    }
}



