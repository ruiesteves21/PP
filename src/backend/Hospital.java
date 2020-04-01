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
public class Hospital {
    private String nome;
    private String localidade;
    private int id_Hospital;
    
    public Hospital() 
    {
    
    }

    public Hospital(String nome, String localidade, int id_Hospital) {
        this.nome = nome;
        this.localidade = localidade;
        this.id_Hospital = id_Hospital;
    }
    
    //Getters
    public String getNome() {
        return nome;
    }

    public String getLocalidade() {
        return localidade;
    }

    public int getId_Hospital() {
        return id_Hospital;
    }
    
    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public void setId_Hospital(int id_Hospital) {
        this.id_Hospital = id_Hospital;
    }

    @Override
    public String toString() {
        return "Hospital{" + "nome=" + nome + ", localidade=" + localidade + ", id_Hospital=" + id_Hospital + '}';
    }
    
    
    
    
}
