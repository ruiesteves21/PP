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
     private ArrayList<Hospital> listaH;
     
     public ListaHospital()
    {
        this.listaH = new ArrayList<Hospital>();
    }

    public ArrayList<Hospital> getListaH()
    {
        return listaH;
    }

    public void setListaH(ArrayList<Hospital> listaH)
    {
        this.listaH = listaH;
    }

    public void addUtilizador(Hospital h)
    {
        listaH.add(h);
    }
    
    public void removeHospital(Hospital h)
    {
        listaH.remove(h);
    }
    
     public int tamanho()
    {
        return listaH.size();
    }
}
