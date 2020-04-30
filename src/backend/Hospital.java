/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.io.Serializable;

/**
 *
 * @author rodrm
 */
public class Hospital implements Serializable  {
    private String nome;
    private String localidade;
    private int idHospital;
    private ListaDoente listaDoente; 
    private ListaEnfermaria listaEnfermaria;
    private ListaEquipamento listaEquipamento;
    
    
    public Hospital() 
    {
    
    }

    public Hospital(String nome, String localidade, int idHospital) {
        this.nome = nome;
        this.localidade = localidade;
        this.idHospital = idHospital;
        this.listaEnfermaria = new ListaEnfermaria();
        this.listaEquipamento = new ListaEquipamento();
    }
    
    //Getters
    public String getNome() {
        return nome;
    }

    public String getLocalidade() {
        return localidade;
    }

    public int getIdHospital() {
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

    public ListaDoente getListaDoente() {
        return listaDoente;
    }

    public ListaEnfermaria getListaEnfermaria() {
        return listaEnfermaria;
    }

    public ListaEquipamento getListaEquipamento() {
        return listaEquipamento;
    }

    @Override
    public String toString() {
        return "Hospital{" + "nome=" + nome + ", localidade=" + localidade + ", idHospital=" + idHospital + '}';
    }
    
    
    
    
}
