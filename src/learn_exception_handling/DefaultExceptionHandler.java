package learn_exception_handling;
/*
* Handling Default Exception:
*
* Sometimes there is some exception raised which is not listed in predictions. In that case
* since there is no exception handler, JRE shows system message and this needs to be fixed.
*
* It is done by adding a 'catch' block that handles any type of exception.
*
* E.g.
*   catch(Exception ex){...}
*
* When multiple catch blocks are used, the 'catch' of super type must appear after the
* 'catch' block of sub type.
*
* Method Invocation Vs Raise of an Exception
* When a method is invoked, control jumps to its definition, executes the code and returns
* back to the calling environment.
*
* When an exception is raised, provided it is handled, control jumps to the 'catch' block,
* executes the 'catch' block but does not returned back.
*
* Sometimes, there are some statements of which execution is very much important.
* Neither 'try' nor 'catch' blocks give guarantee about the execution.
*
* To address this, Java provides 'finally' block.
* It gives full guarantee about execution. It gets invoked irrespective of whether an exception is raised or not.
*
* When 'finally' creates an impact?
* The 'finally' block creates impact especially when the method returns a value other than 'void'.
*
* Rules about try - catch - finally:
*
* 1. All the blocks must be written one after the other without any statement in between.
* 2. A 'try' block must be used in conjunction with either 'catch' or multiple 'catch' or 'finally' or both.
* 3. 'catch' block cannot be written without 'try'
* 4. 	'finally' block cannot be written without 'try'
* 5. It is possible to have nesting of the blocks as well.
*
* */
public class DefaultExceptionHandler {

    public static void main(String[] args) {

        try {
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            int result = n1 / n2;
            System.out.println(result);
        }

        catch(ArithmeticException ex) {
            System.out.println("Enter 2nd value to be non-zero");
        }
        catch(ArrayIndexOutOfBoundsException ax) {
            System.out.println("Enter at least 2 numbers.");
        }
		/*catch(RuntimeException rx) {

		}*/
        catch(Exception ex){
            ex.getMessage();
            System.out.println("This is a generic exception");
        }
		/*catch(Throwable b) {

		}*/
        finally {
            System.out.println("Thank you !!");
        }


    }
}
