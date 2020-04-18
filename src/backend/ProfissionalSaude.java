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
    private String nomeProfsaude;

    public ProfissionalSaude() 
    {
        
    }

    public ProfissionalSaude(int idProfSaude, String nomeProfsaude) {
        this.idProfsaude = idProfsaude;
        this.nomeProfsaude = nomeProfsaude;
    }

    public int getId_prof_saude() {
        return idProfsaude;
    }

    public String getNomePS() {
        return nomeProfsaude;
    }

    public void setId_prof_saude(int idProfsaude) {
        this.idProfsaude = idProfsaude;
    }

    public void setNomePS(String nomeProfsaude) {
        this.nomeProfsaude = nomeProfsaude;
    }

    @Override
    public String toString() {
        return "ProfissionalSaude{" + "idProfsaude=" + idProfsaude + ", nome=" + nomeProfsaude + '}';
    }
    
    
}
