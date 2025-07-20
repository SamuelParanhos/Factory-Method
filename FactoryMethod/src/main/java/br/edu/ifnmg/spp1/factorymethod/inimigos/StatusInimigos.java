/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.spp1.factorymethod.inimigos;

/**
 *
 * @author rdpp
 */
public class StatusInimigos {
    
    private int nivel;
    private float vida;
    private float defesa;
    private float ataque;
    private String frqueza;
    private String resistencias;
    

    public StatusInimigos(int nivel, float vida, float defesa, float ataque, 
            String frqueza, String resistencias) {
        this.nivel = nivel;
        this.vida = vida;
        this.defesa = defesa;
        this.ataque = ataque;
        this.frqueza = frqueza;
        this.resistencias = resistencias;
    }

    public StatusInimigos(int nivel, float vida, float defesa, float ataque) {
        this.nivel = nivel;
        this.vida = vida;
        this.defesa = defesa;
        this.ataque = ataque;
        this.frqueza = null;
        this.resistencias = null;
    }

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
        return frqueza;
    }

    public void setFrqueza(String frqueza) {
        this.frqueza = frqueza;
    }

    public String getResistencias() {
        return resistencias;
    }

    public void setResistencias(String resistencias) {
        this.resistencias = resistencias;
    }  
}
