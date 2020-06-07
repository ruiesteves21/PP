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
public class ListaHospital implements Serializable {
     private ArrayList<Hospital> listaHospital;
     
     public ListaHospital()
    {
        this.listaHospital = new ArrayList<Hospital>();
    }

    public ArrayList<Hospital> getListaHospital()
    {
        return listaHospital;
    }

    public void adicionar(Hospital hospital)
    {
        listaHospital.add(hospital);
    }
    
    public void remover(Hospital hospital)
    {
        listaHospital.remove(hospital);
    }
    
     public int tamanho()
    {
        return listaHospital.size();
    }
    
     public Hospital getHospital(String id) { 
         
            if (listaHospital.contains(id)){
                //convertemos id em int porque definimos assim quando definimos a arraylist
            return listaHospital.get(Integer.parseInt(id));
        } else{
            throw new RuntimeException("O hospital já existe na lista");
        }
    }
     
}
