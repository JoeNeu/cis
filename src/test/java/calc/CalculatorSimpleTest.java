package calc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorSimpleTest {

    private Calculator calc;

    @BeforeEach
    public void setup(){
        CalculatorFactory factory = new CalculatorFactoryImpl();
        calc = factory.createInstance(true);
    }

    @Test
    public void testSum(){
        assertEquals(4,calc.sum(2,2));
    }

    @Test
    public void testSum3Numbers() {
        assertThrows(IllegalArgumentException.class, () -> calc.sum(1, 2, 3));
    }
}
