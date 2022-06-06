package qms.component.control;

import qms.component.QMSComponent;

public class ControlUnit implements QMSComponent {
    private int quantity;
    public ControlUnit(int quantity){
        this.quantity=quantity;
    }
}
