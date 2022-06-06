package qms.component.displayunit.component.processor;

import config.Constants;

public class ArduinoMega implements Processor{
    @Override
    public double getPrice() {
        return Constants.PRICE_ARDUINO_MEGA;
    }
}
