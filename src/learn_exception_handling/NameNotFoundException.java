package learn_exception_handling;

public class NameNotFoundException extends Exception {
    //Since this class inherits Exception, it is treated as CHECKED exception
    private String invalidName;
    public NameNotFoundException(String errorMessage, String invalidName) {
        super(errorMessage);
        this.invalidName = invalidName;
    }

    @Override
    public String getMessage() {
        String errMsg = super.getMessage();
        String finalMessage = errMsg + " :---> " + invalidName;
        return finalMessage;
    }

}
