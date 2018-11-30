/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;

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
    public void salvar() throws IOException{
                
        FileOutputStream arquivo = new FileOutputStream("pokemon.tmp");
        ObjectOutputStream arquivoob = new ObjectOutputStream(arquivo);
        arquivoob.writeObject(pokemons);
        arquivoob.close();
    }
    public void carregar() throws IOException, ClassNotFoundException{
        pokemons.clear();
        FileInputStream retornaArquivo = new FileInputStream("pokemon.tmp");
        ObjectInputStream arquivoob = new ObjectInputStream(retornaArquivo);
        pokemons = (ArrayList<Pokemon>) arquivoob.readObject();
        arquivoob.close();
    }
    public void imprimePokemons(){
        for(int i = 0; i < pokemons.size(); i++){
            System.out.println(i + " - " + pokemons.get(i).getNome());
        }
    }
    public ArrayList<Pokemon> getPokemons(){
        return pokemons;
    }
}
