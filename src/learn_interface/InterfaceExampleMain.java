package learn_interface;
/*
* Basic Rules / Concepts:
*   1. Methods declared within a public interface are by default public and abstract.
*   2. Variables declared within a public interface are by default public, static and final.
*   3. A class can implement multiple interfaces
*   4. An interface can be implemented by multiple classes
*   5. An interface can extend multiple interfaces
*       (Java supports multiple inheritance for interfaces and not for classes)
*
* Why Interfaces?
* Intefaces are mainly used to accomplish following things:
*       1. Expanding the scope of polymorphism
*       2. Achieving multiple inheritance in terms of behaviours.
*           A class can extend only one class but can implement multiple interfaces
* */
public class InterfaceExampleMain {

    public static void main(String[] args) {
        System.out.println("Today's conversion rates: ");
        System.out.println("US Dollars to INR: " + CurrencyConverter.DOLLAR_TO_RUPEE);
        System.out.println("GB Pounds to INR: " + CurrencyConverter.POUND_TO_RUPEE);
        CurrencyConverter forexConverter;//Like abstract classes, interfaces cannot be instantiated but can be used as a reference.
        forexConverter = new DollarToRupeeConverter();
        float usDollars = 100000;
        float indianRupees = forexConverter.doConvert(usDollars);
        System.out.println("Indian Rupees from US Dollars: " + usDollars + " are : " + indianRupees);

        indianRupees = 5000000;
        forexConverter = new RupeeToPoundConverter();
        float gbPounds = forexConverter.doConvert(indianRupees);
        System.out.println("GB Pounds from Indian Rupees: " + indianRupees + " are : " + gbPounds);

    }
}
