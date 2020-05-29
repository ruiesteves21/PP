/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;
import backend.Enfermaria;
import backend.Hospital;
import backend.ListaEnfermaria;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import backend.Sistema;
import backend.Serializacao;
import java.util.UUID;

/**
 *
 * @author ruiesteves
 */
public class ListaEnfermarias extends javax.swing.JFrame {
    DefaultTableModel model; 
    private Sistema sistema;
    private Serializacao bd;
    private int indiceHospital;
     /**
     * Creates new form ListaEnfermarias
     */
    public ListaEnfermarias(Sistema sistema, Serializacao bd, int indiceHospital) {
        initComponents();
        model = (DefaultTableModel) table.getModel();
        this.sistema=sistema;
        this.bd = bd;
        this.indiceHospital=indiceHospital;
   
        carregarTabela();
        labelCodigo.setVisible(false);
        txtCodigo.setVisible(false); 
    }

    
    public void carregarTabela()
    {
        model.setRowCount(0);
         
         for(int i=0; i< sistema.getListaHospital().getListaHospital().get(indiceHospital).getListaEnfermaria().getListaEnfermaria().size(); i++) {
             
            Enfermaria enf = sistema.getListaHospital().getListaHospital().get(indiceHospital).getListaEnfermaria().getListaEnfermaria().get(i);
             
            model.addRow(new Object[] {enf.getNome(), enf.getTipo(), enf.getNCamas(), enf.getIdEnfermaria() });
         }
         
          table.setModel(model);
          
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

        jScrollPane3 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        labelCodigo = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtCamas = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        btInserir = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        imgRetroceder = new javax.swing.JLabel();
        imgHome = new javax.swing.JLabel();
        ComboTip = new javax.swing.JComboBox<>();
        btEquipamentos = new javax.swing.JButton();
        btProfissionais = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(614, 317));
        setUndecorated(true);
        setSize(new java.awt.Dimension(614, 317));
        getContentPane().setLayout(null);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Tipo", "Nº camas", "Codigo "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
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
        jScrollPane3.setViewportView(table);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(250, 70, 360, 190);

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel3.setText("Lista de Enfermarias");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(230, 10, 180, 20);

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel11.setText("Nome :");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(20, 70, 60, 20);

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel12.setText("Tipo :");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(20, 110, 60, 20);

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel13.setText("Nº Camas :");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(20, 150, 80, 20);

        labelCodigo.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        labelCodigo.setText("Código :");
        getContentPane().add(labelCodigo);
        labelCodigo.setBounds(20, 190, 90, 20);

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtNome);
        txtNome.setBounds(120, 70, 120, 30);

        txtCamas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCamasActionPerformed(evt);
            }
        });
        getContentPane().add(txtCamas);
        txtCamas.setBounds(120, 150, 120, 30);

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        getContentPane().add(txtCodigo);
        txtCodigo.setBounds(120, 190, 120, 30);

        btInserir.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btInserir.setText("Inserir");
        btInserir.setName(""); // NOI18N
        btInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirActionPerformed(evt);
            }
        });
        getContentPane().add(btInserir);
        btInserir.setBounds(10, 230, 80, 29);

        btLimpar.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btLimpar);
        btLimpar.setBounds(100, 230, 80, 29);

        btExcluir.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btExcluir);
        btExcluir.setBounds(10, 270, 80, 29);

        btEditar.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btEditar);
        btEditar.setBounds(100, 270, 80, 29);

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

        ComboTip.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Por definir", "Normal", "UCI", " ", " ", " " }));
        getContentPane().add(ComboTip);
        ComboTip.setBounds(120, 110, 120, 30);

        btEquipamentos.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btEquipamentos.setText("Lista Equipamentos");
        btEquipamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEquipamentosActionPerformed(evt);
            }
        });
        getContentPane().add(btEquipamentos);
        btEquipamentos.setBounds(420, 270, 160, 29);

        btProfissionais.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btProfissionais.setText("Lista Profissionais");
        btProfissionais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProfissionaisActionPerformed(evt);
            }
        });
        getContentPane().add(btProfissionais);
        btProfissionais.setBounds(250, 270, 150, 29);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ListaEnfermariasfundo.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 640, 390);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        // TODO add your handling code here:
         DefaultTableModel model = (DefaultTableModel)table.getModel();
        int c = table.getSelectedRow();
        if(c >= 0){
            model.removeRow(c); //remove a linha selecionada
            guardarAlteracoes();
            JOptionPane.showMessageDialog(this, "Removido!");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Selecione uma enfermaria");
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirActionPerformed
        // TODO add your handling code here:
      
       String id = UUID.randomUUID().toString();
     
       
         if (txtNome.getText().isEmpty()) {
             JOptionPane.showMessageDialog(null,"Introduza o nome da enfermaria","Erro",JOptionPane.ERROR_MESSAGE);
             txtNome.requestFocus();
             return;
        }
           
       if (txtCamas.getText().isEmpty()) {
             JOptionPane.showMessageDialog(null,"Introduza o número de camas que constituem a enfermaria","Erro",JOptionPane.ERROR_MESSAGE);
             txtCamas.requestFocus();
             return;
        }
        
        if (!txtCamas.getText().matches("[0-9]+")) {
             JOptionPane.showMessageDialog(null,"Número de camas inválido","Erro",JOptionPane.ERROR_MESSAGE);
             txtNome.requestFocus();
             return;
        }
              
        
        if (txtNome.getText().matches(".*\\d.*")){
             JOptionPane.showMessageDialog(null," Nome inválido","Erro",JOptionPane.ERROR_MESSAGE);
             txtNome.requestFocus();
             return;
        }
        
         if (txtCamas.getText().matches("[a-zA-Z\\s]+")){
             JOptionPane.showMessageDialog(null," Número de camas inválido","Erro",JOptionPane.ERROR_MESSAGE);
             txtCamas.requestFocus();
             return;
        }
         
        // Verificar se todos os campos estao preenchidos
        /* if(txtNome.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O campo 'Nome' deve ser preenchido");
        }
         if(txtCamas.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O campo 'Confirmar Password' deve ser preenchido");
        }*/
        
        
       model.insertRow(model.getRowCount(),new Object[] {txtNome.getText(), ComboTip.getSelectedItem(),txtCamas.getText(),txtCodigo.getText()});
       Enfermaria enf = new Enfermaria(txtNome.getText(), id, Integer.parseInt(txtCamas.getText()), ComboTip.getSelectedItem().toString());
       
       try {
       sistema.getListaHospital().getListaHospital().get(indiceHospital).getListaEnfermaria().adicionar(enf);
       JOptionPane.showMessageDialog(null, "Enfermaria " + txtNome.getText() + " registada!");
       txtNome.setText("");
       txtCamas.setText("");
       txtCodigo.setText(""); 
       carregarTabela();
       } catch(RuntimeException e) {
            JOptionPane.showMessageDialog(null,"Esta enfermaria já se encontra registada!","Erro",JOptionPane.ERROR_MESSAGE);
        }
        guardarAlteracoes();
    }//GEN-LAST:event_btInserirActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        // TODO add your handling code here:
       
        
        int indiceEnfermaria = table.getSelectedRow();
        if (indiceEnfermaria == -1){
                JOptionPane.showMessageDialog(null,"Selecione uma linha","Atenção",JOptionPane.WARNING_MESSAGE); 
        
           }
        sistema.getListaHospital().getListaHospital().get(indiceHospital).getListaEnfermaria().getListaEnfermaria().get(indiceEnfermaria).setNome(txtNome.getText());
        sistema.getListaHospital().getListaHospital().get(indiceHospital).getListaEnfermaria().getListaEnfermaria().get(indiceEnfermaria).setnCamas(Integer.parseInt(txtCamas.getText()));
        sistema.getListaHospital().getListaHospital().get(indiceHospital).getListaEnfermaria().getListaEnfermaria().get(indiceEnfermaria).setTipo(ComboTip.getSelectedItem().toString());

        carregarTabela();
        guardarAlteracoes();
        
    }//GEN-LAST:event_btEditarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        // TODO add your handling code here:
        
        txtNome.setText(null);
        txtCamas.setText(null);
        txtCodigo.setText(null);
    }//GEN-LAST:event_btLimparActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtCamasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCamasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCamasActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void imgHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgHomeMouseClicked
        // TODO add your handling code here:
        dispose();
        PaginaInicialUtilizador p = new PaginaInicialUtilizador(sistema,bd);
        p.setLocationRelativeTo(null);
        p.setVisible(true);
        
    }//GEN-LAST:event_imgHomeMouseClicked

    
    private void imgRetrocederMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgRetrocederMouseClicked
        // TODO add your handling code here:
       dispose();
       ListaHospitais lh = new ListaHospitais(sistema, bd);
       lh.setLocationRelativeTo(null);
       lh.setVisible(true);
    }//GEN-LAST:event_imgRetrocederMouseClicked

    private void btEquipamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEquipamentosActionPerformed
        // TODO add your handling code here:
        int indiceEnfermaria = table.getSelectedRow(); 
        
        if (indiceEnfermaria == -1){
            
              JOptionPane.showMessageDialog(null,"Selecione um equipamento","Atenção",JOptionPane.WARNING_MESSAGE); 
        }  else {    
                    
        ListaEquipamentos equipamento = new ListaEquipamentos(sistema, bd, indiceHospital, indiceEnfermaria);
        guardarAlteracoes();
        dispose();
        equipamento.setVisible(true);
        equipamento.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_btEquipamentosActionPerformed

    private void btProfissionaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProfissionaisActionPerformed
        // TODO add your handling code here:
        int indiceEnfermaria = table.getSelectedRow();    
        
        if (indiceEnfermaria == -1){
            
              JOptionPane.showMessageDialog(null,"Selecione um enfermeiro","Atenção",JOptionPane.WARNING_MESSAGE); 
        }  else {   
                   
        ListaProfissionaisSaude p = new ListaProfissionaisSaude(sistema, bd, indiceHospital, indiceEnfermaria);
        guardarAlteracoes();
        dispose();
        p.setVisible(true);
        p.setLocationRelativeTo(null);
          }
    }//GEN-LAST:event_btProfissionaisActionPerformed
    
     
     

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
            java.util.logging.Logger.getLogger(ListaEnfermarias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaEnfermarias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaEnfermarias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaEnfermarias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ListaEnfermarias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboTip;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btEquipamentos;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btInserir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btProfissionais;
    private javax.swing.JLabel imgHome;
    private javax.swing.JLabel imgRetroceder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtCamas;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
