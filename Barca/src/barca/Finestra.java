/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barca;

/**
 *
 * @author studente
 */
public class Finestra extends javax.swing.JFrame {
    private int x;
    private int y;
    private int xi,yi;
    public Finestra() {
        initComponents();
        this.x = this.barca.getX();
        this.y = this.barca.getY();
        this.xi = x;
        this.yi = y;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        barca = new javax.swing.JLabel();
        avvia = new javax.swing.JButton();
        ferma = new javax.swing.JButton();
        frecciaSu = new javax.swing.JButton();
        frecciaGiù = new javax.swing.JButton();
        frecciaDestra = new javax.swing.JButton();
        frecciaSinistra = new javax.swing.JButton();
        velocità = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        barca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barca/yacht.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(barca)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(377, Short.MAX_VALUE)
                .addComponent(barca)
                .addContainerGap())
        );

        avvia.setText("AVVIA");
        avvia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avviaActionPerformed(evt);
            }
        });

        ferma.setText("FERMA");
        ferma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fermaActionPerformed(evt);
            }
        });

        frecciaSu.setText("▲");
        frecciaSu.setEnabled(false);
        frecciaSu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frecciaSuActionPerformed(evt);
            }
        });

        frecciaGiù.setText("▼");
        frecciaGiù.setEnabled(false);
        frecciaGiù.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frecciaGiùActionPerformed(evt);
            }
        });

        frecciaDestra.setText("►");
        frecciaDestra.setEnabled(false);
        frecciaDestra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frecciaDestraActionPerformed(evt);
            }
        });

        frecciaSinistra.setText("◄");
        frecciaSinistra.setEnabled(false);
        frecciaSinistra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frecciaSinistraActionPerformed(evt);
            }
        });

        velocità.setMaximum(20);
        velocità.setMinimum(5);
        velocità.setMinorTickSpacing(5);
        velocità.setPaintLabels(true);
        velocità.setPaintTicks(true);
        velocità.setSnapToTicks(true);
        velocità.setToolTipText("");
        velocità.setValue(0);

        jLabel2.setText("Velocità della barca");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(avvia, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ferma, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(frecciaSu, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(frecciaSinistra, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(frecciaGiù, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(frecciaDestra, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(86, 86, 86))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(velocità, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(avvia)
                    .addComponent(ferma))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(frecciaSu, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(frecciaGiù, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(frecciaDestra, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(frecciaSinistra, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(velocità, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void avviaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avviaActionPerformed
        frecciaSu.setEnabled(true);
        frecciaGiù.setEnabled(true);
        frecciaSinistra.setEnabled(true);
        frecciaDestra.setEnabled(true);
    }//GEN-LAST:event_avviaActionPerformed
    
            
    private void fermaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fermaActionPerformed
        frecciaSu.setEnabled(false);
        frecciaGiù.setEnabled(false);
        frecciaSinistra.setEnabled(false);
        frecciaDestra.setEnabled(false);
        barca.setLocation(xi,yi);
    }//GEN-LAST:event_fermaActionPerformed

    private void frecciaSuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frecciaSuActionPerformed
        barca.setLocation(x,y-velocità.getValue());
        y = y - velocità.getValue();
    }//GEN-LAST:event_frecciaSuActionPerformed

    private void frecciaGiùActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frecciaGiùActionPerformed
        barca.setLocation(x,y+velocità.getValue());
        y = y + velocità.getValue();
    }//GEN-LAST:event_frecciaGiùActionPerformed

    private void frecciaDestraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frecciaDestraActionPerformed
        barca.setLocation(x+velocità.getValue(),y);
        x = x + velocità.getValue();
    }//GEN-LAST:event_frecciaDestraActionPerformed

    private void frecciaSinistraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frecciaSinistraActionPerformed
        barca.setLocation(x-velocità.getValue(),y);
        x = x - velocità.getValue();
    }//GEN-LAST:event_frecciaSinistraActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Finestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Finestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Finestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Finestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Finestra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton avvia;
    private javax.swing.JLabel barca;
    private javax.swing.JButton ferma;
    private javax.swing.JButton frecciaDestra;
    private javax.swing.JButton frecciaGiù;
    private javax.swing.JButton frecciaSinistra;
    private javax.swing.JButton frecciaSu;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSlider velocità;
    // End of variables declaration//GEN-END:variables
}
