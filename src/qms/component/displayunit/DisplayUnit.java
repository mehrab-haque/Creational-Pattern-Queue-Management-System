package qms.component.displayunit;

import qms.component.QMSComponent;
import qms.component.displayunit.component.DisplayUnitComponent;

import java.util.ArrayList;
import java.util.List;

public class DisplayUnit implements QMSComponent {
    private List<DisplayUnitComponent> parts;
    private int quantity;

    public DisplayUnit(int quantity){
        parts=new ArrayList<>();
        this.quantity=quantity;
    }

    public void add(DisplayUnitComponent part){
        parts.add(part);
    }
}
