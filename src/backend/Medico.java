/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

/**
 *
 * @author rodrm
 */
public class Medico {
    private String especialidade;
    private String nome;
    private String password;
    private String email;

    public Medico() {
    }

    public Medico(String especialidade, String nome, String password, String email) {
        this.especialidade = especialidade;
        this.nome = nome;
        this.password = password;
        this.email = email;
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

    @Override
    public String toString() {
        return "Medico{" + "especialidade=" + especialidade + ", nome=" + nome + ", password=" + password + ", email=" + email + '}';
    }
    
}
