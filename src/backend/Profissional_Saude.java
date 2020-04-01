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
public class Profissional_Saude {
    private int id_prof_saude;
    private String nome;

    public Profissional_Saude() 
    {
        
    }

    public Profissional_Saude(int id_prof_saude, String nome) {
        this.id_prof_saude = id_prof_saude;
        this.nome = nome;
    }

    public int getId_prof_saude() {
        return id_prof_saude;
    }

    public String getNome() {
        return nome;
    }

    public void setId_prof_saude(int id_prof_saude) {
        this.id_prof_saude = id_prof_saude;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Profissional_Saude{" + "id_prof_saude=" + id_prof_saude + ", nome=" + nome + '}';
    }
    
    
}
