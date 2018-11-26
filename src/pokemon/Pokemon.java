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
public class Pokemon {
    
    private String nome;
    private Atributo atributos;
    private int idPokedex;
    private int hp;
    
    /**
     * 
     * @param nome seta o nome
     */
    
    Pokemon(){
        
        atributos = new Atributo();
        
        String nome;
        Tipo tipo;
        int ataque;
        int defesa;
        int hp;
        float altura;
        float peso;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o nome do pokémon.");
        this.nome = scan.nextLine();
        System.out.println("Digite o ataque.");
        ataque = scan.nextInt();
        atributos.setAtaque(ataque);
        System.out.println("Digite a defesa.");
        defesa = scan.nextInt();
        atributos.setDefesa(defesa);
        System.out.println("Digite a altura.");
        altura = scan.nextFloat();
        atributos.setAltura(altura);
        System.out.println("Digite o peso.");
        peso = scan.nextFloat();
        atributos.setPeso(peso);
        System.out.println("Digite a quantidade de pontos de vida do pokémon.");
        hp = scan.nextInt();
        this.hp = hp;
        
        
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    /**
     * 
     * @param ataque seta o ataque
     * @param defesa seta a defesa
     * @param altura seta a altura
     * @param peso   seta o peso
     * @param hp seta o hp
     */
    public void setAtributos(int ataque, int defesa, float altura, float peso, int hp){
        getAtributos().setAtaque(ataque);
        getAtributos().setDefesa(defesa);
        getAtributos().setAltura(altura);
        getAtributos().setPeso(peso);
        this.setHp(hp);
    }

    /**
     * @return the hp
     */
    public int getHp() {
        return hp;
    }

    /**
     * @param hp the hp to set
     */
    public void setHp(int hp) {
        this.hp = hp;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return the atributos
     */
    public Atributo getAtributos() {
        return atributos;
    }

    /**
     * @param atributos the atributos to set
     */
    public void setAtributos(Atributo atributos) {
        this.atributos = atributos;
    }

    /**
     * @return the idPokedex
     */
    public int getIdPokedex() {
        return idPokedex;
    }

    /**
     * @param idPokedex the idPokedex to set
     */
    public void setIdPokedex(int idPokedex) {
        this.idPokedex = idPokedex;
    }
    public int getAtaque(){
        return atributos.getAtaque();
    }
    
    public void addPokemon(Pokemon pokemon, Pokedex pokedex){

    }
}
