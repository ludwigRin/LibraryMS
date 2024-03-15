import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Library lib = new Library();
        Scanner in = new Scanner(System.in);
        boolean on = true;

        do {
            System.out.println("Library Management System Menu:");
            System.out.println("1. Add a book");
            System.out.println("2. Display books");
            System.out.println("3. Rent a book");
            System.out.println("4. Return a book");
            System.out.println("0. Exit");
            System.out.print("Please enter your choice: ");
            
            while (!in.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                in.next();
            }
            int choice = in.nextInt();
            in.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Please enter the Title: ");
                    String title = in.nextLine();
                    System.out.print("Please enter the Author: ");
                    String author = in.nextLine();
                    lib.addBook(new Book(title, author));
                    break;
                case 2:
                    lib.displayBooks();
                    break;
                case 3:
                    System.out.print("Enter the Title of the Book you want to rent: ");
                    String title1 = in.nextLine();
                    System.out.print("Enter the Author of the Book you want to rent: ");
                    String author1 = in.nextLine();
                    System.out.println("You rented " + title1 + " by " + author1);
                    lib.rentBook(title1, author1);
                    break;
                case 4:
                    System.out.print("Enter the Title of the Book you want to return: ");
                    String title2 = in.nextLine();
                    System.out.print("Enter the Author of the Book you want to return: ");
                    String author2 = in.nextLine();
                    System.out.println("You returned" + title2 + " by " + author2);
                    lib.returnBook(title2, author2);
                    break;
                case 0:
                    on = false;
            }
        } while (on);
        in.close();
    }
}