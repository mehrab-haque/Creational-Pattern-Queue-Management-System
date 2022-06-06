package qms.component.communication.component.connectivity;

import config.Constants;

public class Broadband implements Connectivity{
    @Override
    public double getPrice() {
        return Constants.PRICE_BROADBAND;
    }
}
