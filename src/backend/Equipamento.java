/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.util.Calendar;

/**
 *
 * @author rodrm
 */
public class Equipamento {
    private int id_Equip;
    private String indicacao; //livre, ocupado
    private Calendar data_ocupado;
    
    public Equipamento() 
    {
        
    }

    public Equipamento(int id_Equip) {
        this.id_Equip = id_Equip;
        this.indicacao = "Não iniciado";
    }

    public int getId_Equip() {
        return id_Equip;
    }

    public String getIndicacao() {
        return indicacao;
    }

    public Calendar getData_ocupado() {
        return data_ocupado;
    }
    

    public void setId_Equip(int id_Equip) {
        this.id_Equip = id_Equip;
    }

    public void setIndicacao(String indicacao) {
        this.indicacao = indicacao;
    }

    public void setData_ocupado(Calendar data_ocupado) {
        this.data_ocupado = data_ocupado;
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

    public void setIndicacaoOcupada(Calendar dt)
    {
       indicacao = "Ocupada";
        data_ocupado = dt;

    }

    @Override
    public String toString() {
        return "Equipamento{" + "id_Equip=" + id_Equip + ", indicacao=" + indicacao + ", data_ocupado=" + data_ocupado + '}';
    }
    
}

