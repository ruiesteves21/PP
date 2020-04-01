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
    private int id_Doente;
    private String nome;
    private String localidade;
    private String gravidade;
    private boolean gravidadeModerada; 
    private boolean gravidadeGrave;
    private boolean gravidadeMuitoGrave;
    private Calendar data_entrada;
    private Calendar data_saida;
    
    public Doente()
    {
        
    }

    public Doente(int id_Doente, String nome, String localidade, Calendar data_entrada, Calendar data_saida) {
        this.id_Doente = id_Doente;
        this.nome = nome;
        this.localidade = localidade;
        this.gravidade = "Não iniciada";
        this.data_entrada = data_entrada;
        this.data_saida = data_saida;
    }
    
    
    public int getId_Doente() {
        return id_Doente;
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

    public Calendar getData_entrada() {
        return data_entrada;
    }

    public Calendar getData_saida() {
        return data_saida;
    }

    public void setId_Doente(int id_Doente) {
        this.id_Doente = id_Doente;
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

    public void setData_entrada(Calendar data_entrada) {
        this.data_entrada = data_entrada;
    }

    public void setData_saida(Calendar data_saida) {
        this.data_saida = data_saida;
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
        return "Doente{" + "id_Doente=" + id_Doente + ", nome=" + nome + ", localidade=" + localidade + ", gravidade=" + gravidade + ", data_entrada=" + data_entrada + ", data_saida=" + data_saida + '}';
    }
    
    
    
}
