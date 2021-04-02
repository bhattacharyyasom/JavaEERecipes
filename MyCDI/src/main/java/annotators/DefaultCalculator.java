package annotators;

import javax.inject.Qualifier;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


//This custom qualifier is used to bring in more restriction on what kind of injection we want our bean to be used in
//Stronger than @Named examples but also more complicated to setup
//In this example we are allowing this annotation to be used at a type level to allow bean definition and parameter to make sure it can be used at the
//injection point on a constructor parameter

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.PARAMETER})
public @interface DefaultCalculator {
}
