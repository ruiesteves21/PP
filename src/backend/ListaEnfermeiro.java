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
public class ListaEnfermeiro implements Serializable {
    private ArrayList<Enfermeiro> listaEnfermeiro;
    
    public ListaEnfermeiro(){
        this.listaEnfermeiro = new ArrayList<Enfermeiro>();
    }
    
    public ArrayList<Enfermeiro> getListaEnfermeiro(){
        return listaEnfermeiro;
    }
    
    public void adicionar(Enfermeiro enfermeiro){
        listaEnfermeiro.add(enfermeiro);
    }
    
    public void remover(Enfermeiro enfermeiro){
        listaEnfermeiro.remove(enfermeiro);
    }
    
    public int tamanho(){
        return listaEnfermeiro.size();
    }
    
}


   