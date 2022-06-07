package qms.component.control;

import config.Constants;
import qms.component.QMSComponent;
import qms.component.displayunit.component.DisplayUnitComponent;

public class ControlUnit implements QMSComponent {
    private int quantity;
    public ControlUnit(int quantity){
        this.quantity=quantity;
    }

    @Override
    public double getPrice() {
        return quantity* Constants.PRICE_CONTROL_UNIT;
    }

    @Override
    public String toString() {
        String spec="Number of Display Units to control : "+quantity+"\n";
        spec+="Cost of control unit per display unit control : "+Constants.PRICE_CONTROL_UNIT+"\n";
        spec+="Total cost of control unit : "+this.getPrice();
        return spec;
    }
}
