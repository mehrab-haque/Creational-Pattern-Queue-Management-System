package qms.component.communication.component.channel;

import config.Constants;

public class ChannelFactory {
    public Channel getChannel(String channelType){
        if(channelType==null)
            return null;
        else if (channelType.trim().equalsIgnoreCase(Constants.CONNECTIVITY_TYPE_BROADBAND.trim()))
            return new WifiModule();
        else if (channelType.trim().equalsIgnoreCase(Constants.CONNECTIVITY_TYPE_MOBILE_DATA.trim()))
            return new SIMCard();
        else return null;
    }
}
