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
    
     public int numVentiladorOcupados(){
       int totalVentOcupados = 0;
       
       for (Equipamento e: listaEquipamento){
           
           if (e.getTipoEquipamento().equals("Ventilador") && e.getIndicacao().equals("Ocupado")){
               totalVentOcupados = totalVentOcupados + 1;
                    }
        }
       
            return totalVentOcupados;
    }
    
    public float perVentiladorOcupados(){
       float totalVentOcupados;
       float totalVentiladores = 0;
       float percentagem;
       float totalEquipamento = listaEquipamento.size();
       
       totalVentOcupados = numVentiladorOcupados();
       
       for (Equipamento e: listaEquipamento){
           
           if (e.getTipoEquipamento().equals("Ventilador") && (e.getIndicacao().equals("Ocupado") || e.getIndicacao().equals("Livre"))){
               totalVentiladores = totalVentiladores + 1;
                    }
        }
    
       percentagem =  (totalVentOcupados / totalVentiladores /*totalEquipamento*/) * 100;
       
       return percentagem;
        
    }
     
    public int numDesfibrilhadorOcupados(){
       int totalDesfOcupados = 0;
       
       for (Equipamento e: listaEquipamento){
           
           if (e.getTipoEquipamento().equals("Desfibrilhador") && e.getIndicacao().equals("Ocupado")){
               totalDesfOcupados ++;
                    }
       }
       
            return totalDesfOcupados;
    }
    
    public float perDesfibrilhadorOcupados(){
        float totalDesfOcupados;
        float totalDesfibrilhador = 0;
        float percentagem;
        float totalEquipamento = listaEquipamento.size();
      
            
        totalDesfOcupados = numDesfibrilhadorOcupados();
        
         for (Equipamento e: listaEquipamento){
           
           if (e.getTipoEquipamento().equals("Desfibrilhador") && (e.getIndicacao().equals("Ocupado") || e.getIndicacao().equals("Livre"))){
               totalDesfibrilhador = totalDesfibrilhador + 1;
                    }
        }
         
        percentagem = (totalDesfOcupados / totalDesfibrilhador /*totalEquipamento*/) * 100;
          
        return percentagem;     
   } 
    
    public int numOutroOcupados(){
       int totalOutOcupados = 0;
       
       for (Equipamento e: listaEquipamento){
           
           if (e.getTipoEquipamento().equals("Outro") && e.getIndicacao().equals("Ocupado")){
               totalOutOcupados ++;
                    }
       }
       
            return totalOutOcupados;
    }
    
     public float perOutroOcupados(){
        float totalOutOcupados;
        float totalOutros = 0;
        float percentagem;
        float totalEquipamento = listaEquipamento.size();
        
        totalOutOcupados = numOutroOcupados();
        
        for (Equipamento e: listaEquipamento){
           
           if (e.getTipoEquipamento().equals("Outro") && (e.getIndicacao().equals("Ocupado") || e.getIndicacao().equals("Livre"))){
               totalOutros = totalOutros + 1;
                    }
        }
        
        percentagem = (totalOutOcupados / totalOutros /*totalEquipamento*/) * 100;
          
        return percentagem;      
   }
    
    @Override
    public String toString()
    {
        return listaEquipamento.toString();
    }
}
