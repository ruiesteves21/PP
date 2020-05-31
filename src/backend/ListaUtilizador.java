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
 * 
 */
public class ListaUtilizador implements Serializable {
    private TreeMap<String, Utilizador> listaUtilizador;

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
    
    public ListaUtilizador() {
        listaUtilizador = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);        
    }
    
    public void adicionar(Utilizador utilizador) throws UtilizadorDuplicadoException {
        if (utilizador == null) {
            throw new NullPointerException("O parâmetro 'utilizador' não pode ser um valor nulo");
        }        
        
        if (!listaUtilizador.containsKey(utilizador.getUsername())) {
            listaUtilizador.put(utilizador.getUsername(), utilizador);
        }else{
            throw new UtilizadorDuplicadoException(String.format("O utilizador '%s' já existe na coleção", utilizador.getUsername()));
        } 
    }
   
    
    public boolean existe(String username) {
        return listaUtilizador.containsKey(username);
    }
    
    public int size() {
        return listaUtilizador.size();
    }
    
    public Utilizador getUtilizador(String username) throws UtilizadorNaoExistenteException {
        if (listaUtilizador.containsKey(username)){
            return listaUtilizador.get(username);
        }else{
            throw new UtilizadorNaoExistenteException("O utilizador '%s' já existe na lista");
        }
    }
    
    public ArrayList<Utilizador> todos() {
        return new ArrayList<>(listaUtilizador.values());
    }
}
   
