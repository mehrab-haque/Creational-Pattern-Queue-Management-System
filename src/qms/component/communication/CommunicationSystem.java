package qms.component.communication;

import config.Constants;
import qms.component.QMSComponent;
import qms.component.communication.component.CommunicationSystemComponent;

import java.util.ArrayList;
import java.util.List;

public class CommunicationSystem implements QMSComponent {
    private List<CommunicationSystemComponent> parts;

    public CommunicationSystem(){
        parts=new ArrayList<>();
    }

    public void add(CommunicationSystemComponent part){
        parts.add(part);
    }
    @Override
    public double getPrice() {
        double totalPrice=0;
        for(CommunicationSystemComponent communicationSystemComponent:parts)
            totalPrice+=communicationSystemComponent.getPrice();
        return totalPrice;
    }
}
