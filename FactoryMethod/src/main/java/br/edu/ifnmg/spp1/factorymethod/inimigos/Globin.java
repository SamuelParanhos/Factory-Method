/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.spp1.factorymethod.inimigos;

/**
 *
 * @author rdpp
 */
public class Globin 
        extends StatusInimigos 
        implements Inimigo {

    public Globin(int nivel, float vida, float defesa, float ataque) {
        super(nivel, vida, defesa, ataque);
    }

    @Override
    public void tipoDeInimigo() {
        System.out.println("Inimigo do tipo Globin criado");
    }
    
    
}
