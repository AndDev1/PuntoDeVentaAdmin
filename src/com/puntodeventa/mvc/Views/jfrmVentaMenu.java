/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puntodeventa.mvc.Views;

import com.puntodeventa.global.Util.TagHelper;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class jfrmVentaMenu extends javax.swing.JDialog {

    public jfrmVentaMenu(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jpnlTitle = new javax.swing.JPanel();
        jlblQueryProduct = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/salir.gif"))); // NOI18N
        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/corteCaja.png"))); // NOI18N
        jButton3.setText("Corte de caja");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancelar.png"))); // NOI18N
        jButton1.setText("Cancelar venta");

        jpnlTitle.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlblQueryProduct.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        jlblQueryProduct.setForeground(new java.awt.Color(91, 219, 91));
        jlblQueryProduct.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblQueryProduct.setText("Seleccione una opción");

        javax.swing.GroupLayout jpnlTitleLayout = new javax.swing.GroupLayout(jpnlTitle);
        jpnlTitle.setLayout(jpnlTitleLayout);
        jpnlTitleLayout.setHorizontalGroup(
            jpnlTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblQueryProduct, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnlTitleLayout.setVerticalGroup(
            jpnlTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlTitleLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jlblQueryProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnlTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnlTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 35, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int op = JOptionPane.showConfirmDialog(rootPane, TagHelper.getTag("jfrmLogin.exitQuest"), TagHelper.getTag("jfrmLogin.exitDialogTitle"), 2);
        if (op == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jlblQueryProduct;
    private javax.swing.JPanel jpnlTitle;
    // End of variables declaration//GEN-END:variables
}
