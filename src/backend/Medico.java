/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.util.UUID;

/**
 *
 * @author rodrm
 */
public class Medico extends ProfissionalSaude {
    private String especialidade;
    private String nome;
    private String password;
    private String email;
    private String username;
    private String idMedico;
    private ListaDoente listaDoente; 

    public Medico()
    {
        
    }

    public Medico(String especialidade, String nome, String idMedico, String email) {
        this.especialidade = especialidade;
        this.nome = nome;
        this.idMedico = idMedico;
        this.email = email;
        listaDoente = new ListaDoente();
    }
    
    public Medico (String username, String password, String nome)
    {
        this.username = username;
        this.password = password;
        this.nome = nome;
    }
    
     public static UUID randomUUID(){
        UUID uuid = UUID.randomUUID();
        return uuid;
        }
     
    public ListaDoente getListaDoente() {
        return listaDoente;
    }

    public String getIdMedico() {
        return idMedico;
    }
    
    
    public String getNome() {
        return nome;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
    
    public String getUsername() {
        return username;
    }
    
    public String getEspecialidade() {
        return especialidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public ListaDoente getListaDoentes() {
        return listaDoente;
    }
    
    @Override
    public String toString() {
        return "Medico{" + "especialidade=" + especialidade + ", nome=" + nome + ", password=" + password + ", email=" + email + '}';
    }  
}
