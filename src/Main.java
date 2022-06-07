import config.Constants;
import qms.QMSBuilder;
import qms.QMSConcreteBuilder;
import qms.QMSDirector;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter the Queue Management Package Name (Deluxe/Optimal/Poor) : ");
            String packageName=scanner.nextLine();
            System.out.println("Enter the type of connectivity : ");
            String connectivityType=scanner.nextLine();
            System.out.println("Enter the number of display units : ");
            int quantity=scanner.nextInt();
            QMSBuilder qmsBuilder=new QMSConcreteBuilder();
            QMSDirector qmsDirector=new QMSDirector(packageName,connectivityType,quantity);
            qmsDirector.constructQMS(qmsBuilder);
            System.out.println(qmsBuilder.getQMS());
        }
    }

}
