/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;

/**
 *
 * @author pedro
 */
public class ListaEquipamento implements java.io.Serializable {
    private ArrayList<Equipamento> listaE;
    public ListaEquipamento(){
        this.listaE= new ArrayList();     
    }
    
    public ArrayList<Equipamento> getListaE(){
        return listaE;
    }
    
    public void setListaE(ArrayList<Equipamento> listaE){
        this.listaE = listaE;
    }
    
    public void addEquipamento(Equipamento e){
        listaE.add(e);
    }
    
    public void removeEquipamento(Equipamento e){
        listaE.remove(e);
    }
    
    public int tamanho(){
        return listaE.size();
    }
    
    public String toString(){
        return listaE.toString();
    }
    
    public double perDisponivelSim(){
    int contador = 0;
    for (Equipamento e: listaE){
        if (e.isDisponivelSim()){
           contador ++;
        }
    }
    if (listaE.size()==0){
        return 0;
    }else{
        return (contador/ listaE.size())*100;
    }
    }
    
    public double perDisponivelNao(){
    int contador = 0;
    for (Equipamento e: listaE){
        if (e.isDisponivelNao()){
           contador ++;
        }
    }
    if (listaE.size()==0){
        return 0;
    }else{
        return (contador/ listaE.size())*100;
    }
    }
   
}
