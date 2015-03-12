/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculation_solitaire;

/**
 *
 * @author Alienware
 */
public class Card {
    
    /**
     * One of the four valid suits for this cards 
     */
    private int myValue;
    
    /**
     * The number of this card, where Ace: 1, Jack-King: 11-13
     */
    private Suit mySuit;
    
    /**
     * Card constructor
     * 
     * @param aSuit the suit of the card
     * @param aValue the value of the card
     */
    public Card(Suit aSuit, int aValue){
        this.mySuit=aSuit;
        
        if(aValue>=1 && aValue <= 13){
            this.myValue=aValue;
         }else{
            System.err.println(aValue + "is not a valid Card Number");
            System.exit(1);
        }
    }
    
    
    /**
     * Return the number of the card
     * @return the number
     */
    
    public int getValue(){
        return myValue;
    }
    
    public String toString (){
        
        String valStr = "";
        
        switch(this.myValue){
            
            case 1:
                valStr ="Ace"; 
                
            case 2:
                valStr ="Two";
                
            case 3:
                valStr ="Three";
                
            case 4:
                valStr ="Four";    
                
            case 5:
                valStr ="Five";   
                
            case 6:
                valStr ="Six";   
                
            case 7:
                valStr ="Seven";   
                
            case 8:
                valStr ="Right";   
                 
            case 9:
                valStr ="Nine";   
                
            case 10:
                valStr ="Ten"; 
                
            case 11:
                valStr ="Jack"; 
                
            case 12:
                valStr ="Queen"; 
                
            case 13:
                valStr ="King"; 
                
            default: 
                valStr = "Error";
                
        }
        
        return valStr + "of" + mySuit.toString();
    }
}
