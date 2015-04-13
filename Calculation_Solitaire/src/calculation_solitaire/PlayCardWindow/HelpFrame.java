/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculation_solitaire.PlayCardWindow;

/**
 *
 * @author mbyrd
 */
public class HelpFrame extends javax.swing.JFrame {

    /**
     * Creates new form HelpFrame
     */
    public HelpFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("<html>\n\n<h1>How to Play</h1>\n<ul>\n  <li><b>Select a Card</b></li>\n  Card's may be selected with a left mouse click. The selected card will have a blue outline.\n  <li><b>Move a Card</b></li>\n  A selected card may be moved by selecting another card.\n  <li><b>Deselect a Card</b></li>\n  A card may be deselected by left clicking on the selected card.\n</ul>\n\n<h1>Game Rules</h1>\n<ul>\n  <li><b>Objective</b></li>\n  To build four suits in a row based on the foundation card. Each card on the foundation card is to be twice that of<br>\n  the base card and each suit is to be built upwards to the king, regardless of suit, by the internal prescribed by the <br>\nfoundation card.\n  <li><b>Foundation Piles</b></li>\n   Each card on the foundation card is to be twice that of the base card and each suit is to be built upwards to the <br>\nking, regardless of suit, by the internal prescribed by the foundation card.\n  <li><b>Waste Piles</b></li>\n  Waste piles are to be used as temporary holding spaces when no other legal moves can be made. Cards are not <br>\npermitted to be moved from waste pile to waste pile! So, be mindful the ordering of these cards.\n  <li><b>Deck</b></li>\n  The deck is the face down stack of cards. You are only allowed to deal a new card from the deck once the stock <br>\ncard has been moved to either a foundation or a waste pile.\n  <li><b>Stock Card</b></li>\n  This is the card that the top card of deck is dealt to once the deck has been selected. This card must be moved <br>\nbefore a new card can be dealt.\n\n</ul>\n</html>");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jScrollPane1.setViewportView(jLabel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
