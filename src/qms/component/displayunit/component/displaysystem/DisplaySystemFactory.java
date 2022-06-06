package qms.component.displayunit.component.displaysystem;

import config.Constants;

public class DisplaySystemFactory {
    public DisplaySystem getDisplaySystem(String displaySystemType){
        if(displaySystemType==null)
            return null;
        else if(displaySystemType.trim().equalsIgnoreCase(Constants.DISPLAY_SYSTEM_TYPE_LCD_DISPLAY.trim()))
            return new LCDDisplay();
        else if(displaySystemType.trim().equalsIgnoreCase(Constants.DISPLAY_SYSTEM_TYPE_LED_MATRIX.trim()))
            return new LEDMatrix();
        else return null;
    }
}
