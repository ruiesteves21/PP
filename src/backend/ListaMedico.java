/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.util.ArrayList;

/**
 *
 * @author rodrm
 */
public class ListaMedico {
    
     private ArrayList<Medico> listaM;
     
     public ListaMedico()
    {
        this.listaM = new ArrayList<Medico>();
    }

    public ArrayList<Medico> getListaM()
    {
        return listaM;
    }

    public void setListaM(ArrayList<Medico> listaM)
    {
        this.listaM = listaM;
    }

    public void addUtilizador(Medico m)
    {
        listaM.add(m);
    }
    
    public boolean existe(Medico m)
    {
        return listaM.contains(m);
    }

    /**
     * Este metodo serve para saber a posicao de um utilizador na lista
     *
     * @param m
     * @return index da listaU. Se dado um utilizador que não exite devolve -1
     */
    public int posicao(Medico m)
    {
        if (m == null || !this.existe(m)) {
            return -1; // Caso que o utlizador não é validos
        }
        return listaM.indexOf(m);
    }

    /**
     * Devolve o utilizador com um dado index
     *
     * @param i Index do utilizador na listaU
     * @return Utilizador do index i
     */
    public Medico devolveUtilizador(int i)
    {
        if (i > listaM.size() || i < 0) {
            return null;
        }
        return listaM.get(i);
    }

    public Medico devolveUtilizador(String nome)
    {
        if (nome == null || nome.equals("")) {
            return null;
        }

        for (Medico m : listaM) {
            if (m.getNome().equals(nome)) {
                return m;
            }
        }
        // Caso em que não há utilizador com o mesmo nome
        return null;
    }

    /**
     * Este metodo server para verficar se existe um utilizador com o mesmo nome
     *
     * @param s
     * @return true se exitir
     */
    public boolean verficarMesmoNome(String s)
    {
        for (Medico m : listaM) {
            if (m.getNome().equals(s)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString()
    {
        String s = "";

        for (Medico m : listaM) {
            s += m.toString() + "\n";
        }

        return s;
    }
    
}
