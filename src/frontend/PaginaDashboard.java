/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import backend.Doente;
import backend.Enfermaria;
import backend.Equipamento;
import backend.Hospital;
import backend.ListaDoente;
import backend.Medico;
import backend.Serializacao;
import backend.Sistema;
import backend.Utilizador;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rodrm
 */
public class PaginaDashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    private Sistema sistema;
    private Serializacao bd;
    
    /**
     * 
     * @param sistema
     * @param bd 
     */
    public PaginaDashboard(Sistema sistema, Serializacao bd)  {
        initComponents();
        this.sistema = sistema;
        this.bd = bd;
        
        
        atualizar();  
       
    }
    
    private void atualizar() {
        
        try {                       
            txtVentilador.setText(String.valueOf(numVentiladorOcupados()));
            txtDesfibrilhador.setText(String.valueOf(numDesfibrilhadorOcupados()));
            txtOutro.setText(String.valueOf(numOutroOcupados()));  
            txtDesfibrilhadorPerc.setText(String.valueOf(perDesfibrilhadorOcupados()));
            txtVentiladorPerc.setText(String.valueOf(perVentiladorOcupados()));
            txtOutroPerc.setText(String.valueOf(perOutroOcupados()));
            
            doentesModerado();
            doentesGrave();
            doentesMuitoGrave();  
            
            camasOcupadas();
            equipamentoLivre();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Neste momento, não há equipamentos ou doentes registados!!","Aviso",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public int numVentiladorOcupados(){
      //ArrayList<Hospital> hospital = sistema.getListaHospital().getListaHospital();
      // ArrayList<Enfermaria> enfermaria =  sistema.getListaHospital().getListaHospital().get(indiceHospital).getListaEnfermaria().getListaEnfermaria();      
       int totalVentOcupados = 0;
       
        for (Hospital hospital : sistema.getListaHospital().getListaHospital()) {
              
            for(Enfermaria enfermaria: hospital.getListaEnfermaria().getListaEnfermaria()) {
                
                for (Equipamento equipamento: enfermaria.getListaEquipamento().getListaEquipamento()) {
                   
                    if (equipamento.getUtiLigado().equals(sistema.getUtilizadorLigado())) {
                         
                        if (equipamento.getTipoEquipamento().equals("Ventilador") && equipamento.getIndicacao().equals("Ocupado")){
                            totalVentOcupados = totalVentOcupados + 1;
                        }
                     }
                }
            }
        }             
        return totalVentOcupados;
    }
    
    public float perVentiladorOcupados(){
       float totalVentOcupados;
       float totalVentiladores = 0;
       float percentagem;
       
       totalVentOcupados = numVentiladorOcupados();
       
        for (Hospital hospital : sistema.getListaHospital().getListaHospital()) {
              
            for(Enfermaria enfermaria: hospital.getListaEnfermaria().getListaEnfermaria()) {
                
                for (Equipamento equipamento: enfermaria.getListaEquipamento().getListaEquipamento()) {
                    
                    if (equipamento.getUtiLigado().equals(sistema.getUtilizadorLigado())) {
                         
                        if (equipamento.getTipoEquipamento().equals("Ventilador") && (equipamento.getIndicacao().equals("Ocupado") || equipamento.getIndicacao().equals("Livre"))){
                            totalVentiladores = totalVentiladores + 1;
                        }
                     }
                }
            }
        }
    
       percentagem =  (totalVentOcupados / totalVentiladores) * 100;
       
       return percentagem;
        
    }
    
     public int numDesfibrilhadorOcupados(){
        int totalDesfOcupados = 0;
       
        for (Hospital hospital : sistema.getListaHospital().getListaHospital()) {
              
            for(Enfermaria enfermaria: hospital.getListaEnfermaria().getListaEnfermaria()) {
                
                for (Equipamento equipamento: enfermaria.getListaEquipamento().getListaEquipamento()) {
                   
                    if (equipamento.getUtiLigado().equals(sistema.getUtilizadorLigado())) {
                         
                        if (equipamento.getTipoEquipamento().equals("Desfibrilhador") && equipamento.getIndicacao().equals("Ocupado")){
                            totalDesfOcupados ++;
                        }
                     }
                }
            }
        }             
        return totalDesfOcupados;
    }
     
    public float perDesfibrilhadorOcupados(){
        float totalDesfOcupados;
        float totalDesfibrilhador = 0;
        float percentagem;
       
        totalDesfOcupados = numDesfibrilhadorOcupados();
       
        for (Hospital hospital : sistema.getListaHospital().getListaHospital()) {
              
            for(Enfermaria enfermaria: hospital.getListaEnfermaria().getListaEnfermaria()) {
                
                for (Equipamento equipamento: enfermaria.getListaEquipamento().getListaEquipamento()) {
                    
                    if (equipamento.getUtiLigado().equals(sistema.getUtilizadorLigado())) {
                         
                        if (equipamento.getTipoEquipamento().equals("Desfibrilhador") && (equipamento.getIndicacao().equals("Ocupado") || equipamento.getIndicacao().equals("Livre"))){
                               totalDesfibrilhador = totalDesfibrilhador + 1;
                        }
                    }
                }
            }
        }
            
        percentagem = (totalDesfOcupados / totalDesfibrilhador) * 100;
          
        return percentagem; 
        
    }
    
     public int numOutroOcupados(){
       int totalOutOcupados = 0;
       
        for (Hospital hospital : sistema.getListaHospital().getListaHospital()) {
              
            for(Enfermaria enfermaria: hospital.getListaEnfermaria().getListaEnfermaria()) {
                
                for (Equipamento equipamento: enfermaria.getListaEquipamento().getListaEquipamento()) {
                    
                    if (equipamento.getUtiLigado().equals(sistema.getUtilizadorLigado())) {
                        
                        if (equipamento.getTipoEquipamento().equals("Outro") && equipamento.getIndicacao().equals("Ocupado")){
                            totalOutOcupados ++;
                        }
                    }
                }
             }  
        }
       
        return totalOutOcupados;
    }
     
     public float perOutroOcupados(){
        float totalOutOcupados;
        float totalOutros = 0;
        float percentagem;
        
        totalOutOcupados = numOutroOcupados();
        
        for (Hospital hospital : sistema.getListaHospital().getListaHospital()) {
              
            for(Enfermaria enfermaria: hospital.getListaEnfermaria().getListaEnfermaria()) {
                
                for (Equipamento equipamento: enfermaria.getListaEquipamento().getListaEquipamento()) {
                    
                    if (equipamento.getUtiLigado().equals(sistema.getUtilizadorLigado())) {
                         
                        if (equipamento.getTipoEquipamento().equals("Outro") && (equipamento.getIndicacao().equals("Ocupado") || equipamento.getIndicacao().equals("Livre"))){
                            totalOutros = totalOutros + 1;
                        }
                    }
                }
            }
        }
        
        percentagem = (totalOutOcupados / totalOutros) * 100;
          
        return percentagem;      
   }
     
     public void doentesModerado(){
       int totalModerado = 0;
       float totalDoentes = 0;
       float percentagem;  
       
       for (Hospital hospital: sistema.getListaHospital().getListaHospital()) {

            for (Enfermaria enfermaria: hospital.getListaEnfermaria().getListaEnfermaria()) {

                for (Medico medico: enfermaria.getListaMedico().getListaMedico()) {

                    for (Doente doente:  medico.getListaDoente().getListaDoente()) {
                         if (doente.getUtiLigado().equals(sistema.getUtilizadorLigado())) {
                             totalDoentes += 1;
                         }
                         
                        if (doente.getGravidade().equals("Moderado") && (doente.getUtiLigado().equals(sistema.getUtilizadorLigado()))){
                            totalModerado ++;
                        }
                    }
                }
            }
        }    
       
        txtModerado.setText(Integer.toString(totalModerado));
        percentagem = (totalModerado / totalDoentes) * 100;
        txtModeradoPerc.setText(Float.toString(percentagem));
    }
    
    
    public void doentesGrave(){
       int totalGrave = 0;
       float totalDoentes = 0;
       float percentagem; 
       
       for (Hospital hospital: sistema.getListaHospital().getListaHospital()) {

            for (Enfermaria enfermaria: hospital.getListaEnfermaria().getListaEnfermaria()) {

                for (Medico medico: enfermaria.getListaMedico().getListaMedico()) {

                    for (Doente doente:  medico.getListaDoente().getListaDoente()) {
                        if (doente.getUtiLigado().equals(sistema.getUtilizadorLigado())) {
                             totalDoentes += 1;
                         }
                        
                        if (doente.getGravidade().equals("Grave") && (doente.getUtiLigado().equals(sistema.getUtilizadorLigado()))){
                            totalGrave ++;
                        }
                    }
                }
            }
       }       
       txtGrave.setText(Integer.toString(totalGrave));
       percentagem = (totalGrave / totalDoentes) * 100;
       txtGravePerc.setText(Float.toString(percentagem));
    }
    
    public void doentesMuitoGrave(){
       int totalMuitoGrave = 0;
       float totalDoentes = 0;
       float percentagem; 
       
       for (Hospital hospital: sistema.getListaHospital().getListaHospital()) {

            for (Enfermaria enfermaria: hospital.getListaEnfermaria().getListaEnfermaria()) {

                for (Medico medico: enfermaria.getListaMedico().getListaMedico()) {

                    for (Doente doente:  medico.getListaDoente().getListaDoente()) {
                        if (doente.getUtiLigado().equals(sistema.getUtilizadorLigado())) {
                             totalDoentes += 1;
                         }
                        
                        if (doente.getGravidade().equals("Muito Grave") && (doente.getUtiLigado().equals(sistema.getUtilizadorLigado()))){
                            totalMuitoGrave ++;
                        }
                    }
                }
            }
        }
       txtMuitoGrave.setText(Integer.toString(totalMuitoGrave));
       percentagem = (totalMuitoGrave / totalDoentes) * 100;
       txtMuitoGravePerc.setText(Float.toString(percentagem));
    }
    
    private void camasOcupadas() {
        Enfermaria enf = null;
        int totalDoentes = 0;
        int max = -1;
        
        for (Hospital hospital: sistema.getListaHospital().getListaHospital()) {

            for (Enfermaria enfermaria: hospital.getListaEnfermaria().getListaEnfermaria()) {

                for (Medico medico: enfermaria.getListaMedico().getListaMedico()) {

                    for (Doente doente:  medico.getListaDoente().getListaDoente()) {
                        if (doente.getUtiLigado().equals(sistema.getUtilizadorLigado())) {
                             totalDoentes+= 1;
                         }
                    }
                }
                
                if(totalDoentes > max) {
                    enf = enfermaria;
                    max = totalDoentes;
                }       
            }   
        }
        
        txtEnfCamas.setText(enf.getNome());
    }
    
    private void equipamentoLivre() {   
        Enfermaria enf = null;
        int totalEquipamento = 0; 
        int max = -1;
        
        for (Hospital hospital : sistema.getListaHospital().getListaHospital()) {
              
            for(Enfermaria enfermaria: hospital.getListaEnfermaria().getListaEnfermaria()) {
                
                for (Equipamento equipamento: enfermaria.getListaEquipamento().getListaEquipamento()) {
                    
                    if (equipamento.getUtiLigado().equals(sistema.getUtilizadorLigado())) {
                        
                        if (equipamento.getIndicacao().equals("Ocupado")) {
                            totalEquipamento+= 1;
                        }
                    }                                                        
                }
                
                if(totalEquipamento > max) {
                   enf = enfermaria;
                   max = totalEquipamento;
                }    
            }
        }
        txtEnfEquip.setText(enf.getNome());
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
        txtEnfCamas = new javax.swing.JTextField();
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
        imgHome = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtEnfEquip = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(939, 611));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel13.setText("Enfermaria:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(140, 460, 110, 20);

        txtEnfCamas.setEditable(false);
        getContentPane().add(txtEnfCamas);
        txtEnfCamas.setBounds(490, 490, 185, 30);

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel9.setText("Outros equipamentos Ocupados:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(10, 390, 220, 20);

        txtOutro.setEditable(false);
        getContentPane().add(txtOutro);
        txtOutro.setBounds(230, 390, 185, 30);

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel8.setText("Ventiladores Ocupados:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 340, 160, 20);

        txtVentilador.setEditable(false);
        getContentPane().add(txtVentilador);
        txtVentilador.setBounds(230, 330, 185, 30);

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel12.setText("% Outros equipamentos Ocupados:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(450, 390, 230, 20);

        txtOutroPerc.setEditable(false);
        getContentPane().add(txtOutroPerc);
        txtOutroPerc.setBounds(700, 390, 180, 30);

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel11.setText("% Ventiladores Ocupados:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(450, 330, 170, 20);

        txtVentiladorPerc.setEditable(false);
        getContentPane().add(txtVentiladorPerc);
        txtVentiladorPerc.setBounds(700, 330, 180, 30);

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel10.setText("% Desfibrilhadores Ocupados:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(450, 280, 190, 20);

        txtDesfibrilhadorPerc.setEditable(false);
        getContentPane().add(txtDesfibrilhadorPerc);
        txtDesfibrilhadorPerc.setBounds(700, 270, 180, 30);

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel7.setText("Desfibrilhadores Ocupados:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 290, 180, 20);

        txtDesfibrilhador.setEditable(false);
        getContentPane().add(txtDesfibrilhador);
        txtDesfibrilhador.setBounds(230, 280, 185, 30);

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel2.setText("Doentes em estado Muito Grave:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 230, 220, 20);

        txtMuitoGrave.setEditable(false);
        getContentPane().add(txtMuitoGrave);
        txtMuitoGrave.setBounds(230, 230, 185, 30);

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel3.setText("Doentes em estado Grave:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 180, 170, 20);

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel5.setText("% Doentes em estado Muito Grave:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(450, 230, 230, 20);

        txtMuitoGravePerc.setEditable(false);
        getContentPane().add(txtMuitoGravePerc);
        txtMuitoGravePerc.setBounds(700, 220, 180, 30);

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel6.setText("% Doentes em estado Grave:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(450, 180, 190, 20);

        txtGravePerc.setEditable(false);
        getContentPane().add(txtGravePerc);
        txtGravePerc.setBounds(700, 170, 180, 30);

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel4.setText("% Doentes em estado Moderado: ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(450, 130, 220, 20);

        txtModeradoPerc.setEditable(false);
        txtModeradoPerc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModeradoPercActionPerformed(evt);
            }
        });
        getContentPane().add(txtModeradoPerc);
        txtModeradoPerc.setBounds(700, 120, 180, 30);

        txtGrave.setEditable(false);
        getContentPane().add(txtGrave);
        txtGrave.setBounds(230, 180, 185, 30);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel1.setText("Doentes em estado Moderado:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 130, 200, 20);

        txtModerado.setEditable(false);
        getContentPane().add(txtModerado);
        txtModerado.setBounds(230, 130, 185, 30);

        jLabel14.setFont(new java.awt.Font("Leelawadee", 1, 36)); // NOI18N
        jLabel14.setText("Dashboard");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(570, 20, 200, 47);

        imgHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sydney-opera-house.png"))); // NOI18N
        imgHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgHomeMouseClicked(evt);
            }
        });
        getContentPane().add(imgHome);
        imgHome.setBounds(850, 10, 30, 30);

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel16.setText("Com maior número de camas ocupadas:");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(220, 490, 270, 20);

        jLabel17.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel17.setText("Menor número de equipamentos livres:");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(220, 540, 270, 20);

        txtEnfEquip.setEditable(false);
        getContentPane().add(txtEnfEquip);
        txtEnfEquip.setBounds(490, 540, 190, 30);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/dash66.jpg"))); // NOI18N
        jLabel15.setMaximumSize(new java.awt.Dimension(939, 611));
        jLabel15.setMinimumSize(new java.awt.Dimension(939, 611));
        jLabel15.setPreferredSize(new java.awt.Dimension(939, 611));
        getContentPane().add(jLabel15);
        jLabel15.setBounds(-330, -80, 1280, 840);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtModeradoPercActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModeradoPercActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModeradoPercActionPerformed

    private void imgHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgHomeMouseClicked
        // TODO add your handling code here:
        dispose();
        PaginaInicialUtilizador paginaInicialUtilizador = new PaginaInicialUtilizador(sistema,bd);
        paginaInicialUtilizador.setLocationRelativeTo(null);
        paginaInicialUtilizador.setVisible(true);

    }//GEN-LAST:event_imgHomeMouseClicked

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
            java.util.logging.Logger.getLogger(PaginaDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imgHome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JTextField txtEnfCamas;
    private javax.swing.JTextField txtEnfEquip;
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
