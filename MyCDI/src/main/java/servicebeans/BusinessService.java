package servicebeans;

import annotators.DefaultCalculator;
import model.CustomDateTime;

import javax.inject.Inject;

//Constructor Injection using a custom qualifier to only allow constructor injection
public class BusinessService {
    private Calculate c;
    private CustomDateTime customDateTime;

    @Inject
    public BusinessService(@DefaultCalculator Calculate c, CustomDateTime customDateTime) {
        this.c = c;
        this.customDateTime = customDateTime;
    }

    public int doAdd() {
        System.out.println(customDateTime.getTime());
        return c.add(2, 3);
    }
}
