/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casino;

/**
 *
 * @author jakec
 */
public class WinnerPanel extends javax.swing.JFrame {

    /**
     * Creates new form WinnerPanel
     */
    public WinnerPanel() {
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

        PlayerW = new javax.swing.JLabel();
        DealerW = new javax.swing.JLabel();
        Draw = new javax.swing.JLabel();
        Continue = new javax.swing.JButton();
        playerBust = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        PlayerW.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        PlayerW.setText("Player Wins!");
        getContentPane().add(PlayerW);
        PlayerW.setBounds(170, 110, 120, 30);

        DealerW.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        DealerW.setText("Dealer Wins.");
        getContentPane().add(DealerW);
        DealerW.setBounds(170, 110, 122, 31);

        Draw.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        Draw.setText("Draw!");
        getContentPane().add(Draw);
        Draw.setBounds(170, 110, 55, 31);

        Continue.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        Continue.setText("Continue");
        Continue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContinueActionPerformed(evt);
            }
        });
        getContentPane().add(Continue);
        Continue.setBounds(420, 90, 180, 80);

        playerBust.setFont(new java.awt.Font("Impact", 1, 24)); // NOI18N
        playerBust.setText("Player bust!");
        getContentPane().add(playerBust);
        playerBust.setBounds(170, 110, 130, 31);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContinueActionPerformed
        java.awt.Window WindowsOpen[] = java.awt.Window.getWindows(); //Grabs all windows, and assigns it to an array.                              //https://coderanch.com/t/538905/java/Closing-open-windows-opening
        for (int i = 0; i < WindowsOpen.length; i++) { //Cycles through all opened windows from Java.
            WindowsOpen[i].dispose(); //Closes the current window in the cycle.
        }
        MainMenu LoadMainMenu = new MainMenu();
        LoadMainMenu.setSize(700, 550);
        LoadMainMenu.setVisible(true);
    }//GEN-LAST:event_ContinueActionPerformed

    /**
     * @param args the command line arguments
     */
    public void main(String args[]) {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WinnerPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinnerPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinnerPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinnerPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WinnerPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Continue;
    public static javax.swing.JLabel DealerW;
    public static javax.swing.JLabel Draw;
    public static javax.swing.JLabel PlayerW;
    public static javax.swing.JLabel playerBust;
    // End of variables declaration//GEN-END:variables
}
