package inheritance;

public class ToStringMain {

    public static void main(String[] args) {

        int val = 100;
        System.out.println(val);

        Customer c1 = new Customer(101, "Sachin");
        //System.out.println(c1.getCustomerId() + ", " + c1.getName());
        System.out.println(c1);//Invokes toString() implicitly
        System.out.println(c1.toString());//Invokes toString() explicitly

    }

}
