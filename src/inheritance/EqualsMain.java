package inheritance;

public class EqualsMain {

    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        System.out.println("X == Y: ---> " + (x == y));

        Customer c1 = new Customer(101, "Sachin");
        Customer c2 = new Customer(101, "Sachin");
        //Customer c2 = c1;
        System.out.println("C1 == C2: ---> " + (c1 == c2));
        System.out.println("c1.equals(c2): --->" + (c1.equals(c2)));

        String name = "James";
        String name2 = new String("James");
        System.out.println("Name comparison: " + name.equals(name2));

    }

}