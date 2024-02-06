package classes_and_access_modifiers;
/*
* WRAPPER CLASSES -
* Sometimes there is a need to represent primitives in the form of objects.
* For every primitive type, Java provides a Class counterpart known as Wrapper or
* Wrapper Class.
*
* Wrapper classes are also used to convert a qualified String into the respective
* primitive type. This is frequently required in GUI based applications.
*
* E.g.
* int x = Integer.parseInt("1234");
* In the above statement String "1234" gets converted to int with value 1234
* */
public class WrapperClassesMain {

    public static void main(String[] args) {
        //Wrapping
        int x = 100;
        Integer i = x;
        //This is Auto-boxing. Internally it is processed as Integer i = new Integer(x);

        //Unwrapping
        int y = i;
        //This is  unboxing. Internally it is processed as int y = i.intValue();
        System.out.println("Y = " + y);

        String s1 = "120";
        String s2 = "240";
        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);
        System.out.println(n1 + n2);

    }

}
