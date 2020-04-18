/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

/**
 *
 * @author pedro
 */
public class ListaDoentes extends javax.swing.JFrame {

    /**
     * Creates new form ListaDoentes
     */
    public ListaDoentes() {
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

        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btEditar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btExcluir = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btInserir = new javax.swing.JButton();
        txtEnfermaria = new javax.swing.JTextField();
        txtMedico = new javax.swing.JTextField();
        txtCama = new javax.swing.JTextField();
        txtLocalidade = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        ComboGrav = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel3.setText("Lista de Doentes");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(290, 10, 150, 20);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código do Doente", "Nome", "Data de Nascimento", "Localidade", "Cama", "Médico", "Enfermaria", "Gravidade", "Data entrada", "Data Saída"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(table);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(10, 50, 670, 160);

        btEditar.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btEditar);
        btEditar.setBounds(580, 380, 100, 30);

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel10.setText("Data de Saída :");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(270, 460, 110, 20);

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel11.setText("Data de entrada :");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(270, 410, 130, 20);

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel12.setText("Gravidade :");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(270, 290, 80, 20);

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel13.setText("Enfermaria :");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(270, 230, 90, 20);

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel14.setText("Médico :");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(20, 460, 60, 20);

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel15.setText("Cama :");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(20, 400, 60, 20);

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel16.setText("Localidade :");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(20, 350, 80, 20);

        jLabel17.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel17.setText("Data Nasc:");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(270, 350, 70, 20);

        jLabel18.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel18.setText("Nome :");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(20, 290, 60, 20);

        jLabel19.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel19.setText("Codigo :");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(20, 230, 60, 20);

        btExcluir.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.setEnabled(false);
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btExcluir);
        btExcluir.setBounds(580, 330, 100, 30);

        btLimpar.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btLimpar.setText("Limpar");
        btLimpar.setEnabled(false);
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btLimpar);
        btLimpar.setBounds(580, 280, 100, 30);

        btInserir.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btInserir.setText("Inserir");
        btInserir.setEnabled(false);
        getContentPane().add(btInserir);
        btInserir.setBounds(580, 230, 100, 30);

        txtEnfermaria.setEnabled(false);
        getContentPane().add(txtEnfermaria);
        txtEnfermaria.setBounds(380, 230, 110, 30);

        txtMedico.setEnabled(false);
        getContentPane().add(txtMedico);
        txtMedico.setBounds(110, 450, 100, 30);

        txtCama.setEnabled(false);
        txtCama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCamaActionPerformed(evt);
            }
        });
        getContentPane().add(txtCama);
        txtCama.setBounds(110, 400, 100, 30);

        txtLocalidade.setEnabled(false);
        getContentPane().add(txtLocalidade);
        txtLocalidade.setBounds(110, 350, 100, 30);

        txtNome.setEnabled(false);
        getContentPane().add(txtNome);
        txtNome.setBounds(110, 290, 100, 30);

        txtCodigo.setEnabled(false);
        getContentPane().add(txtCodigo);
        txtCodigo.setBounds(110, 230, 100, 30);

        ComboGrav.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Por definir", "Moderado", "Grave", "Muito Grave" }));
        ComboGrav.setToolTipText("");
        ComboGrav.setEnabled(false);
        ComboGrav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboGravActionPerformed(evt);
            }
        });
        getContentPane().add(ComboGrav);
        ComboGrav.setBounds(380, 280, 110, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/undo-button2.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(600, 10, 24, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sydney-opera-house.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(640, 10, 30, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ListaDoentesFundo.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 850, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btEditarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btLimparActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btExcluirActionPerformed

    private void txtCamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCamaActionPerformed

    private void ComboGravActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboGravActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboGravActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main1(String args[]) {
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
            java.util.logging.Logger.getLogger(ListaDoentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaDoentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaDoentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaDoentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ListaDoentes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboGrav;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btInserir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtCama;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtEnfermaria;
    private javax.swing.JTextField txtLocalidade;
    private javax.swing.JTextField txtMedico;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
