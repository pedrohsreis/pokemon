/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class Pokedex {
    
    ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
    int qtdPokemons = 0;
    
    /**
     *  Método que adiciona o pokémon com seus parametros
     */
    
    public Pokemon returnPokemonById(int id){
        return pokemons.get(id);
    }
    public void addPokemonPokedex(Pokemon pokemon){
        pokemons.add(pokemon);
        qtdPokemons++;
    }
    
}
