import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class SimpleTest {
    @Before
    public void setUp() {
        // Do preparation like instantiation classes
    }

    @Test
    public void firstTest() {
        assertNotNull(new String("hello world"));
        assertEquals(2, 1 + 1);
    }
}
