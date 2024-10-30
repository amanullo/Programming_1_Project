package LMS;

public class Book {
    private String name;
    private int year;
    private int bookId;
    private String author;
    private String genre;
    private boolean boolBorrowed;

    // constructor

    public Book(int bookId, String name, int year, String author, String genre, boolean boolBorrowed) {
        this.bookId = bookId;
        this.name = name;
        this.year = year;
        this.author = author;
        this.genre = genre;
        this.boolBorrowed = boolBorrowed;
    }

    // getters and setters for each variable
    public int getBookId() {
        return this.bookId;
    }

    public String getName() {
        return this.name;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setBorrowed(boolean boolBorrowed) {
        this.boolBorrowed = boolBorrowed;
    }

    @Override
    public String toString() {
        return Book("id=" + bookId + ", name='" + name + "', year=" + year + ", author='" + author + "', genre='"
                + genre + "', Borrowed: " + (boolBorrowed ? "Yes" : "No"));
    }

    public static void main(String[] args) {
        Book book = new Book("1984", 1949, "George Orwell", "Dystopian", false);
        System.out.println(book);

        Book book2 = new Book("Dune", 1965, "Frank Herbert", "Science Fiction", true);
        System.out.println(book2);
    }

}
