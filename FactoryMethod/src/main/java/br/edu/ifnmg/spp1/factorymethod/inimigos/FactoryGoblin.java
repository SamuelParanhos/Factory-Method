/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.spp1.factorymethod.inimigos;

/**
 *
 * @author SamuelParanhos
 */
public class FactoryGoblin
        extends FactoryInimigos {

    @Override
    public Inimigo criarInimigo(int nivel) {
        float vida = 20.0f;
        float defesa = 1.0f;
        float ataque = 10.0f;

        if (nivel > 1) {
            vida = vida * (nivel / 2);
            defesa = nivel;
            ataque = ataque + (nivel * 2);
        }

        return new Goblin(nivel, vida, defesa, ataque);

    }

}
