public class Reader {
    private String firstName;
    private String lastName;
    private int cardNumber;
    private int borrowedCount;

    public Reader(String firstName, String lastName, int cardNumber, int borrowedCount) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cardNumber = cardNumber;
        this.borrowedCount = borrowedCount;
    }

    public void printData() {
        System.out.println(this.firstName + ", " + this.lastName + ", " + this.cardNumber + ", " + this.borrowedCount);
    }

    public void increaseBorrowedCount() {
        this.borrowedCount += 1;
    }

    public void decreaseBorrowedCount() {
        this.borrowedCount -= 1;
    }

}
