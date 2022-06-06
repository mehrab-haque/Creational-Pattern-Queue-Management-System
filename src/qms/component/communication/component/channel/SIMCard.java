package qms.component.communication.component.channel;

import config.Constants;

public class SIMCard implements Channel{
    @Override
    public double getPrice() {
        return Constants.PRICE_SIM_CARD;
    }
}
