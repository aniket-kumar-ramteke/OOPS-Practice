package classes_and_access_modifiers;

public class ParameterPassingMain {

    private static void changePrimitive(int xCopy) { // xCopy is Parameter here
        // The parameter is referred to as the variables that are defined during a function declaration or definition.
        xCopy = 20;
    }

    private static void changeObject(Book b1Copy) {
        b1Copy.setTitle("Spring in Action");

    }

    private static Book getBookObject() {
        Book myBook = new Book(101, "Hibernate in Action", 560);
        return myBook;
        //return new Book();
    }

    public static void main(String[] args) {
        int x = 10;//Local variables must be initialized before getting used
        System.out.println("Value before change: " + x);
        changePrimitive(x);//Argument
        /*
         * An argument is referred to the values that are passed within a function when the function is called.
         */
        System.out.println("Value after change: " + x);

        Book b1 = new Book();
        System.out.println("Value before change: " + b1.getTitle());
        changeObject(b1);
        System.out.println("Value after change: " + b1.getTitle());

        Book returnedBook = getBookObject();

        System.out.println(returnedBook.getTitle());
    }


}

