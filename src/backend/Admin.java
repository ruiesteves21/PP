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
    private String nomeAdmin;
    private String passwordAdmin;
    private String emailAdmin;

    public Admin() {
    }
    
     public Admin(String nomeAdmin, String passwordAdmin, String emailAdmin) {
        this.nomeAdmin = nomeAdmin;
        this.passwordAdmin = passwordAdmin;
        this.emailAdmin = emailAdmin;
    }

    
    public void setNomeAdmin(String nomeAdmin){
        this.nomeAdmin = nomeAdmin;
    }
    
    public void setPasswordAdmin(String passwordAdmin){
        this.passwordAdmin = passwordAdmin;
    }
    
    public void setEmailAdmin(String emailAdmin){
        this.emailAdmin = emailAdmin;
    }
    
    public String getNomeAdmin(){
        return nomeAdmin;
    }
    
    public String getPasswordAdmin(){
        return passwordAdmin;
    }
    
    public String getEmailAdmin(){
        return emailAdmin;
    }
    
    
    @Override
    public String toString() {
        return "Admin{" + ", nome=" + nomeAdmin + ", password=" + passwordAdmin + ", email=" + emailAdmin + '}';
    }
    
    
    
    }
