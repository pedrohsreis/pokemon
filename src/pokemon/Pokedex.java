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
    
    public void addPokemon(){
        
        Scanner scan = new Scanner(System.in);
        
        Pokemon pokemon = new Pokemon();
        String nome;
        Tipo tipo;
        int ataque;
        int defesa;
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
        
        pokemon.setAtributos(ataque, defesa, altura, peso);
        
        pokemon.setNome(nome);
        
        pokemons.add(pokemon);
        qtdPokemons++;
    }
    
}
