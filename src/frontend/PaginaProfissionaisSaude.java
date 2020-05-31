/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import backend.Equipamento;
import backend.ListaMedico;
import backend.Medico;
import backend.Utilizador;
import backend.Enfermeiro;
import backend.Serializacao;
import backend.Sistema;
import java.util.ArrayList;
import java.util.UUID;
//import backend.ListaProfissionaisSaude;

//import static frontend.ListaHospitais.table;

//import static frontend.ListaHospitais.table;


import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * 
 */
public class PaginaProfissionaisSaude extends javax.swing.JFrame {
    
    DefaultTableModel modelEnfermeiro; 
    DefaultTableModel modelMedico; 
    private Sistema sistema;
    private Serializacao bd;
    int varHosp; 
    private ListaMedico listaMedico;
    private int indiceHospital;
    private int indiceEnfermaria;
    
    public PaginaProfissionaisSaude(Sistema sistema, Serializacao bd, int indiceHospital, int indiceEnfermaria) {
        initComponents();
        modelEnfermeiro = (DefaultTableModel) tableEnfermeiros.getModel();
        modelMedico = (DefaultTableModel) tableMedicos.getModel();
        this.sistema = sistema;
        this.indiceHospital = indiceHospital;
        this.indiceEnfermaria = indiceEnfermaria;
        this.bd = bd;
        //listaMedico = sistema.getListaHospital().getListaHospital().get(sistema.getHospitalSelecionado()).getListaMedico();
        carregarTabelaEnfermeiro();
        carregarTabelaMedico();
    }
    
    public void carregarTabelaEnfermeiro()
    {
         modelEnfermeiro.setRowCount(0);
        
        for (int i = 0; i < sistema.getListaHospital().getListaHospital().get(indiceHospital).getListaEnfermaria().getListaEnfermaria().get(indiceEnfermaria).getListaEnfermeiro().getListaEnfermeiro().size(); i++) {
            
            Enfermeiro profSaude = sistema.getListaHospital().getListaHospital().get(indiceHospital).getListaEnfermaria().getListaEnfermaria().get(indiceEnfermaria).getListaEnfermeiro().getListaEnfermeiro().get(i);
            
             if (profSaude.getUtiLigado().equals(sistema.getUtilizadorLigado())) {
             modelEnfermeiro.addRow(new Object[]{profSaude.getIdEnfermeiro(), profSaude.getNomeEnfermeiro()});
             }
        }
            tableEnfermeiros.setModel(modelEnfermeiro);
    }
    
     public void carregarTabelaMedico()
    {
        modelMedico.setRowCount(0);
        
        for (int i = 0; i < sistema.getListaHospital().getListaHospital().get(indiceHospital).getListaEnfermaria().getListaEnfermaria().get(indiceEnfermaria).getListaMedico().getListaMedico().size(); i++) {
            
            Medico medico = sistema.getListaHospital().getListaHospital().get(indiceHospital).getListaEnfermaria().getListaEnfermaria().get(indiceEnfermaria).getListaMedico().getListaMedico().get(i);
            
             if (medico.getUtiLigado().equals(sistema.getUtilizadorLigado())) {
            modelMedico.addRow(new Object[]{medico.getIdMedico(),medico.getNomeMedico(), medico.getEspecialidade()});
             }
        }
            tableMedicos.setModel(modelMedico);
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
        btInserirMedico = new javax.swing.JButton();
        btLDoentes = new javax.swing.JButton();
        btLimparEnfermeiro = new javax.swing.JButton();
        txtNomeEnfermeiro = new javax.swing.JTextField();
        imgRetroceder = new javax.swing.JLabel();
        imgHome = new javax.swing.JLabel();
        btExcluirEnfermeiro = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMedicos = new javax.swing.JTable();
        btInserirEnfermeiro = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNomeMedico = new javax.swing.JTextField();
        txtEspecialidade = new javax.swing.JTextField();
        btLimparMedico = new javax.swing.JButton();
        btExcluirMedico = new javax.swing.JButton();
        btEditarEnfermeiro = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(635, 525));
        setUndecorated(true);
        setSize(new java.awt.Dimension(819, 415));
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel3.setText("Lista de Profissionais de Saúde");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(190, 0, 270, 20);

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
        jScrollPane3.setBounds(20, 60, 280, 230);

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel6.setText("Nome Enfermeiro :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 310, 130, 20);

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel8.setText("Especialidade :");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(330, 350, 100, 20);

        btInserirMedico.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btInserirMedico.setText("Inserir");
        btInserirMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirMedicoActionPerformed(evt);
            }
        });
        getContentPane().add(btInserirMedico);
        btInserirMedico.setBounds(330, 410, 80, 29);

        btLDoentes.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btLDoentes.setText("Lista Doentes");
        btLDoentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLDoentesActionPerformed(evt);
            }
        });
        getContentPane().add(btLDoentes);
        btLDoentes.setBounds(350, 460, 120, 29);

        btLimparEnfermeiro.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btLimparEnfermeiro.setText("Limpar");
        btLimparEnfermeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparEnfermeiroActionPerformed(evt);
            }
        });
        getContentPane().add(btLimparEnfermeiro);
        btLimparEnfermeiro.setBounds(120, 350, 80, 30);

        txtNomeEnfermeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeEnfermeiroActionPerformed(evt);
            }
        });
        getContentPane().add(txtNomeEnfermeiro);
        txtNomeEnfermeiro.setBounds(160, 300, 140, 30);

        imgRetroceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/undo-button2.png"))); // NOI18N
        imgRetroceder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgRetrocederMouseClicked(evt);
            }
        });
        getContentPane().add(imgRetroceder);
        imgRetroceder.setBounds(560, 0, 24, 30);

        imgHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sydney-opera-house.png"))); // NOI18N
        imgHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgHomeMouseClicked(evt);
            }
        });
        getContentPane().add(imgHome);
        imgHome.setBounds(600, 0, 30, 30);

        btExcluirEnfermeiro.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btExcluirEnfermeiro.setText("Excluir");
        btExcluirEnfermeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirEnfermeiroActionPerformed(evt);
            }
        });
        getContentPane().add(btExcluirEnfermeiro);
        btExcluirEnfermeiro.setBounds(220, 350, 80, 29);

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
        jScrollPane1.setBounds(330, 60, 290, 230);

        btInserirEnfermeiro.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btInserirEnfermeiro.setText("Inserir");
        btInserirEnfermeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirEnfermeiroActionPerformed(evt);
            }
        });
        getContentPane().add(btInserirEnfermeiro);
        btInserirEnfermeiro.setBounds(20, 350, 80, 29);

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel2.setText("Medicos");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(330, 40, 90, 20);

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel4.setText("Enfermeiros");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 40, 80, 20);

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel5.setText("Nome Médico:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(330, 310, 100, 20);

        txtNomeMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeMedicoActionPerformed(evt);
            }
        });
        getContentPane().add(txtNomeMedico);
        txtNomeMedico.setBounds(500, 300, 120, 30);

        txtEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEspecialidadeActionPerformed(evt);
            }
        });
        getContentPane().add(txtEspecialidade);
        txtEspecialidade.setBounds(500, 340, 120, 30);

        btLimparMedico.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btLimparMedico.setText("Limpar");
        btLimparMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparMedicoActionPerformed(evt);
            }
        });
        getContentPane().add(btLimparMedico);
        btLimparMedico.setBounds(440, 410, 80, 30);

        btExcluirMedico.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btExcluirMedico.setText("Excluir");
        btExcluirMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirMedicoActionPerformed(evt);
            }
        });
        getContentPane().add(btExcluirMedico);
        btExcluirMedico.setBounds(550, 410, 80, 29);

        btEditarEnfermeiro.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btEditarEnfermeiro.setText("Editar");
        btEditarEnfermeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarEnfermeiroActionPerformed(evt);
            }
        });
        getContentPane().add(btEditarEnfermeiro);
        btEditarEnfermeiro.setBounds(120, 400, 80, 30);

        jButton1.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jButton1.setText("Editar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(510, 460, 80, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/G5.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-10, -380, 1050, 950);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btLDoentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLDoentesActionPerformed
       //int c = tableProfissionaisSaude.getSelectedRow();
       int indiceMedico = tableMedicos.getSelectedRow();    
       int indiceEnfermeiro = tableEnfermeiros.getSelectedRow();
       
       if (indiceEnfermeiro >= 0){
                JOptionPane.showMessageDialog(null,"Selecione um médico","Atenção",JOptionPane.WARNING_MESSAGE); 
                tableEnfermeiros.clearSelection();
                return;
        }
       
        if (indiceMedico == -1){
                JOptionPane.showMessageDialog(null,"Selecione um médico","Atenção",JOptionPane.WARNING_MESSAGE); 
        } else {
        
        PaginaDoentes doentes = new PaginaDoentes(sistema, bd, indiceHospital, indiceEnfermaria, indiceMedico);
        
        guardarAlteracoes();
        dispose();
        doentes.setVisible(true);
        doentes.setLocationRelativeTo(null);
        }
       
        
    }//GEN-LAST:event_btLDoentesActionPerformed

    private void txtNomeEnfermeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeEnfermeiroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeEnfermeiroActionPerformed

    private void btLimparEnfermeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparEnfermeiroActionPerformed
        // TODO add your handling code here:
        
        txtNomeEnfermeiro.setText(null);
        
    }//GEN-LAST:event_btLimparEnfermeiroActionPerformed

    private void btInserirMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirMedicoActionPerformed
        // TODO add your handling code here:
        
       String id = UUID.randomUUID().toString();
       
       if (txtNomeMedico.getText().isEmpty()) {
             JOptionPane.showMessageDialog(null,"Introduza o nome do médico","Erro",JOptionPane.ERROR_MESSAGE);
             txtNomeMedico.requestFocus();
             return;
        }
        
        //Impede que existam localidades com digitos e caracteres no nome. Exemplo: 123fg4 
        if (txtNomeMedico.getText().matches(".*\\d.*")){
             JOptionPane.showMessageDialog(null,"Nome do médico inválido","Erro",JOptionPane.ERROR_MESSAGE);
             txtNomeMedico.requestFocus();
             return;
        }
        
     
        if (txtEspecialidade.getText().isEmpty()) {
             JOptionPane.showMessageDialog(null,"Introduza a especialidade","Erro",JOptionPane.ERROR_MESSAGE);
             txtEspecialidade.requestFocus();
             return;
        }
        
        //Impede que existam localidades com digitos e caracteres no nome. Exemplo: 123fg4 
        if (txtEspecialidade.getText().matches(".*\\d.*")){
             JOptionPane.showMessageDialog(null,"Especialidade inválida","Erro",JOptionPane.ERROR_MESSAGE);
             txtEspecialidade.requestFocus();
             return;
        }
        

        Medico medico = new Medico(sistema.getUtilizadorLigado(), txtEspecialidade.getText(), txtNomeMedico.getText(), id);     
        
        //txtNome.setText(txtNome.getText());
        
        try {
        sistema.getListaHospital().getListaHospital().get(indiceHospital).getListaEnfermaria().getListaEnfermaria().get(indiceEnfermaria).getListaMedico().adicionar(medico);
        JOptionPane.showMessageDialog(null, "Medico " + txtNomeMedico.getText() + " registado!");
        txtNomeMedico.setText("");
        txtEspecialidade.setText("");
        
        carregarTabelaMedico();
        }catch(RuntimeException e) {
            //Todas as labels estão preenchidas, no entanto com o tipo de dados errado
            JOptionPane.showMessageDialog(null,"Este médico já se encontra registado","Erro",JOptionPane.ERROR_MESSAGE);
        }
        guardarAlteracoes();
    }//GEN-LAST:event_btInserirMedicoActionPerformed

    private void imgHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgHomeMouseClicked
        // TODO add your handling code here:
        dispose();
        PaginaInicialUtilizador paginaInicialUtilizador = new PaginaInicialUtilizador(sistema,bd);
        paginaInicialUtilizador.setLocationRelativeTo(null);
        paginaInicialUtilizador.setVisible(true);
        
    }//GEN-LAST:event_imgHomeMouseClicked

    private void imgRetrocederMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgRetrocederMouseClicked
        // TODO add your handling code here:
         dispose();
        PaginaEnfermarias l = new PaginaEnfermarias(sistema,bd,indiceHospital);
        //FichaHospital p = new FichaHospital(sistema,bd,table.getSelectedRow());
        l.setLocationRelativeTo(null);
        l.setVisible(true);
    }//GEN-LAST:event_imgRetrocederMouseClicked

    private void btExcluirEnfermeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirEnfermeiroActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tableEnfermeiros.getModel();
        int c = tableEnfermeiros.getSelectedRow();
        if(c >= 0){
            model.removeRow(c); //remove a linha selecionada
            sistema.getListaHospital().getListaHospital().get(indiceHospital).getListaEnfermaria().getListaEnfermaria().get(indiceEnfermaria).getListaEnfermeiro().getListaEnfermeiro().remove(c);
            JOptionPane.showMessageDialog(this, "Removido!");
            guardarAlteracoes();   
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Selecione um enfermeiro");
        }
    }//GEN-LAST:event_btExcluirEnfermeiroActionPerformed

    private void btInserirEnfermeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirEnfermeiroActionPerformed
        // TODO add your handling code here:
        
         String id = UUID.randomUUID().toString();
          
       /* var result = new ArrayList<ProfissionalSaude>();
         sistema.getListaProfissionalSaude().getListaProfissionalSaude().stream().filter((profissionalsaude) -> (profissionalsaude.getNomePS().equals(txtNomeEnfermeiro.getText()))).forEachOrdered((profissionalSaude) -> {
         result.add(profissionalSaude);
         });
         
     if (txtNomeEnfermeiro.getText().isEmpty()) {
             JOptionPane.showMessageDialog(null,"Introduza o nome do profissional de saude","Erro",JOptionPane.ERROR_MESSAGE);
             txtNomeEnfermeiro.requestFocus();
             return;
             
        } else {
         
             if(!result.isEmpty()){
                JOptionPane.showMessageDialog(null,"Esse profissional de saude já existe","Erro",JOptionPane.ERROR_MESSAGE);
                txtNomeEnfermeiro.requestFocus();
                return;
            }     
        }*/
        if (txtNomeEnfermeiro.getText().isEmpty()) {
             JOptionPane.showMessageDialog(null,"Introduza o nome do enfermeiro","Erro",JOptionPane.ERROR_MESSAGE);
             txtNomeMedico.requestFocus();
             return;
        }
        
        //Impede que existam localidades com digitos e caracteres no nome. Exemplo: 123fg4 
        if (txtNomeEnfermeiro.getText().matches(".*\\d.*")){
             JOptionPane.showMessageDialog(null,"Nome do enfermeiro inválido","Erro",JOptionPane.ERROR_MESSAGE);
             txtNomeEnfermeiro.requestFocus();
             return;
        }
        
        Enfermeiro profSaude = new Enfermeiro(sistema.getUtilizadorLigado(), id, txtNomeEnfermeiro.getText());             
        
        try {
        sistema.getListaHospital().getListaHospital().get(indiceHospital).getListaEnfermaria().getListaEnfermaria().get(indiceEnfermaria).getListaEnfermeiro().adicionar(profSaude);
        JOptionPane.showMessageDialog(null, "Enfermeiro " + txtNomeEnfermeiro.getText() + " registado!");
        txtNomeEnfermeiro.setText("");        
        carregarTabelaEnfermeiro();
        }catch(RuntimeException e) {
            //Todas as labels estão preenchidas, no entanto com o tipo de dados errado
            JOptionPane.showMessageDialog(null,"Este enfermeiro já se encontra registado","Erro",JOptionPane.ERROR_MESSAGE);
        }
        guardarAlteracoes();
    }//GEN-LAST:event_btInserirEnfermeiroActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtNomeMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeMedicoActionPerformed

    private void txtEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEspecialidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEspecialidadeActionPerformed

    private void btLimparMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparMedicoActionPerformed
        // TODO add your handling code here:
        txtEspecialidade.setText(null);
        txtNomeMedico.setText(null);       
        
    }//GEN-LAST:event_btLimparMedicoActionPerformed

    private void btExcluirMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirMedicoActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tableMedicos.getModel();
        int c = tableMedicos.getSelectedRow();
        if(c >= 0){
            model.removeRow(c); //remove a linha selecionada
            sistema.getListaHospital().getListaHospital().get(indiceHospital).getListaEnfermaria().getListaEnfermaria().get(indiceEnfermaria).getListaMedico().getListaMedico().remove(c);
            JOptionPane.showMessageDialog(this, "Removido!");
            guardarAlteracoes();   
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Selecione um médico");
        }
    }//GEN-LAST:event_btExcluirMedicoActionPerformed

    private void btEditarEnfermeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarEnfermeiroActionPerformed
        // TODO add your handling code here:
         try {
        int indiceEnfermeiro = tableEnfermeiros.getSelectedRow();
        
        Enfermeiro editarEnfermeiro = sistema.getListaHospital().getListaHospital().get(indiceHospital).getListaEnfermaria().getListaEnfermaria().get(indiceEnfermaria).getListaEnfermeiro().getListaEnfermeiro().get(indiceEnfermeiro);
        
        if (indiceEnfermeiro == -1){
                JOptionPane.showMessageDialog(null,"Selecione um enfermeiro","Atenção",JOptionPane.WARNING_MESSAGE); 
        
        }
        
        editarEnfermeiro.setNomeEnfermeiro(txtNomeEnfermeiro.getText());
        
        
        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null,"Selecione um enfermeiro","Atenção",JOptionPane.WARNING_MESSAGE);
            return;
            } 
        
        carregarTabelaEnfermeiro();
        guardarAlteracoes();
        
    }//GEN-LAST:event_btEditarEnfermeiroActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
                int indiceMedico = tableMedicos.getSelectedRow();

                 Medico editarMedico = sistema.getListaHospital().getListaHospital().get(indiceHospital).getListaEnfermaria().getListaEnfermaria().get(indiceEnfermaria).getListaMedico().getListaMedico().get(indiceMedico);

                if (indiceMedico == -1){
                        JOptionPane.showMessageDialog(null,"Selecione um médico","Atenção",JOptionPane.WARNING_MESSAGE); 

                }

                editarMedico.setNomeMedico(txtNomeMedico.getText());
                editarMedico.setEspecialidade(txtEspecialidade.getText());

        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null,"Selecione um médico","Atenção",JOptionPane.WARNING_MESSAGE);
            return;
            } 
        
        carregarTabelaMedico();
        guardarAlteracoes();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(PaginaProfissionaisSaude.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaProfissionaisSaude.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaProfissionaisSaude.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaProfissionaisSaude.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
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
    private javax.swing.JButton btEditarEnfermeiro;
    private javax.swing.JButton btExcluirEnfermeiro;
    private javax.swing.JButton btExcluirMedico;
    private javax.swing.JButton btInserirEnfermeiro;
    private javax.swing.JButton btInserirMedico;
    private javax.swing.JButton btLDoentes;
    private javax.swing.JButton btLimparEnfermeiro;
    private javax.swing.JButton btLimparMedico;
    private javax.swing.JLabel imgHome;
    private javax.swing.JLabel imgRetroceder;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tableEnfermeiros;
    private javax.swing.JTable tableMedicos;
    private javax.swing.JTextField txtEspecialidade;
    private javax.swing.JTextField txtNomeEnfermeiro;
    private javax.swing.JTextField txtNomeMedico;
    // End of variables declaration//GEN-END:variables
}
