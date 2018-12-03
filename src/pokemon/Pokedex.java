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
 * Classe pokédex, onde são armazenados os pokémons definidos pela classe Pokémon
 */
public class Pokedex {
    
    ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
    int qtdPokemons = 0;
    
    /**
     *  Método que retorna o pokémon e pede o id como paramêtro
     */
    
    public Pokemon returnPokemonById(int id){
        return pokemons.get(id);
    }
    
    /*
    * Método utilizada para adicionar um pokémon a lista da pokédex
    */
    
    public void addPokemonPokedex(Pokemon pokemon){
        pokemons.add(pokemon);
        qtdPokemons++;
    }
    
    /*
    * Método utilizado para salvar os dados contidos no ArrayList em um arquivo
    */
    
    public void salvar() throws IOException, ClassNotFoundException{

        
        ArrayList<Pokemon> pokemonBackup = new ArrayList<Pokemon>();
        
        FileInputStream retornaArquivo = new FileInputStream("pokemon.tmp");
        ObjectInputStream arquivoBack = new ObjectInputStream(retornaArquivo);
        pokemonBackup = (ArrayList<Pokemon>) arquivoBack.readObject();
        
        for(int i = 0; i < pokemonBackup.size(); i++){
            pokemons.add(pokemonBackup.get(i));
        }
        
        FileOutputStream arquivo = new FileOutputStream("pokemon.tmp");
        ObjectOutputStream arquivoob = new ObjectOutputStream(arquivo);
        arquivoob.writeObject(pokemons);
        arquivoob.close();
    }
    
    /*
    * Método utilizado para carregar os dados salvos no arquivo
    */
    
    public void carregar() throws IOException, ClassNotFoundException{
        pokemons.clear();
        FileInputStream retornaArquivo = new FileInputStream("pokemon.tmp");
        ObjectInputStream arquivoob = new ObjectInputStream(retornaArquivo);
        pokemons = (ArrayList<Pokemon>) arquivoob.readObject();
        arquivoob.close();
    }
    
    /*
    * Método utilizado para listar os pokémons contidos no arraylist
    */
    public void imprimePokemons(){
        for(int i = 0; i < pokemons.size(); i++){
            System.out.println(i + " - " + pokemons.get(i).getNome());
        }
    }
    
    /*
    * Método que retorna o ArrayList para utilização.
    */
    
    public ArrayList<Pokemon> getPokemons(){
        return pokemons;
    }
}
