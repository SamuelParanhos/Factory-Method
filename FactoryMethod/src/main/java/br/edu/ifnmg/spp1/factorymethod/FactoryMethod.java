/*
 * Copyright (C) 2025 SamuelParanhos
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package br.edu.ifnmg.spp1.factorymethod;

import br.edu.ifnmg.spp1.factorymethod.inimigos.FactoryGoblin;
import br.edu.ifnmg.spp1.factorymethod.inimigos.FactoryInimigos;
import br.edu.ifnmg.spp1.factorymethod.inimigos.FactorySlime;
import br.edu.ifnmg.spp1.factorymethod.inimigos.Inimigo;

/**
 *
 * @author SamuelParanhos
 */
public class FactoryMethod {

    private static FactoryInimigos fabrica;

    public static void main(String[] args) {
        System.out.println("--- Iniciando o Jogo - Batalha na Floresta ---");

        // Imagine que o jogo decide qual inimigo aparecer com base na área ou sorte.
        // O código cliente não precisa saber qual fábrica específica está sendo usada,
        // ele só precisa de uma "FactoryInimigos".
        String areaAtual = "Pantano"; //Pode ser Caverna ou outra aréa

        // O cliente decide qual fábrica usar com base em uma condição.
        if ("Pantano".equals(areaAtual)) {
            System.out.println("Você entrou no pântano... criaturas gosmentas aparecem!");
            fabrica = new FactorySlime();
        } else {
            System.out.println("Você está em uma caverna escura... pequenos seres te emboscam!");
            fabrica = new FactoryGoblin();
        }
        
         System.out.println("\n-------------------------------------------------\n");

        // O cliente não faz ideia se está criando um Slime ou um Goblin.
        // Ele apenas pede à fábrica para "criar um inimigo".
        System.out.println("Um inimigo aparece!");
        Inimigo inimigo1 = fabrica.criarInimiigo(); // Usando o método que cria no nível 1
        inimigo1.tipoDeInimigo();
        System.out.println("Status -> Vida: " + inimigo1.getVida()
                + ", Ataque: " + inimigo1.getAtaque());

        System.out.println("\n-------------------------------------------------\n");

        System.out.println("Um inimigo mais forte aparece!");
        Inimigo inimigo2 = fabrica.criarInimigo(5);
        inimigo2.tipoDeInimigo();
        System.out.println("Status -> Vida: " + inimigo2.getVida()
                + ", Ataque: " + inimigo2.getAtaque());

        System.out.println("\n--- Fim da Batalha ---");
    }
}
