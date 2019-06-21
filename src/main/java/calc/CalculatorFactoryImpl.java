package calc;

public class CalculatorFactoryImpl implements CalculatorFactory {
    @Override
    public Calculator createInstance(boolean simpleCalc) {
        return simpleCalc ? new CalculatorSimple() : new CalculatorExtended();
    }
}
