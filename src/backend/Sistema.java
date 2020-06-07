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
 * 
 */
public class Sistema implements Serializable
{
    private final ListaUtilizador listaUtilizador;
    private ListaEnfermaria listaEnfermaria;
    public ListaEquipamento listaEquipamento;
    private Utilizador utilizadorLigado;
    private final List<RegistoAcesso> listaEntradas;
    private ListaHospital listaHospital;
    private ListaEnfermeiro listaEnfermeiro;
    private ListaDoente listaDoente;
    private ListaMedico listaMedico;
    
    /**
     * 
     */
    public Sistema()
    {
        listaUtilizador = new ListaUtilizador();
        listaEnfermaria = new ListaEnfermaria();
        listaEntradas = new ArrayList<>();
        listaHospital = new ListaHospital();
        listaDoente = new ListaDoente();
        listaEnfermeiro = new ListaEnfermeiro();
        listaEquipamento = new ListaEquipamento();
        listaMedico = new ListaMedico();
    }

    public ListaEnfermeiro getListaEnfermeiro() {
        return listaEnfermeiro;
    }
   

    public ListaDoente getListaDoente() {
        return listaDoente;
    }

    public ListaMedico getListaMedico() {
        return listaMedico;
    }

    
     public ListaHospital getListaHospital() {
        return listaHospital;
    }

       
    public ListaUtilizador getListaUtilizador()
    {
        return listaUtilizador;
    }
    
     public List<RegistoAcesso> getListaEntradas() {
        return listaEntradas;
    }

    public Utilizador getUtilizadorLigado() {
        return utilizadorLigado;
    }
   
    
    public ListaEnfermaria getListaEnfermaria()
    {
        return listaEnfermaria;
    }    
    
    public ListaEquipamento getListaEquipamento() {
        return listaEquipamento;
    }
 
    
    public boolean autenticarUtilizador(String username, String password) {        
        if (listaUtilizador.existe(username)) {
            try{
                Utilizador u = listaUtilizador.getUtilizador(username);                
                if (u.getPassword().equals(password)){
                    utilizadorLigado = u;
                    listaEntradas.add(new RegistoAcesso(u, LocalDateTime.now()));
                    return true;
                }                
            }catch (Exception e) {}                        
        }        
        return false;        
    }
    
    public void inicializar() throws ListaUtilizador.UtilizadorDuplicadoException {
        listaUtilizador.adicionar(new Administrador("admin", "admin", "Administrador"));
        listaUtilizador.adicionar(new Utilizador("user1", "1234", "Utilizador 1"));
        listaUtilizador.adicionar(new Utilizador("user2", "1234", "Utilizador 2"));        
    }
    
    public void terminar() {
        System.exit(0);
    }  
}
