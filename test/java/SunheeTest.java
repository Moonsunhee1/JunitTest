import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by ce416-07 on 2014. 10. 24..
 */
public class SunheeTest {
    @Test
    public void testSub() throws Exception{
        subtest();
    }

    private void subtest(){
        assertThat(2-1,is(1));
    }

}
