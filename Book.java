public class Book {
    private String name;
    private int year;
    private int bookId;
    private String author;
    private String genre;
    private boolean boolBorrowed;

     //constructor
     public Book(int bookId, String name, int year, String author, String genre) {
        this.bookId = bookId;
        this.name = name;
        this.year = year;
        this.author = author;
        this.genre = genre;
        this.boolBorrowed = boolBorrowed;           // don't think it's needed. I add a list of borrowed book
    }

    // getters and setters for each variable
    public int getBookId() {                    
        return this.bookId;
    }

    public String getName() {       
        return this.name;
    }

    public void setBookId(int bookId) {                 // setter method won't be used
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
    
    @Override
    public String toString() {
        return ("id=" + bookId + ", name=" + name + ", year=" + year + ", author=" + author + ", genre=" + genre); 
    }
}
