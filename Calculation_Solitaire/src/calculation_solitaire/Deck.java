/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculation_solitaire;
import java.util.Random;
/**
 * An implementation of a deck of cards.
 *
 * @author Alienware
 * @since 3/10/2015
 */
public class Deck {
    
    /**
     * The array of cards in the deck, where the top card is in the first index.
     */
    private Card[] myCards;
//    private ArrayList<Card> myCards;
//    private LinkedList<Card> myCards;
   
    
    
    /**
     * The number of cards currently in the deck.
     */
    private int numCards;
    
    
    /**
     *  Constructor with a default of one deck (52 cards) and no shuffling. 
     */  
        public Deck(){
        // Call the other constructor, defining one deck without shuffling
            
            this(false);
            
    }
    
    
    
    /**
     *  Constructor that defines the number of decks
     * @param shuffle  whether to shuffle the cards
     */
    public Deck(boolean shuffle){
        this.numCards=52;
        this.myCards= new Card[this.numCards];
        
        //init card index
         int c = 0;
    
        // for each suit
        for(int s = 0; s < 4; s++){
            
            // for each number
            for(int n = 1; n <= 13; n++){
                
                //add a new card to the deck
                this.myCards[c]=new Card(Suit.values()[s],n);
                c++;
            }
        }
        if(shuffle){
           this.shuffle();
        }
   }
    //shuffle
    
    
    /**
     * Shuffle deck by randomly swapping pairs of cards.
     */
    public void shuffle(){
        
        //init random number generator
        Random rng = new Random();
        
        //temporary card
        
        Card temp;
        
        int j;
        for (int i=0; i<this.numCards;i++){
            
            // get a random card j to swap i's value with
            j=rng.nextInt(this.numCards);
            
            //do swap
            temp=this.myCards[i];
            this.myCards[i] = this.myCards[j];
            this.myCards[j]=temp;
        }
    }
    
    
    /**
     * Deal the next card from the top of the deck.
     * 
     * @return the dealt card
     */
    public Card dealNextCard(){
        //Get the top card
        
        Card top= this.myCards[0];
        
        //shift all the subsequent cards to the left by one index
        
        for(int c=1; c<this.numCards; c++){
            this.myCards[c-1]=this.myCards[c];
        }
        this.myCards[this.numCards-1]=null;
        
        //decrement the number of cards in our deck
        this.numCards--;
        
        return top;
    }
    
    
    
    
    /**
     * Print the top cards in the deck.
     * 
     * @param numToPrint the number of cards from the top of the deck to print.
     */
    public void printDeck(int numToPrint){
        for(int c=0; c<numToPrint; c++){
            System.out.printf("% 3d/%d %s\n", c+1, this.numCards,
                    this.myCards[c].toString());
        }
        System.out.printf("\t[%d others]\n", this.numCards-numToPrint);
    }
 }
