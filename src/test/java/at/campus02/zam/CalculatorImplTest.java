package at.campus02.zam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorImplTest {
    private Calculator calc;

    @BeforeEach
    void setup() {
        //SETUP PHASE
        calc = new CalculatorImpl();
    }

    @Test
    void should_add_two_numbers() {
        //EXERCISE PHASE
        double sol = calc.add(42,68);


        //VERIFY PHASE
        Assertions.assertEquals(110, sol, 0.001); //only with double 3rd parameter
//        Assertions.assertFalse(true);
    }
    @Test
    void should_multiply_two_numbers () {
        Assertions.assertEquals(42, calc.multiply(6,7));
    }
}
