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
public class Enfermaria {
    private int id_Enfermaria;
    private String tipo; //normal, UCI
    private int n_camas;
    private ListaDoente doentes;
    
    public Enfermaria () 
    {
    
    }

    public Enfermaria(int id_Enfermaria, int n_camas) {
        this.id_Enfermaria = id_Enfermaria;
        this.tipo = "Não iniciada";
        this.n_camas = n_camas;
    }

    public int getId_Enfermaria() {
        return id_Enfermaria;
    }

    public String getTipo() {
        return tipo;
    }

    public int getN_camas() {
        return n_camas;
    }
    
    public ListaDoente getDoentes()
    {
        return doentes;
    }
    
    public void setId_Enfermaria(int id_Enfermaria) {
        this.id_Enfermaria = id_Enfermaria;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setN_camas(int n_camas) {
        this.n_camas = n_camas;
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
        return "Enfermaria{" + "id_Enfermaria=" + id_Enfermaria + ", tipo=" + tipo + ", n_camas=" + n_camas + '}';
    }
    
    


}
    
    

