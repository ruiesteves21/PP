/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.io.Serializable;
import java.util.Calendar;

/**
 *
 * @author Rui Esteves
 */
public class Equipamento implements Serializable {
    
    private int idEquip;
    private String indicacao; //livre, ocupado
    private Calendar  dataOcupado;
    private boolean disponivel;
    private boolean indisponivel;
    
    public Equipamento() 
    {
        
    }

    public Equipamento(int idEquip) {
        this.idEquip = idEquip;
        this.indicacao = "Não iniciado";
    }

    public int getIdEquip() {
        return idEquip;
    }

    public String getIndicacao() {
        return indicacao;
    }

    public Calendar getData_ocupado() {
        return dataOcupado;
    }
    

    public void setIdEquip(int idEquip) {
        this.idEquip = idEquip;
    }

    public void setIndicacao(String indicacao) {
        this.indicacao = indicacao;
    }

    public void setDataOcupado(Calendar dataOcupado) {
        this.dataOcupado = dataOcupado;
    }
    
    
    // Metodos para alterar o estado da tarefa
    public void setIndicacaoNaoIniciada()
    {
        indicacao = "Não iníciada";
    }

    public void setIndicacaoLivre()
    {
        indicacao = "Livre";
    }
    
    public boolean isDisponivel(){
        return disponivel ;
    }

    public void setIndicacaoOcupada(Calendar dt)
    {
       indicacao = "Ocupada";
        dataOcupado = dt;
    }
    
    public boolean isIndisponivel(){
        return indisponivel ;
    }


    @Override
    public String toString() {
        return "Equipamento{" + "idEquip=" + idEquip + ", indicacao=" + indicacao + ", dataOcupado=" + dataOcupado + '}';
    }
}
