/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;
import backend.Enfermaria;
import backend.Enfermeiro;
import backend.Equipamento;
import backend.Hospital;
import backend.ListaEnfermeiro;
import backend.Medico;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import backend.Sistema;
import backend.Serializacao;
import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

public class PaginaProfSaudeGenerica extends javax.swing.JFrame {
    DefaultTableModel modelEnfermeiro; 
    DefaultTableModel modelMedico; 
    private Sistema sistema;
    private Serializacao bd;
    private int indiceHospital;
    private int indiceEnfermaria;
   
    /**
     * 
     * @param sistema
     * @param bd 
     */
    public PaginaProfSaudeGenerica(Sistema sistema,Serializacao bd) {
        initComponents();
        modelEnfermeiro = (DefaultTableModel) tableEnfermeiro.getModel();
        modelMedico = (DefaultTableModel) tableMedico.getModel();
        this.sistema=sistema;
        this.bd = bd;
        
        carregarTabelaEnfermeiro();
        carregarTabelaMedico();
        
        //ordena tabela de forma ascedente e descendente
        tableEnfermeiro.setRowSorter(new TableRowSorter(modelEnfermeiro));      
        tableMedico.setRowSorter(new TableRowSorter(modelMedico));
    }
    
    public void carregarTabelaEnfermeiro()
    {

        modelEnfermeiro.setRowCount(0);

      /* ArrayList<Hospital> hospital = sistema.getListaHospital().getListaHospital();
       ArrayList<Enfermaria> enfermaria = sistema.getListaHospital().getListaHospital().get(indiceHospital).getListaEnfermaria().getListaEnfermaria();
       ArrayList<Enfermeiro> enfermeiro = sistema.getListaHospital().getListaHospital().get(indiceHospital).getListaEnfermaria().getListaEnfermaria().get(indiceEnfermaria).getListaEnfermeiro().getListaEnfermeiro();*/

        for (indiceHospital = 0; indiceHospital < sistema.getListaHospital().getListaHospital().size(); indiceHospital++) {

            for(indiceEnfermaria = 0; indiceEnfermaria < sistema.getListaHospital().getListaHospital().get(indiceHospital).getListaEnfermaria().getListaEnfermaria().size(); indiceEnfermaria++) {

                    for(int indiceEnfermeiro = 0; indiceEnfermeiro < sistema.getListaHospital().getListaHospital().get(indiceHospital).getListaEnfermaria().getListaEnfermaria().get(indiceEnfermaria).getListaEnfermeiro().getListaEnfermeiro().size(); indiceEnfermeiro++) {

                       Enfermeiro profEnfermeiro = sistema.getListaHospital().getListaHospital().get(indiceHospital).getListaEnfermaria().getListaEnfermaria().get(indiceEnfermaria).getListaEnfermeiro().getListaEnfermeiro().get(indiceEnfermeiro);
                       
                       //compara o utilizador que está associado ao enfermeiro com o que está logado no preciso momento
                        if (profEnfermeiro.getUtiLigado().equals(sistema.getUtilizadorLigado())) {
                             modelEnfermeiro.addRow(new Object[] {profEnfermeiro.getIdEnfermeiro(), profEnfermeiro.getNomeEnfermeiro()});
                        }
                    }
                }
            }                         
        tableEnfermeiro.setModel(modelEnfermeiro);            
    }
    
     public void carregarTabelaMedico()
    {
        modelMedico.setRowCount(0);

        /*ArrayList<Hospital> hospital = sistema.getListaHospital().getListaHospital();
        ArrayList<Enfermaria> enfermaria = sistema.getListaHospital().getListaHospital().get(indiceHospital).getListaEnfermaria().getListaEnfermaria(); 
        ArrayList<Medico> medico = sistema.getListaHospital().getListaHospital().get(indiceHospital).getListaEnfermaria().getListaEnfermaria().get(indiceEnfermaria).getListaMedico().getListaMedico();*/

        for (indiceHospital = 0; indiceHospital < sistema.getListaHospital().getListaHospital().size(); indiceHospital++) {

            for(indiceEnfermaria = 0; indiceEnfermaria < sistema.getListaHospital().getListaHospital().get(indiceHospital).getListaEnfermaria().getListaEnfermaria().size(); indiceEnfermaria++) {

                for (int indiceMedico = 0 ; indiceMedico < sistema.getListaHospital().getListaHospital().get(indiceHospital).getListaEnfermaria().getListaEnfermaria().get(indiceEnfermaria).getListaMedico().getListaMedico().size() ; indiceMedico++) {

                    Medico profMedico = sistema.getListaHospital().getListaHospital().get(indiceHospital).getListaEnfermaria().getListaEnfermaria().get(indiceEnfermaria).getListaMedico().getListaMedico().get(indiceMedico);
                    
                    //compara o utilizador que está associado ao medico com o que está logado no preciso momento
                    if (profMedico.getUtiLigado().equals(sistema.getUtilizadorLigado())) {
                         modelMedico.addRow(new Object[]{profMedico.getIdMedico(),profMedico.getNomeMedico(), profMedico.getEspecialidade()});
                    }  
                }
            }
        }
        tableMedico.setModel(modelMedico);          
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableEnfermeiro = new javax.swing.JTable();
        txtFiltrarEnf = new javax.swing.JTextField();
        imgHome = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableMedico = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtFiltrarMed = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(805, 480));
        setUndecorated(true);
        getContentPane().setLayout(null);

        tableEnfermeiro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
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
        tableEnfermeiro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableEnfermeiroMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableEnfermeiro);
        if (tableEnfermeiro.getColumnModel().getColumnCount() > 0) {
            tableEnfermeiro.getColumnModel().getColumn(0).setResizable(false);
            tableEnfermeiro.getColumnModel().getColumn(1).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 110, 350, 220);

        txtFiltrarEnf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFiltrarEnfKeyReleased(evt);
            }
        });
        getContentPane().add(txtFiltrarEnf);
        txtFiltrarEnf.setBounds(110, 340, 140, 30);

        imgHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sydney-opera-house.png"))); // NOI18N
        imgHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgHomeMouseClicked(evt);
            }
        });
        getContentPane().add(imgHome);
        imgHome.setBounds(750, 10, 30, 30);

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel3.setText("Lista Genérica de Profissionais de Saude");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(270, 10, 340, 30);

        tableMedico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código", "Nome", "Especialidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableMedico);
        if (tableMedico.getColumnModel().getColumnCount() > 0) {
            tableMedico.getColumnModel().getColumn(0).setResizable(false);
            tableMedico.getColumnModel().getColumn(1).setResizable(false);
            tableMedico.getColumnModel().getColumn(2).setResizable(false);
        }

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(440, 110, 340, 220);

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel4.setText("Médicos");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(440, 70, 80, 30);

        txtFiltrarMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFiltrarMedActionPerformed(evt);
            }
        });
        txtFiltrarMed.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFiltrarMedKeyReleased(evt);
            }
        });
        getContentPane().add(txtFiltrarMed);
        txtFiltrarMed.setBounds(540, 340, 140, 30);

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel2.setText("Pesquisar:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 350, 70, 14);

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel5.setText("Pesquisar: ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(440, 350, 70, 20);

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel6.setText("Enfermeiros");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 70, 110, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/backgroundPRI.png"))); // NOI18N
        jLabel1.setMinimumSize(new java.awt.Dimension(729, 462));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -150, 830, 1030);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableEnfermeiroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableEnfermeiroMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tableEnfermeiroMouseClicked

    private void imgHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgHomeMouseClicked
        // TODO add your handling code here:
        dispose();
        PaginaInicialUtilizador paginaInicialUtilizador = new PaginaInicialUtilizador(sistema,bd);
        paginaInicialUtilizador.setLocationRelativeTo(null);
        paginaInicialUtilizador.setVisible(true);
    }//GEN-LAST:event_imgHomeMouseClicked

    private void txtFiltrarEnfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltrarEnfKeyReleased
        // TODO add your handling code here:
         DefaultTableModel table = (DefaultTableModel)tableEnfermeiro.getModel();
         String search = txtFiltrarEnf.getText().toLowerCase();
         TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
         tableEnfermeiro.setRowSorter(tr);
         tr.setRowFilter(RowFilter.regexFilter(search));
        
    }//GEN-LAST:event_txtFiltrarEnfKeyReleased

    private void txtFiltrarMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFiltrarMedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFiltrarMedActionPerformed

    private void txtFiltrarMedKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltrarMedKeyReleased
        // TODO add your handling code here:       
         DefaultTableModel table = (DefaultTableModel)tableMedico.getModel();
         String search = txtFiltrarMed.getText().toLowerCase();
         TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
         tableMedico.setRowSorter(tr);
         tr.setRowFilter(RowFilter.regexFilter(search));
         
    }//GEN-LAST:event_txtFiltrarMedKeyReleased

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
            java.util.logging.Logger.getLogger(PaginaProfSaudeGenerica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaProfSaudeGenerica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaProfSaudeGenerica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaProfSaudeGenerica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new PaginaEnfermeiroGenerica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imgHome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableEnfermeiro;
    private javax.swing.JTable tableMedico;
    private javax.swing.JTextField txtFiltrarEnf;
    private javax.swing.JTextField txtFiltrarMed;
    // End of variables declaration//GEN-END:variables
}
