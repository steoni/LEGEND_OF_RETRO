/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

/**
 *
 * @author bornbygoogle
 */
public class mainPanel extends javax.swing.JPanel {

    /**
     * Creates new form mainPanel
     */
    public mainPanel() {
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

        menuPanel = new javax.swing.JPanel();
        buttonProduit = new javax.swing.JButton();
        buttonClient = new javax.swing.JButton();
        buttonAchat = new javax.swing.JButton();
        buttonVente = new javax.swing.JButton();
        buttonPromo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(150, 560));

        buttonProduit.setText("Produit");
        buttonProduit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonProduitActionPerformed(evt);
            }
        });

        buttonClient.setText("Client / Fournisseur");
        buttonClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClientActionPerformed(evt);
            }
        });

        buttonAchat.setText("Achat");
        buttonAchat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAchatActionPerformed(evt);
            }
        });

        buttonVente.setText("Vente");
        buttonVente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVenteActionPerformed(evt);
            }
        });

        buttonPromo.setText("Promo");
        buttonPromo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPromoActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(250, 5, 5));
        jLabel1.setText("* obligatoire");

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonProduit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonClient, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(buttonAchat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonVente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonPromo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 48, Short.MAX_VALUE)))
                .addContainerGap())
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(buttonProduit, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(buttonClient, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(buttonAchat, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(buttonVente, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(buttonPromo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 36, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonProduitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonProduitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonProduitActionPerformed

    private void buttonClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonClientActionPerformed

    private void buttonAchatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAchatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAchatActionPerformed

    private void buttonVenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonVenteActionPerformed

    private void buttonPromoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPromoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonPromoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAchat;
    private javax.swing.JButton buttonClient;
    private javax.swing.JButton buttonProduit;
    private javax.swing.JButton buttonPromo;
    private javax.swing.JButton buttonVente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel menuPanel;
    // End of variables declaration//GEN-END:variables
}