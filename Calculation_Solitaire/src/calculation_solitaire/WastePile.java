/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculation_solitaire;
import java.util.*;


/**
 *
 * @author Alienware
 */
public class WastePile{
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
    
   
    private Stack<Card> WastePile = new Stack<Card>();
    
    
    public WastePile(){
     this.numCards=0;
     
    }
    
    
    
    public void push(Card iCard) {       
        this.WastePile.push(iCard);
        this.numCards++;
   } 
    
    
    public Card pop(){
        if(!this.WastePile.isEmpty()){
            Card oCard = this.WastePile.pop();
            this.numCards--;
            return oCard;
        }else{
            this.numCards--;
            return null;
        }
        
    }
    
    public Card peek(){
        if(!this.WastePile.isEmpty()){
            Card pCard = this.WastePile.peek();
            pCard.setFaceUp(true);
            return pCard;
        }else{
            return null;
        }
    }
    
    public boolean isEmpty(){
        return this.WastePile.isEmpty();
    }
    
    
    
    
    
    
    
    
    
    
    
    public void showpush( Card iCard) {
      String iCardName=iCard.toString();
      this.WastePile.push(iCard);
      System.out.println("push(" + iCard.toString() + ")");
      System.out.println("stack: " + WastePile);
   }

   static void showpop(Stack WastePile) {
      System.out.print("pop -> ");
      Card oCard = (Card)WastePile.pop();
      System.out.println(oCard.toString());
      System.out.println("stack: " + WastePile);
   }
    
    
    
    
}
