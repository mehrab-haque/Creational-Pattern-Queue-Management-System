package qms.component.communication.component.connectivity;

import config.Constants;

public class MobileData implements Connectivity{
    @Override
    public double getPrice() {
        return Constants.PRICE_MOBILE_DATA;
    }

    @Override
    public String toString() {
        return "Connectivity : Mobile Data, cost : "+getPrice();
    }
}
