package learn_interface;

/*
 * To use an interface further, there has to be some class which implements that
 * interface and it is possible using 'implements' keyword.
 */
public class DollarToRupeeConverter  implements CurrencyConverter{

    @Override
    public float doConvert(float amountInDollars) {
        float amountInRupees = amountInDollars * DOLLAR_TO_RUPEE;
        return amountInRupees;
    }

}

