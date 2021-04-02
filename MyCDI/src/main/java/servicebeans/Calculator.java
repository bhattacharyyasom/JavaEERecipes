package servicebeans;

import annotators.DefaultCalculator;

@DefaultCalculator
public class Calculator implements Calculate {
    @Override
    public int add(int a , int b){
        return a + b;
    }
}
