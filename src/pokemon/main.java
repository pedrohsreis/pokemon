/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author pedro
 */
public class main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Pokedex pokedex = new Pokedex();
        Batalha batalha;
        Scanner scan = new Scanner(System.in);
        //Pokemon pokemon1 = new Pokemon();
        //Pokemon pokemon2 = new Pokemon();
        int index;
        Pokedex pokedex2 = new Pokedex();

        
        //pokedex.addPokemonPokedex(pokemon1);
        //pokedex.addPokemonPokedex(pokemon2);
        
       //Pokemon teste = new Pokemon("Rodolfo", "Agua", 1, 1, 1, 1, 1);
       
       //pokedex.addPokemonPokedex(teste);
       //pokedex2.salvar();
        //pokedex2.carregar();
        
        pokedex.salvar();
        pokedex.carregar();
        pokedex.imprimePokemons();
        batalha = new Batalha(pokedex.returnPokemonById(0), pokedex.returnPokemonById(1));
        

        System.out.println(batalha.batalhar());
        
           
        
        //pokemon1 = pokedex.returnPokemonById(index);
        //System.out.println(pokemon1.getNome());
        
    }
}
