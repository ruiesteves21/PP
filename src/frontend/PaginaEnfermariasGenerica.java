/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;
import backend.Enfermaria;
import backend.ListaEnfermaria;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import backend.Sistema;
import backend.Serializacao;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author ssoar,ruiesteves
 */
public class PaginaEnfermariasGenerica extends javax.swing.JFrame {
     DefaultTableModel model; 
    private Sistema sistema;
    private Serializacao bd;
    
    /**
     * Creates new form ListaEnfermariasGenerica
     */
    public PaginaEnfermariasGenerica(Sistema sistema,Serializacao bd) {
        initComponents();
        model = (DefaultTableModel) tableEnf.getModel();
        this.sistema=sistema;
        this.bd = bd;
        carregarTabelaGenerica();
        
    }
    
     public void carregarTabelaGenerica()
    {
        model.setRowCount(0);
         
         for(int i=0; i< sistema.getListaEnfermaria().getListaEnfermaria().size(); i++) {
             
            Enfermaria enf = sistema.getListaEnfermaria().getListaEnfermaria().get(i);
            
             if (enf.getUtiLigado().equals(sistema.getUtilizadorLigado())) {
            model.addRow(new Object[] {enf.getNome(), enf.getTipo(), enf.getNCamas(), enf.getIdEnfermaria() });
             }
         }
         
          tableEnf.setModel(model);
          
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableEnf = new javax.swing.JTable();
        imgHome = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ComboTipo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(496, 364));
        setUndecorated(true);
        setSize(new java.awt.Dimension(496, 364));
        getContentPane().setLayout(null);

        tableEnf.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Tipo", "Nº Camas", "Codigo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableEnf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableEnfMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableEnf);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 40, 440, 260);

        imgHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sydney-opera-house.png"))); // NOI18N
        imgHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgHomeMouseClicked(evt);
            }
        });
        getContentPane().add(imgHome);
        imgHome.setBounds(10, 0, 30, 30);

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel3.setText("Lista de Enfermarias");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(150, 0, 180, 30);

        ComboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo", "UCI", "Normal" }));
        ComboTipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboTipoItemStateChanged(evt);
            }
        });
        getContentPane().add(ComboTipo);
        ComboTipo.setBounds(313, 320, 120, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/G5.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -950, 750, 1370);

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

                                
    
    private void tableEnfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableEnfMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tableEnfMouseClicked

     private void filtrar (String tipo){
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        tableEnf.setRowSorter(tr);
        if (!"Tipo".equals(tipo)){
            tr.setRowFilter(RowFilter.regexFilter(tipo));
        }else{
            tableEnf.setRowSorter(tr);
        }
        
    }
    
    private void ComboTipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboTipoItemStateChanged
        // TODO add your handling code here:
        String tipo = ComboTipo.getSelectedItem().toString();
        
        filtrar(tipo);
        
    }//GEN-LAST:event_ComboTipoItemStateChanged

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
            java.util.logging.Logger.getLogger(PaginaEnfermariasGenerica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaEnfermariasGenerica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaEnfermariasGenerica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaEnfermariasGenerica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ListaEnfermariasGenerica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboTipo;
    private javax.swing.JLabel imgHome;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableEnf;
    // End of variables declaration//GEN-END:variables
}
