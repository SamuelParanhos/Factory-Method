/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.spp1.factorymethod.inimigos;

/**
 *
 * @author rdpp
 */
public class FactoryOrc
        extends FactoryInimigos {

    @Override
    public Inimigo criarInimigo(int nivel) {
        float vida = 50.0f;
        float defesa = 20.0f;
        float ataque = 18.0f;

        if (nivel > 1) {
            vida = vida * (nivel / 2);
            defesa = defesa + (2 * nivel);
            ataque = ataque + (nivel * 3);
        }
        return new Orc(nivel, vida, defesa, ataque);
    }

}
