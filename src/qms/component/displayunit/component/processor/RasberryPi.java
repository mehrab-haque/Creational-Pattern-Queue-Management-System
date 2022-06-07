package qms.component.displayunit.component.processor;

import config.Constants;

public class RasberryPi implements Processor{
    @Override
    public double getPrice() {
        return Constants.PRICE_RASBERRY_PI;
    }

    @Override
    public String toString() {
        return "Processor : "+Constants.PROCESSOR_TYPE_RASBERRY_PI+", cost per piece : "+getPrice();
    }
}
