package qms.component.displayunit;

import qms.component.displayunit.component.displaysystem.DisplaySystemFactory;
import qms.component.displayunit.component.processor.ProcessorFactory;

public class DisplayUnitConcreteBuilder implements DisplayUnitBuilder{

    private DisplayUnit displayUnit;
    private String processorType;
    private String displaySystemType;
    public DisplayUnitConcreteBuilder(String processorType,String displaySystemType,int quantity){
        this.displayUnit=new DisplayUnit(quantity);
        this.processorType=processorType;
        this.displaySystemType=displaySystemType;
    }
    @Override
    public void addProcessor() {
        ProcessorFactory processorFactory=new ProcessorFactory();
        displayUnit.add(processorFactory.getProcessor(this.processorType));
    }

    @Override
    public void addDisplaySystem() {
        DisplaySystemFactory displaySystemFactory=new DisplaySystemFactory();
        displayUnit.add(displaySystemFactory.getDisplaySystem(this.displaySystemType));
    }

    @Override
    public DisplayUnit getDisplayUnit() {
        return displayUnit;
    }
}
