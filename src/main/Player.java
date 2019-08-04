/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;

/**
 *
 * @author Jeremiah MacDougall
 */
public class Player {

    /**
     * @return the playerDeck
     */
    public ArrayList<Cards> getPlayerDeck() {
        return playerDeck;
    }

    /**
     * @param playerDeck the playerDeck to set
     */
    public void setPlayerDeck(ArrayList<Cards> playerDeck) {
        this.playerDeck = playerDeck;
    }

    /**
     * @return the playerWinnings
     */
    public ArrayList<Cards> getPlayerWinnings() {
        return playerWinnings;
    }

    /**
     * @param playerWinnings the playerWinnings to set
     */
    public void setPlayerWinnings(ArrayList<Cards> playerWinnings) {
        this.playerWinnings = playerWinnings;
    }
    private String playerName; 
    private int overallScore;
    private int roundScore;
    
    private ArrayList<Cards> playerDeck = new ArrayList<>();
    private ArrayList<Cards> playerWinnings = new ArrayList<>();
    
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
    
    public int getDeckSize() {
    return this.playerDeck.size();
    }
    
}
