package bowling;

/**
 *A program that calculates bowling scores.
 * @author lee heberer
 */
public class Bowling {

    public static void main(String[] args) {
        Game g = new Game();
        g.setGameFrames();
        System.out.printf("score returned = %d.\n",g.setCalculateGameScore(21));
        g.setMessage("Score = " + g.getScore() + "\n\n");
        
        g.setRoll();
        System.out.printf("score returned = %d.\n",g.setCalculateGameScore(21));
        g.setMessage("Score = " + g.getScore());
    }
    
}
