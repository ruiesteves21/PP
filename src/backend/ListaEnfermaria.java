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
    
}
