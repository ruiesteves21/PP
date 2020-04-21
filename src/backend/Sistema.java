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
    private ListaMedico listaMedico;
    private ListaEnfermaria listaEnfermaria;
    private ListaEquipamento listaEquipamento;
    private Medico utilizadorLogin;
    private Admin administradorLogin;
    private final String nomeFichDados = "Sistema.dat";
    private int projetoSel;

    public Sistema()
    {
        listaMedico = new ListaMedico();
        listaEnfermaria = new ListaEnfermaria();
        administradorLogin = null;
        listaMedico.adicionar(new Admin("admin", "admin", "admin@admin.com"));
        utilizadorLogin = null;
    }

    public ListaMedico getListaMedico()
    {
        return listaMedico;
    }

    public void setListaMedico(ListaMedico listaMedico)
    {
        this.listaMedico = listaMedico;
    }

    public Medico getUtilizadorLogin() {
        return utilizadorLogin;
    }

    public void setUtilizadorLogin(Medico utilizadorLogin) {
        this.utilizadorLogin = utilizadorLogin;
    }
    
    public ListaEnfermaria getListaEnfermaria()
    {
        return listaEnfermaria;
    }

    public void setListaEnfermaria(ListaEnfermaria listaEnfermaria)
    {
        this.listaEnfermaria = listaEnfermaria;
    }
    
    public ListaEquipamento getListaEquipamento() {
        return listaEquipamento;
    }

    public void setListaEquipamento(ListaEquipamento listaEquipamento) {
        this.listaEquipamento = listaEquipamento;
    }
    
    public Admin getAdministradorLogin()
    {
        return administradorLogin;
    }

    public void setAdministradorLogin(Admin administradorLogin)
    {
        this.administradorLogin = administradorLogin;
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
