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
public class Deck {
    private int size=60;
    private Cards [] deck = new Cards[size]; // Array of object created
    
      
    public void generate() 
    {
        int counter = 0;
        for (Cards.Suit s :Cards.Suit.values() ) 
        {
            for (Cards.Value v :Cards.Value.values() ) 
            {
                Cards c1 = new Cards(s,v);
                getDeck()[counter] = c1;
                
                // or,   deck[counter] = new Cardgame(s,v);
                counter++;
            }
        }
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * @return the deck
     */
    public Cards[] getDeck() {
        return deck;
    }

    /**
     * @param deck the deck to set
     */
    public void setDeck(Cards[] deck) {
        this.deck = deck;
    }
    
}
