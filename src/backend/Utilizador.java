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
public class Utilizador implements Serializable {
    private String nome;
    private String password;    
    private String username; 
    
    /**
     * 
     */
    public Utilizador()
    {
        
    }
    
    /**
     * 
     * @param username
     * @param password
     * @param nome 
     */
    public Utilizador (String username, String password, String nome)
    {
        this.username = username;
        this.password = password;
        this.nome = nome;    
    }

    //getters
    public String getNome() {
        return nome;
    }

    public String getPassword() {
        return password;
    }
      
    public String getUsername() {
        return username;
    }
        
    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPassword(String password) {
        this.password = password;
    }
   
    public void setUsername(String username) {
        this.username = username;
    }
  
}
