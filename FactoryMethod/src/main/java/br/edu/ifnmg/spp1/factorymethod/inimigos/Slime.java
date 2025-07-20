/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.spp1.factorymethod.inimigos;

/**
 *
 * @author SamuelParanhos
 */
public class Slime 
        extends StatusInimigos
              implements Inimigo {

    public Slime(int nivel, float vida, float defesa, float ataque) {
        super(nivel, vida, defesa, ataque);
    }
  
    @Override
    public void tipoDeInimigo() {
        
        System.out.println("Inimigo do tipo Slime criado");
        
    }
    
}
