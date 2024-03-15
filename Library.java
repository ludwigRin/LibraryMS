import java.util.ArrayList;

public class Library {
    ArrayList<Book> books;

    // constructor
    public Library() {
        this.books = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        book.setLibrary(this);
        this.books.add(book);
        book.setAvailability(true);
    }

    public void displayBooks() {
        for (Book i : books) {
            if (i.getAvailability()) {
                System.out.println(i.getTitle() + " by " + i.getAuthor() + " - available");
            } else {
                System.out.println(i.getTitle() + " by " + i.getAuthor() + " - currently not available");
            }
        }
    }

    public void rentBook(String title, String author) {
        for (Book book : books) {
            if (book.getTitle().equals(title) && book.getAuthor().equals(author)) {
                if (book.getAvailability()) {
                    book.setAvailability(false);
                    System.out.println("You've rented " + title + " by " + author);
                }
            }
        }
    }

    public void returnBook(String title, String author) {
        for (Book book : books) {
            if (book.getTitle().equals(title) && book.getAuthor().equals(author)) {
                if (!book.getAvailability()) {
                    book.setAvailability(true);
                    System.out.println("You've returned " + title + " by " + author);
                }
            }
        }
    }
}