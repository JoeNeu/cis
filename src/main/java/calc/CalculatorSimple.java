package calc;

public class CalculatorSimple implements Calculator {

    CalculatorSimple(){}
    @Override
    public int sum(int... numbers) {
        if(numbers.length != 2) {
            throw new IllegalArgumentException();
        }
        return numbers[0] + numbers[1];
    }
}
