public class Main {
    


    public static void main(String[] args) {
        Library lib = new Library();
        Library lib2 = new Library();
        Book HP = new Book("HP", "JKR", true);


        lib.addBook(HP);

        System.out.println(lib.displayBooks());




    }
}
