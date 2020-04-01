/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.util.Calendar;

/**
 *
 * @author pedro
 */
public class Equipamento {
    private int id_Equipamento;
    private String nome;
    private String disponivel;
    private boolean disponivelSim;
    private boolean disponivelNao;
    
    public Equipamento(){
    
    }
    
    public Equipamento(int id_Equipameno, String nome,String disponivel){
        this.id_Equipamento = id_Equipamento;
        this.nome = nome;
        this.disponivel = "Sim"; 
    }
    
    public int getId_Equipamento(){
        return id_Equipamento;
    }
    public String getNome() {
        return nome;
    }
    public String getDisponivel(){
        return disponivel;
    }

    public void setId_Equipamento(int id_Equipamento) {
        this.id_Equipamento = id_Equipamento;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setDisponivel(String disponivel){
        this.disponivel = disponivel;
    }
    
     // Metodos para alterar o estado da tarefa
    public void setDisponivelNaoIniciada(){
        disponivel = "Sim";
    }
    
    public boolean isDisponivelNao(){
        return disponivelNao;
    }
    public void setDisponivelNao(){
        disponivel = "Nao";
    }
    
    public boolean isDisponivelSim(){
        return disponivelSim;
    }
    public void setDisponivelSim(){
        disponivel = "Sim";
    }

}
