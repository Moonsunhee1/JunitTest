import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by ce416-07 on 2014. 10. 24..
 */
public class UnitTestTest {
    @Test
    public void testsentenseSum() throws Exception {
            UnitTest unitTest = new UnitTest();
            String result = unitTest.sentenseSum("sun","hee");

        assertEquals("sunhee",result);

    }
}
