package qms.component.communication.component.channel;

import config.Constants;

public class WifiModule implements Channel{
    @Override
    public double getPrice() {
        return Constants.PRICE_WIFI_MODULE;
    }

    @Override
    public String toString() {
        return "Channel : Wifi Module, cost : "+getPrice();
    }
}
