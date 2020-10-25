package pl.coderslab.unittestskrajeew05.zadanie03;

import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {

    @Test
    public void circleArea() {
        Circle circleTested = new Circle();
        double v = circleTested.circleArea(10.);
        double expectedArea = Math.PI * Math.pow(10,2);
        assertEquals(expectedArea, v,0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void circleAreaForZero() {
        Circle circleTested = new Circle();
        circleTested.circleArea(-1.);

    }
}