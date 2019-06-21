package calc;

import java.util.Arrays;

public class CalculatorExtended implements Calculator {

    CalculatorExtended(){}
    //private Mockit toBeMocked;

    @Override
    public int sum(int... numbers)
    {
        return Arrays.stream(numbers)
                .sum();
    }
}
