public class Book {
        private String title;
        private String author;
        private int pageCount;
        private boolean available;

        public Book(String title, String author, int pageCount, boolean available) {
            this.title = title;
            this.author = author;
            this.pageCount = pageCount;
            this.available = available;
        }

        public void printInfo() {
            System.out.println(this.title + ", " + this.author + ", " + this.pageCount + ", " + this.available);
        }

        public void borrow() {
            if (this.available) {
                this.available = false;
                System.out.println("Book borrowed");
            } else {
                System.out.println("Not available");
            }

        }

        public void returnBook() {
            if (!this.available) {
                this.available = true;
                System.out.println("Book returned!");
            }

        }
    }
