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
public class Gato extends Animal {

    public Gato(String nome, int idade, Dono dono) {
        super(nome, idade, dono);
    }

    @Override
    public String emitirSom() {
        return "Miau!";
    }

    public double calcularBanho() {
        return 40.0;
    }
}
