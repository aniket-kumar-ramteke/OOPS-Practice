package classes_and_access_modifiers;

public class LearnArrayOfObjects {
    public static void main(String[] args) {
        String[] titlesOfAll = BookStore.getBookTitles();
        for (String each: titlesOfAll) {
            System.out.println(each);
        }

        System.out.println("Average Price is : " + BookStore.getAvgPrice());
    }
}
