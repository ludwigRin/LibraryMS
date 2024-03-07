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
    public ArrayList<Book> displayBooks() {
        return books;
    }

    public void rentBook(Book book) {
        if (book.getAvailability()) {
            book.setAvailability(false);
        }
    }
    public void returnBook(Book book) {
        book.setAvailability(true);
    }
}