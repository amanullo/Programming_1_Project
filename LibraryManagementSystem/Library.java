

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
            System.out.println("book id: " + book.getBookId() + ", Title: " + book.getName() + ", Year published: "
                    + (int)book.getYear() + ", Author: " + book.getAuthor() + ", Genre: " + book.getGenre());
        }
    }

    public Book borrowBook(int bookId) {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getBookId() == bookId) {
                iterator.remove();
                System.out.println(
                        "Borrowed book id: " + book.getBookId() + ", Title: " + book.getName() + ", Year published: "
                                + book.getYear() + ", Author: " + book.getAuthor() + ", Genre: " + book.getGenre());
                return book;
            }
        }
        System.out.println("Book with ID " + bookId + " not found.");
        return null;
    }

    public Book returnBook(Book book) {
        books.add(book);
        System.out.println("Book id: " + book.getBookId() + ", Title: " + book.getName() + " returned.\nThank you!");
        return book;
    }
}
