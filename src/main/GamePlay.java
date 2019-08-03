
package main;

import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author Jeremiah MacDougall
 */
public class GamePlay {  // consider moving this into an object
    
    public static Cards[] CreateRandomArray(Cards[] array){
	Random randomNum = new Random();  // Random number generator			
 
	for (int i=0; i<array.length; i++) {
            int rPos = randomNum.nextInt(array.length);
	    Cards temp = array[i];
	    array[i] = array[rPos];
	    array[rPos] = temp;
	}
 
	return array;
}
    
    public static void main(String[]args) {
    Scanner inputObj = new Scanner(System.in);
  
    Deck ch = new Deck();
    ch.generate(); //calls method to generate 60 cards
    Cards player1Card;
    Cards player2Card;
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
        
        CreateRandomArray(ch.getDeck());  // randomize the card deck
    
        // assign the first half of the deck to player 1
        for (int x=0; x<ch.getDeck().length/2; x++){
          player1.playerDeck.add(ch.getDeck()[x]);  
        }
  
        // assign the second half of the deck to player 2
        for (int x=ch.getDeck().length/2+1; x<ch.getDeck().length; x++) {
          player2.playerDeck.add(ch.getDeck()[x]);    
        }
       
        do {
        // this is where we'll do the comparisons and move the cards around
        // pull cards from player 1 and 2
       
        player1Card = player1.playerDeck.remove(player1.playerDeck.size()-1);
        player2Card = player2.playerDeck.remove(player2.playerDeck.size()-1);

        System.out.println(player1.getPlayerName()+" flips card: " + player1Card.toString());
        System.out.println(player2.getPlayerName()+" flips card: " + player2Card.toString());    
        
        if (player1Card.convertToInt() > player2Card.convertToInt()) 
        {
            player1.playerWinnings.add(player2Card);
            player1.playerWinnings.add(player1Card);
            System.out.println(player1.getPlayerName()+" takes this round!");
        }
        else if (player1Card.convertToInt() < player2Card.convertToInt()) 
        {
            player2.playerWinnings.add(player1Card);
            player2.playerWinnings.add(player1Card);
            System.out.println(player2.getPlayerName()+" takes this round!");
        }
        else {
        System.out.println("TIME FOR WAR!!");
        }  //  it's a tie!  TIME FOR WAR!!!
        // compare them
        // who's is greater? they both get moved to that players collection
        // are they equal?  then
        
        // ----------  START ANOTHER LOOP 
        // and draw two more cards from each, but don't 
        // show them;  draw a 3rd card from each and show them
        // the higher player takes all the cards, if they're the same
        // LOOP THIS AGAIN! ----^
        
        System.out.println(player1.getPlayerName()+" winnings so far: "+player1.playerWinnings.size()+" Remaining Cards: "+player1.playerDeck.size());
        System.out.println(player2.getPlayerName()+" winnings so far: "+player2.playerWinnings.size()+" Remaining Cards: "+player2.playerDeck.size());
        
        System.out.print("Type 'Y' and press enter to continue. ");
        String input = inputObj.next(); 
        
        } while (player1.playerDeck.size() > 0 && player2.playerDeck.size() > 0);        
       // String winner = player1.playerWinnings.size() > player1.playerWinnings.size() ? winner = player1.getPlayerName() : winner = player2.getPlayerName();
        if (player1.playerWinnings.size() > player2.playerWinnings.size()) 
       {
           System.out.println("Congratulations "+player1.getPlayerName()+", you win!");
           int score = player1.getOverallScore();
           score++;
           player1.setOverallScore(score);
       }
        else
        {
           System.out.println("Congratulations "+player2.getPlayerName()+", you win!");
           int score = player2.getOverallScore();
           score++;
           player2.setOverallScore(score);
        }
        System.out.println("Overall Scores:");
        System.out.println(player1.getPlayerName()+" "+player1.getOverallScore());
        System.out.println(player2.getPlayerName()+" "+player2.getOverallScore());
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
