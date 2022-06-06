package qms.component.communication.component.connectivity;

import config.Constants;

public class ConnectivityFactory {
    public Connectivity getConnectivity(String connectivityType){
        if(connectivityType==null)
            return null;
        else if(connectivityType.trim().equalsIgnoreCase(Constants.CONNECTIVITY_TYPE_BROADBAND.trim()))
            return new Broadband();
        else if(connectivityType.trim().equalsIgnoreCase(Constants.CONNECTIVITY_TYPE_MOBILE_DATA.trim()))
            return new MobileData();
        else return null;

    }
}
