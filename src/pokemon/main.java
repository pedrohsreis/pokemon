/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;
import java.util.Scanner;
/**
 *
 * @author pedro
 */
public class main {
    public static void main(String[] args) {
        Pokedex pokedex = new Pokedex();
        Batalha batalha;
        Scanner scan = new Scanner(System.in);
        Pokemon pokemon;
        int index;
        
        pokedex.addPokemon();
        pokedex.addPokemon();
        
        batalha = new Batalha(pokedex.returnPokemonById(0), pokedex.returnPokemonById(1));
        
        batalha.batalhar();
        
        System.out.println("Digite um pokémon para pesquisar.");
        index = scan.nextInt();
        
        pokemon = pokedex.returnPokemonById(index);
        System.out.println(pokemon.getNome());
        
    }
}
