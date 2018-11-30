/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

import java.util.Scanner;
import java.io.Serializable;
/**
 *
 * @author pedro
 */
public class Pokemon implements Serializable{
    
    private String nome;
    private Atributo atributos;
    private int idPokedex;
    private int hp;
    Tipo tipo;
    
    /**
     * 
     * @param nome seta o nome
     */
    
    public Pokemon(){
        
        atributos = new Atributo();
        
        String nome;
        int ataque;
        int defesa;
        int hp;
        float altura;
        float peso;
        int escolherTipo;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Escolha o tipo do pokémon: ");
        System.out.println("1 - Água");
        System.out.println("2 - Elétrico");
        System.out.println("3 - Fogo");
        System.out.println("4 - Pedra");
        System.out.println("5 - Planta");
        escolherTipo = scan.nextInt();
        
        switch(escolherTipo){
            case 1:
                tipo = new Agua();
                break;
            case 2:
                tipo = new Eletrico();
                break;
            case 3:
                tipo = new Fogo();
                break;
            case 4:
                tipo = new Pedra();
                break;
            case 5:
                tipo = new Planta();
                break;
            default:
                tipo = new Pedra();
        }
        
        
        
        
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
    public Pokemon(String nome, String tipo, int ataque, int defesa, int hp, float peso, float altura){
        atributos = new Atributo();
        this.nome = nome;
        this.hp = 15;
        atributos.setAtaque(ataque);
        atributos.setDefesa(defesa);
        atributos.setAltura(altura);
        atributos.setPeso(peso);
        
        switch(tipo){
            case "Agua":
                this.tipo = new Agua();
                break;
            case "Eletrico":
                this.tipo = new Eletrico();
                break;
            case "Fogo":
                this.tipo = new Fogo();
                break;
            case "Pedra":
                this.tipo = new Pedra();
                break;
            case "Planta":
                this.tipo = new Planta();
                break;
            default:
                this.tipo = new Pedra();
                break;
        }
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
    public Tipo getTipo(){
        return tipo;
    }
    

}
