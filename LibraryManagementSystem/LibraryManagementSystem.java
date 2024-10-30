
import java.util.Scanner;

public class LibraryManagementSystem {

    public static void main(String[] args) {

        Library library = new Library();
        User user = new User("Robert Smith");

        Scanner input = new Scanner(System.in);
        int choice;

        // test cases
        library.addBook(new Book(111, "Volcano City", 1955, "Big Boy", "Sci-fi", false));
        library.addBook(new Book(222, "Rain Village", 2000, "Charles Charleson", "Horror", false));

        do {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add a Book");
            System.out.println("2. Display All Books");
            System.out.println("3. Borrow a Book");
            System.out.println("4. Return a Book");
            System.out.println("5. Display Borrowed Books");
            System.out.println("0. Exit\n");
            System.out.print("Enter choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter book ID: ");
                    int id = input.nextInt();
                    input.nextLine(); // Consume newline
                    System.out.print("Enter Title: ");
                    String title = input.nextLine();
                    System.out.print("Year of release: ");
                    int year = input.nextInt();
                    input.nextLine(); // Consume newline
                    System.out.print("Enter Author: ");
                    String author = input.nextLine();
                    System.out.print("Enter genre: ");
                    String genre = input.nextLine();
                    library.addBook(new Book(id, title, year, author, genre, false));
                    break;
                case 2:
                    library.displayBooks();
                    break;
                case 3:
                    System.out.print("Enter Book ID to Borrow: ");
                    int borrowId = input.nextInt();
                    user.borrowBook(library, borrowId);
                    break;
                case 4:
                    System.out.print("Enter Book ID to Return: ");
                    int returnId = input.nextInt();
                    user.returnBook(library, returnId);
                    break;
                case 5:
                    user.displayBorrowedBooks();
                    break;
                case 0:
                    System.out.println("Exiting the system.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        input.close();
    }

}
