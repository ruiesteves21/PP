/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import backend.Sistema;
import backend.Serializacao;

/**
 *
 * @author pedro
 */
public class ListaEquipamentos extends javax.swing.JFrame {

     DefaultTableModel model; 
    private Sistema sistema;
    private Serializacao bd;
    
    /**
     * Creates new form ListaEquipamentos
     */
    public ListaEquipamentos(Sistema sistema, Serializacao bd) {
        initComponents();
         model = (DefaultTableModel) table.getModel();
        this.sistema=sistema;
        this.bd = bd;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDoente = new javax.swing.JTextField();
        txtEnfermaria = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        btInserir = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ComboDisp = new javax.swing.JComboBox<>();
        ComboTipo = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(604, 333));
        setMinimumSize(new java.awt.Dimension(604, 333));
        setSize(new java.awt.Dimension(604, 333));
        getContentPane().setLayout(null);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Tipo", "Disponibilidade", "Enfermaria", "Doente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
        }

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(240, 50, 350, 230);

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel3.setText("Lista de Equipamentos");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(210, 10, 190, 20);

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel7.setText("Nome  :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 100, 60, 20);

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel5.setText("Disponibilidade :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 180, 120, 20);

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel4.setText("Doente :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 260, 60, 20);

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel6.setText("Codigo :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 60, 60, 20);

        txtDoente.setEnabled(false);
        getContentPane().add(txtDoente);
        txtDoente.setBounds(120, 250, 110, 30);

        txtEnfermaria.setEnabled(false);
        getContentPane().add(txtEnfermaria);
        txtEnfermaria.setBounds(120, 210, 110, 30);

        txtNome.setEnabled(false);
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtNome);
        txtNome.setBounds(120, 90, 110, 30);

        txtCodigo.setEnabled(false);
        getContentPane().add(txtCodigo);
        txtCodigo.setBounds(120, 50, 110, 30);

        btInserir.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btInserir.setText("Inserir");
        btInserir.setEnabled(false);
        btInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirActionPerformed(evt);
            }
        });
        getContentPane().add(btInserir);
        btInserir.setBounds(100, 290, 90, 30);

        btLimpar.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btLimpar.setText("Limpar");
        btLimpar.setEnabled(false);
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btLimpar);
        btLimpar.setBounds(10, 290, 80, 30);

        btExcluir.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.setEnabled(false);
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btExcluir);
        btExcluir.setBounds(200, 290, 80, 29);

        btEditar.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btEditar);
        btEditar.setBounds(510, 290, 80, 29);

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel8.setText("Enfermaria :");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 220, 80, 20);

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel9.setText("Tipo :");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(10, 140, 40, 20);

        ComboDisp.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        ComboDisp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Livre", "Ocupado" }));
        ComboDisp.setEnabled(false);
        getContentPane().add(ComboDisp);
        ComboDisp.setBounds(120, 170, 110, 30);

        ComboTipo.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        ComboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Por definir", "Ventilador", "desfibrilhador", "Outro" }));
        ComboTipo.setEnabled(false);
        getContentPane().add(ComboTipo);
        ComboTipo.setBounds(120, 130, 110, 30);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/undo-button2.png"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(520, 10, 24, 30);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sydney-opera-house.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel11);
        jLabel11.setBounds(560, 10, 30, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/listaEquipamentosfundo.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 620, 380);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        // TODO add your handling code here:
        txtCodigo.setText(null);
        txtNome.setText(null);
        txtEnfermaria.setText(null);
        txtDoente.setText(null);
    }//GEN-LAST:event_btLimparActionPerformed

    private void btInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirActionPerformed
        // TODO add your handling code here:
        model.insertRow(model.getRowCount(),new Object[] {txtCodigo.getText(), txtNome.getText(), ComboTipo.getSelectedItem(), ComboDisp.getSelectedItem(), txtEnfermaria.getText(), txtDoente.getText()});
    }//GEN-LAST:event_btInserirActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        // TODO add your handling code here:
         btInserir.setEnabled(true);
         btExcluir.setEnabled(true);
         btLimpar.setEnabled(true);
         txtCodigo.setEnabled(true);
         txtNome.setEnabled(true);
         ComboTipo.setEnabled(true);
         ComboDisp.setEnabled(true);
         txtEnfermaria.setEnabled(true);
         txtDoente.setEnabled(true);
    }//GEN-LAST:event_btEditarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        // TODO add your handling code here:
         DefaultTableModel model = (DefaultTableModel)table.getModel();
        int c = table.getSelectedRow();
        if(c >= 0){
            model.removeRow(c); //remove a linha selecionada
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Selecione um Equipamento");
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        PaginaInicialUtilizador p = new PaginaInicialUtilizador(sistema,bd);
        p.setLocationRelativeTo(null);
        p.setVisible(true);
    }//GEN-LAST:event_jLabel11MouseClicked

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
            java.util.logging.Logger.getLogger(ListaEquipamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaEquipamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaEquipamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaEquipamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ListaEquipamentos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboDisp;
    private javax.swing.JComboBox<String> ComboTipo;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btInserir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDoente;
    private javax.swing.JTextField txtEnfermaria;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
