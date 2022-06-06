package qms;

import qms.component.application.ApplicationFactory;
import qms.component.communication.CommunicationSystemBuilder;
import qms.component.communication.CommunicationSystemConcreteBuilder;
import qms.component.communication.CommunicationSystemDirector;
import qms.component.control.ControlUnitFactory;
import qms.component.displayunit.DisplayUnitBuilder;
import qms.component.displayunit.DisplayUnitConcreteBuilder;
import qms.component.displayunit.DisplayUnitDirector;

public class QMSConcreteBuilder implements QMSBuilder{

    private QMS qms=new QMS();

    @Override
    public void addDisplayUnit(String processorType, String displaySystemType,int quantity) {
        DisplayUnitDirector displayUnitDirector=new DisplayUnitDirector();
        DisplayUnitBuilder displayUnitBuilder=new DisplayUnitConcreteBuilder(processorType, displaySystemType, quantity);
        displayUnitDirector.constructDisplayUnit(displayUnitBuilder);
    }

    @Override
    public void addCommunicationSystem(String communicationType) {
        CommunicationSystemDirector communicationSystemDirector=new CommunicationSystemDirector();
        CommunicationSystemBuilder communicationSystemBuilder=new CommunicationSystemConcreteBuilder(communicationType);
        communicationSystemDirector.constructCommunicationSystem(communicationSystemBuilder);
    }

    @Override
    public void addApplication() {
        ApplicationFactory applicationFactory=new ApplicationFactory();
        qms.add(applicationFactory.getApplication());
    }

    @Override
    public void addControlunit(int quantity) {
        ControlUnitFactory controlUnitFactory=new ControlUnitFactory();
        qms.add(controlUnitFactory.getControlUnit(quantity));
    }

    @Override
    public QMS getQMS() {
        return null;
    }
}
