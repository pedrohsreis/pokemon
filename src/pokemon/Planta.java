/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;
import java.io.Serializable;
/**
 *
 * @author ice
 * Classe do Tipo Planta, extende a classe abstrata Tipo
 */
public class Planta extends Tipo implements Serializable{
    
    String nome;
    String vantagem [];
    String desvantagem[];
    
    /**
    * Construtor da classe Planta, inicializando os atributos
    */
    
    public Planta() {
        this.desvantagem = new String[]{"Fogo"};
        this.vantagem = new String[]{"Planta", "Agua"};
        this.nome = "Planta";
    }
    
    /**
     * Retorna o nome do tipo
     * @return nome do tipo
     */
    
    @Override
    public String getNome() {
        return nome;
    }
    
    /**
     * Retorna as desvantagens do tipo
     * @return desvantagens
     */
    
    @Override
    public String[] getDesvantagem() {
        return desvantagem;
    }
    /**
     * Retorna a vantagem do tipo
     * @return vantagem
     */
    @Override
    public String[] getVantagem() {
        return vantagem;
    }
}
