package learn_exception_handling;

/*
 * throws -
 * 	1. It is used at the end of the method or constructor signature to intimate compiler that
 * 		its statements may throw some exception but it is not willing to handle it; rather its
 * 		calling environment should handle it.
 *
 * 	2. This is applicable for Checked Exceptions and not for unchecked (Runtime) exceptions
 *
 * 	3. Once a method uses 'throws' for a checked exception, it delegates a responsibility
 * 		of handling that exception to its caller.
 *
 * 	4. If required, the caller may further delegate that responsibility to its caller and this
 * 		is done again by using 'throws'.
 *
 * 	5. This chaining can be done up to any level but ideally it should stop at 'main()' because
 * 		if it is not handled by 'main()', it will get propagated to its caller which is not under the
 * 		control of a developer and therefore adding 'throws' declaration for 'main()' is not
 * 		recommended at all.
 */
public class ThrowsMain {

    private static void myMethod() throws Exception{
        //It tells compiler that it may throw an exception: Exception but not willing to
        //handle it rather its caller must handle it.
    }
    private static void yourMethod() throws Exception{
        //It further delegates the responsibility to its caller.
        myMethod();
    }

    private static void ourMethod() {
        //This time the method handles the exception
        try {
            myMethod();
        }
        catch(Exception ex) {
            //Some Code
        }
    }

    private static void theirMethod() throws RuntimeException {
        //Here the method uses throws for RuntimeException which is an unchecked
        //exception and hence caller is not enforced to handle it.
    }

    public static void main(String[] args) {
        try {
            yourMethod();
        }
        catch(Exception ex) {
            //Some code
        }
        ourMethod();

        theirMethod();

    }

}
