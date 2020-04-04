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
public class Doente {
    private int idDoente;
    private String nome;
    private String localidade;
    private String gravidade;
    private boolean gravidadeModerada; 
    private boolean gravidadeGrave;
    private boolean gravidadeMuitoGrave;
    private Calendar dataEntrada;
    private Calendar dataSaida;
    
    public Doente()
    {
        
    }

    public Doente(int idDoente, String nome, String localidade, Calendar dataEntrada, Calendar dataSaida) {
        this.idDoente = idDoente;
        this.nome = nome;
        this.localidade = localidade;
        this.gravidade = "Não iniciada";
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
    }
    
    
    public int getId_Doente() {
        return idDoente;
    }

    public String getNome() {
        return nome;
    }

    public String getLocalidade() {
        return localidade;
    }

    public String getGravidade() {
        return gravidade;
    }

    public Calendar getDataEntrada() {
        return dataEntrada;
    }

    public Calendar getDataSaida() {
        return dataSaida;
    }

    public void setId_Doente(int idDoente) {
        this.idDoente = idDoente;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public void setGravidade(String gravidade) {
        this.gravidade = gravidade;
    }

    public void setData_entrada(Calendar dataEntrada){
        this.dataEntrada = dataEntrada;
    }

    public void setData_saida(Calendar dataSaida){
        this.dataSaida =dataSaida;
    }
    
    // Metodos para alterar o estado da tarefa
    public void setGravidadeNaoIniciada()
    {
        gravidade = "Não iníciada";
    }
    
    public boolean isGravidadeModerada(){
        return gravidadeModerada ;
    }

    public void setGravidadeModerada()
    {
        gravidade = "Moderada";
    }
    
    public boolean isGravidadeGrave(){
        return gravidadeGrave ;
    }

    public void setGravidadeGrave()
    {
       gravidade = "Grave";
    }
    
    public boolean isGravidadeMuitoGrave(){
        return gravidadeMuitoGrave ;
    }
    
    public void setGravidadeMuitoGrave()
    {
       gravidade = "Muito grave";
    }
    
    @Override
    public String toString() {
        return "Doente{" + "idDoente=" + idDoente + ", nome=" + nome + ", localidade=" + localidade + ", gravidade=" + gravidade + ", dataEntrada=" + dataEntrada + ", dataSaida=" + dataSaida + '}';
    }
    
    
    
}
