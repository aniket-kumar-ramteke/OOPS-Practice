package learn_exception_handling;
/*
* User Defined Exceptions
* Sometimes depending upon the domain needs, it is necessary to create exceptions.
* Such exceptions are called as User Defined Exceptions
*
* To create user defined exception, it is necessary to create a class which is called as Exception specific class.
*
* This class must inherit either RuntimeException or Exception or even their descendant.
* To create unchecked exception, inherit from RuntimeException and in case of checked exception, inherit from Exception.
*
* Monitoring exception stack trace:
*
* When the project is  in the DEVELOPMENT phase, it is necessary to perform
* debugging and trouble shooting. Developer needs to known the point of origin of
* an exception and the trace of propagation.
*
* To address this, Exception class provides a method: printStackTrace()
*
* This is specifically meant for the projects which are in DEVELOPMENT phase but definitely not suitable for PRODUCTION phase.
* */
public class UserDefinedExceptionMain {

    public static void main(String[] args) {

        String nameToFind = "Aniket";
        try {
            int position = NameCollection.getPosition(nameToFind);
            System.out.println(nameToFind + " found at position: " + position);
        }
        catch(NameNotFoundException nx) {
            String message = nx.getMessage();
            System.out.println(message);
            //nx.printStackTrace();
        }
    }

}
