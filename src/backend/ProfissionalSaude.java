/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.io.Serializable;
import java.util.UUID;

/**
 *
 * @author rodrm
 */
public class ProfissionalSaude implements Serializable {
    private String idProfSaude;
    private String nomeProfSaude;
    private ListaDoente listaDoente;
    

    public ProfissionalSaude() 
    {
        
    }

    public ProfissionalSaude(String idProfSaude, String nomeProfsaude) {
        this.idProfSaude = idProfSaude;
        this.nomeProfSaude = nomeProfsaude;
        listaDoente = new ListaDoente();
        
    }

     public static UUID randomUUID(){
        UUID uuid = UUID.randomUUID();
        return uuid;
        }
     
    public String getIdProfSaude() {
        return idProfSaude;
    }

    public String getNomePS() {
        return nomeProfSaude;
    }

    public ListaDoente getListaDoente() {
        return listaDoente;
    }
    
    public void setIdProfSaude(String idProfSaude) {
        this.idProfSaude = idProfSaude;
    }

    public void setNomePS(String nomeProfSaude) {
        this.nomeProfSaude = nomeProfSaude;
    }

    @Override
    public String toString() {
        return "ProfissionalSaude{" + "idProfsaude=" + idProfSaude + ", nome=" + nomeProfSaude + '}';
    }
    
    
}
