
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
    
   
    
    public int convertToInt() {  // converts the Value of the card to an integer value
        int temp = 0;
        
        switch(this.getV()) {
         case ONE : temp = 1; 
             break;
         case TWO : temp = 2;
             break;
         case THREE : temp = 3;
             break;
         case FOUR : temp = 4;
             break;
         case FIVE : temp = 5;
             break;
         case SIX : temp = 6;
             break;
         case SEVEN : temp = 7;
             break;
         case EIGHT : temp = 8;
             break;
         case NINE : temp = 9;
             break;
         case TEN : temp = 10;
             break;
         case KING : temp = 14;
             break;
         case QUEEN : temp = 13;
             break;
         case JACK : temp = 11;
             break;
         case PRINCESS : temp = 12;
             break;
         case ACE : temp = 15;
             break;
             
     }
        
     return temp;
    }
    
     @Override
    public String toString() {
     StringBuilder buildString = new StringBuilder();
    
     /* HEARTS, DIAMONDS, SPADES, CLUBS};
    private Suit s; //encapsulation principle applied
                  
    public enum Value{ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, KING, QUEEN, JACK, PRINCESS, ACE};
    */
     
     switch(convertToInt()) {
         case 1 : buildString.append("One");
             break;
         case 2 : buildString.append("Two");
             break;
         case 3 : buildString.append("Three");
             break;
         case 4 : buildString.append("Four");
             break;
         case 5 : buildString.append("Five");
             break;
         case 6 : buildString.append("Six");
             break;
         case 7 : buildString.append("Seven");
             break;
         case 8 : buildString.append("Eight");
             break;
         case 9 : buildString.append("Nine");
             break;
         case 10 : buildString.append("Ten");
             break;
         case 14 : buildString.append("King");
             break;
         case 13 : buildString.append("Queen");
             break;
         case 11 : buildString.append("Jack");
             break;
         case 12 : buildString.append("Princess");
             break;
         case 15 : buildString.append("Ace");
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
