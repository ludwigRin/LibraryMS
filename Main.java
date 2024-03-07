public class Main {
    


    public static void main(String[] args) {
        Library lib = new Library();
        Library lib2 = new Library();
        Book HP = new Book("HP", "JKR", true);
        Book HP2 = new Book("HP2", "JKR", true);

        lib.addBook(HP);
        System.out.println(HP.getAvailability());
        lib.rentBook(HP);
        System.out.println(HP.getAvailability());
        System.out.println(lib.displayBooks());




    }
}
