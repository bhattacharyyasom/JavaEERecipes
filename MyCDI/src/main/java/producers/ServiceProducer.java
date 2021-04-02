package producers;

import model.CustomDateTime;

import javax.enterprise.inject.Produces;
import java.util.Calendar;

//This class will hold most of this applications beans that need initialization
public class ServiceProducer {

    //This method instantiates the bean of the class with certain dependencies
    @Produces
    public CustomDateTime getDateTimeU(){
    return  new CustomDateTime(Calendar.getInstance().getTime(), "Current time and date");
    }

}
