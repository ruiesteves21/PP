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
    
     private ArrayList<Medico> listaMedico;
     
     public ListaMedico()
    {
        this.listaMedico = new ArrayList<Medico>();
    }

    public ArrayList<Medico> getListaMedico()
    {
        return listaMedico;
    }

    public void setListaMedico(ArrayList<Medico> listaMedico)
    {
        this.listaMedico = listaMedico;
    }

    public void adicionar(Medico medico)
    {
        listaMedico.add(medico);
    }
    
    public void remover(Medico medico)
    {
        listaMedico.remove(medico);
    }
    
     public int tamanho()
    {
        return listaMedico.size();
    }
     
    public boolean existe(Medico medico)
    {
        return listaMedico.contains(medico);
    }

    /**
     * Este metodo serve para saber a posicao de um utilizador na lista
     *
     * @param medico
     * @return index da listaU. Se dado um utilizador que não exite devolve -1
     */
    public int posicao(Medico medico)
    {
        if (medico == null || !this.existe(medico)) {
            return -1; // Caso que o utlizador não é validos
        }
        return listaMedico.indexOf(medico);
    }

    /**
     * Devolve o utilizador com um dado index
     *
     * @param i Index do utilizador na listaU
     * @return Utilizador do index i
     */
    public Medico devolveUtilizador(int i)
    {
        if (i > listaMedico.size() || i < 0) {
            return null;
        }
        return listaMedico.get(i);
    }

    public Medico devolveUtilizador(String nome)
    {
        if (nome == null || nome.equals("")) {
            return null;
        }

        for (Medico medico : listaMedico) {
            if (medico.getNome().equals(nome)) {
                return medico;
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
        for (Medico medico : listaMedico) {
            if (medico.getNome().equals(s)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString()
    {
        String s = "";

        for (Medico medico : listaMedico) {
            s += medico.toString() + "\n";
        }

        return s;
    }
    
}
