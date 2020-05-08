/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;
import backend.Hospital;
import backend.Equipamento;
import backend.ListaEquipamento;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import backend.Sistema;
import backend.Serializacao;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import javax.swing.table.TableModel;
//import static frontend.ListaHospitais.table;

/**
 *
 * @author pedro
 */
public class ListaEquipamentos extends javax.swing.JFrame {

    DefaultTableModel model; 
    private Sistema sistema;
    private Serializacao bd;
    int varHosp; 
    private ListaEquipamento listaEquipamento;
    private AtomicInteger id1 = new AtomicInteger(0);
    /**
     * Creates new form ListaEquipamentos
     */
    public ListaEquipamentos(Sistema sistema, Serializacao bd) {
        initComponents();
        model = (DefaultTableModel) table.getModel();
        this.sistema=sistema;
        this.bd = bd;
        carregarTabela();
        //listaEquipamento = sistema.getListaHospital().getListaHospital().get(Integer.parseInt(sistema.getHospitalSelecionado)).getListaEquipamento();
    }
    private void guardarAlteracoes() {
        bd.gravaSistema(sistema);
    }
    public void carregarTabela()
    {
        model.setRowCount(0);
        for (int i = 0; i < sistema.getListaEquipamento().getListaEquipamento().size(); i++) {
            Equipamento e = sistema.getListaEquipamento().getListaEquipamento().get(i);
            
            if (e.getEnfermariaSelecionada().equals(sistema.getEnfermariaSelecionada())) {
            model.addRow(new Object[]{e.getIdEquip(),e.getTipoEquipamento(),e.getIndicacao(),e.getDoente(),});

        }
    }
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
        txtDoente = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        btInserir = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        ComboDisp = new javax.swing.JComboBox<>();
        ComboTipo = new javax.swing.JComboBox<>();
        imgRetroceder = new javax.swing.JLabel();
        imgHome = new javax.swing.JLabel();
        imgGuardar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(604, 333));
        setUndecorated(true);
        setSize(new java.awt.Dimension(604, 333));
        getContentPane().setLayout(null);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Tipo", "Disponibilidade", "Doente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
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
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(table);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(240, 50, 350, 230);

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel3.setText("Lista de Equipamentos");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(210, 10, 190, 20);

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel7.setText("Código  :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 100, 60, 20);

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel5.setText("Disponibilidade :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 190, 120, 20);

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel4.setText("Doente :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 240, 60, 20);

        txtDoente.setEnabled(false);
        getContentPane().add(txtDoente);
        txtDoente.setBounds(120, 240, 110, 30);

        txtCodigo.setEnabled(false);
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        getContentPane().add(txtCodigo);
        txtCodigo.setBounds(120, 90, 110, 30);

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

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel9.setText("Tipo :");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(10, 150, 40, 20);

        ComboDisp.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        ComboDisp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Livre", "Ocupado" }));
        ComboDisp.setEnabled(false);
        getContentPane().add(ComboDisp);
        ComboDisp.setBounds(120, 190, 110, 30);

        ComboTipo.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        ComboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Por definir", "Ventilador", "desfibrilhador", "Outro" }));
        ComboTipo.setEnabled(false);
        getContentPane().add(ComboTipo);
        ComboTipo.setBounds(120, 140, 110, 30);

        imgRetroceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/undo-button2.png"))); // NOI18N
        imgRetroceder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgRetrocederMouseClicked(evt);
            }
        });
        getContentPane().add(imgRetroceder);
        imgRetroceder.setBounds(520, 10, 24, 30);

        imgHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sydney-opera-house.png"))); // NOI18N
        imgHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgHomeMouseClicked(evt);
            }
        });
        getContentPane().add(imgHome);
        imgHome.setBounds(560, 10, 30, 30);

        imgGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/save.png"))); // NOI18N
        imgGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgGuardarMouseClicked(evt);
            }
        });
        getContentPane().add(imgGuardar);
        imgGuardar.setBounds(480, 10, 30, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/listaEquipamentosfundo.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 620, 380);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        // TODO add your handling code here:
        ComboTipo.setSelectedItem(null);
        ComboDisp.setSelectedItem(null);
        txtCodigo.setText(null);
        txtDoente.setText(null);
    }//GEN-LAST:event_btLimparActionPerformed

    private void btInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirActionPerformed
        // TODO add your handling code here:
        model.insertRow(model.getRowCount(),new Object[] {txtCodigo.getText(),ComboTipo.getSelectedItem(), ComboDisp.getSelectedItem(), txtDoente.getText()});
        Equipamento ultimoId = sistema.getListaEquipamento().getListaEquipamento().get(sistema.getListaEquipamento().getListaEquipamento().size()-1);
        int preId = ultimoId.getIdEquip();
        int idFinal = id1.incrementAndGet();
        
         var result = new ArrayList<Equipamento>();
         sistema.getListaEquipamento().getListaEquipamento().stream().filter((equipamento) -> (equipamento.getDoente().equals(txtDoente.getText()))).forEachOrdered((Equipamento) -> {
         result.add(Equipamento);
         }); 
  
       
        if (txtCodigo.getText().isEmpty()) {
             JOptionPane.showMessageDialog(null,"Introduza o codigo do Equipamento","Erro",JOptionPane.ERROR_MESSAGE);
             txtCodigo.requestFocus();
             return; 
        }else {
            if(!result.isEmpty()){
                JOptionPane.showMessageDialog(null, "Esse equipamento já está criado","Erro",JOptionPane.ERROR_MESSAGE);
                txtCodigo.requestFocus();
                return;
            }
        }
        
        model.insertRow(model.getRowCount(),new Object[] {txtCodigo.getText(),ComboTipo.getSelectedItem(), ComboDisp.getSelectedItem(), txtDoente.getText()});
        Equipamento eq = new Equipamento(sistema.getEnfermariaSelecionada(),  Integer.parseInt(txtCodigo.getText()), ComboTipo.getSelectedItem().toString(), ComboDisp.getSelectedItem().toString(), txtDoente.getText());
        
        try {
        sistema.getListaEquipamento().adicionar(eq);
        JOptionPane.showMessageDialog(null, "Equipamento registado!");
        txtCodigo.setText("");
        txtDoente.setText("");
        ComboTipo.setSelectedItem("");
        ComboDisp.setSelectedItem("");
        carregarTabela();
        
        } catch(RuntimeException e) {
            JOptionPane.showMessageDialog(null,"Este equipamento já se encontra registado!","Erro",JOptionPane.ERROR_MESSAGE);
        }
        
        guardarAlteracoes(); 
        
    }//GEN-LAST:event_btInserirActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        // TODO add your handling code here:
         btInserir.setEnabled(true);
         btExcluir.setEnabled(true);
         btLimpar.setEnabled(true);
         txtCodigo.setEnabled(true);
         ComboTipo.setEnabled(true);
         ComboDisp.setEnabled(true);
         txtDoente.setEnabled(true);
    }//GEN-LAST:event_btEditarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        // TODO add your handling code here:
         DefaultTableModel model = (DefaultTableModel)table.getModel();
        int c = table.getSelectedRow();
        if(c >= 0){
            model.removeRow(c); //remove a linha selecionada
            sistema.getListaEquipamento().getListaEquipamento().remove(c);
            guardarAlteracoes();
            JOptionPane.showMessageDialog(this, "Removido!");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Selecione um Equipamento");
        }
    }//GEN-LAST:event_btExcluirActionPerformed

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
        FichaHospital p = new FichaHospital(sistema,bd, varHosp);
        /* FichaHospital p = new FichaHospital(sistema,bd,table.getSelectedRow()); */
        p.setLocationRelativeTo(null);
        p.setVisible(true);
    }//GEN-LAST:event_imgRetrocederMouseClicked

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
       
    }//GEN-LAST:event_tableMouseClicked

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
    private javax.swing.JLabel imgGuardar;
    private javax.swing.JLabel imgHome;
    private javax.swing.JLabel imgRetroceder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDoente;
    // End of variables declaration//GEN-END:variables
}
