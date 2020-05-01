/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import backend.Hospital;
import backend.ListaMedico;
import backend.Medico;
import backend.ProfissionalSaude;
import backend.Serializacao;
import backend.Sistema;
import static frontend.ListaHospitais.table;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pedro
 */
public class ListaProfissionalSaude extends javax.swing.JFrame {
    
    DefaultTableModel model; 
    private Sistema sistema;
    private Serializacao bd;
    int varHosp; 
    private ListaMedico listaMedico;
    
    
    public ListaProfissionalSaude(Sistema sistema, Serializacao bd) {
        initComponents();
        model = (DefaultTableModel) tableProfissionaisSaude.getModel();
        this.sistema = sistema;
        this.bd = bd;
        listaMedico = sistema.getListaHospital().getListaHospital().get(sistema.getHospitalSelecionado()).getListaMedico();
        carregarTabela();
    }
    
    public void carregarTabela()
    {
        model.setRowCount(0);
        for (int i = 0; i < sistema.getListaProfissionalSaude().getListaProfissionalSaude().size(); i++) {
            ProfissionalSaude P = sistema.getListaProfissionalSaude().getListaProfissionalSaude().get(i);
            model.addRow(new Object[]{P.getIdProfSaude(), P.getNomePS()});

        }
    }
    
    private void guardarAlteracoes() {
        bd.gravaSistema(sistema);
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
        tableProfissionaisSaude = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btInserir = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        txtEspecialidade = new javax.swing.JTextField();
        txtHospital = new javax.swing.JTextField();
        ComboBoxFuncao = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        txtEnfermaria = new javax.swing.JTextField();
        imgRetroceder = new javax.swing.JLabel();
        imgHome = new javax.swing.JLabel();
        imgGuardar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(617, 351));
        setUndecorated(true);
        setSize(new java.awt.Dimension(617, 351));
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel3.setText("Lista de Profissionais de Saúde");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(200, 10, 270, 20);

        tableProfissionaisSaude.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Função", "Especialidade", "Enfermaria"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tableProfissionaisSaude);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(280, 70, 330, 230);

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel6.setText("Nome :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 120, 50, 20);

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel7.setText("Função :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 160, 60, 20);

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel8.setText("Especialidade :");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 200, 100, 20);

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel9.setText("Hospital :");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(10, 280, 70, 20);

        btInserir.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btInserir.setText("Inserir");
        btInserir.setEnabled(false);
        btInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirActionPerformed(evt);
            }
        });
        getContentPane().add(btInserir);
        btInserir.setBounds(100, 310, 80, 29);

        btExcluir.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.setEnabled(false);
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btExcluir);
        btExcluir.setBounds(190, 310, 80, 29);

        btLimpar.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btLimpar.setText("Limpar");
        btLimpar.setEnabled(false);
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btLimpar);
        btLimpar.setBounds(10, 310, 80, 30);

        btEditar.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btEditar);
        btEditar.setBounds(530, 310, 80, 29);

        txtNome.setEnabled(false);
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtNome);
        txtNome.setBounds(120, 110, 120, 30);

        txtEspecialidade.setEnabled(false);
        getContentPane().add(txtEspecialidade);
        txtEspecialidade.setBounds(120, 190, 120, 30);

        txtHospital.setEnabled(false);
        getContentPane().add(txtHospital);
        txtHospital.setBounds(120, 270, 120, 30);

        ComboBoxFuncao.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        ComboBoxFuncao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Por definir", "Médico", "Enfermeiro" }));
        ComboBoxFuncao.setEnabled(false);
        ComboBoxFuncao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxFuncaoActionPerformed(evt);
            }
        });
        getContentPane().add(ComboBoxFuncao);
        ComboBoxFuncao.setBounds(120, 150, 120, 30);

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel11.setText("Enfermaria :");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(10, 240, 80, 20);

        txtEnfermaria.setEnabled(false);
        txtEnfermaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnfermariaActionPerformed(evt);
            }
        });
        getContentPane().add(txtEnfermaria);
        txtEnfermaria.setBounds(120, 230, 120, 30);

        imgRetroceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/undo-button2.png"))); // NOI18N
        imgRetroceder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgRetrocederMouseClicked(evt);
            }
        });
        getContentPane().add(imgRetroceder);
        imgRetroceder.setBounds(530, 30, 24, 30);

        imgHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sydney-opera-house.png"))); // NOI18N
        imgHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgHomeMouseClicked(evt);
            }
        });
        getContentPane().add(imgHome);
        imgHome.setBounds(570, 30, 30, 30);

        imgGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/save.png"))); // NOI18N
        imgGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgGuardarMouseClicked(evt);
            }
        });
        getContentPane().add(imgGuardar);
        imgGuardar.setBounds(490, 30, 30, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/listaProfissionaisfundo.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 620, 410);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        // TODO add your handling code here:
        btInserir.setEnabled(true);
        btExcluir.setEnabled(true);
        btLimpar.setEnabled(true);
        
        txtNome.setEnabled(true);
        txtEspecialidade.setEnabled(true);
        txtEnfermaria.setEnabled(true);
        txtHospital.setEnabled(true);
        ComboBoxFuncao.setEnabled(true);
        
    }//GEN-LAST:event_btEditarActionPerformed

    private void ComboBoxFuncaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxFuncaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxFuncaoActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tableProfissionaisSaude.getModel();
        int c = tableProfissionaisSaude.getSelectedRow();
        if(c >= 0){
            model.removeRow(c); //remove a linha selecionada
            sistema.getListaProfissionalSaude().getListaProfissionalSaude().remove(c);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Selecione um profissional de saúde");
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtEnfermariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnfermariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnfermariaActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        // TODO add your handling code here:
        
        txtNome.setText(null);
        txtEspecialidade.setText(null);
        txtEnfermaria.setText(null);
        txtHospital.setText(null);
        ComboBoxFuncao.setSelectedItem(null);
    }//GEN-LAST:event_btLimparActionPerformed

    private void btInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirActionPerformed
        // TODO add your handling code here:
        model.insertRow(model.getRowCount(),new Object[] {txtNome.getText(),ComboBoxFuncao.getSelectedItem(),txtEspecialidade.getText(),txtEnfermaria.getText(),txtHospital.getText()});
        ProfissionalSaude P = new ProfissionalSaude(1, txtNome.getText());
        sistema.getListaProfissionalSaude().adicionar(P);
    }//GEN-LAST:event_btInserirActionPerformed

    private void imgHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgHomeMouseClicked
        // TODO add your handling code here:
        dispose();
        PaginaInicialUtilizador paginaInicialUtilizador = new PaginaInicialUtilizador(sistema,bd);
        paginaInicialUtilizador.setLocationRelativeTo(null);
        paginaInicialUtilizador.setVisible(true);
        
    }//GEN-LAST:event_imgHomeMouseClicked

    private void imgGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgGuardarMouseClicked
        // TODO add your handling code here:
        guardarAlteracoes();
        JOptionPane.showMessageDialog(this, "Alterações guardadas.");
    }//GEN-LAST:event_imgGuardarMouseClicked

    private void imgRetrocederMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgRetrocederMouseClicked
        // TODO add your handling code here:
         dispose();
        FichaHospital p = new FichaHospital(sistema,bd,varHosp);
        //FichaHospital p = new FichaHospital(sistema,bd,table.getSelectedRow());
        p.setLocationRelativeTo(null);
        p.setVisible(true);
    }//GEN-LAST:event_imgRetrocederMouseClicked

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
            java.util.logging.Logger.getLogger(ListaProfissionalSaude.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaProfissionalSaude.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaProfissionalSaude.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaProfissionalSaude.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ListaProfissionalSaude().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxFuncao;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btInserir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JLabel imgGuardar;
    private javax.swing.JLabel imgHome;
    private javax.swing.JLabel imgRetroceder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tableProfissionaisSaude;
    private javax.swing.JTextField txtEnfermaria;
    private javax.swing.JTextField txtEspecialidade;
    private javax.swing.JTextField txtHospital;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
