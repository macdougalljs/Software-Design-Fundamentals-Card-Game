/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Solo1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Jeremiah MacDougall
 */
public class GamePlay {
    public static void main(String[]args) 
    {
    Scanner inputObj = new Scanner(System.in);
    Deck origch = new Deck();
    origch.generate(); //calls method to generate 60 cards
    
    List<Deck> list = Arrays.asList(origch);
    Collections.shuffle(list);
    Object[] ch = list.toArray();
    char keepPlaying; 
    System.out.println("WAR GAME");
    System.out.println("Welcome to the War Game! Let's take the players names.");
    
    // take the players names, and initialize the new player objects
    
    System.out.print("Enter Player 1: ");
    Player player1 = new Player(inputObj.next());
    
    System.out.print("Enter Player 2: ");
    Player player2 = new Player(inputObj.next());
           
    // this is the primary game loop; the game will run until the user quits
    
    do {
    
        System.out.print("Play another round? (Y/N): ");
        
       keepPlaying = inputObj.next().toUpperCase().charAt(0);
       
    } while (keepPlaying == 'Y');
    
    // print 60 cards
    /* this is the original code to display the cards sequentally. 
    for (Cards c :ch.deck) // ch.deck is the first data, stored into c
    {
        System.out.println(c.getS()+ " "+ c.getV());

    }
*/
    }
}
