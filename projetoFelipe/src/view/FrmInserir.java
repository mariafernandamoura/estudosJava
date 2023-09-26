package view;

import control.CantoControl;
import exceptions.StringVaziaException;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FrmInserir extends javax.swing.JFrame {

    CantoControl cc;
    public FrmInserir() {
        initComponents();
        cc = new CantoControl();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnLimpar = new javax.swing.JButton();
        btnIncluir = new javax.swing.JButton();
        txtSeq = new javax.swing.JTextField();
        txtHref = new javax.swing.JTextField();
        txtIn = new javax.swing.JTextField();
        txtGr = new javax.swing.JTextField();
        txtTr = new javax.swing.JTextField();
        txtTrSept = new javax.swing.JTextField();
        txtRef = new javax.swing.JTextField();
        txtAlPasch = new javax.swing.JTextField();
        txtOf = new javax.swing.JTextField();
        txtHy = new javax.swing.JTextField();
        txtCo = new javax.swing.JTextField();
        txtAl = new javax.swing.JTextField();
        lblSeq = new javax.swing.JLabel();
        lblHref = new javax.swing.JLabel();
        lblIn = new javax.swing.JLabel();
        lblGr = new javax.swing.JLabel();
        lblAl = new javax.swing.JLabel();
        lblOf = new javax.swing.JLabel();
        lblCo = new javax.swing.JLabel();
        lblHy = new javax.swing.JLabel();
        lblTr = new javax.swing.JLabel();
        lblTrSe = new javax.swing.JLabel();
        lblAlPasch = new javax.swing.JLabel();
        lblRef = new javax.swing.JLabel();
        txtTitle = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnLimpar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.setToolTipText("");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnIncluir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnIncluir.setText("Inserir");
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        txtSeq.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtHref.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtIn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtGr.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtTr.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtTrSept.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtRef.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtAlPasch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtOf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtHy.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtCo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtAl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblSeq.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSeq.setText("seq:");

        lblHref.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblHref.setText("href:");

        lblIn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblIn.setText("in:");

        lblGr.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblGr.setText("gr:");

        lblAl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblAl.setText("al:");

        lblOf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblOf.setText("of:");

        lblCo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCo.setText("co:");

        lblHy.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblHy.setText("hy:");

        lblTr.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTr.setText("tr:");

        lblTrSe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTrSe.setText("trSept:");

        lblAlPasch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblAlPasch.setText("alPasch:");

        lblRef.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblRef.setText("ref:");

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTitle.setText("title:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblAl)
                                    .addComponent(lblHref, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblIn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblGr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblOf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblSeq, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtSeq, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtHref, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtIn, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtGr, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAl, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtOf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblRef, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblCo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblAlPasch, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblTrSe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblTr, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblHy, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCo)
                                    .addComponent(txtHy)
                                    .addComponent(txtTr)
                                    .addComponent(txtAlPasch)
                                    .addComponent(txtRef)
                                    .addComponent(txtTrSept, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lblTitle)
                        .addGap(18, 18, 18)
                        .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitle))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSeq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSeq))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHref, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHref))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIn))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblGr))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtOf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblOf)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHy))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTr))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTrSe)
                            .addComponent(txtTrSept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAlPasch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAlPasch))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRef))))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIncluir)
                    .addComponent(btnLimpar))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        try
        {
            cc.inserirCanto(txtTitle.getText(), txtHref.getText(), txtIn.getText(), txtGr.getText(), txtAl.getText(), txtOf.getText(), txtCo.getText(), txtHy.getText(), txtTr.getText(), txtTrSept.getText(), txtAlPasch.getText(), txtRef.getText(), txtSeq.getText());
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        }
        catch (SQLException e) {
           JOptionPane.showMessageDialog(null, e.getMessage());
        }
        catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        catch (StringVaziaException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }        
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtTitle.setText(null);
        txtTitle.setText(null);
        txtHref.setText(null);
        txtIn.setText(null);
        txtGr.setText(null);
        txtAl.setText(null);
        txtOf.setText(null);
        txtCo.setText(null);
        txtHy.setText(null); 
        txtTr.setText(null);
        txtTrSept.setText(null);
        txtAlPasch.setText(null);
        txtRef.setText(null);
        txtSeq.setText(null);
    }//GEN-LAST:event_btnLimparActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmInserir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmInserir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmInserir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmInserir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmInserir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAl;
    private javax.swing.JLabel lblAlPasch;
    private javax.swing.JLabel lblCo;
    private javax.swing.JLabel lblGr;
    private javax.swing.JLabel lblHref;
    private javax.swing.JLabel lblHy;
    private javax.swing.JLabel lblIn;
    private javax.swing.JLabel lblOf;
    private javax.swing.JLabel lblRef;
    private javax.swing.JLabel lblSeq;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTr;
    private javax.swing.JLabel lblTrSe;
    private javax.swing.JTextField txtAl;
    private javax.swing.JTextField txtAlPasch;
    private javax.swing.JTextField txtCo;
    private javax.swing.JTextField txtGr;
    private javax.swing.JTextField txtHref;
    private javax.swing.JTextField txtHy;
    private javax.swing.JTextField txtIn;
    private javax.swing.JTextField txtOf;
    private javax.swing.JTextField txtRef;
    private javax.swing.JTextField txtSeq;
    private javax.swing.JTextField txtTitle;
    private javax.swing.JTextField txtTr;
    private javax.swing.JTextField txtTrSept;
    // End of variables declaration//GEN-END:variables
}
