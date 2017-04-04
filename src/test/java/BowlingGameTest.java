import org.junit.Test;
import static org.junit.Assert.*;

public class BowlingGameTest {

    @Test
    public void aTest() {
        assertEquals(0, new BowlingGame().getScore(0));
    }
}
