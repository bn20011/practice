package codewars;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestSumPositive {
    @Test
    public void testSomething() {
        assertEquals(15, SumPositive.sumPosNr(new int[]{1,2,3,4,5}));
        assertEquals(13, SumPositive.sumPosNr(new int[]{1,-2,3,4,5}));
        assertEquals(0, SumPositive.sumPosNr(new int[]{}));
        assertEquals(0, SumPositive.sumPosNr(new int[]{-1,-2,-3,-4,-5}));
        assertEquals(9, SumPositive.sumPosNr(new int[]{-1,2,3,4,-5}));
    }
}
