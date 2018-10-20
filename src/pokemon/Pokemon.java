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
    
    String nome;
    Tipo tipo;
    Atributo atributos;
    int idPokedex;
    
    /**
     * 
     * @param nome seta o nome
     */
    
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
    public void setAtributos(int ataque, int defesa, float altura, float peso){
        atributos.setAtaque(ataque);
        atributos.setDefesa(defesa);
        atributos.setAltura(altura);
        atributos.setPeso(peso);
    }
    
}
