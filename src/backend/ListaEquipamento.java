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
    
    private ArrayList<Equipamento> listaEquipamento;

    public ListaEquipamento()
    {
        this.listaEquipamento = new ArrayList<Equipamento>();
    }

    public ArrayList<Equipamento> getListaEquipamento() {
        return listaEquipamento;
    }

    public void setListaEquipamento(ArrayList<Equipamento> listaEquipamento) {
        this.listaEquipamento = listaEquipamento;
    }
    
    public void adicionar(Equipamento equipamento)
    {
        listaEquipamento.add(equipamento);
    }
    
    public void remover(Equipamento equipamento)
    {
        listaEquipamento.remove(equipamento);
    }
    
    public int tamanho()
    {
        return listaEquipamento.size();
    }
    
    public boolean existe(Equipamento equipamento)
    {
        return listaEquipamento.contains(equipamento);
    }
    
    public double perDisponivel()
    {
    int contador = 0;
    for (Equipamento equipamento: listaEquipamento){
        if (equipamento.isDisponivel()){
           contador ++;
        }
    }
    if (listaEquipamento.isEmpty())
    {
        return 0;
    }else{
        return (contador/ listaEquipamento.size())*100;
    }
    }
    
    public double perIndisponivel()
    {
    int contador = 0;
    for (Equipamento equipamento: listaEquipamento){
        if (equipamento.isIndisponivel()){
           contador ++;
        }
    }
    if (listaEquipamento.isEmpty())
    {
        return 0;
    }else{
        return (contador/ listaEquipamento.size())*100;
    }
    }
    
    @Override
    public String toString()
    {
        return listaEquipamento.toString();
    }
}
