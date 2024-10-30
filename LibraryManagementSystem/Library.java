package LMS;

import java.util.ArrayList;
import java.util.Iterator;

public class Library {

    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
        books.add(new Book(1, "The Catcher in the Rye", 1951, "J.D. Salinger", "Fiction")); // added some books
        books.add(new Book(2, "To Kill a Mockingbird", 1960, "Harper Lee", "Fiction"));
        books.add(new Book(3, "1984", 1949, "George Orwell", "Dystopian"));
        books.add(new Book(4, "Pride and Prejudice", 1813, "Jane Austen", "Romance"));
        books.add(new Book(5, "The Great Gatsby", 1925, "F. Scott Fitzgerald", "Fiction"));
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added to the collection:" + book); // specifying which one
    }

    public void displayBooks() {    
        System.out.println("Available Books in the Library:");   // header
        for (Book book: books) {
            System.out.println(book);
        }
    }

    public Book borrowBook(int bookId) {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getBookId() == bookId) {
                iterator.remove();
                System.out.println("Book borrowed: " + book.getName());
                return book;
            }
        }
        System.out.println("Book with ID " + bookId + " not found.");
        return null;
    }
        
    public void returnBook(Book book) {    // not sure why, but I think it's a void method (does'nt return anything)
        books.add(book);
        System.out.println("Book returned:" + book.getName() + ", thank you!"); 
    }
}
