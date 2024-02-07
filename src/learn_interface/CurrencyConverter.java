package learn_interface;

/*
* Interface:
* Interface is a collection of abstract methods and possibly 'final' variables.
* Used to declare the methods where implementation is not available.
*
*
*  */
public interface CurrencyConverter {
    float doConvert(float amount);//public abstract float doConvert(float amount);
    float DOLLAR_TO_RUPEE = 76.54f;//UPPERCASE naming convention for constants
    float POUND_TO_RUPEE = 105.56f;
    // public static final float POUND_TO_RUPEE = 105.56f;
}

