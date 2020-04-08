/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import backend.Sistema;

/**
 *
 * @author rodrm
 */
public class Arranque {
    private Sistema sis;
    private static boolean gravou;

    public static void setGravou(boolean g)
    {
        gravou = g;
    }

    public static boolean getGravou()
    {
        return gravou;
    }

    public static void main(String[] args)
    {
        Sistema sis = new Sistema();
        sis = (Sistema) sis.lerSistema();
        gravou = true;
        LoginForm login = new LoginForm(sis);
        login.setVisible(true);
    }
}
