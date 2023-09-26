package view;

import control.CantoControl;


public class FrmMain extends javax.swing.JFrame {

    CantoControl cc;

    public FrmMain() {
        initComponents();
        cc = new CantoControl();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jmInserir = new javax.swing.JMenuItem();
        jmExcluir = new javax.swing.JMenuItem();
        jmPesquisar = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Principal");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Criar / Editar / Excluir");

        jmInserir.setText("Criar");
        jmInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmInserirActionPerformed(evt);
            }
        });
        jMenu2.add(jmInserir);

        jmExcluir.setText("Excluir");
        jmExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmExcluirActionPerformed(evt);
            }
        });
        jMenu2.add(jmExcluir);

        jMenuBar1.add(jMenu2);

        jmPesquisar.setText("Pesquisar");

        jMenuItem1.setText("Pesquisar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jmPesquisar.add(jMenuItem1);

        jMenuBar1.add(jmPesquisar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmInserirActionPerformed
        FrmInserir frameInserir = new FrmInserir();
        frameInserir.setVisible(true);
    }//GEN-LAST:event_jmInserirActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        FrmPesquisar framePesquisar = new FrmPesquisar();
        framePesquisar.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jmExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmExcluirActionPerformed
        FrmExcluir frameExcluir = new FrmExcluir();
        frameExcluir.setVisible(true);
    }//GEN-LAST:event_jmExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jmExcluir;
    private javax.swing.JMenuItem jmInserir;
    private javax.swing.JMenu jmPesquisar;
    // End of variables declaration//GEN-END:variables
}
