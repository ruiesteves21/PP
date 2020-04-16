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
    
    private ArrayList<Doente> listaD;
    
    public ListaDoente()
    {
        this.listaD= new ArrayList();
    }
    
    public ArrayList<Doente> getListaD()
    {
        return listaD;
    }
    
    public void setListaD(ArrayList<Doente> listaD)
    {
        this.listaD = listaD;
    }
    
    public void addDoente(Doente d)
    {
        listaD.add(d);
    }
    
    public void removeDoente(Doente d)
    {
        listaD.remove(d);
    }
    
    public int tamanho()
    {
        return listaD.size();
    }
    
    public boolean existe(Doente d)
    {
        return listaD.contains(d);
    }
    
    @Override
    public String toString()
    {
        return listaD.toString();
    }
    
   /*public double perDoenteModerada(){
       int contador = 0;
       for (Doente d: listaD){
           if (d.isGravidadeModerada()){
               contador ++;
           }
       }
       if (listaD.size()==0){
           return 0;
       }else{
         return (contador/ listaD.size())*100;
       }
   }
   
    public double perDoenteGrave(){
       int contador = 0;
       for (Doente d: listaD){
           if (d.isGravidadeGrave()){
               contador ++;
           }
       }
       if (listaD.size()==0){
           return 0;
       }else{
         return (contador/ listaD.size())*100;
       }
   }
   
    public double perDoenteMuitoGrave(){
       int contador = 0;
       for (Doente d: listaD){
           if (d.isGravidadeMuitoGrave()){
               contador ++;
           }
       }
       if (listaD.size()==0){
           return 0;
       }else{
         return (contador/ listaD.size())*100;
       }
   }*/
    
    
    
}
