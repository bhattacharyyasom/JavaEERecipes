package mycdi;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import servicebeans.BusinessService;
import servicebeans.BusinessServiceField;
import servicebeans.BusinessServiceSetter;

public class CDIBootStrap {
    public static void main(String[] args) {
        //Initialize container
        Weld weld = new Weld();
        WeldContainer weldContainer = weld.initialize();

        //Look up beans. This should lookup their dependencies on their own
        BusinessService businessService = weldContainer.select(BusinessService.class).get();
        BusinessServiceSetter businessServiceSetter = weldContainer.select(BusinessServiceSetter.class).get();
        BusinessServiceField businessServiceField = weldContainer.select(BusinessServiceField.class).get();

        System.out.print("Output is "+businessService.doAdd()+"\n");
        System.out.print("Output is "+businessServiceSetter.doAdd()+"\n");
        System.out.print("Output is "+businessServiceField.doAdd()+"\n");

        //Shutdown container
        weldContainer.shutdown();
    }
}