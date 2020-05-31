/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.io.Serializable;
import java.util.Calendar;
import java.util.UUID;

/**
 *
 * 
 */
public class Equipamento implements Serializable {
    
    private String idEquip;
    private String indicacao; //livre, ocupado
    private Calendar  dataOcupado;
    private Utilizador utiLigado;
    private String tipoEquipamento;
    private boolean disponivel;
    private boolean indisponivel;
    private String doente;

    public Equipamento() 
    {
        
    }

    public Equipamento(Utilizador utiLigado, String idEquip, String indicacao, String tipoEquipamento, String doente) {
        this.utiLigado = utiLigado;
        this.idEquip = idEquip;
         this.indicacao = indicacao;
        this.tipoEquipamento = tipoEquipamento;
        this.doente = doente;
    }
    
    public static UUID randomUUID(){
        UUID uuid = UUID.randomUUID();
        return uuid;
        }

    public Utilizador getUtiLigado() {
        return utiLigado;
    }
    
    
    public String getDoente() {
        return doente;
    }
    
    public String getTipoEquipamento() {
        return tipoEquipamento;
    }
    
    public String getIdEquip() {
        return idEquip;
    }

    public String getIndicacao() {
        return indicacao;
    }

    public Calendar getDataOcupado() {
        return dataOcupado;
    }
    
    public boolean isDisponivel(){
        return disponivel ;
    }
    
    public boolean isIndisponivel(){
        return indisponivel ;
    }

    public void setIdEquip(String idEquip) {
        this.idEquip = idEquip;
    }
    
    public void setTipoEquipamento(String tipo) {
        this.tipoEquipamento = tipo;
    }
    
    
    public void setIndicacao(String indicacao) {
        this.indicacao = indicacao;
    }
    
    
    public void setDataOcupado(Calendar dataOcupado) {
        this.dataOcupado = dataOcupado;
    }
    
    public void setDoente(String doente) {
        this.doente = doente;
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
        dataOcupado = dt;
    }
    
    @Override
    public String toString() {
        return "Equipamento{" + "idEquip=" + idEquip + ", indicacao=" + indicacao + ", dataOcupado=" + dataOcupado + '}';
    }
}
