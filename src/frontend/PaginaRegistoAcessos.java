
package frontend;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import backend.RegistoAcesso;
import backend.Serializacao;
import backend.Sistema;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author
 * Bruno Ferreira (bruno@dsi.uminho.pt)
 */
public class PaginaRegistoAcessos extends javax.swing.JFrame {
    private final Sistema sistema;
    private Serializacao bd;

    public PaginaRegistoAcessos(Sistema sistema, Serializacao bd) {
        initComponents();
        this.sistema = sistema;   
        this.bd = bd;
        tabAcessos.setModel(criarModeloTabela());
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
    
    private AbstractTableModel criarModeloTabela() {   
        String[] nomeColunas = {"Username", "Data/Hora"};
        //Cria uma copia da lista de entradas, para nao alterarmos a lista original
        List<RegistoAcesso> registos = new ArrayList<>(sistema.getListaEntradas());
        //Um Comparator permite-nos comparar dois objectos
        registos.sort(new Comparator<RegistoAcesso>(){
           
            @Override
            public int compare(RegistoAcesso o1, RegistoAcesso o2) {
            /*
                Este metodo compara dois objectos do mesmo tipo, serve para o metodo sort saber como ordenar a lista
                O retorno deste metodo é:
                    0  -> se consideramos que os objectos sao iguais,
                    -1 -> se consideramos que o primeiro objecto/argumento é menor que o segundo
                    1 -> se consideramos que o segundo objecto/argumento é maior que o primeiro               

                Como queremos ordenar os registos pela data decrescente do acesso, vamos comparar as datas de 
              cada registo de acesso.
                
                Porque a classe LocalDateTime já tem um método que permite comparar dois LocalDateTime (compareTo),
             vamos utilizar esse método, contudo como queremos ordenar os registos de forma descendente vamos
             inverter a ordem dos parametros que passamos 

            */                
                return o2.getData().compareTo(o1.getData());
            }            
        });

        return new AbstractTableModel() {     
            @Override
            public String getColumnName(int column) {
                return nomeColunas[column];
            }
           
            @Override
            public int getRowCount() {                
                return registos.size();
            }

            @Override
            public int getColumnCount() {                
                return nomeColunas.length;
            }

            @Override
            public Object getValueAt(int rowIndex, int columnIndex) {
                switch (columnIndex) {
                    case 0: 
                        return registos.get(rowIndex).getMedico().getUsername();
                    case 1:
                        return registos.get(rowIndex).getData();
                    default:
                        return "";
                }                              
            }            
        };
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imgRetroceder2 = new javax.swing.JLabel();
        imgRetroceder3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabAcessos = new javax.swing.JTable();
        imgRetroceder6 = new javax.swing.JLabel();
        imgSair = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        imgRetroceder = new javax.swing.JLabel();
        imgRetroceder1 = new javax.swing.JLabel();
        imgRetroceder4 = new javax.swing.JLabel();
        imgRetroceder5 = new javax.swing.JLabel();

        imgRetroceder2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/undo-button2.png"))); // NOI18N
        imgRetroceder2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgRetroceder2MouseClicked(evt);
            }
        });

        imgRetroceder3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/undo-button2.png"))); // NOI18N
        imgRetroceder3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgRetroceder3MouseClicked(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registo de Acessos");
        setMinimumSize(new java.awt.Dimension(345, 313));
        setUndecorated(true);
        setSize(new java.awt.Dimension(345, 313));
        getContentPane().setLayout(null);

        tabAcessos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Data/Hora"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabAcessos);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(40, 50, 271, 234);

        imgRetroceder6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/undo-button2.png"))); // NOI18N
        imgRetroceder6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgRetroceder6MouseClicked(evt);
            }
        });
        getContentPane().add(imgRetroceder6);
        imgRetroceder6.setBounds(270, 10, 24, 30);

        imgSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logout.png"))); // NOI18N
        imgSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgSairMouseClicked(evt);
            }
        });
        getContentPane().add(imgSair);
        imgSair.setBounds(310, 10, 24, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/dash66.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-260, 0, 650, 320);

        imgRetroceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/undo-button2.png"))); // NOI18N
        getContentPane().add(imgRetroceder);
        imgRetroceder.setBounds(480, 10, 24, 30);

        imgRetroceder1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/undo-button2.png"))); // NOI18N
        imgRetroceder1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgRetroceder1MouseClicked(evt);
            }
        });
        getContentPane().add(imgRetroceder1);
        imgRetroceder1.setBounds(530, 30, 24, 30);

        imgRetroceder4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/undo-button2.png"))); // NOI18N
        imgRetroceder4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgRetroceder4MouseClicked(evt);
            }
        });
        getContentPane().add(imgRetroceder4);
        imgRetroceder4.setBounds(64, 30, 490, 310);

        imgRetroceder5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/undo-button2.png"))); // NOI18N
        imgRetroceder5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgRetroceder5MouseClicked(evt);
            }
        });
        getContentPane().add(imgRetroceder5);
        imgRetroceder5.setBounds(530, 30, 24, 70);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void imgSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgSairMouseClicked
        // TODO add your handling code here:
        UIManager.put("OptionPane.noButtonText", "Não");  
        UIManager.put("OptionPane.yesButtonText", "Sim");
        
        if (JOptionPane.showConfirmDialog(null, 
               "Deseja realmente terminar o programa?", 
               "Terminar",
               
               JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                dispose();
                PaginaLogin l = new PaginaLogin(sistema, bd);
                l.setVisible(true);
                guardarAlteracoes();
                dispose();
            
       }
    }//GEN-LAST:event_imgSairMouseClicked

    private void imgRetroceder1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgRetroceder1MouseClicked
        // TODO add your handling code here:
        dispose();
        PaginaHospitais lh = new PaginaHospitais(sistema, bd);
        /*FichaHospital p = new FichaHospital(sistema,bd,varHosp);
        FichaHospital p = new FichaHospital(sistema,bd,table.getSelectedRow()); */
        lh.setLocationRelativeTo(null);
        lh.setVisible(true);
    }//GEN-LAST:event_imgRetroceder1MouseClicked

    private void imgRetroceder2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgRetroceder2MouseClicked
        // TODO add your handling code here:
        dispose();
        PaginaHospitais lh = new PaginaHospitais(sistema, bd);
        /*FichaHospital p = new FichaHospital(sistema,bd,varHosp);
        FichaHospital p = new FichaHospital(sistema,bd,table.getSelectedRow()); */
        lh.setLocationRelativeTo(null);
        lh.setVisible(true);
    }//GEN-LAST:event_imgRetroceder2MouseClicked

    private void imgRetroceder3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgRetroceder3MouseClicked
        // TODO add your handling code here:
        dispose();
        PaginaHospitais lh = new PaginaHospitais(sistema, bd);
        /*FichaHospital p = new FichaHospital(sistema,bd,varHosp);
        FichaHospital p = new FichaHospital(sistema,bd,table.getSelectedRow()); */
        lh.setLocationRelativeTo(null);
        lh.setVisible(true);
    }//GEN-LAST:event_imgRetroceder3MouseClicked

    private void imgRetroceder4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgRetroceder4MouseClicked
        // TODO add your handling code here:
        dispose();
        PaginaHospitais lh = new PaginaHospitais(sistema, bd);
        /*FichaHospital p = new FichaHospital(sistema,bd,varHosp);
        FichaHospital p = new FichaHospital(sistema,bd,table.getSelectedRow()); */
        lh.setLocationRelativeTo(null);
        lh.setVisible(true);
    }//GEN-LAST:event_imgRetroceder4MouseClicked

    private void imgRetroceder5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgRetroceder5MouseClicked
        // TODO add your handling code here:
        dispose();
        PaginaHospitais lh = new PaginaHospitais(sistema, bd);
        /*FichaHospital p = new FichaHospital(sistema,bd,varHosp);
        FichaHospital p = new FichaHospital(sistema,bd,table.getSelectedRow()); */
        lh.setLocationRelativeTo(null);
        lh.setVisible(true);
    }//GEN-LAST:event_imgRetroceder5MouseClicked

    private void imgRetroceder6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgRetroceder6MouseClicked
        // TODO add your handling code here:
        dispose();
        PaginaAdministrador paginaAdministrador = new PaginaAdministrador(sistema,bd);
        paginaAdministrador.setLocationRelativeTo(null);
        paginaAdministrador.setVisible(true);
    }//GEN-LAST:event_imgRetroceder6MouseClicked
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imgRetroceder;
    private javax.swing.JLabel imgRetroceder1;
    private javax.swing.JLabel imgRetroceder2;
    private javax.swing.JLabel imgRetroceder3;
    private javax.swing.JLabel imgRetroceder4;
    private javax.swing.JLabel imgRetroceder5;
    private javax.swing.JLabel imgRetroceder6;
    private javax.swing.JLabel imgSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabAcessos;
    // End of variables declaration//GEN-END:variables
}
