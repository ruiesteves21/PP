/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;
import backend.Sistema;
import javax.swing.JOptionPane;
import backend.ListaUtilizador;
import backend.Utilizador;

/**
 *
 */
public class PaginaPerfil extends javax.swing.JFrame {

    //Referencia ao Sistema, a lista de utilizadores esta no sistema
    private Sistema sistema;    
    //Referencia a Pagina Administrador. Se for indicado, depois de alterarmos um registo podemos solicitar que a tabela seja redesenhada
    private PaginaAdministrador listagem;
    //Referencia o Utilizador que queremos visualizar/editar
    private Utilizador utilizador;   
    
    /**
     * 
     * @param sistema
     * @param utilizador
     * @param listagem 
     */
    public PaginaPerfil(Sistema sistema, Utilizador utilizador, PaginaAdministrador listagem) {
        
        initComponents();          
                              
        //Mostra a centralização da janela
        this.setLocationRelativeTo(null);
        
        //Guarda a referencia ao sistema
        this.sistema = sistema;   
        
        //Guarda a referencia ao utilizador
        this.utilizador = utilizador;
        
        //Guarda a referencia a listagem
        this.listagem = listagem;
        
        //No caso de um registo novo
        if (registoNovo()) {    
            //Altera o titulo da janela
            //Como construimos sempre uma nova janela, as caixas de texto já estão limpas
            setTitle("Criação de novo utilizador");
            txtNome.requestFocus();                      
        }else{
            //No caso de um registo existente
            //Altera o titulo da janela
            setTitle("Alteração de dados de utilizador");
            //Preenche as caixas de texto com os dados do utilizador
            txtNome.setText(utilizador.getNome());
            txtUsername.setText(utilizador.getUsername());            
            txtSenha.requestFocus();
        }               
    }
    
    private boolean registoNovo() {
        //Se utililizador == null consideramos que é um novo registo
        return utilizador == null;
    }    
    
    private void guardar() {
         if (registoNovo() && txtUsername.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Introduza o username pretendido!");            
            txtUsername.requestFocus();
            return;
        }
        
        if (txtNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Introduza o seu nome!");            
            txtNome.requestFocus();
            return;
        }
        
        if (txtSenha.getPassword().length == 0) {
            JOptionPane.showMessageDialog(this, "Introduza a nova password!");
            txtSenha.requestFocus();
            return;
        }       
        
        if (txtConfirmacao.getPassword().length == 0) {
            JOptionPane.showMessageDialog(this, "Introduza a password de confirmação!");
            txtConfirmacao.requestFocus();
            return;
        }  
        
        String password = new String(txtSenha.getPassword());
        
        if (!password.equals(new String(txtConfirmacao.getPassword()))){
            JOptionPane.showMessageDialog(this, "A password de confirmação não corresponde à password introduzida!");
            txtConfirmacao.requestFocus();
            return;
        }        
        
        if (registoNovo()) {      
            txtUsername.setEditable(true);                                 
            Utilizador novoMedico = new Utilizador();
            novoMedico.setNome(txtNome.getText());
            novoMedico.setUsername(txtUsername.getText());
            novoMedico.setPassword(password);
          
            try {
                sistema.getListaUtilizador().adicionar(novoMedico);
                
            } catch (ListaUtilizador.UtilizadorDuplicadoException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
                return;
            }                      
                  
        }else{
            txtUsername.setEditable(false);
            utilizador.setNome(txtNome.getText());        
            utilizador.setPassword(password);       
        }                       
        
        //Se tiver feito uma referencia a listagem, atualiza a listagem
        if (listagem != null) listagem.atualizar();                 
        
        JOptionPane.showMessageDialog(this, "Registo guardado com sucesso.");
        fechar();
        
    }
    
    private void fechar() {
        dispose();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        btEditar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btFechar = new javax.swing.JButton();
        txtSenha = new javax.swing.JPasswordField();
        txtConfirmacao = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(363, 343));
        setUndecorated(true);
        setSize(new java.awt.Dimension(363, 343));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel1.setText("Nome :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 140, 50, 20);

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel2.setText("Username :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(130, 180, 70, 20);

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel3.setText("Senha:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(130, 220, 100, 20);
        getContentPane().add(txtUsername);
        txtUsername.setBounds(230, 180, 120, 20);
        getContentPane().add(txtNome);
        txtNome.setBounds(230, 140, 120, 20);

        btEditar.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btEditar);
        btEditar.setBounds(160, 300, 80, 29);

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel8.setText("Confirma Senha:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(120, 260, 110, 20);

        btFechar.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        btFechar.setText("Fechar");
        btFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFecharActionPerformed(evt);
            }
        });
        getContentPane().add(btFechar);
        btFechar.setBounds(260, 300, 80, 30);
        getContentPane().add(txtSenha);
        txtSenha.setBounds(230, 220, 120, 20);
        getContentPane().add(txtConfirmacao);
        txtConfirmacao.setBounds(230, 260, 120, 20);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo_perfil.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 610, 410);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

            
    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        // TODO add your handling code here:
        guardar();
            
    }//GEN-LAST:event_btEditarActionPerformed

    private void btFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFecharActionPerformed
        // TODO add your handling code here:
         fechar();
    }//GEN-LAST:event_btFecharActionPerformed
       
     
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
            java.util.logging.Logger.getLogger(PaginaPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Perfil_novo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btFechar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPasswordField txtConfirmacao;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}

