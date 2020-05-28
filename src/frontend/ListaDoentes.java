
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import backend.ListaDoente;
import backend.Doente;
import backend.Hospital;
import javax.swing.JOptionPane;
import backend.Serializacao;
import java.util.ArrayList;
import backend.Sistema;
import java.util.Calendar;
import java.util.UUID;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pedro
 */
public class ListaDoentes extends javax.swing.JFrame {
    
    DefaultTableModel model; 
    private Sistema sistema;
    private Serializacao bd;
    private ListaDoente listaDoente;
    private int indiceHospital;
    private int indiceEnfermaria;
    private int indiceMedico;
  
    
    /**
     * Creates new form ListaDoentes
     */
    
    public ListaDoentes(Sistema sistema, Serializacao bd, int indiceHospital, int indiceEnfermaria, int indiceMedico) {
        initComponents();

        model = (DefaultTableModel) tableDoentes.getModel();
        this.sistema = sistema;
        this.bd = bd;      
        this.indiceHospital = indiceHospital;
        this.indiceEnfermaria = indiceEnfermaria;
        this.indiceMedico = indiceMedico;
        carregarTabela();
        //listaDoente = sistema.getListaDoente().getListaDoente().get(sistema.getHospitalSelecionado()).getListaDoente();
    }
    
    
    public void carregarTabela()
    {
        model.setRowCount(0);
        
        for (int i = 0; i < sistema.getListaHospital().getListaHospital().get(indiceHospital).getListaEnfermaria().getListaEnfermaria().get(indiceEnfermaria).getListaProfissionalSaude().getListaProfissionalSaude().get(indiceMedico).getListaDoente().getListaDoente().size(); i++) {
            
            Doente doente = sistema.getListaHospital().getListaHospital().get(indiceHospital).getListaEnfermaria().getListaEnfermaria().get(indiceEnfermaria).getListaProfissionalSaude().getListaProfissionalSaude().get(indiceMedico).getListaDoente().getListaDoente().get(i);
            
            model.addRow(new Object[]{doente.getIdDoente(), doente.getNome(), doente.getDataNasc(), doente.getLocalidade(), doente.getNCama(), doente.getMedico(), doente.getEnfermaria(), doente.getGravidade(), doente.getDataEntrada(), doente.getDataSaida()});

        }
        tableDoentes.setModel(model);
    }

    private void guardarAlteracoes() {
    bd.gravaSistema(sistema);
    }
     
    private void terminar() {        
       if (JOptionPane.showConfirmDialog(null, 
               "Deseja realmente terminar o programa?", 
               "Terminar", 
               JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
           guardarAlteracoes();
           sistema.terminar();
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableDoentes = new javax.swing.JTable();
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
        imgRetroceder = new javax.swing.JLabel();
        imgHome = new javax.swing.JLabel();
        DataSaida = new com.toedter.calendar.JDateChooser();
        DataNasc = new com.toedter.calendar.JDateChooser();
        DataEntrada = new com.toedter.calendar.JDateChooser();
        imgGuardar = new javax.swing.JLabel();
        btModerado = new javax.swing.JRadioButton();
        btGrave = new javax.swing.JRadioButton();
        btMuitoGrave = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel3.setText("Lista de Doentes");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(290, 10, 150, 20);

        tableDoentes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Data de Nascimento", "Localidade", "Cama", "Médico", "Enfermaria", "Gravidade", "Data entrada", "Data Saída"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tableDoentes);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(10, 50, 760, 160);

        btEditar.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btEditar);
        btEditar.setBounds(680, 390, 100, 30);

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel10.setText("Data de Saída :");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(260, 460, 110, 20);

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel11.setText("Data de Entrada :");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(260, 410, 110, 20);

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel12.setText("Gravidade :");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(260, 290, 80, 20);

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel13.setText("Enfermaria :");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(260, 230, 90, 20);

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
        jLabel17.setBounds(260, 350, 70, 20);

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
        btExcluir.setBounds(680, 330, 100, 30);

        btLimpar.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btLimpar.setText("Limpar");
        btLimpar.setEnabled(false);
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btLimpar);
        btLimpar.setBounds(680, 280, 100, 30);

        btInserir.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btInserir.setText("Inserir");
        btInserir.setEnabled(false);
        btInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirActionPerformed(evt);
            }
        });
        getContentPane().add(btInserir);
        btInserir.setBounds(680, 230, 100, 30);

        txtEnfermaria.setEnabled(false);
        getContentPane().add(txtEnfermaria);
        txtEnfermaria.setBounds(390, 230, 110, 30);

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

        imgRetroceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/undo-button2.png"))); // NOI18N
        imgRetroceder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgRetrocederMouseClicked(evt);
            }
        });
        getContentPane().add(imgRetroceder);
        imgRetroceder.setBounds(600, 10, 24, 30);

        imgHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sydney-opera-house.png"))); // NOI18N
        imgHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgHomeMouseClicked(evt);
            }
        });
        getContentPane().add(imgHome);
        imgHome.setBounds(640, 10, 30, 30);
        getContentPane().add(DataSaida);
        DataSaida.setBounds(390, 450, 110, 30);
        getContentPane().add(DataNasc);
        DataNasc.setBounds(390, 340, 110, 30);
        getContentPane().add(DataEntrada);
        DataEntrada.setBounds(390, 400, 110, 30);

        imgGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/save.png"))); // NOI18N
        imgGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgGuardarMouseClicked(evt);
            }
        });
        getContentPane().add(imgGuardar);
        imgGuardar.setBounds(560, 10, 30, 30);

        btModerado.setText("Moderado");
        btModerado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModeradoActionPerformed(evt);
            }
        });
        getContentPane().add(btModerado);
        btModerado.setBounds(360, 290, 80, 23);

        btGrave.setText("Grave");
        btGrave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGraveActionPerformed(evt);
            }
        });
        getContentPane().add(btGrave);
        btGrave.setBounds(460, 290, 60, 23);

        btMuitoGrave.setText("Muito Grave");
        btMuitoGrave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMuitoGraveActionPerformed(evt);
            }
        });
        getContentPane().add(btMuitoGrave);
        btMuitoGrave.setBounds(540, 290, 83, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ListaDoentesFundo.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 850, 520);

        setSize(new java.awt.Dimension(801, 503));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        // TODO add your handling code here:
        btInserir.setEnabled(true);
        btExcluir.setEnabled(true);
        btLimpar.setEnabled(true);
        txtCodigo.setEnabled(true);
        txtNome.setEnabled(true);
        DataNasc.setEnabled(true);
        txtLocalidade.setEnabled(true);
        txtCama.setEnabled(true);
        txtMedico.setEnabled(true);
        txtEnfermaria.setEnabled(true);
        btModerado.setEnabled(true);
        btGrave.setEnabled(true);
        btMuitoGrave.setEnabled(true);
        DataEntrada.setEnabled(true);
        DataSaida.setEnabled(true);
    }//GEN-LAST:event_btEditarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        // TODO add your handling code here:
        txtCodigo.setText(null);
        txtNome.setText(null);
        DataNasc.setDate(null);
        txtLocalidade.setText(null);
        txtCama.setText(null);
        txtMedico.setText(null);
        txtEnfermaria.setText(null);
       /* btModerado.setSelectedItem(null);
        btGrave.setSelectedItem(null);
        btMuitoGrave.setSelectedItem(null);*/
        DataEntrada.setDate(null);
        DataSaida.setDate(null);
        
    }//GEN-LAST:event_btLimparActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tableDoentes.getModel();
        int c = tableDoentes.getSelectedRow();
        if(c >= 0){
            model.removeRow(c); //remove a linha selecionada
            sistema.getListaDoente().getListaDoente().remove(c);
            guardarAlteracoes();
            JOptionPane.showMessageDialog(this, "Removido!");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Selecione um doente");
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void txtCamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCamaActionPerformed

    private void btInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirActionPerformed
       // TODO add your handling code here:
        String id = UUID.randomUUID().toString();
        
       /* int index = tableDoentes.getSelectedRow();
        
                
        var result = new ArrayList<Doente>();
         sistema.getListaDoente().getListaDoente().stream().filter((doente) -> (doente.getNome().equals(txtNome.getText()))).forEachOrdered((doente) -> {
         result.add(doente);
         });
        
        if (txtCama.getText().isEmpty()) {
             JOptionPane.showMessageDialog(null,"Introduza o nome do doente","Erro",JOptionPane.ERROR_MESSAGE);
             txtCama.requestFocus();
             return;
        } else {
             if(!result.isEmpty()){
                JOptionPane.showMessageDialog(null,"Essa cama já está ocupada","Erro",JOptionPane.ERROR_MESSAGE);
                txtCama.requestFocus();
                return;
        }     
        }
        
        Doente doente = sistema.getListaMedico().todos().get(index).getListaDoente().getListaDoente().get(index);
        sistema.getListaDoente().adicionar(doente);
        
        Doente tipoDoente = sistema.getListaMedico().todos().get(indice).getListaDoente().getListaDoente().get(indice);

        if(!btModerado.isSelected() && !btGrave.isSelected() && !btMuitoGrave.isSelected()) {
            JOptionPane.showMessageDialog(null, "Selecione gravidade do estado em que se encontra o doente!!");
        }else {
        
        if(btModerado.isSelected()) {
            tipoDoente.setGravidade("Moderado");          
            carregarTabela();
         }
             
        if(btGrave.isSelected()) {
           tipoDoente.setGravidade("Grave");     
            carregarTabela();
        }
        
        if(btMuitoGrave.isSelected()) {
            tipoDoente.setGravidade("Muito Grave");           
            carregarTabela();

                }        
        }*/        
        
        String Tipo="";
        
            if(btModerado.isSelected()) {   //verificar qual dos radiobuttons esta selecionado
                Tipo = "Moderado";
            }else{
                if(btGrave.isSelected()) {
                    Tipo = "Grave";
                }else {
                    if(btMuitoGrave.isSelected()) {
                        Tipo = "Muito Grave";
                    }
                }
            }
        
        if(DataEntrada.getDate().getTime() >= DataSaida.getDate().getTime()){
            JOptionPane.showMessageDialog(null, "A data de entrada não pode ser superior à data de saída!!!");
            DataEntrada.requestFocus();
            return;
        }
        if(DataNasc.getDate().getTime() > 24/05/2020){
            JOptionPane.showMessageDialog(null, "A data de nascimento não pode ser superior à data atual!!!");
            DataNasc.requestFocus();
            return;
        }
        if(DataNasc.getDate().getTime() > DataEntrada.getDate().getTime() || DataNasc.getDate().getTime() > DataSaida.getDate().getTime()){
            JOptionPane.showMessageDialog(null, "A data de nascimento não pode ser superior à data de entrada ou saída!!!");
            DataNasc.requestFocus();
            return;
        }

        model.insertRow(model.getRowCount(),new Object[] {id, txtNome.getText(), DataNasc.getDate(), txtLocalidade.getText(), txtCama.getText(), txtMedico.getText(), txtEnfermaria.getText(), Tipo, DataEntrada.getDate(), DataSaida.getDate()});
        Doente doente = new Doente(id, txtNome.getText(), txtLocalidade.getText(), Tipo, DataNasc.getCalendar(), DataEntrada.getCalendar(), DataSaida.getCalendar(), Integer.parseInt(txtCama.getText()), txtEnfermaria.getText(), txtMedico.getText());
       
        try {
       // sistema.getListaMedico().todos().get(indice).getListaDoentes().adicionar(doente);
        JOptionPane.showMessageDialog(null, "Doente adicionado!");
        txtNome.setText("");
        txtLocalidade.setText("");
        txtCodigo.setText("");
        txtCama.setText("");
        txtMedico.setText("");
        txtEnfermaria.setText("");
        //btModerado.clearSelection();
        DataNasc.setDate(null);
        DataSaida.setDate(null);
        DataEntrada.setDate(null);
        carregarTabela();
        }catch(RuntimeException e) {
            //Todas as labels estão preenchidas, no entanto com o tipo de dados errado
            JOptionPane.showMessageDialog(null,"Este doente já se encontre registado!!!","Erro",JOptionPane.ERROR_MESSAGE);
        }
        
            
        guardarAlteracoes();
       // Doente d = new Doente (Integer.parseInt(txtCodigo.getText()),txtNome.getText(), txtLocalidade.getText(), ComboGrav.getSelectedItem(),/*DataNasc.getDate(), DataEntrada.getLocalDate()), DataSaida.getLocalDate()*/, Integer.parseInt(txtCama.getText()), txtEnfermaria.getText(), txtMedico.getText());
      //  
    }//GEN-LAST:event_btInserirActionPerformed

    private void imgHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgHomeMouseClicked
        // TODO add your handling code here:
        dispose();
        ListaHospitais listaHospitais = new ListaHospitais(sistema,bd);
        listaHospitais.setLocationRelativeTo(null);
        listaHospitais.setVisible(true);
        this.close();
    }//GEN-LAST:event_imgHomeMouseClicked

    private void imgRetrocederMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgRetrocederMouseClicked
        // TODO add your handling code here:
        dispose();
       ListaProfissionaisSaude p = new ListaProfissionaisSaude(sistema,bd,indiceHospital,indiceMedico);
        //FichaHospital p = new FichaHospital(sistema,bd,table.getSelectedRow());
        p.setLocationRelativeTo(null);
        p.setVisible(true);
    }//GEN-LAST:event_imgRetrocederMouseClicked

    private void imgGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgGuardarMouseClicked
        // TODO add your handling code here:
        //sistema.getListaDoente().adicionar(new Doente (Integer.parseInt(txtCodigo.getText()),txtNome.getText(), txtLocalidade.getText(), ComboGrav.getSelectedItem(),/*DataNasc.getDate(), DataEntrada.getLocalDate()), DataSaida.getLocalDate()*/, Integer.parseInt(txtCama.getText()), txtEnfermaria.getText(), txtMedico.getText()));
        guardarAlteracoes();
        JOptionPane.showMessageDialog(this, "Alterações guardadas.");
    }//GEN-LAST:event_imgGuardarMouseClicked

    private void btModeradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModeradoActionPerformed
        // TODO add your handling code here:
         if(btModerado.isSelected()) {  //para o utilizador apenas poder selecionar um radio button
                btGrave.setSelected(false);
                btMuitoGrave.setSelected(false);
        }
    }//GEN-LAST:event_btModeradoActionPerformed

    private void btGraveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGraveActionPerformed
        // TODO add your handling code here:
          if(btGrave.isSelected()) {  //para o utilizador apenas poder selecionar um radio button
                btModerado.setSelected(false);
                btMuitoGrave.setSelected(false);
        }
    }//GEN-LAST:event_btGraveActionPerformed

    private void btMuitoGraveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMuitoGraveActionPerformed
        // TODO add your handling code here:
          if(btMuitoGrave.isSelected()) {  //para o utilizador apenas poder selecionar um radio button
                btGrave.setSelected(false);
                btModerado.setSelected(false);
        }
    }//GEN-LAST:event_btMuitoGraveActionPerformed

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
    private com.toedter.calendar.JDateChooser DataEntrada;
    private com.toedter.calendar.JDateChooser DataNasc;
    private com.toedter.calendar.JDateChooser DataSaida;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JRadioButton btGrave;
    private javax.swing.JButton btInserir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JRadioButton btModerado;
    private javax.swing.JRadioButton btMuitoGrave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel imgGuardar;
    private javax.swing.JLabel imgHome;
    private javax.swing.JLabel imgRetroceder;
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
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tableDoentes;
    private javax.swing.JTextField txtCama;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtEnfermaria;
    private javax.swing.JTextField txtLocalidade;
    private javax.swing.JTextField txtMedico;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables

    private void close() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
