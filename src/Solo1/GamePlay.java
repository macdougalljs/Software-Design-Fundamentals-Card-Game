/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Solo1;

/**
 *
 * @author Team Raptors
 */
public class GamePlay {
    public static void main(String[]args) 
    {
    CardHand ch = new CardHand();
    ch.generate(); //calls method to generate 60 cards
    // print 60 cards
    for (CardGame c :ch.deck) // ch.deck is the first data, stored into c
    {
        System.out.println(c.getS()+ " "+ c.getV());
    }
    }
}
