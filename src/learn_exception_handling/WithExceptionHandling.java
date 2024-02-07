package learn_exception_handling;

// Exception Handling is an object oriented way of handling runtime errors.

/*
* Java provides 2 basic keyword:
*
*   1. try
*       Used to enclose the statements which are probable to fire an exception
*       It is used in the form of block.
*
*   2. catch
*       Used as an exception handler.
*       It is used in the form of block.
*       Statements written inside 'catch' block execute when an exception is raised.
*
* Working :
*
*   - JRE identifies the abnormal situation and maps it to the corresponding exception specific class.
*   - Once the class is mapped, it creates an object of that class and checks whether the
*       statement which has fired that exception; is enclosed within a 'try' block or not.
*
*   - If enclosed, searches for the relevant 'catch' block and once found, executes that
*       'catch' block otherwise generates predefined message associated with that exception.
*
*   - If not enclosed, generates predefined message associated with that exception.
* */
public class WithExceptionHandling {
    public static void main(String[] args) {

        try {
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            int result = n1 + n2;
            System.out.println(result);
        }

        catch(ArrayIndexOutOfBoundsException ax) {
            System.out.println("Enter at least 2 numbers.");
        }


    }
}
