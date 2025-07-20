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
    public Inimigo criarInimigos(int nivel) {
        float vidabase = 10.0f;
        float defesabase = 2.0f;
        float ataquebase = 2.0f;
        
        vidabase = vidabase * (nivel / 2);
        defesabase = defesabase + (nivel / 2);
        ataquebase = ataquebase * (nivel / 2);
        
        return new Slime(nivel,vidabase,defesabase,ataquebase);
    } 
}
