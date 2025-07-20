/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.spp1.factorymethod.inimigos;

/**
 *
 * @author SamuelParanhos
 */
public class Globin 
        extends StatusInimigos 
        implements Inimigo {
    
   //<editor-fold defaultstate="collapsed" desc="Construtores">
    
    public Globin(int nivel, float vida, float defesa, float ataque) {
        super(nivel, vida, defesa, ataque);
    }

    public Globin(int nivel, float vida, float defesa, float ataque, 
            String frqueza, String resistencias) { 
        super(nivel, vida, defesa, ataque, frqueza, resistencias);
    }
    
    public Globin(){
        super(5,20.0f,5.5f,12.5f);
    }
//</editor-fold>
    
    @Override
    public void tipoDeInimigo() {
        System.out.println("Inimigo do tipo Globin criado");
    }
    
    
}
