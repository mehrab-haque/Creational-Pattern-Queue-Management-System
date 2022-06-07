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

    @Override
    public double getPrice() {
        double totalPrice=0;
        for(DisplayUnitComponent displayUnitComponent:parts)
            totalPrice+=displayUnitComponent.getPrice();
        return quantity*totalPrice;
    }

    @Override
    public String toString() {
        String spec="Number of Display Units : "+quantity+"\n";
        for(DisplayUnitComponent part:parts)
            spec+=part.toString()+'\n';
        spec+="Total cost of display unit : "+this.getPrice();
        return spec;
    }
}
