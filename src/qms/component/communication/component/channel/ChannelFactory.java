package qms.component.communication.component.channel;

import config.Constants;

public class ChannelFactory {
    public Channel getChannel(String channelType){
        if(channelType==null)
            return null;
        else if (channelType.trim().equalsIgnoreCase(Constants.CHANNEL_TYPE_WIFI_MODULE.trim()))
            return new WifiModule();
        else if (channelType.trim().equalsIgnoreCase(Constants.CHANNEL_TYPE_SIM_CARD.trim()))
            return new SIMCard();
        else return null;
    }
}
