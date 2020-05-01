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
public class Enfermaria extends ProfissionalSaude implements Serializable {
    private String nome;
    private int idEnfermaria;
    private String tipo; //normal, UCI
    private int nCamas;
    private ListaDoente listaDoente;
    private ListaEquipamento listaEquipamento;
    
    public Enfermaria () 
    {
    
    }

    public Enfermaria(String nome, int idEnfermaria, int nCamas) {
        this.nome = nome;
        this.idEnfermaria = idEnfermaria;
        this.tipo = "Não iniciada";
        this.nCamas = nCamas;
        this.listaDoente = new ListaDoente();
        this.listaEquipamento = new ListaEquipamento();
    }

    public int getIdEnfermaria() {
        return idEnfermaria;
    }

    public String getNome() {
        return nome;
    }
        
    public String getTipo() {
        return tipo;
    }

    public int getNcamas() {
        return nCamas;
    }

    public ListaDoente getDoentes() {
        return listaDoente;
    }
    
    public ListaEquipamento getEquipamento() {
        return listaEquipamento;
    }
    
    public void setIdEnfermaria(int idEnfermaria) {
        this.idEnfermaria = idEnfermaria;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setNCamas(int nCamas) {
        this.nCamas = nCamas;
    }
     
    
    // Metodos para alterar o tipo de enfermaria
    public void setTipoNaoIniciada()
    {
        tipo = "Não iniciada";
    }

    public void setTipoUCI()
    {
        tipo = "UCI";
    }
    
    public void setTipoNormal()
    {
        tipo = "Normal";
    }
    
    
    @Override
    public String toString() {
        return "Enfermaria{" + "idEnfermaria=" + idEnfermaria + ", tipo=" + tipo + ", nCamas=" + nCamas + '}';
    }
    
    


}
    
    

