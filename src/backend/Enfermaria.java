/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.io.Serializable;
import java.util.UUID;

/**
 *
 * @author rodrm
 */
public class Enfermaria extends ProfissionalSaude implements Serializable {
    private String nome;
    private String idEnfermaria;
    private String tipo; //normal, UCI
    private Hospital hospitalSelecionado;
    private int nCamas;
    
    public Enfermaria () 
    {
    
    }

    public Enfermaria(String nome, String idEnfermaria, int nCamas, String tipo) {
        this.nome = nome;
        this.idEnfermaria = idEnfermaria;
        this.tipo = tipo;
        this.nCamas = nCamas;
    }
    
    public static UUID randomUUID(){
        UUID uuid = UUID.randomUUID();
        return uuid;
        }
    
    public Hospital getHospitalSelecionado() {
        return hospitalSelecionado;
    }
    
    public String getIdEnfermaria() {
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
    
    public void setIdEnfermaria(String idEnfermaria) {
        this.idEnfermaria = idEnfermaria;
    }
    
     public void setHospitalSelecionado(Hospital hospitalSelecionado) {
        this.hospitalSelecionado = hospitalSelecionado;
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
    
    

