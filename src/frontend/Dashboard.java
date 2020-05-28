/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import backend.Serializacao;
import backend.Sistema;

/**
 *
 * @author rodrm
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    private Sistema sistema;
    private Serializacao bd;
    
    public Dashboard(Sistema sistema, Serializacao bd) {
        initComponents();
        this.sistema = sistema;
        this.bd = bd;
        
        txtModerado.setText(String.valueOf(this.sistema.getListaDoente().numDoenteModerado()));
        txtGrave.setText(String.valueOf(this.sistema.getListaDoente().numDoenteGrave()));
        txtMuitoGrave.setText(String.valueOf(this.sistema.getListaDoente().numDoenteMuitoGrave()));
        txtModeradoPerc.setText(String.valueOf(this.sistema.getListaDoente().perDoenteModerado()));
        txtGravePerc.setText(String.valueOf(this.sistema.getListaDoente().perDoenteGrave()));
        txtMuitoGravePerc.setText(String.valueOf(this.sistema.getListaDoente().perDoenteMuitoGrave()));
        
        txtDesfibrilhador.setText(String.valueOf(this.sistema.getListaEquipamento().numDesfibrilhadorOcupados()));
        txtVentilador.setText(String.valueOf(this.sistema.getListaEquipamento().numVentiladorOcupados()));
        txtOutro.setText(String.valueOf(this.sistema.getListaEquipamento().numOutroOcupados()));
        txtDesfibrilhadorPerc.setText(String.valueOf(this.sistema.getListaEquipamento().perDesfibrilhadorOcupados()));
        txtVentiladorPerc.setText(String.valueOf(this.sistema.getListaEquipamento().perVentiladorOcupados()));
        txtOutroPerc.setText(String.valueOf(this.sistema.getListaEquipamento().perOutroOcupados()));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel13 = new javax.swing.JLabel();
        txtEnfermariaProb = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtOutro = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtVentilador = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtOutroPerc = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtVentiladorPerc = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtDesfibrilhadorPerc = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDesfibrilhador = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtMuitoGrave = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMuitoGravePerc = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtGravePerc = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtModeradoPerc = new javax.swing.JTextField();
        txtGrave = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtModerado = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel13.setText("Enfermaria mais Problemática:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(20, 350, 200, 20);

        txtEnfermariaProb.setEditable(false);
        getContentPane().add(txtEnfermariaProb);
        txtEnfermariaProb.setBounds(250, 340, 185, 30);

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel9.setText("Outros equipamentos Ocupados:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(20, 300, 220, 20);

        txtOutro.setEditable(false);
        getContentPane().add(txtOutro);
        txtOutro.setBounds(250, 290, 185, 30);

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel8.setText("Ventiladores Ocupados:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 250, 160, 20);

        txtVentilador.setEditable(false);
        getContentPane().add(txtVentilador);
        txtVentilador.setBounds(250, 240, 185, 30);

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel12.setText("% Outros equipamentos Ocupados:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(450, 350, 230, 20);

        txtOutroPerc.setEditable(false);
        getContentPane().add(txtOutroPerc);
        txtOutroPerc.setBounds(700, 340, 180, 30);

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel11.setText("% Ventiladores Ocupados:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(450, 300, 170, 20);

        txtVentiladorPerc.setEditable(false);
        getContentPane().add(txtVentiladorPerc);
        txtVentiladorPerc.setBounds(700, 290, 180, 30);

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel10.setText("% Desfibrilhadores Ocupados:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(450, 250, 190, 20);

        txtDesfibrilhadorPerc.setEditable(false);
        getContentPane().add(txtDesfibrilhadorPerc);
        txtDesfibrilhadorPerc.setBounds(700, 240, 180, 30);

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel7.setText("Desfibrilhadores Ocupados:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 200, 180, 20);

        txtDesfibrilhador.setEditable(false);
        getContentPane().add(txtDesfibrilhador);
        txtDesfibrilhador.setBounds(250, 190, 185, 30);

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel2.setText("Doentes em estado Muito Grave:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 150, 220, 20);

        txtMuitoGrave.setEditable(false);
        getContentPane().add(txtMuitoGrave);
        txtMuitoGrave.setBounds(250, 140, 185, 30);

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel3.setText("Doentes em estado Grave:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 100, 170, 20);

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel5.setText("% Doentes em estado Muito Grave:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(450, 200, 230, 20);

        txtMuitoGravePerc.setEditable(false);
        getContentPane().add(txtMuitoGravePerc);
        txtMuitoGravePerc.setBounds(700, 190, 180, 30);

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel6.setText("% Doentes em estado Grave:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(450, 150, 190, 20);

        txtGravePerc.setEditable(false);
        getContentPane().add(txtGravePerc);
        txtGravePerc.setBounds(700, 140, 180, 30);

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel4.setText("% Doentes em estado Moderado: ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(450, 100, 220, 20);

        txtModeradoPerc.setEditable(false);
        txtModeradoPerc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModeradoPercActionPerformed(evt);
            }
        });
        getContentPane().add(txtModeradoPerc);
        txtModeradoPerc.setBounds(700, 90, 180, 30);

        txtGrave.setEditable(false);
        getContentPane().add(txtGrave);
        txtGrave.setBounds(250, 90, 185, 30);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel1.setText("Doentes em estado Moderado:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 50, 200, 20);

        txtModerado.setEditable(false);
        getContentPane().add(txtModerado);
        txtModerado.setBounds(250, 40, 185, 30);

        jLabel14.setFont(new java.awt.Font("Leelawadee", 1, 36)); // NOI18N
        jLabel14.setText("Dashboard");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(570, 10, 200, 44);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/dash66.jpg"))); // NOI18N
        getContentPane().add(jLabel15);
        jLabel15.setBounds(-330, -80, 1280, 840);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtModeradoPercActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModeradoPercActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModeradoPercActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtDesfibrilhador;
    private javax.swing.JTextField txtDesfibrilhadorPerc;
    private javax.swing.JTextField txtEnfermariaProb;
    private javax.swing.JTextField txtGrave;
    private javax.swing.JTextField txtGravePerc;
    private javax.swing.JTextField txtModerado;
    private javax.swing.JTextField txtModeradoPerc;
    private javax.swing.JTextField txtMuitoGrave;
    private javax.swing.JTextField txtMuitoGravePerc;
    private javax.swing.JTextField txtOutro;
    private javax.swing.JTextField txtOutroPerc;
    private javax.swing.JTextField txtVentilador;
    private javax.swing.JTextField txtVentiladorPerc;
    // End of variables declaration//GEN-END:variables
}
