/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import backend.Sistema;
import backend.Serializacao;
import javax.swing.table.TableModel;

/**
 *
 * @author ssoar
 */
public class ListaHospitais extends javax.swing.JFrame {

    /**
     * Creates new form Lista_Hospitais
     */
    DefaultTableModel model; 
    private Sistema sistema;
    private Serializacao bd;
    
    
    public ListaHospitais(Sistema sistema, Serializacao bd) {
        initComponents();
        
        model = (DefaultTableModel) table.getModel();
        this.sistema = sistema;
        this.bd = bd;
        
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

        btLimpar = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        btInserir = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        imgRetroceder = new javax.swing.JLabel();
        imgHome = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtLocalidade = new javax.swing.JTextField();
        btFiltrar1 = new javax.swing.JButton();
        imgGuardar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(590, 390));
        setMinimumSize(new java.awt.Dimension(570, 370));
        setUndecorated(true);
        setSize(new java.awt.Dimension(570, 370));
        getContentPane().setLayout(null);

        btLimpar.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btLimpar.setText("Limpar");
        btLimpar.setEnabled(false);
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btLimpar);
        btLimpar.setBounds(20, 230, 80, 29);

        btEditar.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btEditar);
        btEditar.setBounds(20, 270, 80, 29);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo do Hospital", "Nome do Hospital", "Localidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(250, 50, 300, 300);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel1.setText("Lista de Hospitais");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(190, 10, 150, 25);

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel3.setText("Codigo :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 60, 60, 20);

        txtCodigo.setEnabled(false);
        getContentPane().add(txtCodigo);
        txtCodigo.setBounds(110, 60, 100, 30);

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel4.setText("Nome :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 100, 60, 20);

        txtNome.setEnabled(false);
        getContentPane().add(txtNome);
        txtNome.setBounds(110, 100, 100, 30);

        btInserir.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btInserir.setText("Inserir");
        btInserir.setEnabled(false);
        btInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirActionPerformed(evt);
            }
        });
        getContentPane().add(btInserir);
        btInserir.setBounds(20, 190, 80, 29);

        btExcluir.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.setEnabled(false);
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btExcluir);
        btExcluir.setBounds(110, 190, 80, 29);

        imgRetroceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/undo-button2.png"))); // NOI18N
        getContentPane().add(imgRetroceder);
        imgRetroceder.setBounds(480, 10, 24, 30);

        imgHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sydney-opera-house.png"))); // NOI18N
        imgHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgHomeMouseClicked(evt);
            }
        });
        getContentPane().add(imgHome);
        imgHome.setBounds(520, 10, 30, 30);

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel6.setText("Localidade :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 140, 80, 20);

        txtLocalidade.setEnabled(false);
        getContentPane().add(txtLocalidade);
        txtLocalidade.setBounds(110, 140, 100, 30);

        btFiltrar1.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btFiltrar1.setText("Filtrar");
        getContentPane().add(btFiltrar1);
        btFiltrar1.setBounds(110, 270, 80, 29);

        imgGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/save.png"))); // NOI18N
        imgGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgGuardarMouseClicked(evt);
            }
        });
        getContentPane().add(imgGuardar);
        imgGuardar.setBounds(440, 10, 30, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pag_ini_3.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -30, 640, 440);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirActionPerformed
        // TODO add your handling code here:
        model.insertRow(model.getRowCount(),new Object[] {txtCodigo.getText(),txtNome.getText(),txtLocalidade.getText()});
    }//GEN-LAST:event_btInserirActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        // TODO add your handling code here:
        txtCodigo.setText(null);
        txtNome.setText(null);
        txtLocalidade.setText(null);
    }//GEN-LAST:event_btLimparActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        // TODO add your handling code here:
         DefaultTableModel model = (DefaultTableModel)table.getModel();
        int c = table.getSelectedRow();
        if(c >= 0){
            model.removeRow(c); //remove a linha selecionada
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Selecione um hospital");
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        // TODO add your handling code here:
        btInserir.setEnabled(true);
        btExcluir.setEnabled(true);
        btLimpar.setEnabled(true);
        txtCodigo.setEnabled(true);
        txtNome.setEnabled(true);
        txtLocalidade.setEnabled(true);
        
    }//GEN-LAST:event_btEditarActionPerformed

    private void imgHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgHomeMouseClicked
        // TODO add your handling code here:
        PaginaInicialUtilizador paginaInicialUtilizador = new PaginaInicialUtilizador(sistema,bd);
        paginaInicialUtilizador.setLocationRelativeTo(null);
        paginaInicialUtilizador.setVisible(true);
    }//GEN-LAST:event_imgHomeMouseClicked

    private void imgGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgGuardarMouseClicked
        // TODO add your handling code here:
        guardarAlteracoes();
        JOptionPane.showMessageDialog(this, "Alterações guardadas.");
    }//GEN-LAST:event_imgGuardarMouseClicked

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        FichaHospital p = new FichaHospital(sistema,bd);
        int index = table.getSelectedRow();
        
        TableModel model = table.getModel();
        
        String Nome = model.getValueAt(index, 1).toString();
        String Localidade = model.getValueAt(index, 2).toString();
        FichaHospital jtRowData = new FichaHospital(sistema, bd);
        p.txtNome.setText(Nome);
        p.txtLocalidade.setText(Localidade);
        
        p.setLocationRelativeTo(null);
        p.setVisible(true);
        dispose();
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
            java.util.logging.Logger.getLogger(ListaHospitais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaHospitais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaHospitais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaHospitais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // new ListaHospitais(sistema,bd).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btFiltrar1;
    private javax.swing.JButton btInserir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JLabel imgGuardar;
    private javax.swing.JLabel imgHome;
    private javax.swing.JLabel imgRetroceder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable table;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtLocalidade;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
