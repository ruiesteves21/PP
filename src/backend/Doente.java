/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;
import java.io.Serializable;
/**
 *
 * 
 */

public class Doente implements Serializable
{
    private String idDoente;
    private int nCama;
    private Utilizador utiLigado;
    private String nome;
    private String localidade;
    private String gravidade;
    private String dataNasc;
    private String dataEntrada;
    private String dataSaida;


    /**
     * 
     */
    
    
    public Doente(){   
    }
    
    /**
     * 
     * @param utiLigado
     * @param idDoente
     * @param nome
     * @param localidade
     * @param gravidade
     * @param dataNasc
     * @param dataEntrada
     * @param dataSaida
     * @param nCama 
     */
    public Doente(Utilizador utiLigado, String idDoente, String nome, String localidade, String gravidade, String dataNasc, String dataEntrada, String dataSaida,int nCama) {
        this.utiLigado = utiLigado;
        this.idDoente = idDoente;
        this.nome = nome;
        this.localidade = localidade;
        this.gravidade = gravidade;
        this.dataNasc = dataNasc;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.nCama = nCama;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
    }
    
    //getters
    
    public Utilizador getUtiLigado() {
        return utiLigado;
    }
  
    public String getIdDoente() {
        return idDoente;
    }

    public String getNomeDoente() {
        return nome;
    }

    public String getLocalidade() {
        return localidade;
    }

    public String getGravidade() {
        return gravidade;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public String getDataSaida() {
        return dataSaida;
    }
    
    public int getNCama(){
        return this.nCama;
    }

    
    //setters
    public void setIdDoente(String idDoente) {
        this.idDoente = idDoente;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public void setNCama(int nCama) {
        this.nCama = nCama;
    }

    public void setGravidade(String gravidade) {
        this.gravidade = gravidade;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }
   
    public void setDataEntrada(String dataEntrada){
        this.dataEntrada = dataEntrada;
    }

    public void setDataSaida(String dataSaida){
        this.dataSaida = dataSaida;
    }
    
}
