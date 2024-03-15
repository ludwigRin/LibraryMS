class Book {
    String title;
    String author;
    boolean available;
    Library library;

    // constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // setter
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAvailability(boolean available) {
        this.available = available;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    // getter
    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public boolean getAvailability() {
        return this.available;
    }

    public Library getLibrary() {
        return this.library;
    }
}