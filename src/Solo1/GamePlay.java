/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Solo1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Jeremiah MacDougall
 */
public class GamePlay {
    public static void main(String[]args) 
    {
    Deck origch = new Deck();
    origch.generate(); //calls method to generate 60 cards
    
    List<Deck> list = Arrays.asList(origch);
    Collections.shuffle(list);
    Object[] ch = list.toArray();
    
    
    // print 60 cards
    /* this is the original code to display the cards sequentally. 
    for (Cards c :ch.deck) // ch.deck is the first data, stored into c
    {
        System.out.println(c.getS()+ " "+ c.getV());

    }
*/
    }
}
