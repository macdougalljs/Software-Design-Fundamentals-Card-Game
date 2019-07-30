/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author Jeremiah MacDougall
 */
public class GamePlay {
    
    public static Cards[] RandomizedArray(Cards[] array){
	Random rgen = new Random();  // Random number generator			
 
	for (int i=0; i<array.length; i++) {
            int randomPosition = rgen.nextInt(array.length);
	    Cards temp = array[i];
	    array[i] = array[randomPosition];
	    array[randomPosition] = temp;
	}
 
	return array;
}
    
    public static void main(String[]args) 
    {
    Scanner inputObj = new Scanner(System.in);
  
    Deck ch = new Deck();
    ch.generate(); //calls method to generate 60 cards
    
    
    ArrayList<Cards> deck1 = new ArrayList<>();
    ArrayList<Cards> deck2 = new ArrayList<>();
    
    ArrayList<Cards> playerCollected1 = new ArrayList<>();
    ArrayList<Cards> playerCollected2 = new ArrayList<>();
    
    
          
         
   
    
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
    
        // enter main game code here
        
        RandomizedArray(ch.deck);
    
        for (int x=0; x<ch.deck.length; x++){
          deck1.add(ch.deck[x]);  
        }
  
        for (int x=30; x<60; x++) {
          deck2.add(ch.deck[x]);    
        }

        do {
        // this is where we'll do the comparisons and move the cards around
       
        // pull cards from player 1 and 2
        // compare them
        // who's is greater? they both get moved to that players collection
        // are they equal?  then
        
        // ----------  START ANOTHER LOOP 
        // and draw two more cards from each, but don't 
        // show them;  draw a 3rd card from each and show them
        // the higher player takes all the cards, if they're the same
        // LOOP THIS AGAIN! ----^
        
        } while (!deck1.isEmpty() && !deck2.isEmpty());        
        
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
