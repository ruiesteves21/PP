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
    private int idProfSaude;
    private String nomeProfSaude;

    public ProfissionalSaude() 
    {
        
    }

    public ProfissionalSaude(int idProfSaude, String nomeProfsaude) {
        this.idProfSaude = idProfSaude;
        this.nomeProfSaude = nomeProfsaude;
    }

    public int getIdProfSaude() {
        return idProfSaude;
    }

    public String getNomePS() {
        return nomeProfSaude;
    }

    public void setIdProfSaude(int idProfSaude) {
        this.idProfSaude = idProfSaude;
    }

    public void setNomePS(String nomeProfSaude) {
        this.nomeProfSaude = nomeProfSaude;
    }

    @Override
    public String toString() {
        return "ProfissionalSaude{" + "idProfsaude=" + idProfSaude + ", nome=" + nomeProfSaude + '}';
    }
    
    
}
