/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Calendar;
/**
 *
 * @author Rui Esteves
 */

public class Doente implements Serializable
{
    private int idDoente;
    private int nCama;
    private String nome;
    private String localidade;
    private String gravidade;
    private LocalDate dataNasc;
    private String enfermaria;
    private LocalDate dataEntrada;
    private LocalDate dataSaida;
    private String medico;

    
    public Doente(){   
    }

    public Doente(int idDoente, String nome, String localidade, String gravidade, LocalDate dataNasc, LocalDate dataEntrada, LocalDate dataSaida,int nCama, String enfermaria, String medico) {
        this.idDoente = idDoente;
        this.nome = nome;
        this.localidade = localidade;
        this.gravidade = gravidade;
        this.dataNasc = dataNasc;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.nCama = nCama;
        this.enfermaria = enfermaria;
        this.dataEntrada = LocalDate.now();
        this.dataSaida = LocalDate.now();
        this.medico = medico;
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

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public int getnCama() {
        return nCama;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public LocalDate getDataSaida() {
        return dataSaida;
    }
    
    public String getEnfermaria(){
        return this.enfermaria;
    }
    
    public int getNCama(){
        return this.nCama;
    }

    public String getMedico() {
        return medico;
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

    public void setnCama(int nCama) {
        this.nCama = nCama;
    }

    public void setGravidade(String gravidade) {
        this.gravidade = gravidade;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
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

    public void setMedico(String medico) {
        this.medico = medico;
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

    public ListaDoente getListaDoente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
