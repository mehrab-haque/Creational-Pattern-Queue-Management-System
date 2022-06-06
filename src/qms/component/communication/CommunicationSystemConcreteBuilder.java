package qms.component.communication;

import qms.component.communication.component.channel.ChannelFactory;
import qms.component.communication.component.connectivity.ConnectivityFactory;

public class CommunicationSystemConcreteBuilder implements CommunicationSystemBuilder{

    private CommunicationSystem communicationSystem;
    private String communicationType;

    public CommunicationSystemConcreteBuilder(String  communicationType) {
        this.communicationSystem=new CommunicationSystem();
        this.communicationType=communicationType;
    }
    @Override
    public void addConnectivity() {
        ConnectivityFactory connectivityFactory=new ConnectivityFactory();
        communicationSystem.add(connectivityFactory.getConnectivity(communicationType));
    }

    @Override
    public void addChannel() {
        ChannelFactory channelFactory=new ChannelFactory();
        communicationSystem.add(channelFactory.getChannel(communicationType));
    }

    @Override
    public CommunicationSystem getCommunicationDSystem() {
        return communicationSystem;
    }
}
