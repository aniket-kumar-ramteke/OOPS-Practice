package inheritance.icecream;
//This is the example of package and its imports.
import inheritance.food_items.Fruit;
import inheritance.food_items.FruitJuice;

public class IceCream {
    public static void makeIceCream(Fruit fruit){
        System.out.println(fruit.getName() + " ice-cream made! ");
    }

    public static void main(String[] args) {
        Fruit mango = new Fruit("Mango");

        FruitJuice.makeJuice(mango);
        mango.setName("Sitafal");
        makeIceCream(mango);
    }
}
