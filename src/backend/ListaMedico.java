/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.TreeMap;

/**
 *
 * @author rodrm
 */
public class ListaMedico implements Serializable {
    private TreeMap<String, Medico> listaMedico;

    public class UtilizadorNaoExistenteException extends Exception {
        public UtilizadorNaoExistenteException() { }
        public UtilizadorNaoExistenteException(String message) {
            super(message);
        }        
    }
    
    public class UtilizadorDuplicadoException extends Exception {
        public UtilizadorDuplicadoException() { }
        public UtilizadorDuplicadoException(String message) {
            super(message);
        }        
    }
    
    public ListaMedico() {
        listaMedico = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);        
    }
    
    public void adicionar(Medico medico) throws UtilizadorDuplicadoException {
        if (medico == null) {
            throw new NullPointerException("O parâmetro 'utilizador' não pode ser um valor nulo");
        }        
        
        if (!listaMedico.containsKey(medico.getUsername())) {
            listaMedico.put(medico.getUsername(), medico);
        }else{
            throw new UtilizadorDuplicadoException(String.format("O utilizador '%s' já existe na coleção", medico.getUsername()));
        } 
    }
   
    public void adicionarMedico(Medico medico) {
        
         if (medico == null) {
            throw new NullPointerException("O parâmetro 'medico' não pode ser um valor nulo");
        }   
         
        if(!listaMedico.containsKey(medico.getIdMedico())) {
            listaMedico.put(medico.getIdMedico(), medico);
        } else {
            throw new RuntimeException("Este medico já se encontra registado");
        }
    }
    
    public boolean existe(String username) {
        return listaMedico.containsKey(username);
    }
    
    public int size() {
        return listaMedico.size();
    }
    
    public Medico getMedico(String username) throws UtilizadorNaoExistenteException {
        if (listaMedico.containsKey(username)){
            return listaMedico.get(username);
        }else{
            throw new UtilizadorNaoExistenteException("O utilizador '%s' já existe na lista");
        }
    }
    
    public ArrayList<Medico> todos() {
        return new ArrayList<>(listaMedico.values());
    }
}
   
