import org.junit.Test;

import static org.junit.Assert.*;

public class SumTest {

    @Test//positive test
    public void numberIsSum() {
        int[] y = {1, 5, 8};
        assertTrue(Sum.isSum(9, y));
    }

    @Test//negative test
    public void numberIsNotSum() {
        int[] y = {2, 8, 6, 1, 4, 23, 2};
        assertFalse(Sum.isSum(11, y));
    }

    @Test
    public void emptyArray(){
        int[]y = {};
        assertFalse(Sum.isSum(0, y));
    }
}