package bowlingUnitTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author lee heberer
 * @author jason ayer
 * @author duane ziege
 */
@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
            BowlingJUnitTest.class,
            BiggerGameJUnitTest.class
        })
public class MyTestSuite {
    
    public MyTestSuite() {
    }
    
}
