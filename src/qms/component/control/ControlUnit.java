package qms.component.control;

import config.Constants;
import qms.component.QMSComponent;

public class ControlUnit implements QMSComponent {
    private int quantity;
    public ControlUnit(int quantity){
        this.quantity=quantity;
    }

    @Override
    public double getPrice() {
        return quantity* Constants.PRICE_CONTROL_UNIT;
    }
}
