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
public class ListaEquipamento {
    
    private ArrayList<Equipamento> listaEquip;

    public ListaEquipamento()
    {
        this.listaEquip = new ArrayList<Equipamento>();
    }

    public ArrayList<Equipamento> getListaEquip() {
        return listaEquip;
    }

    public void setListaEquip(ArrayList<Equipamento> listaEquip) {
        this.listaEquip = listaEquip;
    }
    
    public void addEquipamento(Equipamento e)
    {
        listaEquip.add(e);
    }
    
    public void removeEquipamento(Equipamento e)
    {
        listaEquip.remove(e);
    }
    
    public int tamanho()
    {
        return listaEquip.size();
    }
    
    public double perDisponivel()
    {
    int contador = 0;
    for (Equipamento e: listaEquip){
        if (e.isDisponivel()){
           contador ++;
        }
    }
    if (listaEquip.size()==0)
    {
        return 0;
    }else{
        return (contador/ listaEquip.size())*100;
    }
    }
    
    public double perIndisponivel()
    {
    int contador = 0;
    for (Equipamento e: listaEquip){
        if (e.isIndisponivel()){
           contador ++;
        }
    }
    if (listaEquip.size()==0)
    {
        return 0;
    }else{
        return (contador/ listaEquip.size())*100;
    }
    }
    
    public String toString()
    {
        return listaEquip.toString();
    }
}
