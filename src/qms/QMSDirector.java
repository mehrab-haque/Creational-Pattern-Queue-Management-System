package qms;

import config.Constants;

public class QMSDirector {
    private QMSBuilder qmsBuilder;
    private String displayUnitType;
    private String communicationType;
    private int displayUnitQuantity;

    public QMSDirector(String displayUnitType, String communicationType, int displayUnitQuantity) {
        this.displayUnitType = displayUnitType;
        this.communicationType = communicationType;
        this.displayUnitQuantity = displayUnitQuantity;
    }

    public void constructQMS(QMSBuilder qmsBuilder){
        this.qmsBuilder=qmsBuilder;
        qmsBuilder.addApplication();
        qmsBuilder.addControlunit(displayUnitQuantity);
        qmsBuilder.addCommunicationSystem(communicationType);
        if(displayUnitType.trim().equalsIgnoreCase(Constants.DISPLAY_UNIT_TYPE_DELUXE.trim()))
            qmsBuilder.addDisplayUnit(Constants.PROCESSOR_TYPE_RASBERRY_PI,Constants.DISPLAY_SYSTEM_TYPE_LCD_DISPLAY,displayUnitQuantity);
        else if(displayUnitType.trim().equalsIgnoreCase(Constants.DISPLAY_UNIT_TYPE_OPTIMAL.trim()))
            qmsBuilder.addDisplayUnit(Constants.PROCESSOR_TYPE_ARDUINO_MEGA,Constants.DISPLAY_SYSTEM_TYPE_LED_MATRIX,displayUnitQuantity);
        else if(displayUnitType.trim().equalsIgnoreCase(Constants.DISPLAY_UNIT_TYPE_POOR.trim()))
            qmsBuilder.addDisplayUnit(Constants.PROCESSOR_TYPE_ATMEGA_32,Constants.DISPLAY_SYSTEM_TYPE_LED_MATRIX,displayUnitQuantity);
    }
}
