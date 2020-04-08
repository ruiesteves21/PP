/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import frontend.Arranque;
import java.io.Serializable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author rodrm
 */
public class Sistema implements Serializable
{
    private ListaMedico listaM;
    private ListaEnfermaria listaE;
    private ListaEquipamento listaEquip;
    private Medico utilizadorLogin;
    private final String nomeFichDados = "Sistema.dat";
    private int projetoSel;

    public Sistema()
    {
        listaM = new ListaMedico();
        listaE = new ListaEnfermaria();
        utilizadorLogin = null;
        listaM.addUtilizador(new Medico("cardiologista", "admin", "admin", "admin@admin.com"));

    }

    public ListaMedico getListaM()
    {
        return listaM;
    }

    public void setListaM(ListaMedico listaM)
    {
        this.listaM = listaM;
    }

    public ListaEnfermaria getListaE()
    {
        return listaE;
    }

    public void setListaE(ListaEnfermaria listaE)
    {
        this.listaE = listaE;
    }
    
    public ListaEquipamento getListaEquip() {
        return listaEquip;
    }

    public void setListaEquip(ListaEquipamento listaEquip) {
        this.listaEquip = listaEquip;
    }
    
    public Medico getUtilizadorLogin()
    {
        return utilizadorLogin;
    }

    public void setUtilizadorLogin(Medico utilizadorLogin)
    {
        this.utilizadorLogin = utilizadorLogin;
    }
    
    public int getProjetoSel()
    {
        return projetoSel;
    }

    public void setProjetoSel(int projetoSel)
    {
        this.projetoSel = projetoSel;
    }

    public void gravaSistema()
    {
        if (!Arranque.getGravou()) {

            try {
                
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(this.nomeFichDados));
                oos.writeObject(this);
                oos.flush();
                oos.close();
                Arranque.setGravou(true);
                JOptionPane.showMessageDialog(null, "Dados gravados com sucesso", "Sucesso", JOptionPane.PLAIN_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Dados não guardados\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }

    }
    
    public Sistema lerSistema(){
        Sistema novoSistema = new Sistema();
        ObjectInputStream ooin = null;
        try{
            ooin = new ObjectInputStream(new FileInputStream(this.nomeFichDados));
            novoSistema = (Sistema) ooin.readObject();
            ooin.close();
            
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "ATENÇÂO:\n " + e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
            
            if ( JOptionPane.showConfirmDialog(null, "Erro na leitura dos dados\nFicheiro: " + this.nomeFichDados + "\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE, JOptionPane.OK_CANCEL_OPTION) == 1){
                System.exit(0);
            }
        }
        
        return novoSistema;
    }
}
