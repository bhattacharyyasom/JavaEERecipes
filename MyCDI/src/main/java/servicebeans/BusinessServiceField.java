package servicebeans;

import javax.inject.Inject;
import javax.inject.Named;

//Field Injection
public class BusinessServiceField {
    @Inject
    @Named("ScientificCalculator")
    private Calculate calculate ;

    public int doAdd(){
      return calculate.add(2,3);
    }
}
