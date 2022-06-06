package qms.component.communication;

import qms.component.displayunit.DisplayUnitBuilder;

public class CommunicationSystemDirector {
    private CommunicationSystemBuilder communicationSystemBuilder;

    public void constructCommunicationSystem(CommunicationSystemBuilder communicationSystemBuilder){
        this.communicationSystemBuilder=communicationSystemBuilder;
        communicationSystemBuilder.addChannel();
        communicationSystemBuilder.addConnectivity();
    }
}
