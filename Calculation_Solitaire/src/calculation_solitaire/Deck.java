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
        this.numCards=48;
        this.myCards= new Card[this.numCards];
        
        //init card index
         int c = 0;
         
        // for each suit
        for(int s = 0; s < 4; s++){
            
            // for each number
            for(int n = 1; n <= 13; n++){                
                //add a new card to the deck
                this.myCards[c]=new Card(Suit.values()[s],n);
                
                int val = this.myCards[c].getValue();
                Suit suit = this.myCards[c].getSuit();
                
                //do not add ace, two, three, or four of spades to the deck.
                if (val == 1 && suit.equals(Suit.Spades)) {
                    this.myCards[c]=null;
                    continue;
                } else if (val == 2 && suit.equals(Suit.Spades)) {
                    this.myCards[c]=null;
                    continue;
                } else if (val == 3 && suit.equals(Suit.Spades)) {
                    this.myCards[c]=null;
                    continue;
                } else if (val == 4 && suit.equals(Suit.Spades)) {
                    this.myCards[c]=null;
                    continue;
                } else {
                    c++;
                }               
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
        if (!isEmpty()) {
            
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
        } else {
            return null;
        }
    }
    
    public boolean isEmpty() {
        if (numCards == 0) {
            return true;
        } else {
            return false;
        }
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
    
    public int getSize(){
        return this.numCards;
    }
    
    //return card at specified index.
    public Card get(int index){
        return myCards[index];
    }
    
    /**
     * Check all cards in the deck to make sure they are all unique.
     */
    public void hasSameCards() {       
        for (int c = 0; c < this.numCards; c++) {
            for (int e = c + 1; e < this.numCards; e++) {
                if (this.myCards[c].equals(this.myCards[e])) {
                    System.err.println("Card at index " + c + " is equal to "
                            + "card at index " + e + ".\nINCORRECT DECK");
                }
            }
        }
    }   
    
 }




