/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Random;

/**
 *
 * @author Jeremiah MacDougall
 */
public class Deck {
    private int size=60;
    public Cards [] deck = new Cards[size]; // Array of object created
    
      
    public void generate() 
    {
        int counter = 0;
        for (Cards.Suit s :Cards.Suit.values() ) 
        {
            for (Cards.Value v :Cards.Value.values() ) 
            {
                Cards c1 = new Cards(s,v);
                deck[counter] = c1;
                
                // or,   deck[counter] = new Cardgame(s,v);
                counter++;
            }
        }
    }
    
}
