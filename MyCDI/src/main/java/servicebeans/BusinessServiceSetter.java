package servicebeans;

import javax.inject.Inject;
import javax.inject.Named;

//Setter Injection
public class BusinessServiceSetter {
    private Calculate c ;

    @Inject
    public void setCalculator(@Named("ScientificCalculator")Calculate c){
        this.c=c;
    }
    public int doAdd(){
      return c.add(2,3);
    }
}
