package classes_and_access_modifiers;

public class BookStore {
    private static Book[] bookData;

    static {
        bookData = new Book[3];
        bookData[0] = new Book();
        bookData[1] = new Book(141,"Let us C",514.50f);
        bookData[2] = new Book(124,"Data Structures and Algorithms",877.25f);
    }

    public static String[] getBookTitles() {
        int size = bookData.length;
        String[] titles = new String[size];
        for(int index = 0; index < size; index++){
            titles[index] = bookData[index].getTitle();
        }
        return titles;
    }

    public static float getAvgPrice() {
        float sum = 0.0f;
        int size = bookData.length;
        for (Book current: bookData) {
            sum = sum + current.getPrice();
        }
        return sum/(float)size;
    }
}
