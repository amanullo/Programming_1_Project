

import java.util.ArrayList;
import java.util.List;

public class User {     
    
    private String name;
    private List<Book> borrowedBooks;   

    public User(String aName) { 
        this.name = aName;     
        borrowedBooks = new ArrayList<>();  
    }

    public void borrowBook(Library library, int bookId) {  
        Book book = library.borrowBook(bookId);     
        if (book != null) {      
            borrowedBooks.add(book);
        }
    } 

    public void returnBook(Library library, int bookId) {   
        for (Book book : borrowedBooks) {  
            if (book.getBookId() == bookId) {   
                borrowedBooks.remove(book); 
                library.returnBook(book);  
                return;             
            }
        }
        System.out.println("Book not found in borrowed books.");
    }

    public void displayBorrowedBooks() {      
        System.out.println(name + "'s Borrowed Books:");
        for (Book book : borrowedBooks) {
            System.out.println(book);         
        }
    }
}

