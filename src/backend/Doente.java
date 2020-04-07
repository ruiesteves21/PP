/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;
import java.time.LocalDate;
import java.util.Calendar;
/**
 *
 * @author Rui Esteves
 */
public class Doente {
    private int idDoente;
    private int nCama;
    private String nome;
    private String localidade;
    private String gravidade;
    private String enfermaria;
    private LocalDate dataEntrada;
    private LocalDate dataSaida;

    
    public Doente(){   
    }

    public Doente(int idDoente, String nome, String localidade, LocalDate dataEntrada, LocalDate dataSaida,String enfermaria,int nCama) {
        this.idDoente = idDoente;
        this.nome = nome;
        this.localidade = localidade;
        this.gravidade = gravidade;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.nCama = nCama;
        this.enfermaria = enfermaria;
        this.dataEntrada = LocalDate.now();
        this.dataSaida = LocalDate.now(); 
    }
    
    //getters
    public int getIdDoente() {
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

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public LocalDate getDataSaida() {
        return dataSaida;
    }
    
    //setters
    public void setIdDoente(int idDoente) {
        this.idDoente = idDoente;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }
   
    public void setDataEntrada(LocalDate dataEntrada){
        this.dataEntrada = dataEntrada;
    }

    public void setDataSaida(LocalDate dataSaida){
        this.dataSaida = dataSaida;
    }
    
    public void setEnfermaria(String enf){
        this.enfermaria = enf;
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
    
    //getters
    
    public String getEnfermaria(){
        return this.enfermaria;
    }
    
    public int getNCama(){
        return this.nCama;
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
    
    
    public void setTeveAlta(Calendar dt){
        this.gravidade = "Teve Alta";
        this.dataSaida = LocalDate.now();
    }
    
    @Override
    public String toString() {
        return "Doente{" + "idDoente=" + idDoente + ", nome=" + nome + ", localidade=" + localidade + ", gravidade=" + gravidade + ", dataEntrada=" + dataEntrada + ", dataSaida=" + dataSaida + ", enfermaria=" + enfermaria + ", nCama =" + nCama + '}';
    }
    
    
    
}
