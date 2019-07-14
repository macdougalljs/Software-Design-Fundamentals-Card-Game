/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Raptors;

/**
 *
 * @author Team Raptors
 */
public class CardHand {
    private int size=60;
    public CardGame [] deck = new CardGame[size]; // Array of object created
    public void generate() 
    {
        int counter = 0;
        for (CardGame.Suit s :CardGame.Suit.values() ) 
        {
            for (CardGame.Value v :CardGame.Value.values() ) 
            {
                CardGame c1 = new CardGame(s,v);
                deck[counter] = c1;
                
                // or,   deck[counter] = new Cardgame(s,v);
                counter++;
            }
        }
    }
    
}
