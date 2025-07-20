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
    public Inimigo criarInimigo(int nivel) {
        float vida = 10.0f;
        float defesa = 2.5f;
        float ataque = 2.0f;

        if (nivel > 1) {
            vida = vida * (nivel / 2);
            defesa = defesa + (nivel / 2);
            ataque = ataque* (nivel / 2);
        }

        return new Slime(nivel, vida, defesa, ataque);
    }
}
