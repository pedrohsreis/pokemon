/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;
import java.io.Serializable;
/**
 *
 * @author pedro
 */
public class Pedra extends Tipo implements Serializable{
    
    String nome;
    String vantagem[];
    String desvantagem[];

    public Pedra() {
        this.nome = "Pedra";
        this.vantagem = new String[]{"Fogo"};
        this.desvantagem = new String[]{"Agua", "Planta"};
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String[] getDesvantagem() {
        return desvantagem;
    }

    @Override
    public String[] getVantagem() {
        return vantagem;
    }
}
