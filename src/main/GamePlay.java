
package main;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author Jeremiah MacDougall
 */
public class GamePlay {  // consider moving this into an object
    
    public static Cards[] CreateRandomArray(Cards[] array){
	Random randomNum = new Random();  		
 
	for (int x=0; x<array.length; x++) {
            int rPos = randomNum.nextInt(array.length);
	    Cards temp = array[x];
	    array[x] = array[rPos];
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
    ArrayList<Cards> player1Battle = new ArrayList<>();
    ArrayList<Cards> player2Battle = new ArrayList<>();
    char keepPlaying; 
    System.out.println("WAR GAME");
    System.out.println("Welcome to the War Game! Let's take the players names.");
    
    // take the players names, and initialize the new player objects
    
    System.out.print("Enter Player #1 Name: ");
    Player player1 = new Player(inputObj.next());
    
    System.out.print("Enter Player #2 Name: ");
    Player player2 = new Player(inputObj.next());
           
    // this is the primary game loop; the game will run until the user quits
    
    do {
    
        // enter main game code here
        
        CreateRandomArray(ch.getDeck());  // randomize the card deck
    
        // assign the first half of the deck to player 1
        for (int x=0; x<ch.getDeck().length/2; x++){
          player1.getPlayerDeck().add(ch.getDeck()[x]);  
        }
  
        // assign the second half of the deck to player 2
        for (int x=ch.getDeck().length/2; x<ch.getDeck().length; x++) {
          player2.getPlayerDeck().add(ch.getDeck()[x]);    
        }
      //  System.out.println(player1.getPlayerName()+" winnings so far: "+player1.getPlayerWinnings().size()+" Remaining Cards: "+player1.getPlayerDeck().size());
      //  System.out.println(player2.getPlayerName()+" winnings so far: "+player2.getPlayerWinnings().size()+" Remaining Cards: "+player2.getPlayerDeck().size());
  
        
        do {
        // this is where we'll do the comparisons and move the cards around
        // pull cards from player 1 and 2
       
        player1Card = player1.getPlayerDeck().remove(player1.getPlayerDeck().size()-1);
        player2Card = player2.getPlayerDeck().remove(player2.getPlayerDeck().size()-1);

        System.out.println(player1.getPlayerName()+" flips card: " + player1Card.toString());
        System.out.println(player2.getPlayerName()+" flips card: " + player2Card.toString());    
        
        if (player1Card.convertToInt() > player2Card.convertToInt()) 
        {
            player1.getPlayerWinnings().add(player2Card);
            player1.getPlayerWinnings().add(player1Card);
            System.out.println(player1.getPlayerName()+" takes this round!");
        }
        else if (player1Card.convertToInt() < player2Card.convertToInt()) 
        {
            player2.getPlayerWinnings().add(player1Card);
            player2.getPlayerWinnings().add(player1Card);
            System.out.println(player2.getPlayerName()+" takes this round!");
        }
        else if (player1Card.convertToInt() == player2Card.convertToInt() &&
                player1.getPlayerDeck().size() > 0 && player2.getPlayerDeck().size() > 0) 
        {
            boolean war = true;
            do 
            {
                System.out.println("TIME FOR WAR!!");

                player1Battle.add(player1Card);
                player2Battle.add(player2Card);  // add the current drawn cards to battle piles

                do 
                {
                    for (int x = 0; x < 2; x++) {
                        // draw 3 more cards and add them to the battle piles 
                        // if the deck is almost used up, only draw enough cards 
                        // so that there is at least one card left to show who wins
                        // the battle
                        if (player1.getPlayerDeck().size() > 1 && player2.getPlayerDeck().size() > 1) 
                        { 
                            player1Card = player1.getPlayerDeck().remove(player1.getPlayerDeck().size()-1);
                            player2Card = player2.getPlayerDeck().remove(player2.getPlayerDeck().size()-1);
                            player1Battle.add(player1Card);
                            player1Battle.add(player2Card);
                            System.out.println(player1.getPlayerName()+ " and "
                                +player2.getPlayerName()+" both pull a hidden card.");
                        }
                    }
                    
                    player1Card = player1.getPlayerDeck().remove(player1.getPlayerDeck().size()-1);
                    player2Card = player2.getPlayerDeck().remove(player2.getPlayerDeck().size()-1);
                    player1Battle.add(player1Card);  // add card to battle pile 1
                    player1Battle.add(player2Card); // add card to battle pile 2
                    
                    System.out.println(player1.getPlayerName()+" flips card: " + player1Card.toString());
                    System.out.println(player2.getPlayerName()+" flips card: " + player2Card.toString());    
     
                } while (player1Card.convertToInt()== player2Card.convertToInt() 
                        && (player1.getDeckSize() > 0 || player2.getDeckSize() > 0) );
                
                
                if (player1Card.convertToInt() > player2Card.convertToInt()) {
                    war = false;
                System.out.println(player1.getPlayerName().toUpperCase()+" WINS THE BATTLE!");
                    for (int x=0; x < player2Battle.size(); x++) {
                        // add code to move cards from battle list to player card collection
                         player1.getPlayerWinnings().add(player2Battle.get(x));
                    }
                
                } else 
                {
                    System.out.println(player2.getPlayerName().toUpperCase()+" WINS THE BATTLE!");
                    war = false;
                     for (int x=0; x < player1Battle.size(); x++) {
                        player2.getPlayerWinnings().add(player1Battle.get(x));
// add code to move cards from battle list to player card collection
                        
                    }
                }
                
  
          //  System.out.println(player2.getPlayerName()+" takes this round!");
                
                
            } while (war);     
        }  
        else 
            System.out.println("A player is out of cards!");
       
        System.out.println(player1.getPlayerName()+" winnings so far: "+player1.getPlayerWinnings().size()+" Remaining Cards: "+player1.getPlayerDeck().size());
        System.out.println(player2.getPlayerName()+" winnings so far: "+player2.getPlayerWinnings().size()+" Remaining Cards: "+player2.getPlayerDeck().size());
        
     //   System.out.print("Type 'Y' and press enter to continue. ");
     //   String input = inputObj.next();  removed the pause
        
        } while (player1.getPlayerDeck().size() > 0 && player2.getPlayerDeck().size() > 0);        

        if (player1.getPlayerWinnings().size() > player2.getPlayerWinnings().size()) 
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
       
        System.out.println();
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
