/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

import java.util.Random;

/**
 *
 * @author ice
 */
public class Batalha {
    Pokemon pokemon1, pokemon2;
    Random rand = new Random();
    int ataque, hp;
    
    Batalha(Pokemon pokemon1, Pokemon pokemon2){
        this.pokemon1 = pokemon1;
        this.pokemon2 = pokemon2;
    }
    public void batalhar(){
        while(pokemon1.getHp() >= 0 && pokemon2.getHp() >= 0){
            if(pokemon1.getHp() > 0){
                System.out.println(pokemon1.getNome() + " irá atacar " + pokemon2.getNome());
                ataque = rand.nextInt(pokemon1.getAtaque()) + 1;
                if(ataque > (pokemon1.getAtaque() / 2)){
                    System.out.println("O ataque foi efetivo.");
                    System.out.println(pokemon2.getNome() + " perdeu 5 pontos de vida.");
                    hp = pokemon2.getHp();
                    pokemon2.setHp(hp - 5);
                }else{
                    System.out.println("O ataque não foi efetivo.");
                    System.out.println(pokemon2.getNome() + " não perdeu pontos de vida.");
                }
            }else{
                System.out.println(pokemon1.getNome() + " foi derrotado.");
                break;
            }
            if(pokemon2.getHp() > 0){
                System.out.println(pokemon2.getNome() + " irá atacar " + pokemon1.getNome());
                ataque = rand.nextInt(pokemon2.getAtaque()) + 1;
                if(ataque > (pokemon2.getAtaque() / 2)){
                    System.out.println("O ataque foi efetivo.");
                    System.out.println(pokemon1.getNome() + " perdeu 5 pontos de vida.");
                    hp = pokemon1.getHp();
                    pokemon1.setHp(hp - 5);
                }else{
                    System.out.println("O ataque não foi efetivo.");
                    System.out.println(pokemon1.getNome() + " não perdeu pontos de vida.");
                }
            }else{
                System.out.println(pokemon2.getNome() + " foi derrotado.");
                break;
            }
        }
    }
}
