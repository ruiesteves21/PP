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
public class ListaEquipamento implements Serializable {
    
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
    
     public double numVentiladorOcupados(){
       int totalVentOcupados = 0;
       
       for (Equipamento e: listaEquipamento){
           
           if (e.getTipoEquipamento().equals("Ventilador") && e.getIndicacao().equals("Ocupado")){
               totalVentOcupados ++;
                    }
        }
       
            return totalVentOcupados;
    }
    
    public double perVentiladorOcupados(){
       int totalVentOcupados = 0;
       
       for (Equipamento e: listaEquipamento){
           
           if (e.getTipoEquipamento().equals("Ventilador") && e.getIndicacao().equals("Ocupado")){
               totalVentOcupados ++;
                    }
        }
            // totalVentOcupados = listaEquipamento.stream().filter((e) -> (e.getTipoEquipamento().equals("Ventilador") && e.getIndicacao().equals("Ocupado"))).map((_item) -> 1).reduce(totalVentOcupados, Integer::sum);
            
       if (listaEquipamento.isEmpty()){
           return 0;
           
       } else{
           
          double percentagem = (totalVentOcupados / listaEquipamento.size()) * 100;
          
          return percentagem;
       }
   } 
     
    public double numDesfibrilhadorOcupados(){
       int totalDesfOcupados = 0;
       
       for (Equipamento e: listaEquipamento){
           
           if (e.getTipoEquipamento().equals("Desfibrilhador") && e.getIndicacao().equals("Ocupado")){
               totalDesfOcupados ++;
                    }
       }
       
            return totalDesfOcupados;
    }
    
    public double perDesfibrilhadorOcupados(){
        int totalDesfOcupados = 0;
        
       for (Equipamento e: listaEquipamento){
           
           if (e.getTipoEquipamento().equals("Desfibrilhador") && e.getIndicacao().equals("Ocupado")){
               totalDesfOcupados ++;
                    }
       }
            
       if (listaEquipamento.isEmpty()){
           return 0;
           
       } else{
           
          double percentagem = (totalDesfOcupados / listaEquipamento.size()) * 100;
          
          return percentagem;
       }
   } 
    
    public double numOutroOcupados(){
       int totalOutOcupados = 0;
       
       for (Equipamento e: listaEquipamento){
           
           if (e.getTipoEquipamento().equals("Outro") && e.getIndicacao().equals("Ocupado")){
               totalOutOcupados ++;
                    }
       }
       
            return totalOutOcupados;
    }
    
     public double perOutroOcupados(){
        int totalOutOcupados = 0;
       
       for (Equipamento e: listaEquipamento){
           
           if (e.getTipoEquipamento().equals("Outro") && e.getIndicacao().equals("Ocupado")){
               totalOutOcupados ++;
                    }
       }
            
       if (listaEquipamento.isEmpty()){
           return 0;
           
       } else{
           
          double percentagem = (totalOutOcupados / listaEquipamento.size()) * 100;
          
          return percentagem;
       }
   }
    
    public Equipamento getEquipamento(String id) {
            if (listaEquipamento.contains(id)){
                return listaEquipamento.get(Integer.parseInt(id));
                //convertemos id em int porque definimos assim quando definimos a arraylist
        } else{
            throw new RuntimeException("O hospital já existe na lista");
        }
    }
    @Override
    public String toString()
    {
        return listaEquipamento.toString();
    }
}
