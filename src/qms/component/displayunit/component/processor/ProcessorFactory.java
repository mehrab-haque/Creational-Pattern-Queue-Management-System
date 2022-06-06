package qms.component.displayunit.component.processor;

import config.Constants;

public class ProcessorFactory {
    public Processor getProcessor(String processorType){
        if(processorType==null)
            return null;
        else if (processorType.trim().equalsIgnoreCase(Constants.PROCESSOR_TYPE_ARDUINO_MEGA.trim()))
            return new ArduinoMega();
        else if (processorType.trim().equalsIgnoreCase(Constants.PROCESSOR_TYPE_ATMEGA_32.trim()))
            return new ATMega32();
        else if (processorType.trim().equalsIgnoreCase(Constants.PROCESSOR_TYPE_RASBERRY_PI.trim()))
            return new RasberryPi();
        else return null;
    }
}
