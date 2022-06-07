package qms.component.displayunit.component.displaysystem;

import config.Constants;

public class LEDMatrix implements DisplaySystem{
    @Override
    public double getPrice() {
        return Constants.PRICE_LED_MATRIX;
    }

    @Override
    public String toString() {
        return "Display : "+Constants.DISPLAY_SYSTEM_TYPE_LED_MATRIX+", cost per piece : "+getPrice();
    }
}
