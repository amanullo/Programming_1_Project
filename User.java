package LMS;

import java.util.ArrayList;
import java.util.List;

public class User {     //  declared as public, so it can be accessed from any other class, like Main class so it could create instances of User
    
    private String name;
    private List<Book> borrowedBooks;   // List of Book objects representing the books this user has borrowed.

    public User(String aName) { // constructor for the User class. It initializes a new User object with a specified name
        this.name = aName;      // Assigns the value of the aName parameter to the instance variable name of this User object.
        borrowedBooks = new ArrayList<>();  // Initializes borrowedBooks as an empty ArrayList to store any books that this user borrows.
    }

    public void borrowBook(Library library, int bookId) {   // // After creating the library object in the main, we pass it to the User class methods, like borrowBook and returnBook, whenever we want to interact with the library.
        Book book = library.borrowBook(bookId);     // Calls the borrowBook method on the library object to check if a book with the given bookId is available to borrow.
                                                    // The result is stored in book
        if (book != null) {             // If book is not null, the book is added to the borrowedBooks list.
            borrowedBooks.add(book);
        }
    } 

    public void returnBook(Library library, int bookId) {   
        for (Book book : borrowedBooks) {   // A for-each loop iterates over the borrowedBooks list to find the book with the specified bookId.
            if (book.getBookId() == bookId) {   // Checks if the ID of the current book matches the bookId.
                borrowedBooks.remove(book); // If it does, the book is removed  from the user's borrowedBooks list.
                library.returnBook(book);   // Calls the returnBook method on the library to return the book
                return;              // Exits the method immediately after the book is returned
            }
        }
        System.out.println("Book not found in borrowed books.");
    }

    public void displayBorrowedBooks() {        // add a method that displays all the books the user has borrowed.
        System.out.println(name + "'s Borrowed Books:");
        for (Book book : borrowedBooks) {
            System.out.println(book);           // By default, this calls the toString() method of the Book class,
        }
    }
}

