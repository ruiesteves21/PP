/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;
import backend.Doente;
import backend.Hospital;
import backend.Equipamento;
import backend.ListaEquipamento;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import backend.Sistema;
import backend.Serializacao;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import javax.swing.table.TableModel;
//import static frontend.ListaHospitais.table;

/**
 *
 * 
 */
public class PaginaEquipamentos extends javax.swing.JFrame {

    DefaultTableModel model; 
    private Sistema sistema;
    private Serializacao bd;
    private int indiceEnfermaria;
    private int indiceHospital;
    private int indiceMedico;
    
    /**
     * Creates new form ListaEquipamentos
     */
    public PaginaEquipamentos(Sistema sistema, Serializacao bd, int indiceHospital, int indiceEnfermaria) {
        initComponents();
        model = (DefaultTableModel) table.getModel();
        this.sistema=sistema;
        this.bd = bd;
        this.indiceEnfermaria = indiceEnfermaria;
        this.indiceHospital = indiceHospital;
        
        carregarTabela();
        carregarComboBox();
        
      
    }
    
    
    public void carregarTabela()
    {
        model.setRowCount(0);
        
        
        for (int i = 0; i < sistema.getListaHospital().getListaHospital().get(indiceHospital).getListaEnfermaria().getListaEnfermaria().get(indiceEnfermaria).getListaEquipamento().getListaEquipamento().size(); i++) {
            
            Equipamento equipamento = sistema.getListaHospital().getListaHospital().get(indiceHospital).getListaEnfermaria().getListaEnfermaria().get(indiceEnfermaria).getListaEquipamento().getListaEquipamento().get(i);
            
            if (equipamento.getUtiLigado().equals(sistema.getUtilizadorLigado())) {
            model.addRow(new Object[]{equipamento.getIdEquip(), equipamento.getTipoEquipamento(), equipamento.getIndicacao(), equipamento.getDoente()});
            }
        }
        
         table.setModel(model);
    }
    
    private void carregarComboBox() {
        
        try {
            
        for (int i = 0; i < sistema.getListaHospital().getListaHospital().get(indiceHospital).getListaEnfermaria().getListaEnfermaria().get(indiceEnfermaria).getListaMedico().getListaMedico().get(indiceMedico).getListaDoente().getListaDoente().size(); i++) {
            
            Doente doente = sistema.getListaHospital().getListaHospital().get(indiceHospital).getListaEnfermaria().getListaEnfermaria().get(indiceEnfermaria).getListaMedico().getListaMedico().get(indiceMedico).getListaDoente().getListaDoente().get(i);
            
            comboDoente.addItem(doente.getNomeDoente());           
        }   
        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null,"Neste momento, não há doentes registados!!","Aviso",JOptionPane.INFORMATION_MESSAGE);
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

        jScrollPane3 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btInserir = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        imgRetroceder = new javax.swing.JLabel();
        imgHome = new javax.swing.JLabel();
        imgGuardar = new javax.swing.JLabel();
        comboDoente = new javax.swing.JComboBox<>();
        comboTipo = new javax.swing.JComboBox<>();
        comboIndicacao = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(613, 389));
        setUndecorated(true);
        setSize(new java.awt.Dimension(604, 333));
        getContentPane().setLayout(null);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Tipo", "Indicação", "Doente"
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
        jScrollPane3.setBounds(240, 70, 370, 240);

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel3.setText("Lista de Equipamentos");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(210, 10, 190, 20);

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel5.setText("Indicação:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 250, 80, 20);

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel4.setText("Doente :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 130, 60, 20);

        btInserir.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btInserir.setText("Inserir");
        btInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirActionPerformed(evt);
            }
        });
        getContentPane().add(btInserir);
        btInserir.setBounds(230, 330, 80, 30);

        btLimpar.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btLimpar);
        btLimpar.setBounds(430, 330, 80, 30);

        btExcluir.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btExcluir);
        btExcluir.setBounds(530, 330, 80, 29);

        btEditar.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btEditar);
        btEditar.setBounds(330, 330, 80, 29);

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel9.setText("Tipo :");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(10, 190, 40, 20);

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

        comboDoente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Doente não selecionado" }));
        getContentPane().add(comboDoente);
        comboDoente.setBounds(80, 130, 150, 30);

        comboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Selecionar Tipo --", "Desfibrilhador", "Ventilador", "Outro" }));
        getContentPane().add(comboTipo);
        comboTipo.setBounds(80, 190, 150, 30);

        comboIndicacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Selecionar Estado --", "Livre", "Ocupado", " " }));
        getContentPane().add(comboIndicacao);
        comboIndicacao.setBounds(80, 250, 150, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/listaEquipamentosfundo.png"))); // NOI18N
        jLabel1.setMinimumSize(new java.awt.Dimension(621, 376));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 650, 420);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        // TODO add your handling code here
        comboIndicacao.setSelectedItem(null);   
        comboDoente.setSelectedItem(null);
        comboTipo.setSelectedItem(null);
    }//GEN-LAST:event_btLimparActionPerformed

    private void btInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirActionPerformed
        // TODO add your handling code here:
        
        String id = UUID.randomUUID().toString();
         
        String doenteSelecionado = comboDoente.getSelectedItem().toString();
        String tipo = comboTipo.getSelectedItem().toString();
        String disponibilidade = comboIndicacao.getSelectedItem().toString();
         
        /*var result = new ArrayList<Equipamento>();
         sistema.getListaEquipamento().getListaEquipamento().stream().filter((equipamento) -> (equipamento.getDoente().equals(txtDoente.getText()))).forEachOrdered((Equipamento) -> {
         result.add(Equipamento);
         }); */
        
         /*if(!btVentilador.isSelected() && !btDesfibrilhador.isSelected() && !btOutro.isSelected()) {
            JOptionPane.showMessageDialog(null, "Selecione o tipo de equipamento!!");
            return;
         }
         
          if(!btLivre.isSelected() && !btOcupado.isSelected() ) {
            JOptionPane.showMessageDialog(null, "Selecione a disponibilidade do equipamento!!");
            return;
          }
          
        int index = table.getSelectedRow();
        Equipamento tipoEquipamento = sistema.getListaHospital().getListaHospital().get(indiceHospital).getListaEnfermaria().getListaEnfermaria().get(indiceEnfermaria).getListaEquipamento().getListaEquipamento().get(index);
        Equipamento disponibilidadeEquipamento = sistema.getListaHospital().getListaHospital().get(indiceHospital).getListaEnfermaria().getListaEnfermaria().get(indiceEnfermaria).getListaEquipamento().getListaEquipamento().get(index);
       
          
        if(btVentilador.isSelected()) {
           tipoEquipamento.setTipoEquipamento("Ventilador");          
            carregarTabela();
         }
             
        if(btDesfibrilhador.isSelected()) {
            tipoEquipamento.setTipoEquipamento("Desfibrilhador");        
            carregarTabela();
        }
        
        if(btOutro.isSelected()) {
            tipoEquipamento.setTipoEquipamento("Outro");              
            carregarTabela();

                }        
                
        if(btLivre.isSelected()) {
           disponibilidadeEquipamento.setIndicacao("Livre");          
            carregarTabela();
         }
             
        if(btOcupado.isSelected()) {
            disponibilidadeEquipamento.setIndicacao("Ocupado");        
            carregarTabela();
            }
                  
             
           
        String Tipo="";
            if(btVentilador.isSelected()) {   //verificar qual dos radiobuttons esta selecionado
                Tipo = "Ventilador";
            }else{
                if(btDesfibrilhador.isSelected()) {
                    Tipo = "Desfibrilhador";
                }else {
                    if(btOutro.isSelected()) {
                        Tipo = "Outro";
                    }
                }
            }
            
         String Disponibilidade="";
         
            if(btLivre.isSelected()) {   //verificar qual dos radiobuttons esta selecionado
                Disponibilidade = "Livre";
            }else{
                if(btOcupado.isSelected()) {
                    Disponibilidade = "Ocupado";
                }
            }*/
         
        if ((comboTipo.getSelectedIndex()==0)){
             JOptionPane.showMessageDialog(null," Selecione um tipo de equipamento","Erro",JOptionPane.ERROR_MESSAGE);             
             return;
        }
        
        if ((comboIndicacao.getSelectedIndex()==0)){
             JOptionPane.showMessageDialog(null," Selecione a disponibilidade do equipamento","Erro",JOptionPane.ERROR_MESSAGE);             
             return;
        }
       
        Equipamento eq = new Equipamento(sistema.getUtilizadorLigado(), id, disponibilidade, tipo, doenteSelecionado);
        
        try {
        sistema.getListaHospital().getListaHospital().get(indiceHospital).getListaEnfermaria().getListaEnfermaria().get(indiceEnfermaria).getListaEquipamento().adicionar(eq);
        JOptionPane.showMessageDialog(null, "Equipamento registado!");       
        comboDoente.setSelectedItem(null); 
        comboTipo.setSelectedItem(null);
        comboIndicacao.setSelectedItem(null);
        carregarTabela();       
       
        } catch(RuntimeException e) {
            JOptionPane.showMessageDialog(null,"Este equipamento já se encontra registado","Erro",JOptionPane.ERROR_MESSAGE);
        }
        
        guardarAlteracoes(); 
        
    }//GEN-LAST:event_btInserirActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        // TODO add your handling code here:
        try {
        int indiceEquipamento = table.getSelectedRow();
        
        Equipamento editarEquipamento = sistema.getListaHospital().getListaHospital().get(indiceHospital).getListaEnfermaria().getListaEnfermaria().get(indiceEnfermaria).getListaEquipamento().getListaEquipamento().get(indiceEquipamento);
        
        if (indiceEquipamento == -1){
                JOptionPane.showMessageDialog(null,"Selecione um equipamento","Atenção",JOptionPane.WARNING_MESSAGE); 
        
        }
        
         if ((comboTipo.getSelectedIndex()==0)){
             JOptionPane.showMessageDialog(null," Selecione um tipo de equipamento","Erro",JOptionPane.ERROR_MESSAGE);             
             return;
        }
        
        if ((comboIndicacao.getSelectedIndex()==0)){
             JOptionPane.showMessageDialog(null," Selecione a disponibilidade do equipamento","Erro",JOptionPane.ERROR_MESSAGE);             
             return;
        }
        
        editarEquipamento.setIndicacao(comboIndicacao.getSelectedItem().toString());
        editarEquipamento.setTipoEquipamento(comboTipo.getSelectedItem().toString());
        editarEquipamento.setDoente(comboDoente.getSelectedItem().toString()); 
        
        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null,"Selecione um equipamento","Atenção",JOptionPane.WARNING_MESSAGE);
            return;
            } 
        
        carregarTabela();
        guardarAlteracoes();
        
    }//GEN-LAST:event_btEditarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        // TODO add your handling code here:
         DefaultTableModel model = (DefaultTableModel)table.getModel();
        int c = table.getSelectedRow();
        if(c >= 0){
            model.removeRow(c); //remove a linha selecionada
            sistema.getListaHospital().getListaHospital().get(indiceHospital).getListaEnfermaria().getListaEnfermaria().get(indiceEnfermaria).getListaEquipamento().getListaEquipamento().remove(c);
            JOptionPane.showMessageDialog(this, "Removido!");
            guardarAlteracoes();
            
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
       PaginaEnfermarias l = new PaginaEnfermarias(sistema,bd,indiceHospital);
        //FichaHospital p = new FichaHospital(sistema,bd,table.getSelectedRow());
        l.setLocationRelativeTo(null);
        l.setVisible(true);
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
            java.util.logging.Logger.getLogger(PaginaEquipamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaEquipamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaEquipamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaEquipamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ListaEquipamentos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btInserir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JComboBox<String> comboDoente;
    private javax.swing.JComboBox<String> comboIndicacao;
    private javax.swing.JComboBox<String> comboTipo;
    private javax.swing.JLabel imgGuardar;
    private javax.swing.JLabel imgHome;
    private javax.swing.JLabel imgRetroceder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
