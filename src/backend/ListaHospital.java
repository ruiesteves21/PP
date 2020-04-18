/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.util.ArrayList;

/**
 *
 * @author rodrm
 */
public class ListaHospital {
     private ArrayList<Hospital> listaHospital;
     
     public ListaHospital()
    {
        this.listaHospital = new ArrayList<Hospital>();
    }

    public ArrayList<Hospital> getListaHospital()
    {
        return listaHospital;
    }

    public void setListaHospital(ArrayList<Hospital> listaHospital)
    {
        this.listaHospital = listaHospital;
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

    @Override
    public String toString()
    {
        String s = "";

        for (Hospital hospital : listaHospital) {
            s += hospital.toString() + "\n";
        }

        return s;
    }
     
    
}
