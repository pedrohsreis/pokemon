/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

/**
 *
 * @author ice
 */
public class Planta extends Tipo{
    
    String nome;
    String vantagem [];
    String desvantagem[];

    public Planta() {
        this.desvantagem = new String[]{"Fogo"};
        this.vantagem = new String[]{"Planta", "Agua"};
        this.nome = "Planta";
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
