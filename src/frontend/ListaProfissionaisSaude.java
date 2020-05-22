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
import java.util.ArrayList;
//import backend.ListaProfissionaisSaude;

//import static frontend.ListaHospitais.table;

//import static frontend.ListaHospitais.table;


import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pedro
 */
public class ListaProfissionaisSaude extends javax.swing.JFrame {
    
    DefaultTableModel model; 
    private Sistema sistema;
    private Serializacao bd;
    int varHosp; 
    private ListaMedico listaMedico;
    private int indice;
    
    
    public ListaProfissionaisSaude(Sistema sistema, Serializacao bd, int indice) {
        initComponents();
        model = (DefaultTableModel) tableEnfermeiros.getModel();
        this.sistema = sistema;
        this.indice=indice;
        this.bd = bd;
        //listaMedico = sistema.getListaHospital().getListaHospital().get(sistema.getHospitalSelecionado()).getListaMedico();
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
        tableEnfermeiros = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btInserir = new javax.swing.JButton();
        btLDoentes = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        txtEspecialidade = new javax.swing.JTextField();
        imgRetroceder = new javax.swing.JLabel();
        imgHome = new javax.swing.JLabel();
        imgGuardar = new javax.swing.JLabel();
        btExcluir1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMedicos = new javax.swing.JTable();
        btInserirE = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(819, 415));
        setUndecorated(true);
        setSize(new java.awt.Dimension(819, 415));
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel3.setText("Lista de Profissionais de Saúde");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(290, 10, 270, 20);

        tableEnfermeiros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tableEnfermeiros);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(260, 110, 210, 230);

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel6.setText("Nome :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 120, 50, 20);

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel8.setText("Especialidade :");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 170, 100, 20);

        btInserir.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btInserir.setText("Inserir");
        btInserir.setEnabled(false);
        btInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirActionPerformed(evt);
            }
        });
        getContentPane().add(btInserir);
        btInserir.setBounds(500, 360, 80, 29);

        btLDoentes.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btLDoentes.setText("Lista Doentes");
        btLDoentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLDoentesActionPerformed(evt);
            }
        });
        getContentPane().add(btLDoentes);
        btLDoentes.setBounds(670, 360, 120, 29);

        btLimpar.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btLimpar.setText("Limpar");
        btLimpar.setEnabled(false);
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btLimpar);
        btLimpar.setBounds(10, 220, 80, 30);

        btEditar.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btEditar);
        btEditar.setBounds(10, 340, 80, 29);

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
        txtEspecialidade.setBounds(120, 160, 120, 30);

        imgRetroceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/undo-button2.png"))); // NOI18N
        imgRetroceder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgRetrocederMouseClicked(evt);
            }
        });
        getContentPane().add(imgRetroceder);
        imgRetroceder.setBounds(720, 10, 24, 30);

        imgHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sydney-opera-house.png"))); // NOI18N
        imgHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgHomeMouseClicked(evt);
            }
        });
        getContentPane().add(imgHome);
        imgHome.setBounds(760, 10, 30, 30);

        imgGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/save.png"))); // NOI18N
        imgGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgGuardarMouseClicked(evt);
            }
        });
        getContentPane().add(imgGuardar);
        imgGuardar.setBounds(680, 10, 30, 30);

        btExcluir1.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btExcluir1.setText("Excluir");
        btExcluir1.setEnabled(false);
        btExcluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluir1ActionPerformed(evt);
            }
        });
        getContentPane().add(btExcluir1);
        btExcluir1.setBounds(10, 280, 80, 29);

        tableMedicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Especialidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableMedicos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(500, 110, 290, 230);

        btInserirE.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btInserirE.setText("Inserir");
        btInserirE.setEnabled(false);
        btInserirE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirEActionPerformed(evt);
            }
        });
        getContentPane().add(btInserirE);
        btInserirE.setBounds(260, 360, 80, 29);

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel2.setText("Medicos");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(500, 80, 90, 20);

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel4.setText("Enfermeiros");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(260, 80, 80, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/G5.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-20, -390, 1050, 950);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        // TODO add your handling code here:
        btInserir.setEnabled(true);
        btLDoentes.setEnabled(true);
        btLimpar.setEnabled(true);
        btInserirE.setEnabled(true);
        txtNome.setEnabled(true);
        txtEspecialidade.setEnabled(true);
    }//GEN-LAST:event_btEditarActionPerformed

    private void btLDoentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLDoentesActionPerformed
       //int c = tableProfissionaisSaude.getSelectedRow();
       int indice = tableMedicos.getSelectedRow();    
        ListaDoentes doentes = new ListaDoentes(sistema, bd, indice);
        guardarAlteracoes();
        dispose();
        doentes.setVisible(true);
        doentes.setLocationRelativeTo(null);
       
       
;
       
        
    }//GEN-LAST:event_btLDoentesActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        // TODO add your handling code here:
        
        txtNome.setText(null);
        txtEspecialidade.setText(null);
        
    }//GEN-LAST:event_btLimparActionPerformed

    private void btInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirActionPerformed
        // TODO add your handling code here:
        
        
     var result = new ArrayList<ProfissionalSaude>();
         sistema.getListaProfissionalSaude().getListaProfissionalSaude().stream().filter((profissionalsaude) -> (profissionalsaude.getNomePS().equals(txtNome.getText()))).forEachOrdered((profissionalSaude) -> {
         result.add(profissionalSaude);
         });
         
     if (txtNome.getText().isEmpty()) {
             JOptionPane.showMessageDialog(null,"Introduza o nome do profissional de saude","Erro",JOptionPane.ERROR_MESSAGE);
             txtNome.requestFocus();
             return;
        } else {
             if(!result.isEmpty()){
                JOptionPane.showMessageDialog(null,"Esse profissional de saude já existe","Erro",JOptionPane.ERROR_MESSAGE);
                txtNome.requestFocus();
                return;
        }     
        } 
     if (txtEspecialidade.getText().isEmpty()) {
             JOptionPane.showMessageDialog(null,"Introduza a especialidade","Erro",JOptionPane.ERROR_MESSAGE);
             txtEspecialidade.requestFocus();
             return;
        }
        
        //Impede que existam localidades com digitos e caracteres no nome. Exemplo: 123fg4 
        if (txtEspecialidade.getText().matches(".*\\d.*")){
             JOptionPane.showMessageDialog(null," Especialidade inválida","Erro",JOptionPane.ERROR_MESSAGE);
             txtEspecialidade.requestFocus();
             return;
        }
        
        model.insertRow(model.getRowCount(),new Object[] {txtNome.getText(),txtEspecialidade.getText()});
        ProfissionalSaude P = new ProfissionalSaude(1, txtNome.getText());
        sistema.getListaProfissionalSaude().adicionar(P);
        
        //txtNome.setText(txtNome.getText());
        
        try {
        sistema.getListaProfissionalSaude().adicionar(P);
        JOptionPane.showMessageDialog(null, "Hospital registado!");
        txtNome.setText("");
        
        txtEspecialidade.setText("");
        carregarTabela();
        }catch(RuntimeException e) {
            //Todas as labels estão preenchidas, no entanto com o tipo de dados errado
            JOptionPane.showMessageDialog(null,"Nome da especialidade inválido","Erro",JOptionPane.ERROR_MESSAGE);
        }
        guardarAlteracoes();
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
        ListaEnfermarias l = new ListaEnfermarias(sistema,bd,indice);
        //FichaHospital p = new FichaHospital(sistema,bd,table.getSelectedRow());
        l.setLocationRelativeTo(null);
        l.setVisible(true);
    }//GEN-LAST:event_imgRetrocederMouseClicked

    private void btExcluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluir1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tableEnfermeiros.getModel();
        int c = tableEnfermeiros.getSelectedRow();
        if(c >= 0){
            model.removeRow(c); //remove a linha selecionada
            sistema.getListaProfissionalSaude().getListaProfissionalSaude().remove(c);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Selecione um profissional de saúde");
        }
    }//GEN-LAST:event_btExcluir1ActionPerformed

    private void btInserirEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirEActionPerformed
        // TODO add your handling code here:
        var result = new ArrayList<ProfissionalSaude>();
         sistema.getListaProfissionalSaude().getListaProfissionalSaude().stream().filter((profissionalsaude) -> (profissionalsaude.getNomePS().equals(txtNome.getText()))).forEachOrdered((profissionalSaude) -> {
         result.add(profissionalSaude);
         });
         
     if (txtNome.getText().isEmpty()) {
             JOptionPane.showMessageDialog(null,"Introduza o nome do profissional de saude","Erro",JOptionPane.ERROR_MESSAGE);
             txtNome.requestFocus();
             return;
        } else {
             if(!result.isEmpty()){
                JOptionPane.showMessageDialog(null,"Esse profissional de saude já existe","Erro",JOptionPane.ERROR_MESSAGE);
                txtNome.requestFocus();
                return;
        }     
        } 
     if (txtEspecialidade.getText().isEmpty()) {
             JOptionPane.showMessageDialog(null,"Introduza a especialidade","Erro",JOptionPane.ERROR_MESSAGE);
             txtEspecialidade.requestFocus();
             return;
        }
        
        //Impede que existam localidades com digitos e caracteres no nome. Exemplo: 123fg4 
        if (txtEspecialidade.getText().matches(".*\\d.*")){
             JOptionPane.showMessageDialog(null," Especialidade inválida","Erro",JOptionPane.ERROR_MESSAGE);
             txtEspecialidade.requestFocus();
             return;
        }
        
        model.insertRow(model.getRowCount(),new Object[] {txtNome.getText()});
        ProfissionalSaude P = new ProfissionalSaude(1, txtNome.getText());
        sistema.getListaProfissionalSaude().adicionar(P);
        
        //txtNome.setText(txtNome.getText());
        
        try {
        sistema.getListaProfissionalSaude().adicionar(P);
        JOptionPane.showMessageDialog(null, "Hospital registado!");
        txtNome.setText("");
        
        txtEspecialidade.setText("");
        carregarTabela();
        }catch(RuntimeException e) {
            //Todas as labels estão preenchidas, no entanto com o tipo de dados errado
            JOptionPane.showMessageDialog(null,"Nome da especialidade inválido","Erro",JOptionPane.ERROR_MESSAGE);
        }
        guardarAlteracoes();
    }//GEN-LAST:event_btInserirEActionPerformed

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
            java.util.logging.Logger.getLogger(ListaProfissionaisSaude.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaProfissionaisSaude.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaProfissionaisSaude.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaProfissionaisSaude.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ListaProfissionaisSaude().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir1;
    private javax.swing.JButton btInserir;
    private javax.swing.JButton btInserirE;
    private javax.swing.JButton btLDoentes;
    private javax.swing.JButton btLimpar;
    private javax.swing.JLabel imgGuardar;
    private javax.swing.JLabel imgHome;
    private javax.swing.JLabel imgRetroceder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tableEnfermeiros;
    private javax.swing.JTable tableMedicos;
    private javax.swing.JTextField txtEspecialidade;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
