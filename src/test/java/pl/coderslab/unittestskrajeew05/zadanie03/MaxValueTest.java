package pl.coderslab.unittestskrajeew05.zadanie03;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxValueTest {

    @Test
    public void largestPositiveNumbers() {

        final  int[] testList = {1,2,3,4,10,100,1000};
        int largest = MaxValue.largest(testList);
        assertEquals(1000, largest);
    }

    @Test
    public void largestNegativeNumbers() {
        final  int[] testList2 = {-1,-2,-3,-4,-10,-100,-1000};
        int largest = MaxValue.largest(testList2);
        assertEquals(-1, largest);
    }

    @Test
    public void largestPositiveNegativeNumbers() {
        final int[] testList3 = {-1,2000,3,4,-10,-100,-1000};
        int largest = MaxValue.largest(testList3);
        assertEquals(2000, largest);
    }
}