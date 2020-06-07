/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.io.Serializable;
import java.util.UUID;

/**
 *
 * 
 */
public class Enfermeiro implements Serializable {
    private String idEnfermeiro;
    private Utilizador utiLigado;
    private String nomeEnfermeiro;
    private ListaDoente listaDoente;
    
    /**
     * 
     */
    public Enfermeiro() 
    {
        
    }
    
    /**
     * 
     * @param utiLigado
     * @param idEnfermeiro
     * @param nomeEnfermeiro 
     */
    public Enfermeiro(Utilizador utiLigado, String idEnfermeiro, String nomeEnfermeiro) {
        this.utiLigado = utiLigado;
        this.idEnfermeiro = idEnfermeiro;
        this.nomeEnfermeiro = nomeEnfermeiro;
        listaDoente = new ListaDoente();
        
    }
 
    //getters
    public Utilizador getUtiLigado() {
        return utiLigado;
    }
     
    public String getIdEnfermeiro() {
        return idEnfermeiro;
    }

    public String getNomeEnfermeiro() {
        return nomeEnfermeiro;
    }

    public ListaDoente getListaDoente() {
        return listaDoente;
    }
    
    //setters
    public void setIdEnfermeiro(String idProfSaude) {
        this.idEnfermeiro = idProfSaude;
    }

    public void setNomeEnfermeiro(String nomeProfSaude) {
        this.nomeEnfermeiro = nomeProfSaude;
    }

  public static UUID randomUUID(){
        UUID uuid = UUID.randomUUID();
        return uuid;
        }

}
