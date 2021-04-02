package servicebeans;

import org.apache.commons.lang3.tuple.Pair;

import javax.inject.Named;

@Named("ScientificCalculator")
public class ScientificCalculator implements Calculate,Exponential {
    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public Pair<Long, Long> coordinates(Long l) {
        return new Pair<>() {
            @Override
            public Long getLeft() {
                return 123L;
            }

            @Override
            public Long getRight() {
                return 23L;
            }

            @Override
            public Long setValue(Long aLong) {
                return 15L;
            }
        };
    }
}
