/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Rui Esteves
 */
public class ListaProfissionalSaude implements Serializable {
    private ArrayList<ProfissionalSaude> listaProfissionalSaude;
    
    public ListaProfissionalSaude(){
        this.listaProfissionalSaude = new ArrayList<ProfissionalSaude>();
    }
    
    public ArrayList<ProfissionalSaude> getListaProfissionalSaude(){
        return listaProfissionalSaude;
    }
    
    public void setListaProfissionalSaude(ArrayList<ProfissionalSaude> listaProfissionalSaude){
        this.listaProfissionalSaude = listaProfissionalSaude;
    }
    
    public void adicionar(ProfissionalSaude profissionalSaude){
        listaProfissionalSaude.add(profissionalSaude);
    }
    
    public void remover(ProfissionalSaude profissionalSaude){
        listaProfissionalSaude.remove(profissionalSaude);
    }
    
    public int tamanho(){
        return listaProfissionalSaude.size();
    }
    
      @Override
    public String toString()
    {
        String s = "";

        for (ProfissionalSaude profissionalSaude : listaProfissionalSaude) {
            s += profissionalSaude.toString() + "\n";
        }

        return s;
    }
    
    
}


   