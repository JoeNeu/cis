package calc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;



public class CalculatorExtendedTest {

    private CalculatorExtended calc;

    @BeforeEach
    public void setup(){
        CalculatorFactory factory = new CalculatorFactoryImpl();
        calc = (CalculatorExtended) factory.createInstance(false);
    }

    @Test
    public void testSum(){
        assertEquals(4,calc.sum(2,2));
    }

    @Test
    public void testSum3Numbers() {
        assertEquals(6, calc.sum(1, 2, 3));
    }
}
