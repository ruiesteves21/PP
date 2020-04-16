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
    private int idHospital;
    private ListaDoente listaD; 
    private ListaEnfermaria listaE;
    private ListaEquipamento listaEquip;
    
    
    public Hospital() 
    {
    
    }

    public Hospital(String nome, String localidade, int id_Hospital) {
        this.nome = nome;
        this.localidade = localidade;
        this.idHospital = idHospital;
    }
    
    //Getters
    public String getNome() {
        return nome;
    }

    public String getLocalidade() {
        return localidade;
    }

    public int getId_Hospital() {
        return idHospital;
    }
    
    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public void setId_Hospital(int idHospital) {
        this.idHospital = idHospital;
    }

    public int getIdHospital() {
        return idHospital;
    }

    public ListaDoente getListaD() {
        return listaD;
    }

    public ListaEnfermaria getListaE() {
        return listaE;
    }

    public ListaEquipamento getListaEquip() {
        return listaEquip;
    }

    @Override
    public String toString() {
        return "Hospital{" + "nome=" + nome + ", localidade=" + localidade + ", idHospital=" + idHospital + '}';
    }
    
    
    
    
}
