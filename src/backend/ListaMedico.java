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
public class ListaMedico implements Serializable {
    
     private ArrayList<Medico> listaMedico;
     
     public ListaMedico()
    {
        this.listaMedico = new ArrayList<Medico>();
    }

    public ArrayList<Medico> getListaMedico() {
        return listaMedico;
    }
     
     public void adicionar(Medico medico)
    {
        listaMedico.add(medico);
    }
    
     public void remover(Medico medico)
    {
        listaMedico.remove(medico);
    }
    
     public int tamanho()
    {
        return listaMedico.size();
    }

    public boolean existe(Medico medico)
    {
        return listaMedico.contains(medico);
    }
     
    
}
