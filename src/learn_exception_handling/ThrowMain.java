package learn_exception_handling;

/*
* throw: Used to throw the exception explicitly. Sometimes there is a need to throw the
* exception programmatically. It is done using 'throw'
*   E.g.
*   throw <<Throwable>>
* */

public class ThrowMain {
    private static int divide(int n1, int n2) {
        if(n2 == 0) {
            //Throw Runtime Exception
            RuntimeException rx = new RuntimeException("Unable to perform the division");
            throw rx;
        }
        int division = n1 / n2;
        return division;
    }

    public static void main(String[] args) {
        try {
            int result = divide(10, 2);
            System.out.println(result);
        }
        catch(RuntimeException runtimeEx) {
            String errorMessage = runtimeEx.getMessage();
            System.out.println("Error Message: " + errorMessage);
        }

    }
}
