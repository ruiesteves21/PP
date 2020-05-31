/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.io.Serializable;
import java.util.ArrayList;
/**
 *
 * 
 */
public class ListaEnfermaria implements Serializable {
    
     private ArrayList<Enfermaria> listaEnfermaria;

    public ListaEnfermaria()
    {
        this.listaEnfermaria = new ArrayList<Enfermaria>();
    }

    public ArrayList<Enfermaria> getListaEnfermaria() {
        return listaEnfermaria;
    }

    public void setListaEnfermaria(ArrayList<Enfermaria> listaEnfermaria) {
        this.listaEnfermaria = listaEnfermaria;
    }
    
    public void adicionar(Enfermaria enfermaria)
    {
        listaEnfermaria.add(enfermaria);
    }
    
     public void remover(Enfermaria enfermaria)
    {
        listaEnfermaria.remove(enfermaria);
    }
    
     public int tamanho()
    {
        return listaEnfermaria.size();
    }
    
    /**
     * Este metodo serve para saber todos as enfermarias em que o doente está internado
     * @param doente
     * @return Lista de Enfermarias em que o doente se encontra
     
    
    public ArrayList<Enfermaria> listaEnfermariaDoente(Doente doente)
    {
        ArrayList<Enfermaria> nEnfermaria = new ArrayList<>();

        for (Enfermaria enfermaria : listaEnfermaria) {
            if (enfermaria.getDoentes().existe(doente)) {
                nEnfermaria.add(enfermaria);
            }
        }

        return nEnfermaria;
    }
    
    
     * Este metodo serve para saber todos as enfermarias onde o equipamento está colocado
     * @param equipamento
     * @return Lista de Enfermarias em que o equipamento se encontra
     
    
    public ArrayList<Enfermaria> listaEnfermariaEquipamento (Equipamento equipamento)
    {
        ArrayList<Enfermaria> nEquipamento = new ArrayList<>();

        for (Enfermaria enfermaria : listaEnfermaria) {
            if (enfermaria.getEquipamento().existe(equipamento)) {
                nEquipamento.add(enfermaria);
            }
        }

        return nEquipamento;
    }*/
    
}
