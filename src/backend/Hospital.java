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
public class Hospital implements Serializable  {
    private String nome;
    private String localidade;
    private String idHospital;
    private Utilizador utiLigado;
    private ListaEnfermaria listaEnfermaria;

    
    /**
     * 
     */
    public Hospital() 
    {
    
    }
    
    /**
     * 
     * @param utiLigado
     * @param nome
     * @param localidade
     * @param idHospital 
     */
    public Hospital(Utilizador utiLigado, String nome, String localidade, String idHospital) {
        this.utiLigado = utiLigado;
        this.nome = nome;
        this.localidade = localidade;
        this.idHospital = idHospital;
        listaEnfermaria = new ListaEnfermaria();  
    }
    
    
    //Getters
    
     public Utilizador getUtiLigado() {
        return utiLigado;
    }
    
    public String getNome() {
        return nome;
    }

    public String getLocalidade() {
        return localidade;
    }

    public String getIdHospital() {
        return idHospital;
    }
    
    public ListaEnfermaria getListaEnfermaria() {
        return listaEnfermaria;
    }
    
    //Setters
    public void setUtiLigado(Utilizador utiLigado) {
        this.utiLigado = utiLigado;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public void setId_Hospital(String idHospital) {
        this.idHospital = idHospital;
    }

     public static UUID randomUUID(){
        UUID uuid = UUID.randomUUID();
        return uuid;
        }
     
}
