package qms.component.displayunit;

public class DisplayUnitDirector {
    private DisplayUnitBuilder displayUnitBuilder;

    public void constructDisplayUnit(DisplayUnitBuilder displayUnitBuilder){
        this.displayUnitBuilder=displayUnitBuilder;
        displayUnitBuilder.addProcessor();
        displayUnitBuilder.addDisplaySystem();
    }
}
