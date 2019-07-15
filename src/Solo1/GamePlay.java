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
public class GamePlay {
    public static void main(String[]args) 
    {
    Deck ch = new Deck();
    ch.generate(); //calls method to generate 60 cards
    // print 60 cards
    for (Cards c :ch.deck) // ch.deck is the first data, stored into c
    {
        System.out.println(c.getS()+ " "+ c.getV());
    }
    }
}
