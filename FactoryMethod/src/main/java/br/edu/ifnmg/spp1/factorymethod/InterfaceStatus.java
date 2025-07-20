/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.spp1.factorymethod;

/**
 *
 * @author SamuelParanhos
 */

//status base das criatures e player, pode adicionado em outras packages
public interface InterfaceStatus {
    
    float getVida();
    void setVida(float vida);
    float getAtaque();
    void setAtaque(float ataque);
    float getDefesa();
    void setDefesa(float defesa);
    int getNivel();
    void setNivel(int nivel);
    String getFraqueza(); 
    void setFraqueza(String fraqueza);
    String getResistencia();
    void setResistencia(String resistencia);
}
