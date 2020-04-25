/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rodrm
 */
public class Sistema implements Serializable
{
    private final ListaMedico listaMedico;
    private ListaEnfermaria listaEnfermaria;
    private ListaEquipamento listaEquipamento;
    private Medico utilizadorLigado;
    private final List<RegistoAcesso> listaEntradas;
    

    public Sistema()
    {
        listaMedico = new ListaMedico();
        listaEnfermaria = new ListaEnfermaria();
        listaEntradas = new ArrayList<>();
    }
    
    public ListaMedico getListaMedico()
    {
        return listaMedico;
    }
    
     public List<RegistoAcesso> getListaEntradas() {
        return listaEntradas;
    }

    public Medico getUtilizadorLigado() {
        return utilizadorLigado;
    }

    public void setUtilizadorLigado(Medico utilizadorLigado) {
        this.utilizadorLigado = utilizadorLigado;
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
    
    public boolean autenticarUtilizador(String username, String password) {        
        if (listaMedico.existe(username)) {
            try{
                Medico u = listaMedico.getMedico(username);                
                if (u.getPassword().equals(password)){
                    utilizadorLigado = u;
                    listaEntradas.add(new RegistoAcesso(u, LocalDateTime.now()));
                    return true;
                }                
            }catch (Exception e) {}                        
        }        
        return false;        
    }
    
     public void inicializar() throws ListaMedico.UtilizadorDuplicadoException {
        listaMedico.adicionar(new Administrador("admin", "admin", "Administrador"));
        listaMedico.adicionar(new Medico("user1", "1234", "Utilizador 1"));
        listaMedico.adicionar(new Medico("user2", "1234", "Utilizador 2"));        
    }
    
    public void terminar() {
        System.exit(0);
    }
    
    
}
