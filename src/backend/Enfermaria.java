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
    private ListaEquipamento listaEquipamento;
    private ListaProfissionalSaude listaProfissionalSaude;
    private ListaMedico listaMedico;
    
    public Enfermaria () 
    {
    
    }

    public Enfermaria(String nome, String idEnfermaria, int nCamas, String tipo) {
        this.nome = nome;
        this.idEnfermaria = idEnfermaria;
        this.tipo = tipo;
        this.nCamas = nCamas;
        listaEquipamento = new ListaEquipamento();
        listaProfissionalSaude = new ListaProfissionalSaude();
        listaMedico = new ListaMedico();
    }
    
    public static UUID randomUUID(){
        UUID uuid = UUID.randomUUID();
        return uuid;
        }

    public ListaEquipamento getListaEquipamento() {
        return listaEquipamento;
    }

    public ListaProfissionalSaude getListaProfissionalSaude() {
        return listaProfissionalSaude;
    }

    public ListaMedico getListaMedico() {
        return listaMedico;
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

    public int getnCamas() {
        return nCamas;
    }
    
    public void setIdEnfermaria(String idEnfermaria) {
        this.idEnfermaria = idEnfermaria;
    }
   
     
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setnCamas(int nCamas) {
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
    
    

