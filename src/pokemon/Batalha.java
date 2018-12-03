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
    boolean temVantagem1;
    boolean temDesvantagem1;
    boolean temVantagem2;
    boolean temDesvantagem2;
    
    
    
    public Batalha(Pokemon pokemon1, Pokemon pokemon2){
        this.pokemon1 = pokemon1;
        this.pokemon2 = pokemon2;
        temVantagem1 = false;
        temVantagem2 = false;
        temDesvantagem1 = false;
        temDesvantagem2 = false;
        for(int i = 0; i < pokemon1.getTipo().getDesvantagem().length; i++){
            if(pokemon2.getTipo().getNome() == pokemon1.getTipo().getDesvantagem()[i]){
                temDesvantagem1 = true;
            }
        }
        for(int i = 0; i < pokemon2.getTipo().getDesvantagem().length; i++){
            if(pokemon1.getTipo().getNome() == pokemon2.getTipo().getDesvantagem()[i]){
                temDesvantagem2 = true;
            }
        }
        if(pokemon1.getTipo().getNome() == pokemon2.getTipo().getVantagem()[0]){
            temVantagem2 = true;
        }
        if(pokemon2.getTipo().getNome() == pokemon1.getTipo().getVantagem()[0]){
            temVantagem1 = true;
        }
        
    }
    public String batalhar(){
        
        StringBuilder saida = new StringBuilder();
        

        
        
        while(pokemon1.getHp() >= 0 && pokemon2.getHp() >= 0){
            
            if(pokemon1.getHp() > 0){
                
                saida.append(pokemon1.getNome());
                saida.append(" irá atacar ");
                saida.append(pokemon2.getNome());
                saida.append("\n");
                ataque = rand.nextInt(pokemon1.getAtaque()) + 1;
                
                if(ataque > (pokemon1.getAtaque() / 2)){
                    
                    if(temVantagem1 || temDesvantagem2){
                        
                        saida.append("O ataque foi efetivo.");
                        saida.append("\n");
                        saida.append(pokemon2.getNome());
                        saida.append(" perdeu 7 pontos de vida.");
                        saida.append("\n");
                        hp = pokemon2.getHp();
                        pokemon2.setHp(hp - 7);
                    }else{
                    
                        saida.append("O ataque foi efetivo.");
                        saida.append("\n");
                        saida.append(pokemon2.getNome());
                        saida.append(" perdeu 5 pontos de vida.");
                        saida.append("\n");

                        hp = pokemon2.getHp();
                        pokemon2.setHp(hp - 5);
                    }
                    
                }else{
                    
                    saida.append("O ataque não foi efetivo.");
                    saida.append("\n");
                    saida.append(pokemon2.getNome());
                    saida.append(" não perdeu pontos de vida.");
                    saida.append("\n");
                    
                }
            }else{
                
                saida.append("\n");
                saida.append(pokemon1.getNome());
                saida.append(" foi derrotado.");
                saida.append("\n");
                break;
                
            }
            if(pokemon2.getHp() > 0){
                
                saida.append(pokemon2.getNome());
                saida.append(" irá atacar ");
                saida.append(pokemon1.getNome());
                saida.append("\n");
                ataque = rand.nextInt(pokemon2.getAtaque()) + 1;
                
                if(ataque > (pokemon2.getAtaque() / 2)){
                    
                    if(temVantagem2 || temDesvantagem1){
                        saida.append("O ataque foi efetivo.");
                        saida.append("\n");
                        saida.append(pokemon1.getNome());


                        saida.append("\n");

                        hp = pokemon1.getHp();
                        pokemon1.setHp(hp - 7);
                    }else{
                    
                        saida.append("O ataque foi efetivo.");
                        saida.append("\n");
                        saida.append(pokemon1.getNome());


                        saida.append("\n");

                        hp = pokemon1.getHp();
                        pokemon1.setHp(hp - 5);
                    }
                }else{
                    
                    saida.append("O ataque não foi efetivo.");
                    saida.append("\n");
                    saida.append(pokemon1.getNome());
                    saida.append(" não perdeu pontos de vida.");
                    saida.append("\n");
                    
                }
            }else{
                saida.append("\n");
                saida.append(pokemon2.getNome());
                saida.append(" foi derrotado.");
                saida.append("\n");
                break;
            }
        }
        return saida.toString();
    }
    public void imprimeTurno(String saidaTurno){
        System.out.println(saidaTurno);
    }
}
