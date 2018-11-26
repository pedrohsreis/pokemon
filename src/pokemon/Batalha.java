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
    public String batalhar(){
        
        StringBuilder saida = new StringBuilder();
        
        while(pokemon1.getHp() >= 0 && pokemon2.getHp() >= 0){
            if(pokemon1.getHp() > 0){
                saida.append(pokemon1.getNome());
                saida.append(" irá atacar ");
                saida.append(pokemon2.getNome());
                saida.append(System.lineSeparator());
                ataque = rand.nextInt(pokemon1.getAtaque()) + 1;
                if(ataque > (pokemon1.getAtaque() / 2)){
                    saida.append("O ataque foi efetivo.");
                    saida.append(System.lineSeparator());
                    saida.append(pokemon2.getNome());
                    saida.append(" perdeu 5 pontos de vida.");
                    saida.append(System.lineSeparator());
                    hp = pokemon2.getHp();
                    pokemon2.setHp(hp - 5);
                }else{
                    saida.append("O ataque não foi efetivo.");
                    saida.append(System.lineSeparator());
                    saida.append(pokemon2.getNome());
                    saida.append(" não perdeu pontos de vida.");
                    saida.append(System.lineSeparator());
                }
            }else{
                saida.append(System.lineSeparator());
                saida.append(pokemon1.getNome());
                saida.append(" foi derrotado.");
                saida.append(System.lineSeparator());
                break;
            }
            if(pokemon2.getHp() > 0){
                saida.append(pokemon2.getNome());
                saida.append(" irá atacar ");
                saida.append(pokemon1.getNome());
                saida.append(System.lineSeparator());
                ataque = rand.nextInt(pokemon2.getAtaque()) + 1;
                if(ataque > (pokemon2.getAtaque() / 2)){
                    saida.append("O ataque foi efetivo.");
                    saida.append(System.lineSeparator());
                    saida.append(pokemon1.getNome());
                    System.out.println(" perdeu 5 pontos de vida.");
                    saida.append(System.lineSeparator());
                    hp = pokemon1.getHp();
                    pokemon1.setHp(hp - 5);
                }else{
                    saida.append("O ataque não foi efetivo.");
                    saida.append(System.lineSeparator());
                    saida.append(pokemon1.getNome());
                    saida.append(" não perdeu pontos de vida.");
                    saida.append(System.lineSeparator());
                }
            }else{
                saida.append(System.lineSeparator());
                saida.append(pokemon2.getNome());
                saida.append(" foi derrotado.");
                saida.append(System.lineSeparator());
                break;
            }
        }
        return saida.toString();
    }
}
