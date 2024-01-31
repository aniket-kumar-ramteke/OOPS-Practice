package classes_and_access_modifiers;

public class Book {

    static {
        System.out.println("Book class is getting loaded.");
    }
    private int bookId;
    private String title;
    private float price;
    static int bookCount;//Holds the count of books. Since one copy is enough, it is declared as 'static'
    static private int totalBooks;//Holds the count of books but this time it is 'private'
    public Book() { // No arguments constructor
        bookId = 1;
        title = "Thinking in Java";
        price = 750.50f;
        bookCount++;
        totalBooks++;
    }
    public Book(int bookId, String title, float price) { // Constructor
        this.bookId = bookId;
        this.title = title;
        this.price = price;
        bookCount++;
        totalBooks++;
    }
    public int getBookId() {
        return bookId;
    }
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public static int getTotalBooks() {//Since this method is 'static' can be called without object
        return totalBooks;//Static method can access only static members
    }


}