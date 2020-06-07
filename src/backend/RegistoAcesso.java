/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 *
 * 
 */
public class RegistoAcesso implements Serializable {
    
    private Utilizador medico;
    private LocalDateTime data;
    
    /**
     * 
     */
    public RegistoAcesso() 
    { 
        
    }
    
    /**
     * 
     * @param utilizador
     * @param data 
     */
    public RegistoAcesso(Utilizador utilizador, LocalDateTime data) {
        this.medico = utilizador;
        this.data = data;
    }
    
    //getters
    public Utilizador getMedico() {
        return medico;
    }
    
     public LocalDateTime getData() {
        return data;
    }
     
    public void setMedico(Utilizador medico) {
        this.medico = medico;
    }
    
    public void setData(LocalDateTime data) {
        this.data = data;
    }      
    
}
