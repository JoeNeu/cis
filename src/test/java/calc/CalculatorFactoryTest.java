package calc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

@Tag("integration")
public class CalculatorFactoryTest {
    private CalculatorFactory factory;

    @BeforeEach
    public void setUp() {
        factory = new CalculatorFactoryImpl();
    }

    @Test
    public void testSimpleFactory() {
        Calculator calc = factory.createInstance(true);
        assertTrue(calc.getClass() == CalculatorSimple.class);
    }

    @Test
    public void testExtendedFactory() {
        Calculator calc = factory.createInstance(false);
        assertTrue(calc.getClass() == CalculatorExtended.class);
    }
}
