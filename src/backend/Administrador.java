/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.io.Serializable;

/**
 *
 * @author Rui Esteves
 */
public class Administrador extends Medico implements Serializable  {

    public Administrador() {
    }

    public Administrador(String username, String password, String nome) {
        super(username, password, nome);
    }

}
