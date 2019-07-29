/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Jeremiah MacDougall
 */
public class Cards {
    // enum
public enum Suit {HEARTS, DIAMONDS, SPADES, CLUBS};
    private Suit s; //encapsulation principle applied
                  
    public enum Value{ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, KING, QUEEN, JACK, PRINCESS, ACE};
    
    
    private Value v; 
    // constructor
    
    public Cards() {
       this.s= Suit.CLUBS;
       this.v= Value.ACE;        
    }
    
    public Cards(Suit s, Value v)
    {
        this.s=s;
        this.v=v;
    }

    /**
     * @return the s
     */
    public Suit getS() {
        return s;
    }

    /**
     * @param s the s to set
     */
    public void setS(Suit s) {
        this.s = s;
    }

    /**
     * @return the v
     */
    public Value getV() {
        return v;
    }

    /**
     * @param v the v to set
     */
    public void setV(Value v) {
        this.v = v;
    }
}
