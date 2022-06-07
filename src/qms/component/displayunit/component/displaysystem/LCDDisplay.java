package qms.component.displayunit.component.displaysystem;

import config.Constants;

public class LCDDisplay implements DisplaySystem{
    @Override
    public double getPrice() {
        return Constants.PRICE_LCD_DISPLAY;
    }

    @Override
    public String toString() {
        return "Display : "+Constants.DISPLAY_SYSTEM_TYPE_LCD_DISPLAY+", cost per piece : "+getPrice();
    }
}
