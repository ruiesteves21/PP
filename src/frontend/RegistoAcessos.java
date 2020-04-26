
package frontend;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import backend.RegistoAcesso;
import backend.Serializacao;
import backend.Sistema;
import javax.swing.JOptionPane;

/**
 *
 * @author
 * Bruno Ferreira (bruno@dsi.uminho.pt)
 */
public class RegistoAcessos extends javax.swing.JFrame {
    private final Sistema sistema;
    private Serializacao bd;

    public RegistoAcessos(Sistema sistema, Serializacao bd) {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        tabAcessos = new javax.swing.JTable();
        imgSair = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registo de Acessos");
        setMaximumSize(new java.awt.Dimension(350, 315));
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
        jScrollPane2.setBounds(40, 60, 271, 234);

        imgSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/logout.png"))); // NOI18N
        imgSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgSairMouseClicked(evt);
            }
        });
        getContentPane().add(imgSair);
        imgSair.setBounds(310, 10, 24, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/wp2.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-210, 0, 650, 320);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void imgSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgSairMouseClicked
        // TODO add your handling code here:
        terminar();
    }//GEN-LAST:event_imgSairMouseClicked
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imgSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabAcessos;
    // End of variables declaration//GEN-END:variables
}
