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
    private String nome;

    public ProfissionalSaude() 
    {
        
    }

    public ProfissionalSaude(int idProfSaude, String nome) {
        this.idProfsaude = idProfsaude;
        this.nome = nome;
    }

    public int getId_prof_saude() {
        return idProfsaude;
    }

    public String getNome() {
        return nome;
    }

    public void setIdProfSaude(int idProfsaude) {
        this.idProfsaude = idProfsaude;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "ProfissionalSaude{" + "idProfsaude=" + idProfsaude + ", nome=" + nome + '}';
    }
    
    
}
