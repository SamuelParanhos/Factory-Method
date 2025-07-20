/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.spp1.factorymethod.inimigos;

/**
 *
 * @author SamuelParanhos
 */
public class Orc 
        extends StatusInimigos 
        implements Inimigo {

    //<editor-fold defaultstate="collapsed" desc="Construtores">
    
    public Orc(int nivel, float vida, float defesa, float ataque) {
        super(nivel, vida, defesa, ataque);
    }

    public Orc(int nivel, float vida, float defesa, float ataque, 
            String frqueza, String resistencias) {
        super(nivel, vida, defesa, ataque, frqueza, resistencias);
    }
    
    public Orc(){
        super(10, 80.0f, 20.0f, 18.50f);
    }
//</editor-fold>
    
    @Override
    public void tipoDeInimigo() {
        System.out.println("Inimigo do tipo Orc criado");
    }
    
}
