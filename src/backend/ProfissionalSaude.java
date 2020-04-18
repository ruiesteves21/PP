/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

/**
 *
 * @author rodrm
 */
public class ProfissionalSaude {
    private int idProfsaude;
    private String nomePS;

    public ProfissionalSaude() 
    {
        
    }

    public ProfissionalSaude(int idProfSaude, String nomePS) {
        this.idProfsaude = idProfsaude;
        this.nomePS = nomePS;
    }

    public int getId_prof_saude() {
        return idProfsaude;
    }

    public String getNomePS() {
        return nomePS;
    }

    public void setId_prof_saude(int idProfsaude) {
        this.idProfsaude = idProfsaude;
    }

    public void setNomePS(String nomePS) {
        this.nomePS = nomePS;
    }

    @Override
    public String toString() {
        return "ProfissionalSaude{" + "idProfsaude=" + idProfsaude + ", nome=" + nomePS + '}';
    }
    
    
}
