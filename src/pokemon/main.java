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
        Pokemon pokemon1 = new Pokemon();
        Pokemon pokemon2 = new Pokemon();
        int index;
        
        pokedex.addPokemonPokedex(pokemon1);
        pokedex.addPokemonPokedex(pokemon2);
        
        batalha = new Batalha(pokedex.returnPokemonById(0), pokedex.returnPokemonById(1));
        
       
        
        System.out.println(batalha.batalhar());
        
        System.out.println("Digite um pokémon para pesquisar.");
        index = scan.nextInt();
        
        pokemon1 = pokedex.returnPokemonById(index);
        System.out.println(pokemon1.getNome());
        
    }
}
