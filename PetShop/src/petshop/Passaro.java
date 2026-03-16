/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petshop;

/**
 *
 * @author crisf
 */
public class Passaro extends Animal {

    public Passaro(String nome, int idade, Dono dono) {
        super(nome, idade, dono);
    }

  

  
    public String emitirSom() {
        return "Piu Piu!";
    }

    
    public double calcularBanho() {
        return 20.0;
    }
}