import java.util.ArrayList;

public class Library {
    ArrayList<Book> books;
    
    // constructor
    public Library() {
        this.books = new ArrayList<Book>();
    }
    

    public void addBook(Book book) {
        if (book.getAvailability()) {
            book.setLibrary(this);
        }
        this.books.add(book);
        book.setAvailability(false);
    }
    public ArrayList<Book> displayBooks() {
        return books;
    }



}

