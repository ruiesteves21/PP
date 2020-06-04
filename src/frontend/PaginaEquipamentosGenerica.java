/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;
import backend.Equipamento;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import backend.Sistema;
import backend.Serializacao;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author ssoar
 */
public class PaginaEquipamentosGenerica extends javax.swing.JFrame {
     DefaultTableModel model; 
    private Sistema sistema;
    private Serializacao bd;

    /**
     * Creates new form ListaEquipamentosGenerica
     */
    public PaginaEquipamentosGenerica(Sistema sistema, Serializacao bd) {
        initComponents();
        
        model = (DefaultTableModel) tableEquipamento.getModel();
        this.sistema=sistema;
        this.bd = bd;
        
        carregarTabelaEquipGenerica();
        
         //ordena tabela de forma ascedente e descendente
        tableEquipamento.setRowSorter(new TableRowSorter(model));
    }
    
     public void carregarTabelaEquipGenerica()
    {
        model.setRowCount(0);
         
         for(int i=0; i< sistema.getListaEquipamento().getListaEquipamento().size(); i++) {
             
            Equipamento equipamento = sistema.getListaEquipamento().getListaEquipamento().get(i);
            
            if (equipamento.getUtiLigado().equals(sistema.getUtilizadorLigado())) {
             model.addRow(new Object[]{equipamento.getIdEquip(), equipamento.getTipoEquipamento(), equipamento.getIndicacao(), equipamento.getDoente()});
            }
         }
         
          tableEquipamento.setModel(model);
          
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
        tableEquipamento = new javax.swing.JTable();
        imgHome = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ComboTipo = new javax.swing.JComboBox<>();
        ComboIndicacao = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(807, 358));
        setUndecorated(true);
        setSize(new java.awt.Dimension(807, 358));
        getContentPane().setLayout(null);

        tableEquipamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Tipo", "Indicação", "Doente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableEquipamento);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(70, 40, 690, 250);

        imgHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sydney-opera-house.png"))); // NOI18N
        imgHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgHomeMouseClicked(evt);
            }
        });
        getContentPane().add(imgHome);
        imgHome.setBounds(10, 10, 30, 30);

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Lista de Equipamentos");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(290, 10, 190, 20);

        ComboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Selecione Tipo --", "Desfibrilhador", "Ventilador", "Outro" }));
        ComboTipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboTipoItemStateChanged(evt);
            }
        });
        ComboTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboTipoActionPerformed(evt);
            }
        });
        getContentPane().add(ComboTipo);
        ComboTipo.setBounds(410, 310, 140, 30);

        ComboIndicacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Selecione Indicacao --", "Livre", "Ocupado" }));
        ComboIndicacao.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboIndicacaoItemStateChanged(evt);
            }
        });
        getContentPane().add(ComboIndicacao);
        ComboIndicacao.setBounds(600, 310, 160, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/G4.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-170, -130, 1550, 830);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void imgHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgHomeMouseClicked
        // TODO add your handling code here:
        dispose();
        PaginaInicialUtilizador paginaInicialUtilizador = new PaginaInicialUtilizador(sistema,bd);
        paginaInicialUtilizador.setLocationRelativeTo(null);
        paginaInicialUtilizador.setVisible(true);
    }//GEN-LAST:event_imgHomeMouseClicked

      private void filtrarTipo (String tipo){
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        tableEquipamento.setRowSorter(tr);
        if (!"-- Selecione Tipo --".equals(tipo)){
            tr.setRowFilter(RowFilter.regexFilter(tipo));
        }else{
            tableEquipamento.setRowSorter(tr);
        }
        
    }
    
    private void filtrarIndicacao (String indicacao){
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        tableEquipamento.setRowSorter(tr);
        if (!"-- Selecione Indicacao --".equals(indicacao)){
            tr.setRowFilter(RowFilter.regexFilter(indicacao));
        }else{
            tableEquipamento.setRowSorter(tr);
        }
        
    }
    
    
    
    private void ComboTipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboTipoItemStateChanged
        // TODO add your handling code here:
        String tipo = ComboTipo.getSelectedItem().toString();
        
        filtrarTipo(tipo);
    }//GEN-LAST:event_ComboTipoItemStateChanged

    private void ComboIndicacaoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboIndicacaoItemStateChanged
        // TODO add your handling code here:
        String indicacao = ComboIndicacao.getSelectedItem().toString();
        
        filtrarIndicacao(indicacao);
    }//GEN-LAST:event_ComboIndicacaoItemStateChanged

    private void ComboTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboTipoActionPerformed

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
            java.util.logging.Logger.getLogger(PaginaEquipamentosGenerica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaEquipamentosGenerica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaEquipamentosGenerica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaEquipamentosGenerica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ListaEquipamentosGenerica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboIndicacao;
    private javax.swing.JComboBox<String> ComboTipo;
    private javax.swing.JLabel imgHome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableEquipamento;
    // End of variables declaration//GEN-END:variables
}
