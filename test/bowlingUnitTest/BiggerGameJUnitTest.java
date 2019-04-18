package bowlingUnitTest;

import bowling.Game;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author lee heberer
 * @author jason ayer
 * @author duane ziege
 */
public class BiggerGameJUnitTest {
    Game g;
    
    public BiggerGameJUnitTest() {
    }
    
    @Before
    public void setUp(){
        g = new Game();
    }
    
    @Test
    public void testAllSpareGame(){
        g.setSpareTestScore(9,1,21);
        int score = g.getScore();
        assertEquals("The score is incorrect.",190,score);
    }
    
    @Test
    public void testSetGameTestScore(){
        g.setGameFrames();
        g.setCalculateGameScore();
        int score = g.getScore();
        assertEquals("the game total is incorrect.",210,score);
    }
    
}
