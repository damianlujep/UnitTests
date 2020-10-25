package pl.coderslab.unittestskrajeew05.example01;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private final Calculator calcUnderTest = new Calculator();
    private static final double DELTA = .000000001;

    @Test
    public void shouldAddTwoPositiveNumbers() {
        final double actual = calcUnderTest.add(2., 2.);
        assertEquals(4., actual, DELTA);
    }

    @Test
    public void shouldAddTwoNegativeNumbers() {
        final double actual = calcUnderTest.add(-3., -5.);
        assertEquals(-8., actual, DELTA);
    }

    @Test
    public void shouldAddPositiveAndNegativeNum() {
        final double actual = calcUnderTest.add(20., -50.);
        assertEquals(-30., actual, DELTA);
    }

    @Test
    public void shouldAddTwoZeros() {
        final double actual = calcUnderTest.add(0., 0.);
        assertEquals(0., actual, DELTA);
    }

    @Test
    public void shouldSubtractPositiveNumbers() {
        final double actual = calcUnderTest.subtract(5., 4.);
        assertEquals(1., actual, DELTA);
    }

    @Test
    public void shouldSubtractPositiveNumbersGivingNegative() {
        final double actual = calcUnderTest.subtract(4., 15.);
        assertEquals(-11., actual, DELTA);
    }

    @Test
    public void shouldMultiplyPositiveNumbers() {
        final double actual = calcUnderTest.multiply(8., 3.);
        assertEquals(24., actual, DELTA);
    }

    @Test
    public void shouldDividePositiveNumbers() {
        final double actual = calcUnderTest.divide(4., 2.);
        assertEquals(2., actual, DELTA);
    }

    @Test
    public void shouldDividePositiveNumbersGivingFraction() {
        final double actual = calcUnderTest.divide(5., 2.);
        assertEquals(2.5, actual, DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenDividingByZero() {
        final double actual = calcUnderTest.divide(5., 0.);
    }

    @Test
    public void shouldReturnTrueWhenComparingValues() {
        final boolean actual = calcUnderTest.greater(55, 2);
        assertTrue(actual);
    }

    @Test
    public void shouldReturnFalseWhenComparingValues() {
        final boolean actual = calcUnderTest.greater(2, 8);
        assertFalse(actual);
    }

    @Test
    public void shouldReturnFalseWhenComparingEqualValues() {
        final boolean actual = calcUnderTest.greater(33, 33);
        assertFalse(actual);
    }

    @Test
    public void evaluatesExpression() {
        Calculator calculator = new Calculator();
        int sum = calculator.eval("1+2+3");
        assertEquals(6, sum);

    }

    @Test
    public void factorialTestOne() {
        double factorial = calcUnderTest.factorial(4);
    }
}