
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//cool tests

public class CounterTest {

    @Test
    public void testConstructor() {
        Counter ctr = new Counter();
        assertEquals(0, ctr.getValue());
    }

    @Test
    public void testReset() {
        Counter ctr = new Counter();
        ctr.reset();
        assertEquals(0, ctr.getValue());
    }

}
