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
public class Enfermaria extends ProfissionalSaude {
    private int idEnfermaria;
    private String tipo; //normal, UCI
    private int nCamas;
    private ListaDoente doentes;
    
    public Enfermaria () 
    {
    
    }

    public Enfermaria(int idEnfermaria, int nCamas) {
        this.idEnfermaria = idEnfermaria;
        this.tipo = "Não iniciada";
        this.nCamas = nCamas;
    }

    public int getIdEnfermaria() {
        return idEnfermaria;
    }

    public String getTipo() {
        return tipo;
    }

    public int getNcamas() {
        return nCamas;
    }
    
    public ListaDoente getDoentes()
    {
        return doentes;
    }
    
    public void setIdEnfermaria(int idEnfermaria) {
        this.idEnfermaria = idEnfermaria;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
    
    

