package qms.component.displayunit.component.displaysystem;

import config.Constants;

public class LEDMatrix implements DisplaySystem{
    @Override
    public double getPrice() {
        return Constants.PRICE_LED_MATRIX;
    }
}
