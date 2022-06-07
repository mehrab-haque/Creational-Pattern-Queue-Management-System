package qms.component.application;

import config.Constants;
import qms.component.QMSComponent;

public class Application implements QMSComponent {
    @Override
    public double getPrice() {
        return Constants.PRICE_APPLICATION;
    }

    @Override
    public String toString() {
        return "Yealy cost of the application for communication : "+Constants.PRICE_APPLICATION;
    }
}
