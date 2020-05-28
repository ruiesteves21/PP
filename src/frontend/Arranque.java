/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import backend.Administrador;
import backend.Utilizador;
import backend.Sistema;
import backend.ListaUtilizador;
import backend.Serializacao;

/**
 *
 * @author rodrm
 */
public class Arranque {
    
    public static void main(String[] args) throws ListaUtilizador.UtilizadorDuplicadoException 
    {
        Sistema sistema;        
        String ficheiroDados = String.format("%s\\utilizadores.data", System.getProperty("user.dir"));
        System.out.println(String.format("Ficheiro de dados: %s.", ficheiroDados));
        Serializacao bd = new Serializacao(ficheiroDados);        
        
        //Se o ficheiro de base de dados nao existir
        if (! bd.getFicheiro().exists()) {
            //Cria uma instancia do sistema
            sistema = new Sistema();      
            //Adiciona dois utilizadores para que possa ser possivel entrar no sistema
            sistema.getListaUtilizador().adicionar(new Administrador("admin","admin", "Aministrador"));
            sistema.getListaUtilizador().adicionar(new Utilizador("user1", "1234", "Utilizador 1"));                    
        }else{
            sistema = bd.lerSistema();            
        }                 
        
        //Uma vez que a JanelaLogin é modal, este método irá bloquear até que a janela seja fechada.
        //A janela só fecha quando os dados de login são válidos.                
        LoginForm login = new LoginForm(sistema, bd);               
        login.setVisible(true);
        
    }
}
