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
public abstract class Tipo implements Serializable{


    /**
     *
     * @return
     */
    public abstract String getNome();
    public abstract String[] getDesvantagem();
    public abstract String[] getVantagem();
}
