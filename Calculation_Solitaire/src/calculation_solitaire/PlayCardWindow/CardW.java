/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculation_solitaire.PlayCardWindow;
import javax.swing.ImageIcon;  
import javax.swing.JLabel;
import calculation_solitaire.Card;
import javax.swing.Icon;

/**
 *
 * @author Alienware
 */
public class CardW extends JLabel{  
      
  
    private static final long serialVersionUID = 1L;  
    private Card card;  
    private boolean faceUp;
      
    public CardW(Card c)  
    {  
        super();  
        this.card=c;  
//        setBounds(0,0,MainWindow.POKERWIDTH, MainWindow.POKERHEIGHT);  
    }  
      
    public void setFaceUp(boolean isFaceUp)  
    {  
        faceUp = isFaceUp;
    }
      
}  
