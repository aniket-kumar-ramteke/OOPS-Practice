package learn_exception_handling;

public class WithoutExceptionHandling {
/*
* Exception: An error that occurs during program's execution is known as Exception.
* Errors are of 2 types:
*       Compile Time Errors ---> errors
*       Runtime Errors ----> exceptions
*
* Exceptions are the actual objects created by JRE.
* These objects contain error information.
* */
    public static void main(String[] args) {

        //it will generate ArrayIndexOutOfBoundsException when you dont provide arguments.
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        int result = n1 + n2;
        System.out.println(result);

    }

}