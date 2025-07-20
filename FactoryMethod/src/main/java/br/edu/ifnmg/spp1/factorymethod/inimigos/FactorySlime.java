/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.spp1.factorymethod.inimigos;

/**
 *
 * @author SamuelParanhos
 */
public class FactorySlime 
        extends FactoryInimigos {

    @Override
    public Inimigo criarInimigos() {
        return new Slime();
    } 
}
