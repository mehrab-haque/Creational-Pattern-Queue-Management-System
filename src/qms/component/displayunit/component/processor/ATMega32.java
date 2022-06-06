package qms.component.displayunit.component.processor;

import config.Constants;

public class ATMega32 implements Processor{
    @Override
    public double getPrice() {
        return Constants.PRICE_ATMEGA_32;
    }
}
