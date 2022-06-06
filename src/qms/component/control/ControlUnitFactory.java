package qms.component.control;

public class ControlUnitFactory {
    public ControlUnit getControlUnit(int quantity){
        return new ControlUnit(quantity);
    }
}
