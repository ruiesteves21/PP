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
    private Utilizador utiLigado;
    private String tipoEquipamento;
    private String doente;
    
    /**
     * 
     */
    public Equipamento() 
    {
        
    }
    
    /**
     * 
     * @param utiLigado
     * @param idEquip
     * @param indicacao
     * @param tipoEquipamento
     * @param doente 
     */
    public Equipamento(Utilizador utiLigado, String idEquip, String indicacao, String tipoEquipamento, String doente) {
        this.utiLigado = utiLigado;
        this.idEquip = idEquip;
         this.indicacao = indicacao;
        this.tipoEquipamento = tipoEquipamento;
        this.doente = doente;
    }
      
    //getters
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
    
    //setters
    public void setIdEquip(String idEquip) {
        this.idEquip = idEquip;
    }
    
    public void setTipoEquipamento(String tipo) {
        this.tipoEquipamento = tipo;
    }
    
    
    public void setIndicacao(String indicacao) {
        this.indicacao = indicacao;
    }
    
    public void setDoente(String doente) {
        this.doente = doente;
    }
    
   public static UUID randomUUID(){
        UUID uuid = UUID.randomUUID();
        return uuid;
        }
}
