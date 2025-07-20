/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.spp1.factorymethod.inimigos;

import br.edu.ifnmg.spp1.factorymethod.InterfaceStatus;

/**
 *
 * @author SamuelParanhos
 */
//SuperClass para status base dos inimigos
public class StatusInimigos
        implements InterfaceStatus {

    private int nivel;
    private float vida;
    private float defesa;
    private float ataque;
    private String fraqueza;
    private String resistencia;

    //<editor-fold defaultstate="collapsed" desc="Construtores">
    public StatusInimigos(int nivel, float vida, float defesa, float ataque,
            String frqueza, String resistencias) {
        this.nivel = nivel;
        this.vida = vida;
        this.defesa = defesa;
        this.ataque = ataque;
        this.fraqueza = frqueza;
        this.resistencia = resistencias;
    }

    public StatusInimigos(int nivel, float vida, float defesa, float ataque) {
        this.nivel = nivel;
        this.vida = vida;
        this.defesa = defesa;
        this.ataque = ataque;
        this.fraqueza = null;
        this.resistencia = null;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    @Override
    public int getNivel() {
        return nivel;
    }

    @Override
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public float getVida() {
        return vida;
    }

    @Override
    public void setVida(float vida) {
        this.vida = vida;
    }

    @Override
    public float getDefesa() {
        return defesa;
    }

    @Override
    public void setDefesa(float defesa) {
        this.defesa = defesa;
    }

    @Override
    public float getAtaque() {
        return ataque;
    }

    @Override
    public void setAtaque(float ataque) {
        this.ataque = ataque;
    }

    @Override
    public String getFraqueza() {
        return fraqueza;
    }

    @Override
    public void setFraqueza(String fraqueza) {
        this.fraqueza = fraqueza;
    }

    @Override
    public String getResistencia() {
        return resistencia;
    }

    @Override
    public void setResistencia(String resistencia) {
        this.resistencia = resistencia;
    }
//</editor-fold>
}
