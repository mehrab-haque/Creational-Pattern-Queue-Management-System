package qms.component.communication.component.channel;

import config.Constants;

public class WifiModule implements Channel{
    @Override
    public double getPrice() {
        return Constants.PRICE_WIFI_MODULE;
    }
}
