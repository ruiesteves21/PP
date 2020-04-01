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
public class ListaEnfermaria {
    
     private ArrayList<Enfermaria> listaE;

    public ListaEnfermaria()
    {
        this.listaE = new ArrayList<Enfermaria>();
    }

    public ArrayList<Enfermaria> getListaE() {
        return listaE;
    }

    public void setListaE(ArrayList<Enfermaria> listaE) {
        this.listaE = listaE;
    }
    
    public void addEnfermaria(Enfermaria e)
    {
        listaE.add(e);
    }
    
    /**
     * Este metodo serve para saber todos as enfermarias em que o doente está internado
     * @param d
     * @return Lista de Enfermarias em que o doente se encontra
     */
    
    public ArrayList<Enfermaria> listaEnfermariaDoente(Doente d)
    {
        ArrayList<Enfermaria> nE = new ArrayList<>();

        for (Enfermaria e : listaE) {
            if (e.getDoentes().existe(d)) {
                nE.add(e);
            }
        }

        return nE;
    }
    
     
    
}
