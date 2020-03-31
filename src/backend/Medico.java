/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.util.logging.Logger;

/**
 *
 * @author rodrm
 */
public class Medico {
    private String especialidade;

    public Medico() {
    }

    public Medico(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return "Medico{" + "especialidade=" + especialidade + '}';
    }
    
    
    
    
    
}
