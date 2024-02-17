import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class scientificCalculatorTest {

    @Test
    public void testSquareRootPositiveNumber() {
        assertEquals(4.0, scientificCalculator.squareRoot(16.0), 0.0001);
    }

    @Test
    public void testSquareRootNegativeNumber() {
        assertEquals(0.0, scientificCalculator.squareRoot(-16.0), 0.0001);
    }

    @Test
    public void testNaturalLogarithm() {
        assertEquals(2.302585, scientificCalculator.naturalLogarithm(10.0), 0.000001);
    }

    @Test
    public void testNaturalLogarithmNonPositiveNumber() {
        assertEquals(0.0, scientificCalculator.naturalLogarithm(0.0), 0.000001);
        assertEquals(0.0, scientificCalculator.naturalLogarithm(-1.0), 0.00001);
    }

    @Test
    public void testPowerFunction() {
        assertEquals(1000.0, scientificCalculator.powerFunction(10.0, 3.0), 0.0001);
    }

    @Test
    public void testPowerFunctionNegativeExponent() {
        assertEquals(0.001, scientificCalculator.powerFunction(10.0, -3.0), 0.0001);
    }

    @Test
    public void testPowerFunctionZeroExponent() {
        assertEquals(1.0, scientificCalculator.powerFunction(10.0, 0.0), 0.0001);
    }

    @Test
    public void testFactorial() {
        assertEquals(120, scientificCalculator.factorial(5));
    }

    @Test
    public void testFactorialZero() {
        assertEquals(1, scientificCalculator.factorial(0));
    }

    @Test
    public void testFactorialNegative() {
        assertEquals(-1, scientificCalculator.factorial(-10), 0);
    }
}