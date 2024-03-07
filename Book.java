class Book {
    String title;
    String author;
    boolean available;

    // constructor
    public Book(String title, String author, boolean available) {
        this.title = title;
        this.author = author;
        this.available = available;
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

    
}