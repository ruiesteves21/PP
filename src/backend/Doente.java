/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
/**
 *
 * @author Rui Esteves
 */

public class Doente implements Serializable
{
    private String idDoente;
    private int nCama;
    private String nome;
    private String localidade;
    private String gravidade;
    private String dataNasc;
    private String dataEntrada;
    private String dataSaida;


    
    public Doente(){   
    }

    public Doente(String idDoente, String nome, String localidade, String gravidade, String dataNasc, String dataEntrada, String dataSaida,int nCama) {
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

    public int getnCama() {
        return nCama;
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

    public void setnCama(int nCama) {
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
    
    
    public void setCama(int nova){
        if(nova>= 1)
            this.nCama = nova;
        else {
            System.out.println("ERRO:Número da cama começa em 1.");
        }
    }
    
    public void setGravidadeMuitoGrave()
    {
       gravidade = "Muito grave";
    }
   
    public void setGravidadeGrave()
    {
       gravidade = "Grave";
    }
    
    public void setGravidadeModerada()
    {
        this.gravidade = "Moderada";
    }

    
    // Metodos para alterar o estado do Doente
    public void setGravidadeNaoRegistada()
    {
        gravidade = "Não Registada";
    }
    
    public boolean isGravidadeModerada(){
        return ("Moderada".equals(this.gravidade)) ;
    }
    
    public boolean isGravidadeGrave(){
        return ("Grave".equals(this.gravidade)) ;
    }
    
    public boolean isGravidadeMuitoGrave(){
         return ("Muito Grave".equals(this.gravidade)) ;
    }
    
    
    /*public void setTeveAlta(String dt){
        this.gravidade = "Teve Alta";
        this.dataSaida = Calendar.getInstance();;
    }*/
    
    @Override
    public String toString() {
        return "Doente{" + "idDoente=" + idDoente + ", nome=" + nome + ", localidade=" + localidade + ", data de nascimento=" + dataNasc + ", gravidade=" + gravidade + ", dataEntrada=" + dataEntrada + ", dataSaida=" + dataSaida + ", nCama =" + nCama + '}';
    }
    
    
}
