/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.spp1.factorymethod.inimigos;

/**
 *
 * @author SamuelParanhos
 */
public class Goblin 
        extends StatusInimigos 
        implements Inimigo {
    
   //<editor-fold defaultstate="collapsed" desc="Construtores">
    
    public Goblin(int nivel, float vida, float defesa, float ataque) {
        super(nivel, vida, defesa, ataque);
    }

    public Goblin(int nivel, float vida, float defesa, float ataque, 
            String fraqueza, String resistencias) { 
        super(nivel, vida, defesa, ataque, fraqueza, resistencias);
    }
//</editor-fold>
    
    @Override
    public void tipoDeInimigo() {
        System.out.println("Inimigo do tipo Goblin criado");
    }
    
    
}
