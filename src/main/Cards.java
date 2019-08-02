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
    
    @Override
    
    public String toString() {
     StringBuilder buildString = new StringBuilder();
    
     /* HEARTS, DIAMONDS, SPADES, CLUBS};
    private Suit s; //encapsulation principle applied
                  
    public enum Value{ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, KING, QUEEN, JACK, PRINCESS, ACE};
    */
     
     switch(this.getV()) {
         case ONE : buildString.append("One");
             break;
         case TWO : buildString.append("Two");
             break;
         case THREE : buildString.append("Three");
             break;
         case FOUR : buildString.append("Four");
             break;
         case FIVE : buildString.append("Five");
             break;
         case SIX : buildString.append("Six");
             break;
         case SEVEN : buildString.append("Seven");
             break;
         case EIGHT : buildString.append("Eight");
             break;
         case NINE : buildString.append("Nine");
             break;
         case TEN : buildString.append("Ten");
             break;
         case KING : buildString.append("King");
             break;
         case QUEEN : buildString.append("Queen");
             break;
         case JACK : buildString.append("Jack");
             break;
         case PRINCESS : buildString.append("Princess");
             break;
         case ACE : buildString.append("Ace");
             break;
             
     }
     
     buildString.append(" of ");
         
     switch(this.getS()) {
         case HEARTS :
             buildString.append("Hearts");
             break;
         case DIAMONDS :
             buildString.append("Diamonds");
             break;
         case CLUBS :
             buildString.append("Clubs");
             break;
         case SPADES : 
             buildString.append("Spades");
             break;
     }
     
     return buildString.toString();
    }
}
