package qms;

public interface QMSBuilder {
    public void addDisplayUnit(String processorType, String displaySystemType,int quantity);
    public void addCommunicationSystem(String communicationType);
    public void addApplication();
    public void addControlunit(int quantity);
    public QMS getQMS();
}
