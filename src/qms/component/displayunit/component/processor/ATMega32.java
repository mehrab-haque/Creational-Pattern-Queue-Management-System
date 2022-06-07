package qms.component.displayunit.component.processor;

import config.Constants;

public class ATMega32 implements Processor{
    @Override
    public double getPrice() {
        return Constants.PRICE_ATMEGA_32;
    }

    @Override
    public String toString() {
        return "Processor : "+Constants.PROCESSOR_TYPE_ATMEGA_32+", cost per piece : "+getPrice();
    }
}
