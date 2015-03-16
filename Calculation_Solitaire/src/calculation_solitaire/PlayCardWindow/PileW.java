/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculation_solitaire.PlayCardWindow;
import java.awt.Graphics;  
import javax.swing.ImageIcon;  
import javax.swing.JLayeredPane;  
import calculation_solitaire.Deck;
/**
 *
 * @author Alienware
 */
public class PileW extends JLayeredPane  
{  
  
    private static final long serialVersionUID = 1L;  
    public Deck pile;  
  
    public PileW(Deck pile)  
    {  
        this.pile = pile;  
        setLayout(null);  
          
        //4px for the border when chosen  
//        setSize(MainWindow.POKERWIDTH + 4, MainWindow.POKERHEIGHT + 4);  
           
    }  
  
    public void paint(Graphics g)  
    {  
        super.paint(g);  
        g.drawImage(  
                new ImageIcon(this.getClass().getResource("/images/bg.gif"))  
                        .getImage(), 2, 2, null);  
  
        setOpaque(false); 
    }  
}  
