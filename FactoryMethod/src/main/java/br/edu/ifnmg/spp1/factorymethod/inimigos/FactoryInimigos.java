/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.spp1.factorymethod.inimigos;

/**
 *
 * @author SamuelParanhos
 */

//Essa classe principal do FactoryMethodo
public abstract class FactoryInimigos {
   
    //Ela e abstrata para forçar as subclasses implementa-la
    //Fazendo que assim as subclasses criei o objeto correto
    public abstract Inimigo criarInimigos(int nivel);

    //Define o nivel padrao do inimigo como 1
    public Inimigo criInimiigo(){
        return criarInimigos(1);
    }
    
    public void planejarInimigo(int nivel){
        //Chama o método para obter o objeto do produto
        Inimigo t = criarInimigos(nivel);
        
        System.out.println("Gerando Inimigo\n");
        
        //Usa o produto
        t.tipoDeInimigo();
    }   
    
}
