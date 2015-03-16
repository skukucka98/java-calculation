/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculation_solitaire;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Alienware
 */
public class Card {
    
    /**
     * One of the four valid suits for this cards.
     */
    private int myValue;
    
    /**
     * The number of this card, where Ace: 1, Jack-King: 11-13.
     */
    private Suit mySuit;
    
    /**
     * Weather the face of card is up.
     */     
    private boolean faceUp;
    
    
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
    
    public Card(Suit aSuit, int aValue, boolean aFaceUp) {
        this(aSuit, aValue);
        faceUp = aFaceUp;
    }
        
    /**
     * Return the number of the card
     * @return the number
     */
    
    public int getValue(){
        return myValue;
    }
    
    public Suit getSuit(){
        return mySuit;
    }
    
    
    public boolean isFaceUp()  
    {  
        return faceUp;  
    }  
      
    public void setFaceUp(boolean on)  
    {  
        faceUp=on;  
    }
    
    public Icon getIcon() {
        if(faceUp){  
            return new ImageIcon(this.getClass().getResource("images/"+mySuit+myValue+".png"));  
        } else {  
            return new ImageIcon(this.getClass().getResource("images/b2fv.png")); 
        }       
    }
    
    public String toString (){
        
        String valStr = "";
        
        switch(this.myValue){

            case 1:
                valStr ="Ace"; 
                break;            
            case 2:
                valStr ="Two";
                break;
            case 3:
                valStr ="Three";
                break;
            case 4:
                valStr ="Four";    
                break;
            case 5:
                valStr ="Five";   
                break;
            case 6:
                valStr ="Six";   
                break;
            case 7:
                valStr ="Seven";   
                break;
            case 8:
                valStr ="Right";   
                break;
            case 9:
                valStr ="Nine";   
                break;
            case 10:
                valStr ="Ten"; 
                break;
            case 11:
                valStr ="Jack"; 
                break;
            case 12:
                valStr ="Queen"; 
                break;
            case 13:
                valStr ="King"; 
                break;

            default: 
                valStr = "Error";
                break;
        }
        
        return valStr + " of " + mySuit.toString();
    }
    
    /**
     * Compare two different cards for equality.
     * 
     * @return true for equal cards and false for not equal cards.
     */
    public boolean equals(Card otherCard) {
        return this.getValue() == otherCard.getValue() 
                && this.mySuit.equals(otherCard.mySuit);
    }
}
