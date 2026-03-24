public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Foundation", "I. Asimov", 798, true);
        new Book("Le dereglement du monde", "A. Maalouf", 289, true);
        new Book("The Memory Police", "Y. Ogawa", 288, true);
        book1.printInfo();
        book1.borrow();
        book1.returnBook();
    }
}

