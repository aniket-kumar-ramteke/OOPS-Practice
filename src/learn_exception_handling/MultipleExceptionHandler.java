package learn_exception_handling;

/*
* Handling multiple exceptions : It is possible to handle multiple exceptions using multiple 'catch' blocks.
* Also it is possible to nest try-catch blocks upto many levels.
* */

public class MultipleExceptionHandler {

    public static void main(String[] args) {

        try {
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            int result = n1 / n2;
            System.out.println(result);
        }

        catch(ArrayIndexOutOfBoundsException ax) {
            System.out.println("Enter at least 2 numbers.");
        }

        catch(ArithmeticException ex) {
            System.out.println("Enter 2nd value to be non-zero");
        }


    }
}
