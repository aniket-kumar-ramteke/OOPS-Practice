package classes_and_access_modifiers;

public class BookMain {

    static {
        System.out.println("Main class is getting loaded.");
    }

    static public void main(String[] args) {

        System.out.println("Application begins...");
        Book firstBook = new Book();
        Book secondBook = new Book(2, "React Unleashed", 1023.45f);
        int currentBookCount = Book.bookCount;
        System.out.println("Current Book Count: " + currentBookCount);

        //Creating 5 more objects
        for(int a=1;a<=5;a++) {
            Book b = new Book();
        }
        int latestBookCount = Book.bookCount;
        System.out.println("Current Book Count: " + latestBookCount);

        //Invoke getTotalBooks() to get the total books
        System.out.println(Book.getTotalBooks());


    }

}
