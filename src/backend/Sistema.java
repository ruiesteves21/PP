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
    private final ListaUtilizador listaUtilizador;
    private ListaEnfermaria listaEnfermaria;
    private ListaEquipamento listaEquipamento;
    private Utilizador utilizadorLigado;
    private final List<RegistoAcesso> listaEntradas;
    private ListaHospital listaHospital;
    private ListaProfissionalSaude listaProfissionalSaude;
    private ListaDoente listaDoente;
    

    public Sistema()
    {
        listaUtilizador = new ListaUtilizador();
        listaEnfermaria = new ListaEnfermaria();
        listaEntradas = new ArrayList<>();
        listaHospital = new ListaHospital();
        listaDoente = new ListaDoente();
        listaProfissionalSaude = new ListaProfissionalSaude();
        listaEquipamento = new ListaEquipamento();
    }

    public ListaProfissionalSaude getListaProfissionalSaude() {
        return listaProfissionalSaude;
    }

    public void setListaProfissionalSaude(ListaProfissionalSaude listaProfissionalSaude) {
        this.listaProfissionalSaude = listaProfissionalSaude;
    }

    public ListaDoente getListaDoente() {
        return listaDoente;
    }

    public void setListaDoente(ListaDoente listaDoente) {
        this.listaDoente = listaDoente;
    }
    
    

     public ListaHospital getListaHospital() {
        return listaHospital;
    }

    public void setListaHospital(ListaHospital listaHospital) {
        this.listaHospital = listaHospital;
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

    public void setUtilizadorLigado(Utilizador utilizadorLigado) {
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
