package learn_interface;

public class RupeeToPoundConverter implements CurrencyConverter {

    /*
    * Whenever a class implements an interface, it must define all the methods from that
    * interface otherwise it must be declared 'abstract'.
    * */
    @Override
    public float doConvert(float amountInRupees) {
        float amountInPounds = amountInRupees / POUND_TO_RUPEE;
        return amountInPounds;
    }

}
