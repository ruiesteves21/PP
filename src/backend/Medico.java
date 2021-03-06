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
public class Medico implements Serializable {
    private String especialidade;
     private Utilizador utiLigado;
    private String nome;
    private String idMedico;
    private ListaDoente listaDoente; 
    
    /**
     * 
     */
    public Medico() {
        
    }
    
    /**
     * 
     * @param utiLigado
     * @param especialidade
     * @param nome
     * @param idMedico 
     */
    public Medico(Utilizador utiLigado, String especialidade, String nome, String idMedico) {
        this.utiLigado = utiLigado;
        this.especialidade = especialidade;
        this.nome = nome;
        this.idMedico = idMedico;    
        listaDoente = new ListaDoente();
    }
      
    //getters
    public Utilizador getUtiLigado() {
        return utiLigado;
    }
     
    public ListaDoente getListaDoente() {
        return listaDoente;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public String getNomeMedico() {
        return nome;
    }

    public String getIdMedico() {
        return idMedico;
    }
    
    //setters
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void setNomeMedico(String nome) {
        this.nome = nome;
    }

    public void setIdMedico(String idMedico) {
        this.idMedico = idMedico;
    }
    
    public static UUID randomUUID(){
       UUID uuid = UUID.randomUUID();
       return uuid;
       }
  
}
