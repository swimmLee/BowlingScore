package bowling;

import java.util.Scanner;

/**
 * This class calculates the game score for bowling for one player.
 * @author lee heberer
 * @author jason ayer
 * @author duane ziege
 */
public class Game {
    private int score = 0;
    private int[] roll = new int[21];
    
    /**
     * This a bowling score calculator for one player for one game.
     * Frame scores are loaded into array and game total is calculated
     * when 
     */
    public Game(){
    }
    
    /**
     * Uses keyboard to load roll array.
     * No error checking for invalid roll entry.
     * Follow the rules of the game.
     */
    public void setRoll(){
        setScore(0);
        int j = 0;
        Scanner kb = new Scanner(System.in);
        for(int i=0; i<10; i++){
            setMessage("enter pin count for first ball for frame "+ (i+1));
            roll[j] = Integer.parseInt(kb.nextLine());
            if(roll[j] == 10){
                setMessage("Strike - congradulations.");
                if(i==9 && (roll[j] == 10)){
                    setMessage("enter your second ball for frame " + (i+1));
                    roll[j+1] = Integer.parseInt(kb.nextLine());
                    setMessage("enter your third ball for frame " + (i+1));
                    roll[j+2] = Integer.parseInt(kb.nextLine());
                    j++;
                }
                j++;
            }
            else if(roll[j] <10 && roll[j] >= 0){
                setMessage("enter pin count for second ball of frame " + (i+1));
                roll[j+1] = Integer.parseInt(kb.nextLine());
                if(roll[j] + roll[j+1] == 10)
                    setMessage("Spare covered - nice roll");
                if(i==9 && (roll[j]+roll[j+1] == 10)){
                    setMessage("enter your third ball for frame " + (i+1));
                    roll[j+2] = Integer.parseInt(kb.nextLine());
                    j++;
                }
                j+=2;
            }
        }
    }
    
    /**
     * Outputs messages to screen.
     * @param message a string passed to method for output.
     */
    public void setMessage(String message){
        System.out.println(message);
    }
    
    /**
     * Loads the array with identical pin fall each frame
     * Tests scoring arithmetic.
     * @param pins pin fall each roll
     * @param rolls the number of rolls
     */
    public void setTestScore(int pins, int rolls){//
        for(int i=0; i<rolls; i++){
            roll[i] = pins;
            roll[i+1] = pins;
        }
        for(int i=0; i<rolls-1; i+=2){
            if(roll[i]+roll[i+1] == 10 && i%2 == 0){
                score += roll[i] + roll[i+1] + roll[i+2];
            }
            else{
                score += roll[i] + roll[i+1];
            }
        }
    }
    
    /**
     * Calculates the game score for array of pin fall
     * @param rolls rolls for game. max for game.
     * @return game total score.
     */
    public int setCalculateGameScore(int rolls){//
        int i=0;
        for(int j=0; j<10; j++){
            if(roll[i] == 10){
                score += roll[i] + roll[i+1] + roll[i+2];
                System.out.printf("frame %d,  %d,   score %d\n",j+1,roll[i], score);
                i++;
            }
            else if(roll[i]+roll[i+1] == 10){
                score += roll[i] + roll[i+1] + roll[i+2];
                System.out.printf("frame %d,  %d, %d, score %d\n",j+1,roll[i],roll[i+1], score);
                i+=2;
            }
            else{
                score += roll[i] + roll[i+1];
                System.out.printf("frame %d,  %d, %d, score %d\n",j+1,roll[i],roll[i+1], score);
                i+=2;
            }
        }
        return score;
    }
    
    /**
     *For testing the spare scoring. First + second = 10
     * @param first first ball rolled every frame
     * @param second second ball rolled every frame
     * @param rolls 
     */
    public void setSpareTestScore(int first,int second, int rolls){//
        for(int i=0; i<rolls-1; i+=2){
            roll[i] = first;
            roll[i+1] = second;
        }
        roll[20] = first;
        for(int i=0; i<rolls-1; i+=2){
            if(roll[i]+roll[i+1] == 10 && i%2 == 0){
                score += roll[i] + roll[i+1] + roll[i+2];
            }
            else{
                score += roll[i] + roll[i+1];
            }
        }
    }
    
    /**
     * Loads the array with pin fall for ball rolled.
     * A test game with known result.
     */
    public void setGameFrames(){
        roll[0] = 3;
        roll[1] = 7;// 1  17
        roll[2] = 7;
        roll[3] = 3;// 2  34
        roll[4] = 7;
        roll[5] = 2;// 3  43
        roll[6] = 9;
        roll[7] = 1;// 4  62
        roll[8] = 9;
        roll[9] = 1;// 5  82
        roll[10] = 10;// 6  112
        roll[11] = 10;// 7  141
        roll[12] = 10;// 8  161
        roll[13] = 9;
        roll[14] = 1;// 9  181
        roll[15] = 10;
        roll[16] = 10;
        roll[17] = 9;// 10  210
        roll[18] = 0;
        roll[19] = 0;
        roll[20] = 0;
    }
    
    /**
     * Returns the score variable
     * @return the score variable.
     */
    public int getScore(){
        return score;
    }
    
    /**
     * Method for resetting score.
     * @param score value to store in score.
     */
    private void setScore(int score){
        this.score = score;
    }
}
