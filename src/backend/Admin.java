/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

/**
 *
 * @author Rui Esteves
 */
public class Admin extends Medico  {
    private String nome;
    private String password;
    private String email;

    public Admin() {
    }
    
     public Admin(String nome, String password, String email) {
        this.nome = nome;
        this.password = password;
        this.email = email;
       
    }

    @Override
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getPassword(){
        return password;
    }
    
    public String getEmail(){
        return email;
    }
    
    
    @Override
    public String toString() {
        return "Admin{" + ", nome=" + nome + ", password=" + password + ", email=" + email + '}';
    }
    
    
    
    }
