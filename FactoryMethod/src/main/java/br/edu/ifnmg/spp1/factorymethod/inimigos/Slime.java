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
    
    //<editor-fold defaultstate="collapsed" desc="Construtores">
    

    public Slime(int nivel, float vida, float defesa, float ataque) {
        super(nivel, vida, defesa, ataque);
    }

    public Slime(int nivel, float vida, float defesa, float ataque,
            String frqueza, String resistencias) {
        super(nivel, vida, defesa, ataque, frqueza, resistencias);
    }  
    
    //Atributos padrão
    public Slime(){
        super(1, 10.0f,5.0f,2.0f);
    }
//</editor-fold>
  
    @Override
    public void tipoDeInimigo() {
        
        System.out.println("Inimigo do tipo Slime criado");
        
    }
    
}
