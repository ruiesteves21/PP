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
 */
public class Enfermaria extends Enfermeiro implements Serializable {
    private String nome;
    private String idEnfermaria;
    private String tipo; //normal, UCI
    private Utilizador utiLigado;
    private int nCamas;
    private ListaEquipamento listaEquipamento;
    private ListaEnfermeiro listaEnfermeiro;
    private ListaMedico listaMedico;
    
    /**
     * 
     */
    public Enfermaria () 
    {
    
    }
    
    /**
     * 
     * @param utiLigado
     * @param nome
     * @param idEnfermaria
     * @param nCamas
     * @param tipo 
     */
    public Enfermaria(Utilizador utiLigado, String nome, String idEnfermaria, int nCamas, String tipo) {
        this.utiLigado = utiLigado;
        this.nome = nome;
        this.idEnfermaria = idEnfermaria;
        this.tipo = tipo;
        this.nCamas = nCamas;
        listaEquipamento = new ListaEquipamento();
        listaEnfermeiro = new ListaEnfermeiro();
        listaMedico = new ListaMedico();
    }
    
    //getters
    public Utilizador getUtiLigado() {
        return utiLigado;
    }
    
    public ListaEquipamento getListaEquipamento() {
        return listaEquipamento;
    }

    public ListaEnfermeiro getListaEnfermeiro() {
        return listaEnfermeiro;
    }

    public ListaMedico getListaMedico() {
        return listaMedico;
    }
        
    
    public String getIdEnfermaria() {
        return idEnfermaria;
    }

    public String getNome() {
        return nome;
    }
        
    public String getTipo() {
        return tipo;
    }

    public int getNCamas() {
        return nCamas;
    }
    
    //setters
    public void setIdEnfermaria(String idEnfermaria) {
        this.idEnfermaria = idEnfermaria;
    }
   
     
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setNCamas(int nCamas) {
        this.nCamas = nCamas;
    }
    
    public static UUID randomUUID(){
        UUID uuid = UUID.randomUUID();
        return uuid;
        }
}
    
    

