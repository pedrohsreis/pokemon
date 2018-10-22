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
    public void addPokemon(){
        
        Scanner scan = new Scanner(System.in);
        
        Pokemon pokemon = new Pokemon();
        String nome;
        Tipo tipo;
        int ataque;
        int defesa;
        int hp;
        float altura;
        float peso;
        
        System.out.println("Digite o nome do pokémon.");
        nome = scan.nextLine();
        System.out.println("Digite o ataque.");
        ataque = scan.nextInt();
        System.out.println("Digite a defesa.");
        defesa = scan.nextInt();
        System.out.println("Digite a altura.");
        altura = scan.nextFloat();
        System.out.println("Digite o peso.");
        peso = scan.nextFloat();
        System.out.println("Digite a quantidade de pontos de vida do pokémon.");
        hp = scan.nextInt();
        
        pokemon.setAtributos(ataque, defesa, altura, peso, hp, qtdPokemons);
        
        pokemon.setNome(nome);
        
        pokemons.add(pokemon);
        qtdPokemons++;
    }
    public Pokemon returnPokemonById(int id){
        int i;
        for(i = 0; i < pokemons.size(); i++){
            if(i == id){
                break;
            }
        }
        return pokemons.get(i);
    }
    
}
