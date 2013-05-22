package com.puntodeventa.mvc.Views;

import com.puntodeventa.global.Util.TagHelper;
import java.awt.event.KeyEvent;

/**
 *
 * @author USER
 */
public class jfrmVentaConsultProductPrice extends javax.swing.JDialog {

    private String productDescription;
    private String productPrice;

    public jfrmVentaConsultProductPrice(java.awt.Frame parent, boolean modal, String productDescription, String productPrice) {
        super(parent, modal);
        this.productDescription = productDescription;
        this.productPrice = productPrice;
        initComponents();
        setTagValues ();
        setLocationRelativeTo(null);
    }

    private void setTagValues (){
        this.jlblQueryProduct.setText(TagHelper.getTag("jfrmConsultProductPrice.title"));
        this.jlblProductDescription.setText(productDescription);
        this.jlblProductPrice.setText("$" + productPrice);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnlTitle = new javax.swing.JPanel();
        jlblQueryProduct = new javax.swing.JLabel();
        jpnlContent = new javax.swing.JPanel();
        jlblProductDescription = new javax.swing.JLabel();
        jlblProductPrice = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(484, 283));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });

        jpnlTitle.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlblQueryProduct.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        jlblQueryProduct.setForeground(new java.awt.Color(91, 219, 91));
        jlblQueryProduct.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblQueryProduct.setText("Consulta de precio");

        javax.swing.GroupLayout jpnlTitleLayout = new javax.swing.GroupLayout(jpnlTitle);
        jpnlTitle.setLayout(jpnlTitleLayout);
        jpnlTitleLayout.setHorizontalGroup(
            jpnlTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblQueryProduct, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnlTitleLayout.setVerticalGroup(
            jpnlTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblQueryProduct, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnlContent.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlblProductDescription.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        jlblProductDescription.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblProductDescription.setText("Coca Cola");

        jlblProductPrice.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jlblProductPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblProductPrice.setText("$7.50");

        javax.swing.GroupLayout jpnlContentLayout = new javax.swing.GroupLayout(jpnlContent);
        jpnlContent.setLayout(jpnlContentLayout);
        jpnlContentLayout.setHorizontalGroup(
            jpnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlContentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblProductDescription, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                    .addComponent(jlblProductPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpnlContentLayout.setVerticalGroup(
            jpnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlContentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblProductDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblProductPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpnlContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnlTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnlTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpnlContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped
        if (evt.getKeyChar() == KeyEvent.VK_ESCAPE) {
            this.dispose();
        }
    }//GEN-LAST:event_formKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jlblProductDescription;
    private javax.swing.JLabel jlblProductPrice;
    private javax.swing.JLabel jlblQueryProduct;
    private javax.swing.JPanel jpnlContent;
    private javax.swing.JPanel jpnlTitle;
    // End of variables declaration//GEN-END:variables
}
