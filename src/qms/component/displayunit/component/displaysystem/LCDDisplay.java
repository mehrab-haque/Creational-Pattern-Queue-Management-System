package qms.component.displayunit.component.displaysystem;

import config.Constants;

public class LCDDisplay implements DisplaySystem{
    @Override
    public double getPrice() {
        return Constants.PRICE_LCD_DISPLAY;
    }
}
