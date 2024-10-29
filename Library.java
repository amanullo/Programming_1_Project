package LMS;

import java.util.ArrayList;
import java.util.Iterator;

public class Library {

    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Added to the collection!");
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println("Title and Id: " + book.getName() + " " + book.getBookId());
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
        
    public Book returnBook(Book book) {
        books.add(book);
        System.out.println("Book returned, thank you!");
        return book;
    }
}
