package qms;

import qms.component.QMSComponent;

import java.util.ArrayList;
import java.util.List;

public class QMS {
    private List<QMSComponent> parts;

    public QMS(){
        this.parts=new ArrayList<>();
    }

    public void add(QMSComponent part){
        this.parts.add(part);
    }
}
