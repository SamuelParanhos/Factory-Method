/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.spp1.factorymethod.inimigos;

/**
 *
 * @author SamuelParanhos
 */

//SuperClass para status base dos inimigos
public class StatusInimigos {
    
    private int nivel;
    private float vida;
    private float defesa;
    private float ataque;
    private String fraqueza;
    private String resistencias;
    
    //<editor-fold defaultstate="collapsed" desc="Construtores">
    
  
        
    public StatusInimigos(int nivel, float vida, float defesa, float ataque, 
            String frqueza, String resistencias) {
        this.nivel = nivel;
        this.vida = vida;
        this.defesa = defesa;
        this.ataque = ataque;
        this.fraqueza = frqueza;
        this.resistencias = resistencias;
    }

    public StatusInimigos(int nivel, float vida, float defesa, float ataque) {
        this.nivel = nivel;
        this.vida = vida;
        this.defesa = defesa;
        this.ataque = ataque;
        this.fraqueza = null;
        this.resistencias = null;
    }
//</editor-fold>

    
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    
    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public float getVida() {
        return vida;
    }

    public void setVida(float vida) {
        this.vida = vida;
    }

    public float getDefesa() {
        return defesa;
    }

    public void setDefesa(float defesa) {
        this.defesa = defesa;
    }

    public float getAtaque() {
        return ataque;
    }

    public void setAtaque(float ataque) {
        this.ataque = ataque;
    }

    public String getFrqueza() {
        return fraqueza;
    }

    public void setFrqueza(String frqueza) {
        this.fraqueza = frqueza;
    }

    public String getResistencias() {
        return resistencias;
    }

    public void setResistencias(String resistencias) {
        this.resistencias = resistencias;
    }  
//</editor-fold>
}
