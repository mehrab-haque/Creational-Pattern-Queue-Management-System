import config.Constants;
import qms.QMSBuilder;
import qms.QMSConcreteBuilder;
import qms.QMSDirector;

public class Main {
    public static void main(String[] args) {
        QMSBuilder qmsBuilder=new QMSConcreteBuilder();
        QMSDirector qmsDirector=new QMSDirector(Constants.DISPLAY_UNIT_TYPE_DELUXE,Constants.CONNECTIVITY_TYPE_BROADBAND,3);
        qmsDirector.constructQMS(qmsBuilder);
        System.out.println(qmsBuilder.getQMS().getPrice());
    }

}
