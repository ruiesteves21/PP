/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.util.ArrayList;
import java.util.Calendar;


/**
 *
 * @author Rui Esteves
 */
public class ListaDoente implements java.io.Serializable  {
    
    private ArrayList<Doente> listaDoente;
    
    public ListaDoente()
    {
        this.listaDoente= new ArrayList();
    }
    
    public ArrayList<Doente> getListaDoente()
    {
        return listaDoente;
    }
    
    public void setListaDoente(ArrayList<Doente> listaDoente)
    {
        this.listaDoente = listaDoente;
    }
    
    public void adicionar(Doente doente)
    {
        listaDoente.add(doente);
    }
    
    public void remover(Doente doente)
    {
        listaDoente.remove(doente);
    }
    
    public int tamanho()
    {
        return listaDoente.size();
    }
    
    public boolean existe(Doente doente)
    {
        return listaDoente.contains(doente);
    }
    
    @Override
    public String toString()
    {
        return listaDoente.toString();
    }
    
   /*public double perDoenteModerada(){
       int contador = 0;
       for (Doente d: listaDoente){
           if (d.isGravidadeModerada()){
               contador ++;
           }
       }
       if (listaDoente.size()==0){
           return 0;
       }else{
         return (contador/ listaDoente.size())*100;
       }
   }
   
    public double perDoenteGrave(){
       int contador = 0;
       for (Doente d: listaDoente){
           if (d.isGravidadeGrave()){
               contador ++;
           }
       }
       if (listaDoente.size()==0){
           return 0;
       }else{
         return (contador/ listaDoente.size())*100;
       }
   }
   
    public double perDoenteMuitoGrave(){
       int contador = 0;
       for (Doente d: listaDoente){
           if (d.isGravidadeMuitoGrave()){
               contador ++;
           }
       }
       if (listaDoente.size()==0){
           return 0;
       }else{
         return (contador/ listaDoente.size())*100;
       }
   }*/
    
    
    
}
