/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

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
     */
    public void setAtributos(int ataque, int defesa, float altura, float peso, int hp, int id){
        getAtributos().setAtaque(ataque);
        getAtributos().setDefesa(defesa);
        getAtributos().setAltura(altura);
        getAtributos().setPeso(peso);
        this.setHp(hp);
        idPokedex = id;
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
    
}
