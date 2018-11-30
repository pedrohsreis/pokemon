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
public class Eletrico extends Tipo{
    
    String nome;
    String vantagem[];
    String desvantagem[];

    public Eletrico() {
        this.nome = "Eletrico";
        this.desvantagem = new String[]{"Pedra"};
        this.vantagem = new String[]{"Planta"};
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
