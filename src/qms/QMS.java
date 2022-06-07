package qms;

import qms.component.QMSComponent;
import utility.Priceable;

import java.util.ArrayList;
import java.util.List;

public class QMS implements Priceable {
    private List<QMSComponent> parts;

    public QMS(){
        this.parts=new ArrayList<>();
    }

    public void add(QMSComponent part){
        this.parts.add(part);
    }

    @Override
    public double getPrice() {
        double totalPrice=0;
        for(QMSComponent qmsComponent:parts)
            totalPrice+=qmsComponent.getPrice();
        return totalPrice;
    }

    @Override
    public String toString() {
        String spec="\n";
        for(QMSComponent part:parts)
            spec+=part.toString()+'\n';
        spec+="Total cost : "+this.getPrice();
        return spec+"\n";
    }
}
