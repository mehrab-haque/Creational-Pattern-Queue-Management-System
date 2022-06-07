package qms.component.displayunit.component.processor;

import config.Constants;

public class ArduinoMega implements Processor{
    @Override
    public double getPrice() {
        return Constants.PRICE_ARDUINO_MEGA;
    }

    @Override
    public String toString() {
        return "Processor : "+Constants.PROCESSOR_TYPE_ARDUINO_MEGA+", cost per piece : "+getPrice();
    }
}
