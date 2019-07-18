/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Solo1;

/**
 *
 * @author Jeremiah MacDougall
 */
public class Player {
    private String playerName; 
    private int overallScore;
    private int roundScore;

    public Player(String name) {
        this.playerName = name;
        this.roundScore = 0;
        this.overallScore = 0;

}
    /**
     * @return the playerName
     */
    public String getPlayerName() {
        return playerName;
    }

    /**
     * @param playerName the playerName to set
     */
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    /**
     * @return the overallScore
     */
    public int getOverallScore() {
        return overallScore;
    }

    /**
     * @param overallScore the overallScore to set
     */
    public void setOverallScore(int overallScore) {
        this.overallScore = overallScore;
    }

    /**
     * @return the roundScore
     */
    public int getRoundScore() {
        return roundScore;
    }

    /**
     * @param roundScore the roundScore to set
     */
    public void setRoundScore(int roundScore) {
        this.roundScore = roundScore;
    }
    
}
