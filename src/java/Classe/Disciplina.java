package Classe;

import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabri
 */
public class Disciplina implements Serializable{
        private int coddisciplina;
        private String nomeDisciplina;
        private float cargaHoraria;
        private String ementa;
        
        public Disciplina(){
        }

    public int getCoddisciplina() {
        return coddisciplina;
    }

    public void setCoddisciplina(int coddisciplina) {
        this.coddisciplina = coddisciplina;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String Disciplina) throws Exception {
             this.nomeDisciplina = nomeDisciplina;
}

    public float getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(float cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getEmenta() {
        return ementa;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }
        
        
        
}
