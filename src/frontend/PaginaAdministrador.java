/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import backend.ListaUtilizador;
import backend.Sistema;
import backend.Utilizador;
import backend.Serializacao;

/**
 *
 * @author ssoar
 */


public class PaginaAdministrador extends javax.swing.JFrame {
    
    private Sistema sistema;
    private Serializacao bd;
    private AbstractTableModel modeloTabelaAdmin;
    
    /**
     * 
     * @param sistema
     * @param bd 
     */
    public PaginaAdministrador (Sistema sistema, Serializacao bd) {
        initComponents();
        
        //Mostra a centralização da janela
        this.setLocationRelativeTo(null);
        
        //O processo de fecho da janela será controlado pelo programa
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        
        this.sistema = sistema;
        this.bd = bd;
        this.modeloTabelaAdmin = criarModeloTabela();
        tabelUtilizadores.setModel(modeloTabelaAdmin);
    }
    
    private AbstractTableModel criarModeloTabela() {   
        String[] nomeColunas = {"Username", "Nome"};
        
        return new AbstractTableModel() {     
            @Override
            public String getColumnName(int column) {
                return nomeColunas[column];
            }
           
            @Override
            public int getRowCount() {
                //Retorna o número de linhas que a tabela deverá ter
                return sistema.getListaUtilizador().size();
            }

            @Override
            public int getColumnCount() {
                //Retorna o número de colunas que a tabela deverá ter
                return nomeColunas.length;
            }

            @Override
            public Object getValueAt(int rowIndex, int columnIndex) {
            /*
                Este método é invocado quando se pretende "popular" cada uma das células da tabela
                Se a tabela tem 3 linhas e 2 colunas existem 6 células (3*2), logo o método será invocado 6 vezes
                    rowIndex representa a linha da célula (0 a rowCount -1)
                    columnIndex representa a coluna da célula (0 a ColumnCount -1)
            */
                switch (columnIndex) {
                    case 0: 
                        return sistema.getListaUtilizador().todos().get(rowIndex).getUsername();
                    case 1:
                        return sistema.getListaUtilizador().todos().get(rowIndex).getNome();
                    default:
                        return "";
                }                              
            }            
        };
    }
    
    private void adicionar() {
        PaginaPerfil perfil = new PaginaPerfil(sistema, null, this);   
        perfil.setVisible(true);
    }
    
    private void editar() {
        int rowIndex = tabelUtilizadores.getSelectedRow();
        //Se nenhum registo selecionado, nao é possivel editar
        if (rowIndex == -1) {
            
              JOptionPane.showMessageDialog(null,"Selecione um utilizador","Atenção",JOptionPane.WARNING_MESSAGE); 
        }  else {             
        
        
        String username = (String) modeloTabelaAdmin.getValueAt(rowIndex, 0);
        
            try {
                Utilizador medico = sistema.getListaUtilizador().getUtilizador(username);
                 PaginaPerfil perfil = new PaginaPerfil(sistema, medico, this);   
                perfil.setVisible(true);
            } catch (ListaUtilizador.UtilizadorNaoExistenteException ex) {            
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }
    }
    
    private void remover() {
        int rowIndex = tabelUtilizadores.getSelectedRow();
        //Se nenhum registo selecionado, nao é possivel remover
        if (rowIndex == -1) {
            
              JOptionPane.showMessageDialog(null,"Selecione um utilizador","Atenção",JOptionPane.WARNING_MESSAGE); 
        }  else {  
            
            String username = (String) modeloTabelaAdmin.getValueAt(rowIndex, 0);
            
            try {
                sistema.getListaUtilizador().remover(username);
                atualizar();
                guardarAlteracoes();
                 JOptionPane.showMessageDialog(null,"Removido","Informação",JOptionPane.INFORMATION_MESSAGE); 
                 
            } catch (Exception e) {
                 JOptionPane.showMessageDialog(this, e.getMessage());
            }    
        }
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
    
    public void atualizar() {    
        //Informa o modelo que foram efetuadas alteracoes, o modelo informa a tabela e os dados são redesenhados
        modeloTabelaAdmin.fireTableDataChanged();
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
        tabelUtilizadores = new javax.swing.JTable();
        imgSair = new javax.swing.JLabel();
        btAdicionar = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btRegistoAcesso = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(375, 419));
        setUndecorated(true);
        setSize(new java.awt.Dimension(366, 368));
        getContentPane().setLayout(null);

        tabelUtilizadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelUtilizadores);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 50, 290, 210);

        imgSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logout.png"))); // NOI18N
        imgSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgSairMouseClicked(evt);
            }
        });
        getContentPane().add(imgSair);
        imgSair.setBounds(310, 10, 24, 30);

        btAdicionar.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btAdicionar.setText("Adicionar");
        btAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarActionPerformed(evt);
            }
        });
        getContentPane().add(btAdicionar);
        btAdicionar.setBounds(230, 320, 100, 30);

        btEditar.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btEditar);
        btEditar.setBounds(230, 270, 100, 30);

        jButton1.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jButton1.setText("Página Utilizador");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(40, 270, 160, 30);

        btRegistoAcesso.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btRegistoAcesso.setText("Registo de acesso");
        btRegistoAcesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegistoAcessoActionPerformed(evt);
            }
        });
        getContentPane().add(btRegistoAcesso);
        btRegistoAcesso.setBounds(40, 320, 160, 30);

        jButton2.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jButton2.setText("Remover");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(230, 370, 100, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/dash66.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-500, 0, 1120, 430);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarActionPerformed
        // TODO add your handling code here:
         adicionar();
    }//GEN-LAST:event_btAdicionarActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        // TODO add your handling code here:
        editar();
    }//GEN-LAST:event_btEditarActionPerformed

    private void imgSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgSairMouseClicked
        // TODO add your handling code here:
        dispose();
        PaginaLogin l = new PaginaLogin(sistema, bd);
        l.setVisible(true);
    }//GEN-LAST:event_imgSairMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
        PaginaInicialUtilizador paginaInicialUtilizador = new PaginaInicialUtilizador(sistema, bd);
        paginaInicialUtilizador.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btRegistoAcessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegistoAcessoActionPerformed
        // TODO add your handling code here:
        dispose();
        PaginaRegistoAcessos registoAcessos = new PaginaRegistoAcessos(sistema, bd);
        registoAcessos.setVisible(true);
    }//GEN-LAST:event_btRegistoAcessoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        remover();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(PaginaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new PaginaAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btRegistoAcesso;
    private javax.swing.JLabel imgSair;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelUtilizadores;
    // End of variables declaration//GEN-END:variables
}
