/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

/**
 *
 * @author ssoar
 */
public class login extends javax.swing.JPanel {

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
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
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setName(""); // NOI18N
        setLayout(null);

        jLabel1.setText("Nome de utilizador:");
        add(jLabel1);
        jLabel1.setBounds(20, 80, 100, 20);
        jLabel1.getAccessibleContext().setAccessibleName("label_name");

        jLabel2.setText("Password:");
        add(jLabel2);
        jLabel2.setBounds(20, 110, 60, 13);
        add(jTextField1);
        jTextField1.setBounds(160, 80, 140, 19);
        jTextField1.getAccessibleContext().setAccessibleName("txt1");

        add(jTextField2);
        jTextField2.setBounds(160, 110, 140, 19);
        jTextField2.getAccessibleContext().setAccessibleName("txt2");

        jButton1.setText("Entrar");
        add(jButton1);
        jButton1.setBounds(160, 150, 73, 21);
        jButton1.getAccessibleContext().setAccessibleName("bt_entrar");

        add(jPanel1);
        jPanel1.setBounds(270, 180, 80, 70);

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
