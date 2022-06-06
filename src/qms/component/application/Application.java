package qms.component.application;

import config.Constants;
import qms.component.QMSComponent;

public class Application implements QMSComponent {
    @Override
    public double getPrice() {
        return Constants.PRICE_APPLICATION;
    }
}
