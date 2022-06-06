package qms.component.displayunit.component.processor;

import config.Constants;

public class RasberryPi implements Processor{
    @Override
    public double getPrice() {
        return Constants.PRICE_RASBERRY_PI;
    }
}
