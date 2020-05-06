/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.io.Serializable;

/**
 *
 * @author rodrm,RuiEsteves
 */
public class ProfissionalSaude implements Serializable {
    private int idProfSaude;
    private String nomeProfSaude;
    private int idHospital;
    private int idEnfermaria;
    private String especialidade;
    private String funcao; //medico ou enfermeiro 


    public ProfissionalSaude() 
    {
        
    }

    public ProfissionalSaude(String nomeProfsaude,int idHospital,int idEnfermaria,String especialidade,String funcao) {
       // this.idProfSaude = idProfSaude;
        this.nomeProfSaude = nomeProfsaude;
        this.idHospital = idHospital;
        this.idEnfermaria = idEnfermaria;
        this.funcao = funcao;
        this.especialidade = especialidade;
    }

    public int getIdHospital() {
        return idHospital;
    }

    public void setIdHospital(int idHospital) {
        this.idHospital = idHospital;
    }

    public int getIdEnfermaria() {
        return idEnfermaria;
    }

    public void setIdEnfermaria(int idEnfermaria) {
        this.idEnfermaria = idEnfermaria;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
    public int getIdProfSaude() {
        return idProfSaude;
    }

    public String getNomePS() {
        return nomeProfSaude;
    }

    public void setIdProfSaude(int idProfSaude) {
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
