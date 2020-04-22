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
 * @author rodrm
 */
public class RegistoAcesso implements Serializable {
    
    private Medico medico;
    private LocalDateTime data;

    public RegistoAcesso() {  }

    public RegistoAcesso(Medico utilizador, LocalDateTime data) {
        this.medico = utilizador;
        this.data = data;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }      
    
}
