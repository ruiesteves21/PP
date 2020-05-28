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
 * @author Utilizador
 */
public class Medico implements Serializable {
    private String especialidade;
    private String nome;
    private String idMedico;
    private ListaDoente listaDoente; 
    
    public Medico() {
        
    }
    
    public Medico(String especialidade, String nome, String idMedico) {
        this.especialidade = especialidade;
        this.nome = nome;
        this.idMedico = idMedico;    
        listaDoente = new ListaDoente();
    }
    
     public static UUID randomUUID(){
        UUID uuid = UUID.randomUUID();
        return uuid;
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

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void setNomeMedico(String nome) {
        this.nome = nome;
    }

    public void setIdMedico(String idMedico) {
        this.idMedico = idMedico;
    }

    public void setListaDoente(ListaDoente listaDoente) {
        this.listaDoente = listaDoente;
    }
    
  
}
