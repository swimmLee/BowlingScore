package bowlingUnitTest;

import bowling.Game;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Ignore;

/**
 *
 * @author lee heberer
 */
public class BowlingJUnitTest {
    Game g;
    
    public BowlingJUnitTest() {
    }
    
    @Before
    public void setUp(){
        g = new Game();
    }
    
    @Test
    public void testScore(){
        int score = g.getScore();
        assertEquals("The score is incorrect.",0,score);
    }
    
    @Test
    public void testSetTestScore(){
        g.setTestOpenScore(4,20);
        int score = g.getScore();
        assertEquals("The score is incorrect.",60,score);
    }
    
    @Test
    public void testAllSpareGame(){
        g.setSpareTestScore(7,3,21);
        int score = g.getScore();
        assertEquals("The score is incorrect.",170,score);
    }
}
