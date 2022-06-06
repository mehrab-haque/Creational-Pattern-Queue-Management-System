package qms.component.communication;

import qms.component.displayunit.DisplayUnit;

public interface CommunicationSystemBuilder {
    public void addConnectivity();
    public void addChannel();
    public CommunicationSystem getCommunicationDSystem();
}
