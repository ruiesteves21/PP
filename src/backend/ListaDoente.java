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
public class ListaDoente implements Serializable  {
    
    private ArrayList<Doente> listaDoente;
    
    public ListaDoente()
    {
        this.listaDoente= new ArrayList();
    }
    
    public ArrayList<Doente> getListaDoente()
    {
        return listaDoente;
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
    
    public int numDoenteModerado(){
       int totalModerado = 0;
       
       for (Doente doente: listaDoente){
           if (doente.getGravidade().equals("Moderado")){
               totalModerado ++;
           }
       }
       
       return totalModerado;
    }
    
    public float perDoenteModerado(){
       int totalModerado;
       float percentagem;
       float totalDoente = listaDoente.size();
       
       totalModerado = numDoenteModerado();
       
       percentagem = (totalModerado / totalDoente) * 100;
          
       return percentagem;
       
   }
    
    public int numDoenteGrave(){
       int totalGrave = 0;
       
       for (Doente doente: listaDoente){
           if (doente.getGravidade().equals("Grave")){
               totalGrave ++;
           }
       }
       
       return totalGrave;
    }
    
    public float perDoenteGrave(){
       int totalGrave;
       float percentagem;
       float totalDoente = listaDoente.size();
       
       totalGrave = numDoenteGrave();
       
       percentagem = (totalGrave / totalDoente) * 100;
          
       return percentagem;
       
   }
    
    
    public int numDoenteMuitoGrave(){
       int totalMuitoGrave = 0;
       
       for (Doente doente: listaDoente){
           if (doente.getGravidade().equals("Muito Grave")){
               totalMuitoGrave ++;
           }
       }
            return totalMuitoGrave;
    }
    
     public float perDoenteMuitoGrave(){
       int totalMuitoGrave;
       float percentagem;
       float totalDoente = listaDoente.size();
       
       totalMuitoGrave = numDoenteMuitoGrave();
       
       percentagem = (totalMuitoGrave / totalDoente) * 100;
          
       return percentagem;
   }
     
    
    @Override
    public String toString()
    {
        return listaDoente.toString();
    }   
    
}
