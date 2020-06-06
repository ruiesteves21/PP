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
 * 
 */
public class PaginaEnfermarias extends javax.swing.JFrame {
    DefaultTableModel model; 
    private Sistema sistema;
    private Serializacao bd;
    private int indiceHospital;
     
    /**
     * 
     * @param sistema
     * @param bd
     * @param indiceHospital 
     */
    public PaginaEnfermarias(Sistema sistema, Serializacao bd, int indiceHospital) {
        initComponents();
        model = (DefaultTableModel) table.getModel();
        this.sistema=sistema;
        this.bd = bd;
        this.indiceHospital=indiceHospital;
   
        carregarTabelaEnfermaria();       
    }

    
    public void carregarTabelaEnfermaria()
    {
        model.setRowCount(0);
         
         for(int i=0; i< sistema.getListaHospital().getListaHospital().get(indiceHospital).getListaEnfermaria().getListaEnfermaria().size(); i++) {
             
            Enfermaria enf = sistema.getListaHospital().getListaHospital().get(indiceHospital).getListaEnfermaria().getListaEnfermaria().get(i);
             
            if (enf.getUtiLigado().equals(sistema.getUtilizadorLigado())) {
            model.addRow(new Object[] {enf.getNome(), enf.getTipo(), enf.getNCamas(), enf.getIdEnfermaria() });
            }
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
        txtNome = new javax.swing.JTextField();
        txtCamas = new javax.swing.JTextField();
        btInserir = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        imgRetroceder = new javax.swing.JLabel();
        imgHome = new javax.swing.JLabel();
        comboTipo = new javax.swing.JComboBox<>();
        btEquipamentos = new javax.swing.JButton();
        btProfissionais = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(614, 317));
        setUndecorated(true);
        setSize(new java.awt.Dimension(614, 317));
        getContentPane().setLayout(null);

        jScrollPane3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane3MouseClicked(evt);
            }
        });

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
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
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
        jLabel11.setBounds(20, 100, 60, 20);

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel12.setText("Tipo :");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(20, 140, 60, 20);

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel13.setText("Nº Camas :");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(20, 180, 80, 20);

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtNome);
        txtNome.setBounds(110, 100, 120, 30);

        txtCamas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCamasActionPerformed(evt);
            }
        });
        getContentPane().add(txtCamas);
        txtCamas.setBounds(110, 180, 120, 30);

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

        comboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Por definir", "Normal", "UCI", " ", " ", " " }));
        getContentPane().add(comboTipo);
        comboTipo.setBounds(110, 140, 120, 30);

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
         
        int row = table.getSelectedRow();
         
        if(row  >= 0){
            model.removeRow(row ); //remove a linha selecionada
            sistema.getListaHospital().getListaHospital().get(indiceHospital).getListaEnfermaria().getListaEnfermaria().remove(row);
            //excluir das listas genericas
            sistema.getListaEnfermaria().getListaEnfermaria().remove(row);
            txtNome.setText(null);
            txtCamas.setText(null);
            comboTipo.setSelectedItem(null);
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
       
       //Se a enfermaria tiver o mesmo nome e o mesmo nº de camas, já existe
       for (Enfermaria enfermaria: sistema.getListaHospital().getListaHospital().get(indiceHospital).getListaEnfermaria().getListaEnfermaria() )
        {
            if (enfermaria.getNome().equals(txtNome.getText()) && (String.valueOf(enfermaria.getNCamas()).equals(txtCamas.getText())))
            {
                JOptionPane.showMessageDialog(null,"Esta enfermaria já existe","Erro",JOptionPane.ERROR_MESSAGE);
                return;
            }       
        }
        
        //text box nome vazia
         if (txtNome.getText().isEmpty()) {
             JOptionPane.showMessageDialog(null,"Introduza o nome da enfermaria","Atenção",JOptionPane.WARNING_MESSAGE);
             txtNome.requestFocus();
             return;
        }
         
         //text box camas vazia
         if (txtCamas.getText().isEmpty()) {
             JOptionPane.showMessageDialog(null,"Introduza o número de camas que constituem a enfermaria","Atenção",JOptionPane.WARNING_MESSAGE);
             txtCamas.requestFocus();
             return;
        }
        
        //Se a text box camas não for constituida, somente, por algarismos, dá erro
        if (!txtCamas.getText().matches("[0-9]+")) {
             JOptionPane.showMessageDialog(null,"Número de camas inválido","Erro",JOptionPane.ERROR_MESSAGE);
             txtNome.requestFocus();
             return;
        }
              
        //A text box nome só pode conter letras
        if (txtNome.getText().matches(".*\\d.*")){
             JOptionPane.showMessageDialog(null," Nome da enfermaria inválido","Erro",JOptionPane.ERROR_MESSAGE);
             txtNome.requestFocus();
             return;
        }
        
        //Se a comboBox não tiver com algum tipo de enfermaria selecionado, dá erro 
        if ((comboTipo.getSelectedIndex()==0 || (comboTipo.getSelectedIndex() < 0))){
             JOptionPane.showMessageDialog(null," Selecione um tipo de enfermaria","Atenção",JOptionPane.WARNING_MESSAGE);             
             return;
        }
        
         
       Enfermaria enf = new Enfermaria(sistema.getUtilizadorLigado(), txtNome.getText(), id, Integer.parseInt(txtCamas.getText()), comboTipo.getSelectedItem().toString());
       
       try {
       sistema.getListaHospital().getListaHospital().get(indiceHospital).getListaEnfermaria().adicionar(enf);
       //adicionar nas listas genericas
       sistema.getListaEnfermaria().adicionar(enf);
       JOptionPane.showMessageDialog(null, "Enfermaria " + txtNome.getText() + " registada!");
       txtNome.setText("");
       txtCamas.setText("");
       comboTipo.setSelectedItem(null);
       carregarTabelaEnfermaria();
       } catch(RuntimeException e) {
            JOptionPane.showMessageDialog(null,"Esta enfermaria já se encontra registada!","Erro",JOptionPane.ERROR_MESSAGE);
        }
        guardarAlteracoes();
    }//GEN-LAST:event_btInserirActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        // TODO add your handling code here:
       try {
                int indiceEnfermaria = table.getSelectedRow();
                Enfermaria editarEnfermaria =  sistema.getListaHospital().getListaHospital().get(indiceHospital).getListaEnfermaria().getListaEnfermaria().get(indiceEnfermaria);
               

                if (indiceEnfermaria == -1){
                        JOptionPane.showMessageDialog(null,"Selecione uma enfermaria","Atenção",JOptionPane.WARNING_MESSAGE); 
                        return;
                }
                
                for (Enfermaria enfermaria: sistema.getListaHospital().getListaHospital().get(indiceHospital).getListaEnfermaria().getListaEnfermaria() )
                {
                    if (enfermaria.getNome().equals(txtNome.getText()) && (String.valueOf(enfermaria.getNCamas()).equals(txtCamas.getText())))
                    {
                        JOptionPane.showMessageDialog(null,"Esta enfermaria já existe","Erro",JOptionPane.ERROR_MESSAGE);
                        return;
                    }
        
                }
       
                
                if (txtNome.getText().isEmpty()) {
                 JOptionPane.showMessageDialog(null,"Introduza o nome da enfermaria","Erro",JOptionPane.ERROR_MESSAGE);
                 txtNome.requestFocus();
                 return;
                }

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

               //Impede que existam camas com letras e com digitos e caracteres no nome.
               if (!txtCamas.getText().matches("[0-9]+")) {
                    JOptionPane.showMessageDialog(null,"Número de camas inválido","Erro",JOptionPane.ERROR_MESSAGE);
                    txtNome.requestFocus();
                    return;
               }


               if (txtNome.getText().matches(".*\\d.*")){
                    JOptionPane.showMessageDialog(null," Nome da enfermaria inválido","Erro",JOptionPane.ERROR_MESSAGE);
                    txtNome.requestFocus();
                    return;
               }


                if ((comboTipo.getSelectedIndex()==0 || (comboTipo.getSelectedIndex() < 0))){
                    JOptionPane.showMessageDialog(null," Selecione um tipo de enfermaria","Erro",JOptionPane.ERROR_MESSAGE);             
                    return;
                }       

                editarEnfermaria.setNome(txtNome.getText());
                editarEnfermaria.setnCamas(Integer.parseInt(txtCamas.getText()));
                editarEnfermaria.setTipo(comboTipo.getSelectedItem().toString());
                
                
        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null,"Selecione uma enfermaria","Atenção",JOptionPane.WARNING_MESSAGE);
            return;
            } 

        carregarTabelaEnfermaria();
        guardarAlteracoes();
        
    }//GEN-LAST:event_btEditarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        // TODO add your handling code here:
        
        txtNome.setText(null);
        txtCamas.setText(null);
        comboTipo.setSelectedItem(null);
    }//GEN-LAST:event_btLimparActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtCamasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCamasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCamasActionPerformed

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
       PaginaHospitais lh = new PaginaHospitais(sistema, bd);
       lh.setLocationRelativeTo(null);
       lh.setVisible(true);
    }//GEN-LAST:event_imgRetrocederMouseClicked

    private void btEquipamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEquipamentosActionPerformed
        // TODO add your handling code here:
        int indiceEnfermaria = table.getSelectedRow(); 
        
        if (indiceEnfermaria == -1){
            
              JOptionPane.showMessageDialog(null,"Selecione uma enfermaria","Atenção",JOptionPane.WARNING_MESSAGE); 
        }  else {    
                    
        PaginaEquipamentos equipamento = new PaginaEquipamentos(sistema, bd, indiceHospital, indiceEnfermaria);
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
            
              JOptionPane.showMessageDialog(null,"Selecione uma enfermaria","Atenção",JOptionPane.WARNING_MESSAGE); 
        }  else {   
                   
        PaginaProfissionaisSaude p = new PaginaProfissionaisSaude(sistema, bd, indiceHospital, indiceEnfermaria);
        guardarAlteracoes();
        dispose();
        p.setVisible(true);
        p.setLocationRelativeTo(null);
          }
    }//GEN-LAST:event_btProfissionaisActionPerformed

    private void jScrollPane3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane3MouseClicked
        // TODO add your handling code here:
         int indiceEnfermaria = table.getSelectedRow();  //quando o utilizador seleciona uma enfermaria clicando
                                                  //na tabela

        if(indiceEnfermaria>=0 && indiceEnfermaria < sistema.getListaHospital().getListaHospital().get(indiceHospital).getListaEnfermaria().getListaEnfermaria().size()) {
            
           Enfermaria enf = sistema.getListaHospital().getListaHospital().get(indiceHospital).getListaEnfermaria().getListaEnfermaria().get(indiceEnfermaria);
           
            txtNome.setText(enf.getNome());
            txtCamas.setText(String.valueOf(enf.getNCamas()));

            /*txtNome.setText(enf.getNome());
            txtCamas.setText(String.valueOf(enf.getNCamas()));
            comboTipo.setSelectedItem(enf.getTipo());*/
        }
        
        
    }//GEN-LAST:event_jScrollPane3MouseClicked

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        int indiceEnfermaria = table.getSelectedRow();  //quando o utilizador seleciona uma enfermaria clicando
                                                  //na tabela

        if(indiceEnfermaria>=0 && indiceEnfermaria < sistema.getListaHospital().getListaHospital().get(indiceHospital).getListaEnfermaria().getListaEnfermaria().size()) {
            
            Enfermaria enf = sistema.getListaHospital().getListaHospital().get(indiceHospital).getListaEnfermaria().getListaEnfermaria().get(indiceEnfermaria);
            txtNome.setText(enf.getNome());
            comboTipo.setSelectedItem(enf.getTipo());
            txtCamas.setText(String.valueOf(enf.getNCamas()));
        }
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
            java.util.logging.Logger.getLogger(PaginaEnfermarias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaEnfermarias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaEnfermarias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaEnfermarias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ListaEnfermarias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btEquipamentos;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btInserir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btProfissionais;
    private javax.swing.JComboBox<String> comboTipo;
    private javax.swing.JLabel imgHome;
    private javax.swing.JLabel imgRetroceder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtCamas;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
