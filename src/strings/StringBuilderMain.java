package strings;
/*
* StringBuilder :
* A class from java.lang package that is used for String manipulation.
*
* It is also possible to manipulate String data using String class but it causes
* performance implications because Strings are immutable.
*
* Every single manipulation results into a new object creation.
* To address this, Java provides StringBuilder which follows mutable sequence
* of characters. It provides several overloaded append() method to perform
* manipulation.
* */
public class StringBuilderMain {

    public static void main(String[] args) {
        /*
         * String messages = "Welcome"; System.out.println(messages);
         *
         * messages = messages + ", Hello"; System.out.println(messages);
         *
         * messages = messages + ", Hi"; System.out.println(messages);
         *
         * messages = messages + ", Bye"; System.out.println(messages);
         */

        StringBuilder builder = new StringBuilder("Hello, my name is Aniket and I am ");
        builder.append(27);
        builder.append(" years old and my weight is ");
        builder.append(72.5f);
        builder.append(" Kgs and my Vaccination status is ");
        builder.append(true + ".");
//        System.out.println(builder);//Invokes toString()
        String builderInfo = builder.toString();
        System.out.println(builderInfo);


    }

}
