/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculation_solitaire;

public class FoundationPile {
    
    private int[] myPile;
    private int i=0;
   
   public FoundationPile(){
        
    }
    
    
    public FoundationPile(int[] a){
        this.myPile=a;
    }
      
    public boolean validFoundation(int b){
        if(this.myPile[i+1]==b){
            this.i++;
            return true;
        } else {
            return false;
        }
    }
    
    public void setI(int index) {
        i = index;
    }
    
    public boolean isFull() {
        if (i == 12) {
            return true;
        } else {
            return false;
        }
    }
    
    public int geti(){
        return i;
    }
    
    public int getMyPileAt(int n){
        return myPile[n];
    }
}
